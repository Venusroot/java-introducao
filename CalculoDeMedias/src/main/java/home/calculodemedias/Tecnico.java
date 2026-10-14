/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home.calculodemedias;

/**
 *
 * @author Mota
 */
public class Tecnico extends Superior {

    public Tecnico(double N1, double N2, double N3) {
        super(N1, N2, N3);
    }

    @Override
    public double CalculaMedia() {
        return (getN1() + getN2() * 2 + getN3() * 2) / 5;
    }
}
