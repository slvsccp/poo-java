package poo03;

public class Aula03 {
    public static void main(String[] args){
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1451);
        p1.setDono("Matheus");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1111);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}