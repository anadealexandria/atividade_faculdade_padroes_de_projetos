package Patos;

import Quack.PatoMudo;
import voo.NaoVoar;

public class PatosDeBorracha extends Patos{
	
	public PatosDeBorracha() {
		grasnavel = new PatoMudo();
		voavel = new NaoVoar();
	}
	
	public void exibe() {
		System.out.println("Eu sou de borracha!");
	}
}
