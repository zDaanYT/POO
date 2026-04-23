public class Aluno extends Pessoa {
   private String RA;
   private int disciplinas;
   private boolean matricula;
   
    public Aluno (String nome, String cpf, Data nascimento, String telefone, String RA) {
        super(nome, cpf, nascimento, telefone);
        setRA(RA); // já validado.
    }

    public Aluno (String nome, String cpf, Data nascimento, String RA) {
        super(nome, cpf, nascimento);
        setRA(RA); // já validado.
    }   
   
   public void setRA (String RA) {
      if (RA != null && RA.matches("\\d{8}")) {
         this.RA = RA;
      } else {
         System.out.println("[ERRO] RA invalido");
      }
   }
   
   public String getRA () {
      return this.RA;
   }
   
   public void setDisciplinas (int disciplinas) {
      if (disciplinas > 0) {
         this.disciplinas = disciplinas;
      } else {
         System.out.println("[ERRO] Valor invalido");
      }
   }
   
   public int getDisciplinas () {
      return this.disciplinas;
   }
   
   public double getCargaSemanal () {
      return disciplinas * 4;
   } 
   
   public void matricular (int disciplinas) {
      if (disciplinas > 0) {
         this.matricula = true;
         this.disciplinas = disciplinas;
      } else {
         System.out.println("[ERRO] Impossivel matricular.");
         this.matricula = false;
      }
   }
   
   @Override
   public String toString () {
      return super.toString() + 
      "\nRA: " + getRA() + 
      "\nDisciplinas: " + getDisciplinas() + 
      "\nCarga horaria semanal: " + getCargaSemanal();
   }
}