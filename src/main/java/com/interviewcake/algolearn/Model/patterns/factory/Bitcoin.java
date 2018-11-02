package com.interviewcake.algolearn.Model.patterns.factory;

public class Bitcoin extends AbstractCurrency {
    private String name = "Bitcoin";

    @Override
    public String getName() {
        return name;
    }
}
