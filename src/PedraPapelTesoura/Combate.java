package PedraPapelTesoura;

public class Combate {

	private String jogadaDesafiante;
	private String jogadaDesafiado;
	
	public void lutar(Jogador desafiante, Jogador desafiado) {
		
        switch(desafiante.getJogada()) {
        case 0 :
        	jogadaDesafiante = "Pedra";
            break;
        case 1 :
        	jogadaDesafiante = "Papel";
            break;
        case 2 :
        	jogadaDesafiante = "Tesoura";
            break;
        }
        
        switch(desafiado.getJogada()) {
        case 0 :
        	jogadaDesafiado = "Pedra";
            break;
        case 1 :
        	jogadaDesafiado = "Papel";
            break;
        case 2 :
        	jogadaDesafiado = "Tesoura";
            break;
        }
        
		System.out.println(desafiante.getNome() + " Jogou: " + jogadaDesafiante);
		System.out.println(desafiado.getNome() + " Jogou: " + jogadaDesafiado);
		
        if (jogadaDesafiante.equals(jogadaDesafiado)) {
        	System.out.println("Empate!");
        } else if(jogadaDesafiante.equals("Pedra") && jogadaDesafiado.equals("Tesoura")) {
            System.out.println(desafiante.getNome() +" Venceu!");
        } else if(jogadaDesafiante.equals("Tesoura") && jogadaDesafiado.equals("Papel")) {
        	System.out.println(desafiante.getNome() +" Venceu!");
        } else if(jogadaDesafiante.equals("Papel") && jogadaDesafiado.equals("Pedra")) {
        	System.out.println(desafiante.getNome() +" Venceu!");;
        } else {
        	System.out.println(desafiado.getNome() +" Venceu!");
        }
	}
}
