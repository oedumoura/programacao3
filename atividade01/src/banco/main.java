package banco;


public class main {
	public static void main(String[] args) throws SaldoInsuficienteException, SaqueInvalidoException, LimiteInsuficienteException, DepositoInvalidoException, SetLimiteInvalidoException {
		ContaCorrente Conta123 = new ContaCorrente();
		Conta123.setValorLimite(1000);
		Conta123.depositar(1000);
		
		
		
		System.out.println("limite " + Conta123.getLimite() + " Saldo " + Conta123.getSaldo()
		+ " Valor Limite " + Conta123.getValorLimite());
		
		try { Conta123.sacar(1000);			
		} catch (SaqueInvalidoException e) {
			System.out.println(e.getMessage());
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (LimiteInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("limite " + Conta123.getLimite() + " Saldo " + Conta123.getSaldo()
		+ " Valor Limite " + Conta123.getValorLimite());
		
		try {  Conta123.depositar(-50);
			
		} catch (DepositoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("limite " + Conta123.getLimite() + " Saldo " + Conta123.getSaldo()
		+ " Valor Limite " + Conta123.getValorLimite());
		
		try { Conta123.sacar(-1000);			
		} catch (SaqueInvalidoException e) {
			System.out.println(e.getMessage());
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (LimiteInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("limite " + Conta123.getLimite() + " Saldo " + Conta123.getSaldo()
		+ " Valor Limite " + Conta123.getValorLimite());
		
		try {Conta123.setValorLimite(5000);
			
		} catch (SetLimiteInvalidoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("limite " + Conta123.getLimite() + " Saldo " + Conta123.getSaldo()
		+ " Valor Limite " + Conta123.getValorLimite());
		
		try {  Conta123.depositar(5800);
		
		} catch (DepositoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		try { Conta123.sacar(5400);			
		} catch (SaqueInvalidoException e) {
			System.out.println(e.getMessage());
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (LimiteInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		try { Conta123.sacar(-1000);			
		} catch (SaqueInvalidoException e) {
			System.out.println(e.getMessage());
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (LimiteInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		try { Conta123.sacar(1000);			
		} catch (SaqueInvalidoException e) {
			System.out.println(e.getMessage());
			
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (LimiteInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("limite " + Conta123.getLimite() + " Saldo " + Conta123.getSaldo()
		+ " Valor Limite " + Conta123.getValorLimite());
	}
	

	
	

}
