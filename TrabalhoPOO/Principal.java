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
         System.out.println(aluno[0]);
      } else { System.out.println("Matricula falhou."); }

      // CHEFE

      chefe[0] = new Chefe("Carlos", "00876543256", new Data(12, 1, 1980), "Dimetor", 4000.00, "1556789", "");
      chefe[0].setNome("Carlos Silva");
      chefe[0].setCPF("09876543210");
      chefe[0].setCargo("Diretor");
      chefe[0].setTelefone("4284000000");
      chefe[0].setRegistro("1456789");
      chefe[0].setSalario(5000.00);
      chefe[0].setNascimento(new Data(15, 8, 1980));

      System.out.println(chefe[0]);

      professor[0] = new Professor("A", "A", new Data(12, 1, 1980), 0.0, "A", 0);
      professor[0].setNome("Maria Oliveira");
      professor[0].setCPF("11223344556");
      professor[0].setTelefone("42991660000");
      professor[0].setRegistro("9876543");
      professor[0].setSalario(3000.00);
      professor[0].setHorasAula(40);
      professor[0].setNascimento(new Data(10, 12, 1985));

      System.out.println(professor[0]);

      funcionario[0] = new Funcionario("A", "A", new Data(12, 1, 1980), "A", 0.0, "A");
      funcionario[0].setNome("João Santos");
      funcionario[0].setCPF("11122233344");
      funcionario[0].setTelefone("42991670000");
      funcionario[0].setRegistro("1234567");
      funcionario[0].setSalario(2500.00);
      funcionario[0].setNascimento(new Data(20, 3, 1990));
      
      System.out.println(funcionario[0]); 

   }
}
