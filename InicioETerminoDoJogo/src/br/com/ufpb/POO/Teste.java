package br.com.ufpb.POO;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculadorDeDuracao verificador = new CalculadorDeDuracao();
		
		System.out.print("Digite a hora inicial do jogo: ");
		int hi = Integer.parseInt(scan.nextLine());
		System.out.print("Digite os minutos iniciais do jogo: ");
		int mi = Integer.parseInt(scan.nextLine());
		System.out.print("Digite a hora final do jogo: ");
		int hf = Integer.parseInt(scan.nextLine());
		System.out.print("Digite os minutos finais do jogo: ");
		int mf = Integer.parseInt(scan.nextLine());
		
		System.out.print("A duração do jogo foi de: "+verificador.retornarDuracao(hi, mi, hf, mf));
		scan.close();
	}
}
