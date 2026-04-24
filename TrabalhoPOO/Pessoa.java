public class Pessoa {
	private String nome;
	private String cpf;
 private Data nascimento;
 private String telefone;

	public Pessoa (String nome, String cpf, Data nascimento, String telefone) {
		setNome(nome); // já validado.
		setCPF(cpf); // já validado.
     	setNascimento(nascimento); // já validado.
      	setTelefone(telefone); // já validado.
	}
   
 public Pessoa (String nome, String cpf, Data nascimento) {
		setNome(nome); // já validado.
		setCPF(cpf); // já validado.
      	setNascimento(nascimento); // já validado.
	}
	
	public void setNome (String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else 
			System.out.println("[ERRO] Nome invalido");

	}

	public void setCPF (String cpf) {
		if (cpf != null && cpf.matches("\\d{11}")) { // Verifica se o CPF não é nulo e se é válido.
			this.cpf = cpf;
		} else 
			System.out.println("[ERRO] CPF invalido");
	}
   
   public void setNascimento (Data nascimento) {
      if (nascimento != null) {
         this.nascimento = nascimento;
      } else {
         System.out.println("[ERRO] Data invalida");
      }
   }
   
    public void setTelefone (String telefone) {
      if (telefone != null && telefone.matches("\\d{11}")) { // Verifica se o telefone não é nulo e se é válido.
         this.telefone = telefone;
      } else {
         System.out.println("[ERRO] Telefone invalido");
      }
   }
	
	public String getNome () {
		return this.nome;	
	}

	public String getCPF () {
		return this.cpf;
	}
   
	public Data getNascimento () {
		return this.nascimento;
	}
   
	public String getTelefone () {
		return this.telefone;
	}
   
	public String toString() {
    	return "Nome: " + getNome() + 
    	"\nCPF: " + getCPF() + 
     "\nData de nascimento: " + getNascimento() +     
		    "\nTelefone: " + getTelefone(); 
   }
}
