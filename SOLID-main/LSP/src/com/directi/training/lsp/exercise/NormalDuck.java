package com.directi.training.lsp.exercise;

public class NormalDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }
}