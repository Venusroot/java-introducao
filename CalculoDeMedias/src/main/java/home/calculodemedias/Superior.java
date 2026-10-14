package home.calculodemedias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mota
 */
public class Superior {

    private double N1;
    private double N2;
    private double N3;

    public Superior(double N1, double N2, double N3) {
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
    }

    protected double getN1() {
        return N1;
    }

    protected double getN2() {
        return N2;
    }

    protected double getN3() {
        return N3;
    }

    public double CalculaMedia() {
        return N1 * 0.35 + N2 * 0.50 + N3 * 0.15;
    }
}