package org.lesson3.ocp;

public class RightTriangleV2 implements ShapeV2 {
    private int cathetus1;
    private int cathetus2;
    private double hypotenuse;

    public RightTriangleV2(int cathetus2, int cathetus1) {
        this.cathetus2 = cathetus2;
        this.cathetus1 = cathetus1;
        this.hypotenuse = Math.sqrt(Math.pow(cathetus1, 2)
                + Math.pow(cathetus2, 2));
    }


    public int getCathetus1() {
        return cathetus1;
    }

    public int getCathetus2() {
        return cathetus2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public double getArea() {
        return cathetus1 * cathetus2 / 2.0;
    }
}
