package org.example.homework.lesson11.task1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        SecretLocker passcode = new SecretLocker("1234");
        System.out.println(passcode);
        Class<SecretLocker> secretLockerClass = SecretLocker.class;
        Field field = secretLockerClass.getDeclaredField("passcode");
        field.setAccessible(true);
        field.set(passcode, "3546");
        System.out.println(passcode);
    }
}
