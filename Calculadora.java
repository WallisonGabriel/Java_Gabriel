import java.util.*; 

public class Calculadora {
	public static void main(String[] args) {  
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ola, escolha uma das operacoes: 1:Soma, 2:Subtracao, 3:Multiplicacao, 4:Divisao");  
		int operacao = sc.nextInt();
		
		System.out.println("Digite um numero");
		double num1 = sc.nextDouble();
		System.out.println("Digite outro numero");
		double num2 = sc.nextDouble();
		
		switch(operacao){
			case 1:
				System.out.println("A soma dos numeros e " + (num1+num2));
			break;
			case 2:
				System.out.println("A subtração dos numeros e " + (num1-num2));
			break;
			case 3:
				System.out.println("A multiplicacao dos numeros e " + (num1*num2));
			break;
			case 4:
				System.out.println("A divisao dos numeros e " + (num1/num2));
			break;
		}
  }
}