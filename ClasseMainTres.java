package exercicosjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lousada
 */
 public class ClasseMainTres {
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Digite o número de horas trabalhadas por uma pessoa : ");
        String numeroHorasDigitado = br.readLine();
        int numeroHoras = Integer.parseInt(numeroHorasDigitado);

        System.out.println("Digite o valor do Salario minimo : ");
        String salarioMinimoDigitado = br.readLine();
        int salarioMinimo = Integer.parseInt(salarioMinimoDigitado);

        System.out.println("O Salario a receber é :" + calculoSalariohaReceber(numeroHoras, salarioMinimo));
 }
    /*
        3) Receba o número de horas trabalhadas por uma pessoa e o valor do
        salário mínimo e mostre o salário a receber baseado nas seguintes regras:
        A hora trabalhada equivale a 10% do salário mínimo informado;
        O salário bruto é dado pelo número de horas trabalhadas multiplicado pelo
        valor de cada hora;
        O imposto pago é de 3%.
        O salário a receber é equivalente ao salário bruto subtraído do imposto.
   */
public static double  calculoSalariohaReceber(int horasTrabalhadas,double salarioMinimo){

        double valorHoraTrabalhada = 0.10*salarioMinimo;
        double salarioBruto = horasTrabalhadas*valorHoraTrabalhada;
        double impostoPago = salarioBruto*0.03;
        double salarioHaReceber = salarioBruto - impostoPago;
        return salarioHaReceber;
    }


}