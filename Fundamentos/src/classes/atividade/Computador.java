/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Computador {
    private Memoria memoria;
    private Processador processador;
    private int capacidadeDisco;
    private String sistemaOperacional;

    public Computador(Memoria memoria, Processador processador, int capacidadeDisco, String sistemaOperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDisco = capacidadeDisco;
        this.sistemaOperacional = sistemaOperacional;
}

    Computador(Memoria memoria, classes.atividade.Processador processador, int i, String windows_10) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static class Processador {

        public Processador() {
        }
    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDisco=" + capacidadeDisco + ", sistemaOperacional=" + sistemaOperacional + '}';
    }
    
}
