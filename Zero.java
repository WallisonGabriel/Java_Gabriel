import java.util.*; 

public class Zero {
	public static void main(String[] args) {  
	  
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ola, por favor insira um numero para verificar se e maior, menor ou igual a zero (0): ");  
		int numero = sc.nextInt();  
		
		if (numero>0){
			System.out.println("O numero " + numero + " e maior que 0.");
		} else if (numero<0){
			System.out.println("O numero " + numero + " e menor que 0.");
		} else if (numero==0){
			System.out.println("O numero " + numero + " e igual a 0.");
		}
		
		
  }
}