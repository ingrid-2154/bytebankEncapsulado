
public class testaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
	System.out.println(conta.getAgencia());
	
	Conta contadois = new Conta(1337, 13249);
	
	Conta contatres = new Conta(1337, 5643);
	
	System.out.println(Conta.getTotal());
	}
}