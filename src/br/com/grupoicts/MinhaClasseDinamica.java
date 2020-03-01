//Pacote
package br.com.grupoicts;

public class MinhaClasseDinamica {
	//Variaveis Estaticas
    static int intA_Static;
    
    //Variaveis Publicas 	
	public 
		int intX_Public;
	
	//Variaveis Privadas
	private 
		int intY_Private;
	
	// =================================================
    // Construtores Java: Possuem o mesmo nome da Classe
	// =================================================
	//Construtor Padrao
	MinhaClasseDinamica(){ //Nao recebe nenhum parametro
		this.intX_Public = 9;
		this.intY_Private = 2;
		System.out.println("Construtor Default this.intX_Public[" + this.intX_Public + "] this.intY_Private [" + this.intY_Private + "]");
	}
	//Construtor 1 :Sobrecarga >> recebe somente um parametro
	MinhaClasseDinamica(int intVal1){
		this.intX_Public = intVal1;
		this.intY_Private = 0;
		System.out.println(" Construtor 1 this.intX_Public[" + this.intX_Public + "] this.intY_Private [" + this.intY_Private + "]");
	}
	//Construtor 2 :Sobrecarga >> recebe dois parametros parametros
	MinhaClasseDinamica(int intVal1,int intVal2){
		this.intX_Public = intVal1;
		this.intY_Private = intVal2;
		System.out.println("Construtor 2 this.intX_Public[" + this.intX_Public + "] this.intY_Private [" + this.intY_Private + "]");
	}
	//Construtor n: Sobrecarga >> Recebe diferentes parametros dos demais acima
	//..
	
	// ==================================================================
	// Poliformation = (Igual Subrecarga)Metodos que possuem MesmoNome e parametros e ou Retorno diferentes 
	// ==================================================================
	public void meuMetodoMultiForma(String stringValue) {
		System.out.println("Esse recebe stringValue["+ stringValue + "]");
	}
	
	public int meuMetodoMultiForma(int intValue1, int intiValue2) {
		System.out.println("Esse recebe intValue1[" + intValue1 + "] intiValue2[" + intiValue2 + "]");
	    return intValue1+intiValue2;
	}
	
    // ================
    //Getters & Setters
    // ================
    public int getX_Public() {
		System.out.println("getX_Public intX_Public["+ intX_Public + "]");
		return intX_Public;
	}
	public void setX_Public(int iValue) {
		this.intX_Public = iValue;
		System.out.println("setX_Public intX_Public["+ intX_Public + "]");
	}
	public int getY_Private() {
		System.out.println("getY_Private intY_Private["+ intY_Private + "]");
		return intY_Private;
	}
	public void setY_Private(int iValue) {
		this.intY_Private = iValue;
		System.out.println("setY_Private intY_Private["+ intY_Private + "]");
	}
	public int getA_Static() {
		System.out.println("getA_Static intA_Static["+ intA_Static + "]");
		return intA_Static;
	}
	public void setA_Static(int iValue1) {
		MinhaClasseDinamica.intA_Static = iValue1;
		System.out.println("setA_Static intA_Static["+ intA_Static + "]");
	}
}
