//Pacote
package br.com.grupoicts;
//Imports

//IMPORTANTE:Como a MinhaClasseDinamica esta no mesmo pacote
//nao precisa ser importada para funcionar
//import br.com.grupoicts.MinhaClasseDinamica;

// ====================
// AULA 13 - 10/02/2020 
// ====================
// ASSUNTOS ABORDADOS:
//   a.	udemy SESSAO 08 --. Construindo suas próprias funções/Metodos
//   b.	udemy SESSAO 08 63. Classes com três atributos 
//                          (Triangulo:Hipotenusa,CatetoAdjasente,CatetoOposto)
//   c.	udemy SESSAO 08 64. Criando Métodos em Classes
//   d.	udemy SESSAO 08 69. Membros estáticos.
//   e.	udemy SESSAO 08 --. Membros de Instancia.
//   f.	udemy SESSAO 09 74. Construtores
//   g.	udemy SESSAO 09 75. Palavra this
//   h.	udemy SESSAO 09 76. Sobrecarga = Construtores que recebem diferentes parametros
//   i.	udemy SESSAO 09 77. Encapsulamento = Esconder detalhes de impl. de uma classe
//                          utilizar getters & setters
//   j.	udemy SESSAO 09 78. Getters & Setters

public class app {
	static int intVar1_Static = 1;
	static int intVar2_Static = 2;
	static int intVar3_Static = 3;
	static int intVar4_Static = 4;
	static short shortVar2_Static = 5;

	public static void main(String[] args) {
		MinhaClasseDinamica mi1 = new MinhaClasseDinamica(intVar1_Static,intVar2_Static);
		MinhaClasseDinamica mi2 = new MinhaClasseDinamica(intVar3_Static,intVar4_Static);
		mi1.meuMetodoMultiForma("MeuParametroString ");
		// Nota: Apesar de shortVarStatic nao ser int, eh numero e funciona
		intVar2_Static = mi1.meuMetodoMultiForma(intVar1_Static, shortVar2_Static);
		System.out.println("app.main()\n\t Chamou mi1.meuMetodoMultiForma(" + intVar1_Static + "," + shortVar2_Static
				+ ")\n\t retornou intVar2_Static[" + intVar2_Static + "]");

		mi1.setA_Static(intVar1_Static);
		System.out.println("app.main()\n\t Chamou mi1.setA_Static(" + intVar1_Static + ")");

		intVar3_Static = mi1.getA_Static();
		System.out
				.println("app.main()\n\t Chamou mi1.getA_Static()\n\t Retornou:intVar3_Static[" + intVar3_Static + "]");

		mi2.setA_Static(intVar2_Static);
		System.out.println("app.main()\n\t Chamou mi2.setA_Static(" + intVar2_Static + ")");

		intVar4_Static = mi2.getA_Static();
		System.out
				.println("app.main()\n\t Chamou mi2.getA_Static()\n\t Retornou:intVar4_Static[" + intVar4_Static + "]");
	}

}
