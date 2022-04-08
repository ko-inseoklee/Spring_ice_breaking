package com.example.icebreaking.service;


import com.example.icebreaking.CoolMessage;
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

    public CustomizedResponseEntity<Confirm> sendMessage(String phoneNumber) throws CoolsmsException {
        String code = HayUtility.generateIdentifyNumber();
        Confirm confirm = confirmRepository.findByPhoneNumberEquals(phoneNumber);

        //First Time
        if(confirm == null || confirm.getRequestTime() <= 10){

            try{
                coolMessage.sendSMS(phoneNumber,code);
                if(confirm == null) {
                    confirm = new Confirm(HayUtility.getCurrentTime(), code, phoneNumber);
                    confirmRepository.save(confirm);
                }
                else confirmRepository.updateValidation(HayUtility.generateIdentifyNumber(), confirm.getRequestTime() + 1, HayUtility.getCurrentTime(), phoneNumber);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        } else return new CustomizedResponseEntity<>(400, ResponseMessage.MORE_THAN_TEN_TIMES_REQUEST,confirm);





        return new CustomizedResponseEntity<>(201, ResponseMessage.CONFIRM_CREATE_SUCCESS,confirm);
    }
}
