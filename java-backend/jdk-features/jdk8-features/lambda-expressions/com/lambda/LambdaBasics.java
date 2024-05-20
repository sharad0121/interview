package com.lambda;

import java.util.Function;


public class LambdaBasics {
    public static void printSimplestLambda(Function lambda) {
        lambda.apply();
    }

    public static void main(String[] args) {
        greetingfunction = () -> {
            System.out.println("Hi Good Day!");
        };

        LambdaBasics.printSimplestLambda(greetingfunction);

    }
}