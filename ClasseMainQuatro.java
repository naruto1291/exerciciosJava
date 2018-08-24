package exercicosjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lousada
 */
 public class ClasseMainQuatro {
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite quantidade area Metros Quadrados : ");
        String recebidoareaQuadradaMetros = br.readLine();
        int areaQuadradaMetros = Integer.parseInt(recebidoareaQuadradaMetros);
        areaParaTintar(areaQuadradaMetros);
 }
/*
        4) Fa�a um programa para uma loja de tintas. O programa dever� pedir o
        tamanho em metros quadrados da �rea a ser pintada. Considere que a
        cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a tinta �
        vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usu�rio a
        quantidades de latas de tinta a serem compradas e o pre�o total.
*/
    public static void areaParaTintar(int metrosQuadrados) {
        int litro = metrosQuadrados / 3;
        int lata = 18 * litro;
        int lata18litros = metrosQuadrados / 54;//(3*18)
        if (metrosQuadrados % 54 != 0) {
            lata18litros += 1;
        }
        double precoLataTotal = lata18litros * 80;
        System.out.println("Total Litros: "+ lata18litros+ "Preco Total: "+precoLataTotal);
    }


}