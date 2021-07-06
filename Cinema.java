import java.util.*;

public class Cinema{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ola, somos o servico de compra de ingressos do cinema Jailson.\nPor favor, digite ser nome");
		String nome = sc.next();
		int erro, sessao;
		String fileira;
		try{
			do{
				System.out.println("\nSeja bem-vindo(a) " + nome + ", as sessoes disponiveis sao:\n1- As Branquelas (sala Alpha)\n2- A Chegada (sala Beta)\n0- Sair");
				sessao = sc.nextInt();
				erro=0;
				if(sessao==0){
					System.exit(0);
				}else if(sessao == 1){
					System.out.println("A sessao escolhida foi: AS BRANQUELAS.");
					int A_DEF=12, A_A=20, A_B=20, A_C=24, A_D=24, A_E=26, A_F=26;
					//A (Alpha) + _ + número da fileira
					do{
						System.out.println("Os acentos disponiveis sao:\n\nDeficiente (DEF)-" + A_DEF +"\nA-" + A_A + "    B-" + A_B + "    C-" + A_C + " \nD-" + A_D + "    E-" + A_E + "    F-" + A_F + " \nQual a fileira desejada?");
						fileira = sc.next().toUpperCase();
						if (fileira.equalsIgnoreCase("A") || fileira.equalsIgnoreCase("B") || fileira.equalsIgnoreCase("C") || fileira.equalsIgnoreCase("D") || fileira.equalsIgnoreCase("E") || fileira.equalsIgnoreCase("F") || fileira.equalsIgnoreCase("DEF")){
							erro =0;
						}else{
							erro =2;
							System.out.println("\nFileira nao encontrada, tente novamente.\n");
						}
					}while(erro==2);
					
					System.out.println("Quantos lugares voce quer? \nPor favor, respeite a quantidade de lugares disponiveis.");
					do{
						int lugar = sc.nextInt();
						if(fileira.equalsIgnoreCase("DEF")){
							A_DEF -= lugar;
						}else if(fileira.equalsIgnoreCase("A")){
							A_A -= lugar;
						}else if(fileira.equalsIgnoreCase("B")){
							A_B -= lugar;
						}else if(fileira.equalsIgnoreCase("C")){
							A_C -= lugar;
						}else if(fileira.equalsIgnoreCase("D")){
							A_D -= lugar;
						}else if(fileira.equalsIgnoreCase("E")){
							A_E -= lugar;
						}else if(fileira.equalsIgnoreCase("F")){
							A_F -= lugar;
						}

						if(A_DEF<0 || A_A<0 || A_B<0 || A_C<0 || A_D<0 || A_E<0 || A_F<0){
							erro ++;
							System.out.println("Nao e possivel deixar uma fileira com numero negativo. \nPor favor, tente novamente.\n");
						}
					}while(erro==2);
						
					System.out.println("Lista de lugares vagos: \nDEF=" + A_DEF + "\nA=" + A_A + "\nB=" + A_B + "\nC=" + A_C + "\nD=" + A_D + "\nE=" + A_E + "\nF=" + A_F);
					
					System.out.println("Agradecemos a preferência " + nome + " :) Esperamos lhe ver novamente.");
				}else if(sessao == 2){
					System.out.println("A sessao escolhida foi: A CHEGADA.");
					int B_DEF=12, B_A=20, B_B=24, B_C=24, B_D=26, B_E=26;
					//B (Beta) + _ + número da fileira
					do{
						System.out.println("Os acentos disponiveis sao:\nDeficiente-" + B_DEF + "\nA-" + B_A + "    B-" + B_B + "    C-" + B_C + " \nD-" + B_D + "    E-" + B_E + "\nQual a fileira desejada?");
						fileira = sc.next().toUpperCase();
						if (fileira.equalsIgnoreCase("A") || fileira.equalsIgnoreCase("B") || fileira.equalsIgnoreCase("C") || fileira.equalsIgnoreCase("D") || fileira.equalsIgnoreCase("E") || fileira.equalsIgnoreCase("DEF")){
							erro=1;
						}else{
							erro =2;
							System.out.println("\nFileira nao encontrada, tente novamente.\n");
						}
					}while(erro == 1);
					
					System.out.println("Quantos lugares voce quer? \nPor favor, respeite a quantidade de lugares disponiveis.");
					do{
						int lugar = sc.nextInt();
						if(fileira.equalsIgnoreCase("DEF")){
							B_DEF -= lugar;
						}else if(fileira.equalsIgnoreCase("A")){
							B_A -= lugar;
						}else if(fileira.equalsIgnoreCase("B")){
							B_B -= lugar;
						}else if(fileira.equalsIgnoreCase("C")){
							B_C -= lugar;
						}else if(fileira.equalsIgnoreCase("D")){
							B_D -= lugar;
						}else if(fileira.equalsIgnoreCase("E")){
							B_E -= lugar;
						}
						
						if(B_DEF<0 || B_A<0 || B_B<0 || B_C<0 || B_D<0 || B_E<0){
							erro=1;
							System.out.println("Nao e possivel deixar uma fileira com numero negativo. \nPor favor, tente novamente.\n");
						}
					}while(erro==2);
						
					System.out.println("Lista de lugares vagos: \nDEF=" + B_DEF + "\nA=" + B_A + "B=" + B_B + "\nC=" + B_C + "\nD=" + B_D + "\nE=" + B_E);
					
					System.out.println("Agradecemos a preferencia " + nome + " :) Esperamos lhe ver novamente.");
				}else{
					System.out.println("NUMERO INVALIDO. Tente novamente.");
					erro=1;
				}

			}while(erro==1);

		} catch(Exception e) {
			System.out.print("Nao foi possivel ler algum valor digitado");
		}
	}
}