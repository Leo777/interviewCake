package com.interviewcake.algolearn.Model.patterns;


public class SingletonPattern {
    private static SingletonPattern INSTANCE = null;


    private SingletonPattern() {
    }

    private static SingletonPattern getInstance (){
        if(INSTANCE == null){
            INSTANCE = new SingletonPattern();
        }
        return INSTANCE;
    }
}
