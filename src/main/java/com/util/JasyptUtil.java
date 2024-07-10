package com.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("G0CvDz7oJn6");   //加密所需的salt(盐)

        String username = textEncryptor.encrypt("张三");
        String password = textEncryptor.encrypt("123456");
        System.out.println(username);
        System.out.println(password);
    }
}
