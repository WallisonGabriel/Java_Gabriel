import java.util.*; 

public class Soma {
	public static void main(String[] args) {  
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ola, por favor insira tres(3) numeros e vamos somar os dois maiores. Primeiro numero:");  
		int num1 = sc.nextInt();  
		System.out.println("Segundo numero:");  
		int num2 = sc.nextInt();  
		System.out.println("Terceiro numero:");  
		int num3 = sc.nextInt();  
		
		if ((num1==num2) || (num2==num3) || (num1==num3)){
			System.out.println("Algum dos numeros foram iguais.");
		} else if((num1>num3) && (num2>num3)){
			System.out.println("A soma dos dois(2) maiores e " + (num1+num2));
		} else if ((num1<num2) && (num1<num3)){
			System.out.println("A soma dos dois(2) maiores e " + (num2+num3));
		} else if ((num1>num2) && (num2<num3)){
			System.out.println("A soma dos dois(2) maiores e " + (num3+num2));
		}
		
		
  }
}