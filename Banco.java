import java.util.*;
public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolhas;

        Conta Conta1 = new Conta ("Gabriel Augusto", 123456789, "Branco Bolo de Cenoura", 1000000, "1 de março de 2021");
        System.out.println("Seja bem-vindo " + Conta1.returnTitular() + ". O que gostaria de fazer hoje?");
        
        do{
            System.out.println("digite: \n1- Sacar \n2- Depositar \nOutro- Sair");

            escolhas = sc.nextInt();
            if(escolhas==1){
                System.out.println("Quanto voce gostaria de sacar?");
                Conta1.Sacar(0);
                System.out.print("Depois do saque, sua conta tem R$" + Conta1.returnSaldo() + ". Agora com a taxa de 5%, sua renda e: \nR$");
                Conta1.Renda();
            }else if(escolhas==2){
                System.out.println("Quanto voce gostaria de depositar?");
                Conta1.Depositar(0);
                System.out.print("Depois do deposito, sua conta tem R$" + Conta1.returnSaldo() + ". Agora com a taxa de 5%, sua renda e: \nR$");
                Conta1.Renda();
            }else{
                System.out.println("Obrigado pela preferencia " + Conta1.returnTitular() + ", espero que nao odeio o Planeta Fome :)");
            }
            if(escolhas==1 || escolhas==2){
                System.out.print("\nVoce sera redirecionado. Novamente ");
            }
        }while(escolhas<2);
    }
}