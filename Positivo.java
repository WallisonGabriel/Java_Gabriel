import java.util.*;

public class Positivo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ola, por favor insira dois(2) numeros, se ambos tiverem o mesmo sinal (+ ou -), sera dado como verdadeiro, caso o contrario sera falso. Primeiro numero:");  
		int num1 = sc.nextInt();  
		System.out.println("Segundo numero:");  
		int num2 = sc.nextInt();  
		
		if ((num1>=0 && num2>=0) || (num1<0 && num2<0)){
			System.out.println("O resultado e POSITIVO.");
		} else{
			System.out.println("O resultado e FALSO.");
		}
	}
}