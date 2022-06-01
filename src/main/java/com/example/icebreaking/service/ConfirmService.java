package com.example.icebreaking.service;

import com.example.icebreaking.HayUtility;
import com.example.icebreaking.ResponseMessage;
import com.example.icebreaking.controller.CustomizedResponseEntity;
import com.example.icebreaking.domain.Confirm;
import com.example.icebreaking.repository.user.ConfirmRepository;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.springframework.stereotype.Service;

@Service
public class ConfirmService {

    private CoolMessage coolMessage = new CoolMessage();
    private final ConfirmRepository confirmRepository;

    public ConfirmService(ConfirmRepository confirmRepository) throws CoolsmsException {
        this.confirmRepository = confirmRepository;
    }

    public Confirm getConfirm(String phoneNumber) {
        return confirmRepository.findByPhoneNumberEquals(phoneNumber);
    }

    public CustomizedResponseEntity<Confirm> sendMessage(String phoneNumber) throws CoolsmsException {

        String code;

        Confirm confirm = confirmRepository.findByPhoneNumberEquals(phoneNumber);

        //First Time
        if(confirm == null || confirm.getRequestTime() <= 10){
            try{
                if(confirm == null) {
                    code = HayUtility.generateIdentifyNumber();
                    coolMessage.sendSMS(phoneNumber,code);

                    Confirm newConfirm = new Confirm();

                    newConfirm.setCreationTime(HayUtility.getCurrentTime());
                    newConfirm.setValidationNumber(code);
                    newConfirm.setPhoneNumber(phoneNumber);
                    confirmRepository.save(newConfirm);
                }
                else {
                    code = HayUtility.generateIdentifyNumber();
                    confirmRepository.updateValidation(code, confirm.getRequestTime() + 1, HayUtility.getCurrentTime(), phoneNumber);
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        } else return new CustomizedResponseEntity<>(400, ResponseMessage.MORE_THAN_TEN_TIMES_REQUEST,confirm);
        return new CustomizedResponseEntity<>(201, ResponseMessage.CONFIRM_CREATE_SUCCESS,confirm);
    }

    public boolean validate(String phoneNumber, String code){
        Confirm confirm = confirmRepository.findByPhoneNumberEquals(phoneNumber);

        if(confirm == null) return false;


        return confirm.getValidationNumber().equals(code);
    }
}
