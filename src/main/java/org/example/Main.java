package org.example;

import org.example.service.BinaryToDecimalConverter;
import org.example.service.DecimalToBinaryConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

// Реализовать конвертер десятичного числа в двоичное
public class Main {

    private static final String CONFIG_PATH = "context.xml";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_PATH);
        BinaryToDecimalConverter toDecimalConverter = (BinaryToDecimalConverter) applicationContext.getBean("binaryToDecimalConverterImpl");
        DecimalToBinaryConverter toBinaryConverter = (DecimalToBinaryConverter) applicationContext.getBean("decimalToBinaryConverterImpl");

        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                Integer decimal = in.nextInt();
                System.out.println(toBinaryConverter.toBinary(decimal));
            } catch (Throwable e) {
                e.printStackTrace();
                in.nextLine();
            }
        }

    }
}