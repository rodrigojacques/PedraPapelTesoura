package PedraPapelTesoura;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String jogador1;
		String jogador2;
		int jogada1;
		int jogada2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("********** PEDRA, PAPEL OU TESOURA **********");
		System.out.print("Informe o nome do desafiante: ");
		jogador1 = scanner.nextLine();
		System.out.print("Informe o nome do desafiado: ");
		jogador2 = scanner.nextLine();
		System.out.print("informe a jogada de " + jogador1 + "\n[0] Pedra\n[1] Papel\n[2] Tesoura\n>>>");
		jogada1 = scanner.nextInt();
		System.out.print("informe a jogada de " + jogador2 + "\n[0] Pedra\n[1] Papel\n[2] Tesoura\n>>>");
		jogada2 = scanner.nextInt();
		
		Jogador desafiante = new Jogador(jogador1, jogada1);
		Jogador desafiado = new Jogador(jogador2, jogada2);
		Combate luta = new Combate();
		luta.lutar(desafiante, desafiado);
		
		scanner.close();
		}
}
