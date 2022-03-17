package br.cesed.si.p3.exceptions.lista1.banco;

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String mensagem){
		super( mensagem );
	}
}
