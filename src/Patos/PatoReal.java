package Patos;

import Quack.Quack;
import voo.VoarComAsas;

public class PatoReal extends Patos{

	public PatoReal() {
		grasnavel=new Quack();
		voavel = new VoarComAsas();
	}
	
	public void exibe() {
		System.out.println("Eu sou um verdadeiro Pato Real");
	}
	

	
}
