/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao;

/**
 *
 * @author Aluno
 */
public class Enumeracao {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Usuario", "Usuario@gmail.com", true, TipoUsuarioEnum.TECNICO);
        System.out.println("usuario");
        Pedido pedido = new Pedido("Pedido do usuario 01", 29.99, StatusEnum.EM_PREPARACAO.getstatus());
        System.out.println("pedido");
        pedido.setStatus(StatusEnum.EM_TRANSPORTE.getstatus());
        System.out.println("pedido");
        pedido.setStatus(StatusEnum.ENTREGUE.getstatus());
        System.out.println("pedido");
              
        
    }
}
