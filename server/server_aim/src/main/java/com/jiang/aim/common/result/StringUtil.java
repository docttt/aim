package com.jiang.aim.common.result;

import java.util.UUID;

public class StringUtil {

    public static String newId(){
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        System.out.println(uuid);
        return uuid;
    }

    public static void main(String[] args) {
        StringUtil.newId();
    }
}
