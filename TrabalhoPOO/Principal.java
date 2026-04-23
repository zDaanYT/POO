public class Principal {
   public static void main(String args[]) {
      Data nascimento[] = new Data[6];
      Aluno aluno[] = new Aluno[1];
      Funcionario funcionario[] = new Funcionario[1];
      Funcionario professor[] = new Professor[1];
      Funcionario chefe[] = new Chefe[1];
      
      nascimento[0] = new Data(00, 00, 0000); 
      aluno[0] = new Aluno();
      aluno[0].setNome("Danilo Moreira Ribeiro");
      aluno[0].setCPF("12345678900");
      aluno[0].setNascimento(nascimento[0]);
      aluno[0].setTelefone("42991647496");
      aluno[0].setRA("25031526");
      aluno[0].setDisciplinas(5);
      aluno[0].setNascimento(new Data(24, 05, 2004));
      
      aluno[0].matricular(aluno[0].getDisciplinas());
      
      if (aluno[0].this.matricula == true) {
         System.out.println("Aluno matriculado com sucesso!");
         System.out.println(aluno[0]);
      } else { System.out.println("Matricula falhou."); }

      nascimento[1] = new Data(00, 00, 0000);
      chefe[0] = new Chefe();
      chefe[0].setNome("Carlos Silva");
      chefe[0].setCPF("09876543210");
      chefe[0].setNascimento(nascimento[1]);
      chefe[0].setCargo("Diretor");
      chefe[0].setTelefone("4284000000");
      chefe[0].setRegistro("1456789");
      chefe[0].setSalario(5000.00);
      chefe[0].setNascimento(new Data(15, 08, 1980));

      System.out.println(chefe[0]);

      nascimento[2] = new Data(00, 00, 0000);
      professor[0] = new Professor();
      professor[0].setNome("Maria Oliveira");
      professor[0].setCPF("11223344556");
      professor[0].setNascimento(nascimento[2]);
      professor[0].setTelefone("42991660000");
      professor[0].setRegistro("9876543");
      professor[0].setSalario(3000.00);
      professor[0].setHorasAula(40);
      professor[0].setNascimento(new Data(10, 12, 1985));

      System.out.println(professor[0]);

   }
}
