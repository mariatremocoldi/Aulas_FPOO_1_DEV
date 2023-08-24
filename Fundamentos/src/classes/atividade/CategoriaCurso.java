/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividade;

/**
 *
 * @author Aluno
 */
public class CategoriaCurso {

    static String PROGRAMACAO;
    static String DESIGN;
    Curso curso1 = new Curso("Python Avançado", "Curso avançado de programação em Python", Categoria.INFORMATICA);
String nomeCurso1 = curso1.getNome();
String descricaoCurso1 = curso1.getDescricao();
String categoriaCurso1 = curso1.getCategoria();

Curso curso2 = new Curso("Pintura em Tela", "Curso de técnicas de pintura em tela", Categoria.ARTES);
String nomeCurso2 = curso2.getNome();
String descricaoCurso2 = curso2.getDescricao();
String categoriaCurso2 = curso2.getCategoria();

    private static class Categoria {

        private static String ARTES;
        private static String INFORMATICA;

        public Categoria() {
        }
    }
}

