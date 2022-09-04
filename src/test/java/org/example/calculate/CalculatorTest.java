package org.example.calculate;

import org.assertj.core.api.Assertions;
import org.example.calculate.Calculator;
import org.example.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {

    @DisplayName("덧셈 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void additionTest(int operand1 , String operator , int operand2 , int result) {

       int calculateResult =  Calculator.calculate(new PositiveNumber(operand1),operator,new PositiveNumber(operand2));
        assertThat(calculateResult).isEqualTo(result);
    }
   private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1,"+",2,3),
                arguments(1,"-",2,-1),
                arguments(4,"*",2,8),
                arguments(4,"/",2,2)
        );
    }



//    @DisplayName("덧셈 연산을 수행한다.")
//    @Test
//    void additionTest() {
//
//        int result = Calculator.calculate(1,"+",2);
//        assertThat(result).isEqualTo(3);
//    }
//
//    @DisplayName("뺄셈 연산을 수행한다.")
//    @Test
//    void subtractionTest() {
//
//        int result = Calculator.calculate(1,"-",2);
//        assertThat(result).isEqualTo(-1);
//    }
}
