package exercicosjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lousada
 */
 public class ClasseMainCInco {
	public static void main(String[] args) throws IOException {
       Conta umaConta = new Conta("999222","Ramon F L",0);
       Conta duasConta = new Conta("000002","Jonh F");
       System.out.println("Conta : "+umaConta.getNomeCorrentista());
       System.out.println("Conta : "+umaConta.getNumeroConta());
       System.out.println("Conta : "+umaConta.getSaldo());
        
       System.out.println("Conta : "+duasConta.getNomeCorrentista());
       System.out.println("Conta : "+duasConta.getNumeroConta());
       duasConta.depósito(500.0);
       duasConta.saque(50.0);
       System.out.println("Conta : "+duasConta.getSaldo());
     
	}
}
/*
5) Crie uma classe para implementar uma conta corrente. A classe deve
possuir os seguintes atributos: número da conta, nome do correntista e
saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No
construtor, saldo é opcional, com valor default zero e os demais atributos
são obrigatórios.
*/
class Conta {

    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public Conta(String numeroConta, String nomeCorrentista, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            saldo = 0;
        }
    }

    public Conta(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void alterarNome(String nomeParaAlterar) {
        nomeCorrentista = nomeParaAlterar;
    }

    public void depósito(double deposito) {
        if (deposito > 0) {
            saldo += deposito; 
        }
    }

    public void saque(double saque) {
        if (saque > saldo) {
            saldo = saque - saldo;
        }
    }
}
