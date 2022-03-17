package banco;

public class SaqueInvalidoException extends Exception {
	public SaqueInvalidoException(String mensagem){
		super( mensagem );
	}
}
