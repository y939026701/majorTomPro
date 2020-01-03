package com.majortom.utils;

/**
 * @author 李文海
 * @version 1.0
 * @desc
 * @date 2020.01.03. \ 17:48
 * @copyright &copy; xuetang9
 * @address
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//



import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Tool {
    public Md5Tool() {
    }

    public static String md5(String buffer) {
        String string = null;
        char[] hexDigist = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(buffer.getBytes());
            byte[] datas = md.digest();
            char[] str = new char[32];
            int k = 0;

            for(int i = 0; i < 16; ++i) {
                byte b = datas[i];
                str[k++] = hexDigist[b >>> 4 & 15];
                str[k++] = hexDigist[b & 15];
            }

            string = new String(str);
        } catch (NoSuchAlgorithmException var9) {
            var9.printStackTrace();
        }

        return string;
    }
}

