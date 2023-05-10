package org.example.service.impl;

import org.example.service.DecimalToBinaryConverter;

public class DecimalToBinaryConverterImpl implements DecimalToBinaryConverter {

    @Override
    public String toBinary(Integer decimal) {
        return Integer.toBinaryString(decimal);
    }
}