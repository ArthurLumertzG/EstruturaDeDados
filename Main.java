
public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		agenda.adicionar("Arthur", "art@", "111");
		agenda.adicionar("Miguel", "migl@", "222");
		agenda.adicionar("Cako", "cako@", "333");
		agenda.exibir();
		
		agenda.remover("Cako");
		agenda.exibir();
	}

}
