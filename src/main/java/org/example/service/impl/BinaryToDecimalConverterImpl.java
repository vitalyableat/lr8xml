package org.example.service.impl;

import org.example.service.BinaryToDecimalConverter;

public class BinaryToDecimalConverterImpl implements BinaryToDecimalConverter {
    @Override
    public Integer toDecimal(String binaryString) {
        return Integer.parseInt(binaryString,2);
    }
}