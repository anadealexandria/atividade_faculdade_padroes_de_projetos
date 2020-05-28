package Apresentacao;

import Patos.PatoDeBicoVermelho;
import Patos.PatoReal;
import Patos.Patos;
import Patos.PatosDeBorracha;

public class PatinhosNaLagoa {

	public static void main(String[] args) {
		
		Patos patinho1 = new PatoDeBicoVermelho ();
		patinho1.peformFly();
		patinho1.peformQuack();
		patinho1.nadar();
		patinho1.exibe();
		
		Patos patinho2 = new PatosDeBorracha();
		patinho2.peformFly();
		patinho2.peformQuack();
		patinho2.nadar();
		patinho2.exibe();
		
		
		Patos patinho3 = new PatoReal();
		patinho3.peformFly();
		patinho3.peformQuack();
		patinho3.nadar();
		patinho3.exibe();
		
		System.out.println("Boa tarde!!");
		System.out.println("Bom dia!");
		System.out.println("Boa noite!");
		
	}

}
