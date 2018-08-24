package exercicosjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lousada
 */
 public class ClasseMainUm {
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite O ano anual do funcionario, para saber o Salario Atual:");
        String anoDigitado = br.readLine();
        int anoSalario = Integer.parseInt(anoDigitado);
        System.out.println(salarioAtual(anoSalario)); 
 }
     /*1) Um funcionário de uma empresa recebe, anualmente, aumento salarial.
     Sabe-se que:
     Esse funcionário foi contratado em 2005 com salário inicial de R$ 1.000,00;
     Em 2006 ele recebeu aumento de 1,5% sobre seu salário inicial; e
     A partir de 2007, os aumentos salariais sempre corresponderam ao dobro
     do percentual do ano anterior.
     Faça um algoritmo que determine o salário atual deste funcionário.*/

    public static double salarioAtual(int ano) {
        double anoInicial = 2005;
        double percentualAumento = 1.5 / 100;
        double salarioInicial = 1000.00;
        if (ano >= anoInicial) {
            return  (1.0+percentualAumento*(ano - anoInicial)) * salarioInicial;
        } else {
            return 0;
        }
    }
}