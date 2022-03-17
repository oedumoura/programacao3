package banco;

public class ContaCorrente {
	
	private float limite;
	private float saldo;
	private float valorLimite;
	
	
	
	


	public void sacar(float valor) throws SaldoInsuficienteException, SaqueInvalidoException, LimiteInsuficienteException{
		if(valor<=0){ throw new SaqueInvalidoException("\nO valor do seu Saque � Insuficiente, pois � inferior a Zero.\n"
				+ "Valor do Saque R$ " + valor);
			
		}
		
		else if (saldo<valor ) { throw new SaldoInsuficienteException("\nO Seu saldo � Insuficiente para fazer a transa��o.\n"
				+ "O Valor que o senhor est� tentando sacar � de R$ " + valor + "\nE o seu Saldo � de R$ " + saldo + "\n");
		//Exercicio 7, no SaldoInsuficienteException pode-se recuperar o valor do saldo do Cliente
			
		} else if (limite<valor) { throw new LimiteInsuficienteException("\nO Seu Limite � Insuficiente para fazer a transa��o.\n"
				+ "Valor do Limite da conta R$ " + limite);
		
			
		} else {
			this.saldo = saldo - valor;
			this.limite = limite - valor;
			System.out.println("\nSaque de R$ " + valor + " Efetuado.\n");
		}
		
	}
	
	public void depositar(float valor) throws DepositoInvalidoException{
		if(valor>0) {
			this.setSaldo(valor+saldo);
			System.out.println("\nDeposito de de R$ " + valor + " Efetuado.\n");
		
		} else { throw new DepositoInvalidoException("\nO valor do seu Deposito � Insuficiente para fazer a transa��o, "
				+ "\nPois o mesmo � inferior a zero.\n");
			
		}
		
	}
	public void  setValorLimite(float valor) throws SetLimiteInvalidoException{
		if(valor>0) {
			this.setLimite(valor);
			this.valorLimite = valor;
			System.out.println("\nNovo Limite da conta modificado para R$ " + valor + " .\n");
		
		} else { throw new SetLimiteInvalidoException("\nO valor do Limite atribuido a conta n�o pode ser negativo.\n"
				+ "Valor de Limite Solicitado R$ " + valor);
			
		}
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValorLimite() {
		return valorLimite;
	}
	
	
	

}
