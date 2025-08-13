
public class Agenda {

	private Contato[] contatos;
	private int indice;
	private final int capacidade = 100;
	
	public Agenda() {
		this.contatos = new Contato[capacidade];
		this.indice = 0;
	}
	
	public boolean adicionar(String nome, String email, String telefone) {
		if( this.indice < this.capacidade) {
		Contato contato = new Contato(nome, email, telefone);
		this.contatos[this.indice] = contato;
		this.indice++;
		return true;
	}
		return false;
	}
	
	public void exibir() {
			for(int i = 0; i < indice; i++) {
				Contato contato = this.contatos[i];
				System.out.println("Nome: " + contato.getNome() + " Email:" + contato.getEmail() + " Telefone: " + contato.getTelefone());
			}
	}
	
	
	public void remover(String nome) {
		for( int i = 0; i < indice; i++) {
			String verificaNome = this.contatos[i].getNome();
			if(verificaNome.equals(nome)){
				this.contatos[i] = null;
				for (int j = i+1; j < capacidade; j++) {
					contatos[j-1] = contatos[j]; 
				}
				indice--;
			}
		}
	}

}
