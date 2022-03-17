package banco;

public class LimiteInsuficienteException extends Exception {
	public LimiteInsuficienteException(String mensagem){
		super(mensagem);
	}
}
