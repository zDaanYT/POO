public class Principal {
   public static void main(String args[]) {
      Aluno aluno[] = new Aluno[1];
      Funcionario funcionario[] = new Funcionario[1];
      Professor professor[] = new Professor[1];
      Chefe chefe[] = new Chefe[1];
       
      // ALUNO 
       
      aluno[0] = new Aluno("Danilo", "11111111111", new Data(1, 1, 2000), "42991647497", "11111111");
      aluno[0].setNome("Danilo Moreira Ribeiro");
      aluno[0].setCPF("12345678900");
      aluno[0].setTelefone("42991647496");
      aluno[0].setRA("25031526");
      aluno[0].setDisciplinas(5);
      aluno[0].setNascimento(new Data(24, 5, 2004));
      
      aluno[0].matricular(aluno[0].getDisciplinas());
      
      if (aluno[0].getMatricula() == true) {
         System.out.println("Aluno matriculado com sucesso!");
         System.out.println(aluno[0] + "\n");
      } else { System.out.println("Matricula falhou."); }

      // CHEFE

      chefe[0] = new Chefe("Carlos Jorge", "52998224725", new Data(15, 8, 1980), "42991640000", 5000.0, "12456789", "Diretor");
      System.out.println(chefe[0] + "\n");

      // PROFFESSOR

      professor[0] = new Professor("Maria Oliveira", "52998224725", new Data(10, 12, 1985), "42991660000", 3000.0, "98765432", 40);
      System.out.println(professor[0] + "\n");
      
      // FUNCIONÁRIO
      
      funcionario[0] = new Funcionario("Joao Santos", "52998224725", new Data(20, 3, 1990), "42991670000", 2500.0, "12345678");
      System.out.println(funcionario[0]); 

   }
}
