public class Chefe extends Funcionario {
   private String cargo;
   
   public Chefe (String nome, String cpf, Data nascimento, String telefone, double salario, String registro) {
      super(nome, cpf, nascimento, telefone, salario, registro);
      setCargo(cargo);
   }
   
   public void setCargo(String cargo) {
      if (cargo != null) {
         this.cargo = cargo;
      } else {
         System.out.println("[ERRO] Cargo invalido.");
      }
   }
   
   public String getCargo() {
      return this.cargo;
   }
   
   public double bonificar () { // Método sobreposto
		return getSalario() * 0.2;
	}
   
   public double getSalarioBonificado() {
      return getSalario() + bonificar();
   }
   
}