/* MeuPrimeiroPrograma*
 *  Este programa mostra ao aluno:
 *  1)QUe um programa Java é construído dentro de um projeto Java
 *  2)Todo programa Java deve ter uma classe com o método main
 *  3)Como exibir informações no terminal(console) do Java
 *  4)Como ler uma string no terminal(console) do Java
 *  Realizado Push
 */
package MeuPrimeiroPrograma;

import java.util.Scanner;

public class Principal { //Classe que mantém o método Principal

	public static void main(String[] args) { //Esse é o método Principal
		System.out.println("Olá amigo!\nQual é o seu nome?"); //Uso do Println
		
		//entrada de dados usando a biblioteca scanner
		Scanner in =  new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir uma string printf
		System.out.printf("Olá %s!\n", nome);
		
		
		
		
		
		
	
	
	}

}
