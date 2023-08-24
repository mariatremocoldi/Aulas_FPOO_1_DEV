/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {
    
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    
    
    public Carro(String modelo, String cor, int ano, String marca, int marcha) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
      
        
        
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", marca=" + marca + '}';
    }
         
    }

