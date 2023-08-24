/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class MetodoSala {
    public static void main(String[] args) {
       Computador computador1 = new Computador(Memoria.GB8, Processador.I7, 512, "Windows 10");
        Computador computador2 = new Computador(Memoria.GB16, Processador.I9, 1024, "macOS");

        Curso curso1 = new Curso("Java Programming", "Learn Java from scratch", CategoriaCurso.PROGRAMACAO);
        Curso curso2 = new Curso("Graphic Design", "Master the art of digital design", CategoriaCurso.DESIGN);

        Sala sala1 = new Sala(30, 10, 101, true, 25);
        Sala sala2 = new Sala(20, 8, 202, false, 15);

    }

   
}
