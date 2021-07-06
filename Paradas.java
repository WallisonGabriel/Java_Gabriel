import java.util.*;
public class Paradas {
    public static void main(String[] args) {    

        Scanner sc = new Scanner(System.in); 
        
        Onibus Onibus1 = new Onibus("Mercedes", "Mercedes", 2, 30, 0, 600, 16);
        Onibus1.returnPassageiro_maximo();
        Onibus1.returnReabastecer();

        System.out.println("O onibus vai partir, ainda tem " + Onibus1.returnAssentosVagos() + " assentos vagos. Quantos passageiros vao subir?");
        Onibus1.definirEntrada(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.returnAssentosVagos() + " acentos vagos, qual vai ser o percurso (em km) ate a proxima parada?");
        Onibus1.definirPercurso(0);

        Onibus1.liga();
        //primeira parada
        Onibus1.desliga();

        System.out.println("Chegamos a primeira parada. Tem " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao descer?");
        Onibus1.definirSaida(0);
        System.out.println("Tem " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao entrar nessa parada?");
        Onibus1.definirEntrada(0);
        System.out.println("Ainda tem " + Onibus1.returnCombustivel() + "litros de gasolina. Gostaria de reabastecer? \ntrue - Reabastecer \nfalse - Nao reabastecer \n");
        Onibus1.definirReabastecer(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.returnAssentosVagos() + " acentos vagos, qual vai ser o percurso (em km) ate a proxima parada?");
        Onibus1.definirPercurso(0);
        
        Onibus1.liga();
        //segunda parada
        Onibus1.desliga();

        System.out.println("Chegamos a segunda parada. Tem " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao descer?");
        Onibus1.definirSaida(0);
        System.out.println("Tem " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao entrar nessa parada?");
        Onibus1.definirEntrada(0);
        System.out.println("Ainda tem " + Onibus1.returnCombustivel() + "litros de gasolina. Gostaria de reabastecer? \ntrue - Reabastecer \nfalse - Nao reabastecer \n");
        Onibus1.definirReabastecer(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.returnAssentosVagos() + " acentos vagos, qual vai ser o percurso (em km) ate a proxima parada?");
        Onibus1.definirPercurso(0);
        
        Onibus1.liga();
        //terceira parada
        Onibus1.desliga();

        System.out.println("Chegamos a terceira parada. Tem " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vão descer?");
        Onibus1.definirSaida(0);
        System.out.println("Tem " + Onibus1.returnAssentosOcupados() + " passageiros no onibus. Quantas pessoas vao entrar nessa parada?");
        Onibus1.definirEntrada(0);
        System.out.println("Ainda tem " + Onibus1.returnCombustivel() + "litros de gasolina. Gostaria de reabastecer? \ntrue - Reabastecer \nfalse - Nao reabastecer \n");
        Onibus1.definirReabastecer(0);
        System.out.println("Com " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.returnAssentosVagos() + " acentos vagos, qual vai ser o percurso (em km) ate a proxima parada?");
        Onibus1.definirPercurso(0);
        
        Onibus1.liga();
        //última parada
        Onibus1.desliga();

        System.out.println("Chegamos a parada final. Tem " + Onibus1.returnAssentosOcupados() + " passageiros no onibus e todos vao ter que descer.");
        Onibus1.returnParadaFinal();
        System.out.println("Agora o onibus tem " + Onibus1.returnAssentosOcupados() + " assentos ocupados e " + Onibus1.quantidade_combustivel + " litros de gasolina no tanque.\nObrigado pela preferencia.");
   }
}