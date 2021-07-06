import java.util.*;
class Onibus {
    Scanner sc = new Scanner(System.in); 

    String marca;
    String motor;
    String modelo;
    String tempo_cricao;
    String ultimo_reparo;
    int andares;
    int assentos_andar;
    int assentos_ocupados;
    int passageiros_maximo;
    String proprietario;
    String preco;
    int ano;
    double kilometro_litro;
    double quantidade_combustivel;
    double limite_combustivel;
    double velocidadeAtual;
    double kilometragem;
    double velocidade_maxima;
    String cor;
    int peso;
    int assentos_vagos;

    //Método construtor
    public Onibus(String marca, String motor, int andares, int assentos_andar, int assentos_ocupados, double limite_combustivel, double kilometro_litro) {
        this.andares=andares;
        this.marca=marca;
        this.motor=motor;
        this.assentos_andar=assentos_andar;
        this.assentos_ocupados=assentos_ocupados;
        this.limite_combustivel=limite_combustivel;
        this.kilometro_litro=kilometro_litro;
    }

    public int returnAssentosOcupados()  {
        return this.assentos_ocupados;
    }

    public int returnPassageiro_maximo()  {
        return this.passageiros_maximo= andares * assentos_andar;
    }

    public int returnAssentosVagos()  { 
        return this.assentos_vagos = passageiros_maximo - assentos_ocupados;
    }

    public double returnCombustivel()  { 
        return this.quantidade_combustivel;
    }

    public void returnReabastecer()  { 
        this.quantidade_combustivel=limite_combustivel;
    }

    public void returnParadaFinal()  { 
        this.assentos_vagos = assentos_vagos + assentos_ocupados;
        this.assentos_ocupados-=assentos_ocupados;
    }

    public void definirCombustivel(double quantidade) {
        this.quantidade_combustivel =  this.quantidade_combustivel- quantidade;
    }
    
    public void definirPercurso(double percurso) {
        percurso = sc.nextInt(); 
        this.quantidade_combustivel =  this.quantidade_combustivel- (percurso/kilometro_litro);
    }

    public void definirEntrada(int passageiros_subindo) {
        passageiros_subindo = sc.nextInt(); 
        this.assentos_ocupados=assentos_ocupados+passageiros_subindo;
        this.assentos_vagos=assentos_vagos+passageiros_subindo;
    }

    public void definirSaida(int passageiros_descendo) {
        passageiros_descendo = sc.nextInt(); 
        this.assentos_ocupados=assentos_ocupados-passageiros_descendo;
        this.assentos_vagos=assentos_vagos+passageiros_descendo;
    }

    public void definirReabastecer(double reabastecido) {
        boolean escolha=sc.nextBoolean();
        if(escolha==true){
            reabastecido=limite_combustivel-quantidade_combustivel;
            this.quantidade_combustivel=limite_combustivel;
        }else if(escolha==false){
            return;
        }
    }

    void liga() {
        System.out.println("O onibus está ligado e partindo");
    }

    void desliga(){
        System.out.println("O onibus chegou e esta desligado");
    }
}