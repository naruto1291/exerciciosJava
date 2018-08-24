package exercicosjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lousada
 */
 public class ClasseMainDois {
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite numeros do Intervalo:");
              String EntradaNumeros[] = br.readLine().split(" ");
              int  tamanhoEntradaNumeros = (EntradaNumeros.length);
                int conjuntoNumero [] = new int[tamanhoEntradaNumeros] ;
              for(int index = 0;index<EntradaNumeros.length;index++){
                  conjuntoNumero[index]=Integer.parseInt(EntradaNumeros[index]);
              }
              numerosPrimosNoIntervalo(conjuntoNumero);
 }
/*
    2) Elabore um algoritmo para mostrar os números primos existentes em um
    intervalo.
    O usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial <
    final) e os números primos existentes no intervalo ([inicial, final]) devem
    ser separados por um espaço em branco

    Exemplo:
    Entrada: 2 13
    Saída: 2 3 5 7 11 13
*/
  public static void numerosPrimosNoIntervalo(int NumeroDoIntervalo[]){
			System.out.println("Saída: ");
      for (int numero :NumeroDoIntervalo ){
	  
			if(numeroPrimo(numero)){
			System.out.print(numero+" ");
			}
          
          
      }
	  System.out.print("\n");
  }
    public static boolean numeroPrimo(int PrimoTeste) {
        int contador = 0;
        for (int x = 1; x <= PrimoTeste; x++) {
            if (PrimoTeste % x == 0) {
                //  System.out.println("Contador: "+contador+"Numero: "+x);
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }


}