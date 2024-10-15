package com.directi.training.lsp.exercise;

public class Pool {
    public void run() {
        Duck donaldDuck = new NormalDuck();
        Duck electricDuck = new ElectronicDuck();
        electricDuck.turnOn(); // Activer l'ElectronicDuck avant de l'utiliser
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            try {
                duck.quack();
            } catch (RuntimeException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            try {
                duck.swim();
            } catch (RuntimeException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}