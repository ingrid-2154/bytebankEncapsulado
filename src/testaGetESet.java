
public class testaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(5444, 7666);

		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
	
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");	
		System.out.println(conta.getTitular().getProfissao());
	}
}
