package com.interviewcake.algolearn.Model.patterns.builder;

public class main {
    Computer computer = new Computer.ComputerBuilder().withHdd(100).setProcessor(4.5f).setRam(64).build();
}
