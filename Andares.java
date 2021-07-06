import java.util.*;
public class Andares {
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in);
        int escolha;
        
        Elevador Elevador1 = new Elevador(10, 5, 0, 5, 0);
        Elevador1.returnEspacoOcupado();
        Elevador1.returnEspacoLivre();

        System.out.println("Ola, o elevador esta atualmente no andar " + Elevador1.andar_atual + ". ");

        do{
            System.out.println("Gostaria de ir para qual andar?");
            Elevador1.definirAndares(0);

            System.out.println("Se quiser sair do programa, digite '0', mas se quiser permanecer, digite qualquer outro numero.");
            escolha = sc.nextInt();
        }while(escolha!=0);

    }
}