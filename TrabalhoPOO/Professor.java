public class Professor extends Funcionario {
   private int horasAula;
   
   public Professor (String nome, String cpf, Data nascimento, String telefone, double salario, String registro, int horasAula) {
      super(nome, cpf, nascimento, telefone, salario, registro);
      setHorasAula(horasAula); // já validado.
   }
   
   public Professor (String nome, String cpf, Data nascimento, double salario, String registro, int horasAula) {
      super(nome, cpf, nascimento, salario, registro);
      setHorasAula(horasAula); // já validado.
   }
   
   public void setHorasAula(int horasAula) {
      if (horasAula > 0) {
         this.horasAula = horasAula;
      } else {
         System.out.println("[ERRO] Valor invalido.");
      }
   }
   
   public int getHorasAula() {
      return this.horasAula;
   }
   
   
   public double bonificar () {
		return 10 * getHorasAula();
	}
   
   public double getSalarioBonificado() {
      return getSalario() + bonificar();
   }
   
   
}