package com.example.icebreaking;

import java.sql.Timestamp;
import java.util.Random;

public class HayUtility {
    public static Timestamp getCurrentTime(){
        return new Timestamp(System.currentTimeMillis());
    }

    public static String generateIdentifyNumber(){
        int random = (int)(new Random().nextInt(9000)) + 1000;
        return Integer.toString(random);
    }
}
