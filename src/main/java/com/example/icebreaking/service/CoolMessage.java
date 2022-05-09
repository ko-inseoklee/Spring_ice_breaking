package com.example.icebreaking.service;
;

import com.example.icebreaking.ignore;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Service
public class CoolMessage {
    private Message coolSMS = new Message(ignore.SMS_API_KEY,ignore.SMS_API_SECRET_KEY);

    public void sendSMS(String phoneNumber, String code) throws CoolsmsException {
        try{
            HashMap<String,String> params = new HashMap<String,String>();
            params.put("to",phoneNumber);
            params.put("from","01027765098");
            params.put("type","SMS");
            params.put("text","[HAY] 인증번호는 ["+ code +"] 입니다.");

            coolSMS.send(params);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
