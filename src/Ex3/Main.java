package Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("*******************************");
		System.out.print("Digite a quantidade de formas que voce deseja criar: ");
		
		int qtdFormas = entrada.nextInt();
		
		ArrayList<FormaGeometrica> objetos = new ArrayList<FormaGeometrica>();
		System.out.println(" ");
		for(int i = 1; i <= qtdFormas; i++) {
			Scanner entradaFor = new Scanner(System.in);
			System.out.print("Digite 1 para criar um retangulo 2 para criar um quadrado e 3 para criar um circulo: ");
			int numForma = entradaFor.nextInt();
			int pos;
			int n = 2;
			double lados[] = new double[n];
			switch(numForma) {
			
				 //Retangulo
				 
				case 1:
					Scanner ladoRet = new Scanner(System.in);
					System.out.println("\nRetangulo");
					System.out.println("*******************************");
					for(pos = 1; pos <= n; pos++ ) {
						System.out.print("Digite o valor do lado "+pos+": ");
						lados[pos-1] = ladoRet.nextInt();
					}
					System.out.println("*******************************\n");
					Retangulo retangulo = new Retangulo(lados[0], lados[1], lados[0], lados[1], lados[0], lados[1]);
					objetos.add(retangulo);
				break;
				
				//Quadrado
				
				case 2:
					Scanner ladoQuad = new Scanner(System.in);
					System.out.println("\nQuadrado");
					System.out.println("*******************************");
					System.out.print("Digite o valor do lado: ");
					double lado = ladoQuad.nextDouble();
					System.out.println("\n*******************************\n");
					Quadrado quadrado = new Quadrado(lado, lado, lado ,lado, lado);
					objetos.add(quadrado);
				break;
				
				//Circulo
				
				case 3:
					Scanner raioCirc = new Scanner(System.in);
					System.out.println("\nCirculo");
					System.out.println("*******************************");
					System.out.print("Digite o valor do raio: ");
					double raioCirculo = raioCirc.nextDouble();
					System.out.println("*******************************\n");
					Circulo circulo = new Circulo(raioCirculo);
					objetos.add(circulo);
				break;
				
				default:
					System.out.println("Opcao invalida.");
					
					i--;
				break;
			}
			entradaFor.close();
		}
		int i = 1;
		System.out.println("Resultados");
		System.out.println("*******************************");
		for(FormaGeometrica objeto: objetos) {
			if(objeto.getClass().getSimpleName().toLowerCase().equals("quadrado")){
				System.out.print("Lados do quadrado: "+ i + ": \n");
				for (int n = 1; n < 5; n++)
					System.out.println(n + ": " + ((Quadrado) objeto).getL());
				
			}
			if(objeto.getClass().getSimpleName().toLowerCase().equals("retangulo")){
				System.out.print("Lados do retangulo: "+ i + ": \n");
				for (int n = 1; n < 3; n++) {
					System.out.println(n + ": " + ((Retangulo) objeto).getB());
					System.out.println(n + ": " + ((Retangulo) objeto).getH());
				}			
			}
			if(objeto.getClass().getSimpleName().toLowerCase().equals("circulo")){
				System.out.println("Raio do circulo: "+ i + ": " + ((Circulo) objeto).getRaio());
			}
			System.out.println("Area do " + objeto.getClass().getSimpleName().toLowerCase() + " "+  i + ": " + objeto.calcularArea());
			System.out.println("Perimetro do " + objeto.getClass().getSimpleName().toLowerCase() + " "+  i + ": " + objeto.calcularPerimetro());
			System.out.println("*******************************");
			i++;
		}
		entrada.close();
	}
}
