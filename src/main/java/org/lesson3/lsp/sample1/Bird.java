package org.lesson3.lsp.sample1;

/**
 * T
 */
public class Bird {

    private boolean canFly = true;

    public Bird() {
    }

    public Bird(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void fly() {
        System.out.println("Птица летит.");
    }

    public void run() {
        System.out.println("Птица бежит!");
    }

}
