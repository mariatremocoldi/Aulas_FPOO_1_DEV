/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int numeroCadeiras;
    private int numeroMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int numeroComputadores;

    public Sala(int numeroCadeiras, int numeroMesas, int numeroSala, boolean temProjetor, int numeroComputadores) {
        this.numeroCadeiras = numeroCadeiras;
        this.numeroMesas = numeroMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.numeroComputadores = numeroComputadores;
    }

    public int getNumeroCadeiras() {
        return numeroCadeiras;
    }

    public int getNumeroMesas() {
        return numeroMesas;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public boolean isTemProjetor() {
        return temProjetor;
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "numeroCadeiras=" + numeroCadeiras + ", numeroMesas=" + numeroMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", numeroComputadores=" + numeroComputadores + '}';
    }
    
    
}
