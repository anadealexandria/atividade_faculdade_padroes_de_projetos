package Patos;

import Quack.Quack;
import voo.VoarComAsas;

public class PatoDeBicoVermelho extends Patos{
	
	public PatoDeBicoVermelho() {
		grasnavel = new Quack();
		voavel = new VoarComAsas();
	}
	
	public void exibe() {
		System.out.println("Eu tenho o bico vermelho!");;
	}
	
	

}
