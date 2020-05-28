package Patos;

import Quack.Grasnavel;
import voo.Voavel;

public class Patos {
	
	Voavel voavel;
	Grasnavel grasnavel;

	public void nadar() {
		System.out.println("Eu nado!");
	}
			
	public void exibe() {
		
	}
	
	public void peformQuack() {
		grasnavel.quack();
	}
	
	public void peformFly() {
		voavel.voar();		
	}
}
