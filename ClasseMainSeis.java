package exercicosjava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Lousada
 */
 public class ClasseMainSeis {
 public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o valor da altura:");
        String alturaDigitada = br.readLine();
        int altura = Integer.parseInt(alturaDigitada);
        System.out.println("Digite o valor da base:");
        String baseDigitado = br.readLine();
        int base = Integer.parseInt(baseDigitado);
        Retangulo medidaLocal =new Retangulo();
        medidaLocal.mudarLadoA(base);
        medidaLocal.mudarLadoB(altura);
        double areaQuadrada = medidaLocal.calcularArea();
       
        System.out.println("numero de pisos em Metros Quadrados:"+areaQuadrada );
        System.out.println("Rodapé:"+(areaQuadrada*0.1)+"metros quadrados");
     
 }

/*
6) Crie uma classe que modele um retângulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a
escolher)
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e
calcular Perímetro;
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que
informe as medidas de um local. Depois, deve criar um objeto com as 
medidas e calcular a quantidade de pisos e de rodapés necessárias para o
local.
*/

class Retangulo {

    private int ladoA;
    private int ladoB;

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void mudarLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void mudarLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public double valorLadosA() {
        return ladoA;
    }

    public double valorLadosB() {
        return ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    public double calcularPerimetro() {
        return ladoA + ladoA + ladoB + ladoB;
    }

}





}