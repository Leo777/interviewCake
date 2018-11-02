package com.interviewcake.algolearn.Model.patterns.builder;

public class Computer {
    private int hdd;
    private int ram;
    private float processor;

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.processor = builder.processor;
    }

    static class ComputerBuilder {
        private int hdd;
        private int ram;
        private float processor;

        public ComputerBuilder withHdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setProcessor(float processor) {
            this.processor = processor;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
