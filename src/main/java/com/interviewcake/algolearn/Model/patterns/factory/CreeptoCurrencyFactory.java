package com.interviewcake.algolearn.Model.patterns.factory;

public class CreeptoCurrencyFactory {
    private AbstractCurrency currency = null;
    private static CreeptoCurrencyFactory INSTANCE = null;

    private CreeptoCurrencyFactory() {

    }

    public AbstractCurrency getCurrency(String type) {
        if (type.equals("B")) {
            currency = new Bitcoin();
        } else if (type.equals("E")) {
            currency = new Etherium();
        } else {
            throw new RuntimeException("No such currency");
        }
        return currency;
    }

    public static CreeptoCurrencyFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CreeptoCurrencyFactory();
        }
        return INSTANCE;
    }
}
