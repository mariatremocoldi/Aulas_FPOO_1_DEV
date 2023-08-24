/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    
    private int qtdeRodas;
    private boolean marchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;

    public Bicicleta() {
    }

    public Bicicleta(int qtdeRodas, boolean marchas, String modelo, boolean temFreio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.marchas = marchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situacao = "Parada";
        this.velocidade = 0;
    }
    
    public void andar(int Velocidade) {
       this.situacao = "Andando";
        this.velocidade = Velocidade;
    }
    
    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade  -= 1;
    }
    public boolean verificarSeTemFreio(){
        return this .temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", marchas=" + marchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

    
    
    
}
