import java.util.*;
class Conta{
    Scanner sc = new Scanner(System.in); 

    String titular;
    int numero_conta;
    String agencia;
    double saldo;
    String data_abertura;

    public Conta(String titular, int numero_conta, String agencia, double saldo, String data_abertura){
        this.titular = titular;
        this.numero_conta = numero_conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data_abertura = data_abertura;
    }

    public String returnTitular(){
        return this.titular;
    }

    public int returnNumeroConta(){
        return this.numero_conta;
    }

    public String returnAgencia(){
        return this.agencia;
    }

    public double returnSaldo(){
        return this.saldo;
    }

    public String returnDataAbertura(){
        return this.data_abertura;
    }

    public void Sacar(double saque){
        saque=sc.nextDouble();
        saldo = saldo - saque;
        System.out.println(saldo);
    }

    public void Depositar(double deposito){
        deposito=sc.nextDouble();
        saldo = saldo + deposito;
        System.out.println(saldo);
    }

    public void Renda(){
        saldo = saldo + (saldo * 0.05);
        System.out.println(saldo);
    }
}