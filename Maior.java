import java.util.*; 

public class Maior {
	public static void main(String[] args) {  
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ola, por favor insira tres(3) numeros para verificar deles e maior. Primeiro numero:");  
		int num1 = sc.nextInt();  
		System.out.println("Segundo numero:");  
		int num2 = sc.nextInt();  
		System.out.println("Terceiro numero:");  
		int num3 = sc.nextInt();  
		
		if ((num1==num2) || (num2==num3) || (num1==num3)){
			System.out.println("Algum dos numeros foram iguais.");
		} else if((num1>num2) && (num1>num3)){
			System.out.println("O numero " + num1 + " e o maior.");
		} else if ((num2>num1) && (num2>num3)){
			System.out.println("O numero " + num2 + " e o maior.");
		} else if ((num3>num1) && (num3>num2)){
			System.out.println("O numero " + num3 + " e o maior.");
		}
		
		
  }
}