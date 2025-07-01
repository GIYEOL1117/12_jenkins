package org.example.jenkins.service;

import org.example.jenkins.dto.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plusTwoNumbers(CalculatorDto calculatorDto) {
        return calculatorDto.getNum1() + calculatorDto.getNum2();
    }
}
