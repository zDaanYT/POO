public class Funcionario extends Pessoa {
	private double salario;
   private String registro;

	public Funcionario (String nome, String cpf, Data nascimento, String telefone, double salario, String registro) {
		super(nome, cpf, nascimento, telefone);
		setSalario(salario); // já validado.
      	setRegistro(registro); // já validado.
	}
   
   public void setSalario (double salario) {
      if (salario > 0 && salario > 700) {
         this.salario = salario;
      } else {
         System.out.println("[ERRO] Salario invalido.");
      }
   }
   
	public final double getSalario () {
		return this.salario;
	}
   
   public void setRegistro (String registro) {
      if (registro != null && registro.matches("\\d{8}")) {
         this.registro = registro;
      } else {
         System.out.println("[ERRO] Registro invalido");
      }
   }
   
   public String getRegistro () {
      return this.registro;
   }
   
   public double bonificar () {
		return getSalario() * 0.1;
	}
   
   public double getSalarioBonificado() {
      return getSalario() + bonificar();
   }

	@Override
	public String toString() {
    	return "Nome: " + getNome() + 
        "\nCPF: " + getCPF() +
        "\nSalário: " + getSalario() + 
        "\nRegistro: " + getRegistro();
	}
}
