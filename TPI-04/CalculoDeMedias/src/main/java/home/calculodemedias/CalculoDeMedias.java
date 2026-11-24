/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package home.calculodemedias;

import javax.swing.JOptionPane;

/**
 *
 * @author Mota
 */
public class CalculoDeMedias  {

    public static void main(String[] args) {
        double n1Superior = lerNota("Nota da P1:");
        double n2Superior = lerNota("Nota da P2:");
        double n3Superior = lerNota("Nota dos trabalhos:");

        double n1Tecnico = lerNota("Nota do 1º trimestre:");
        double n2Tecnico = lerNota("Nota do 2º trimestre:");
        double n3Tecnico = lerNota("Nota do 3º trimestre:");

        Superior alunoSuperior =
                new Superior(n1Superior, n2Superior, n3Superior);

        Tecnico alunoTecnico =
                new Tecnico(n1Tecnico, n2Tecnico, n3Tecnico);

        String mensagem = "Média do Superior: "
                + String.format("%.2f", alunoSuperior.CalculaMedia())
                + "\nMédia do Técnico: "
                + String.format("%.2f", alunoTecnico.CalculaMedia());

        JOptionPane.showMessageDialog(null, mensagem);
    }

    private static double lerNota(String pergunta) {
        String resposta = JOptionPane.showInputDialog(null, pergunta);
        resposta = resposta.trim().replace(",", ".");
        return Double.parseDouble(resposta);
    }
}
