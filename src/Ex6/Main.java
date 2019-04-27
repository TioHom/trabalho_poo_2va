package Ex6;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int opcao = 0;
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		while (opcao != 5) {
			System.out.println("Funcionarios: " + funcionarios.toString());
			System.out.println("*********************************************************************");
			System.out.println("Menu");
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1 . Criar Funcionario");
			System.out.println("2 . Criar Funcionario com Ensino Basico");
			System.out.println("3 . Criar Funcionario com Ensino Medio");
			System.out.println("4 . Criar Funcionario com Graduacao");
			System.out.println("5 . Sair");
			System.out.print("Digite a opcao selecionada: ");
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();			
			
			switch(opcao) {
				case 1: 
					Funcionario funcionario = new Funcionario();
					Funcionario func = funcionario.createFuncionario();
					funcionarios.add(func);
				break;
				
				case 2:
					EnsinoBasico eb = new EnsinoBasico();
					EnsinoBasico funcEb = eb.createFuncionario();
					funcionarios.add(funcEb);
				break;
				
				case 3:
					EnsinoMedio em = new EnsinoMedio();
					EnsinoMedio funcEm = em.createFuncionario();
					funcionarios.add(funcEm);
				break;
				
				case 4: 
					Graduacao gd = new Graduacao();
					Graduacao funcGd = gd.createFuncionario();
					funcionarios.add(funcGd);
				break;
				
				case 5:
				return;
				
				default: System.out.println("Opcao invalida."); 
				break;
			}
		}
	}
}
