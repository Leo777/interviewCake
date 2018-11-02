package com.interviewcake.algolearn.Model.patterns.factory;

public class Main {
    public static void main(String[] args) {
        CreeptoCurrencyFactory currencyFactory = CreeptoCurrencyFactory.getInstance();

        System.out.println(currencyFactory.getCurrency("E").getName());


    }

}
