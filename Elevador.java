import java.util.*;
class Elevador {
    Scanner sc = new Scanner(System.in); 

    int espaco_maximo;
    int espaco_ocupado;
    int espaco_livre;
    int botao_andar;
    int andar_atual;
    double forca_cabo; //em kg
    double peso; //em kg

    //Método construtor
    public Elevador(int botao_andar, int espaco_maximo, int espaco_ocupado, int espaco_livre, int andar_atual) {
        this.botao_andar = botao_andar;
        this.espaco_maximo = espaco_maximo;
        this.espaco_ocupado = espaco_ocupado;
        this.espaco_livre = espaco_livre;
        this.andar_atual=andar_atual;
    }

    public int returnEspacoOcupado()  {
        return this.espaco_ocupado = espaco_maximo - espaco_livre;
    }

    public int returnEspacoLivre()  {
        return this.espaco_maximo= espaco_maximo - espaco_ocupado;
    }

    public int returnAndares()  { 
        return this.botao_andar;
    }

    public int returnEspacoMaximo()  { 
        return this.espaco_maximo;
    }

    public int returnAndarAtual()  { 
        return this.andar_atual;
    }

    public void definirAndares(int andar_destino) {
        andar_destino=sc.nextInt();
        if(andar_destino>botao_andar){
            System.out.println("O numero requirido excede os andares do predio");
        }else if(andar_destino>andar_atual){
            andar_atual=andar_destino;
            subir();
        }else if(andar_destino<andar_atual){
            andar_atual=andar_destino;
            descer();
        }else if(andar_destino==andar_atual){
            parado();
        }
        
    }

    void subir() {
        System.out.println("O elavador esta fechando as portas \nO elevador esta subindo \nO elevador esta abrindo as portas \nO elevador chegou no andar " + andar_atual);
    }

    void descer(){
        System.out.println("O elavador esta fechando as portas \nO elevador esta descendo \nO elevador esta abrindo as portas \nO elevador chegou no andar " + andar_atual);
    }

    void parado(){
        System.out.println("O elevador nao pode se mexer pois ja esta no andar solicitado");
    }
}