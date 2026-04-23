public class Principal {
   public static void main(String args[]) {
      Data  nascimento[] = new Data[6];
      Aluno aluno[] = new Aluno[1];
      Funcionario chefe[] = new Chefe[1];
      Funcionario professor[] = new Professor[1]
      
      nascimento[0] = new Data(00, 00, 0000); 
      aluno[0] = new Aluno();
      aluno[0].setNome("Danilo Moreira Ribeiro");
      aluno[0].setCpf("12345678900");
      aluno[0].setNascimento(nascimento[0]);
      aluno[0].setTelefone("42991647496");
      aluno[0].setMatricula("25031526");
      aluno[0].setNascimento(new Data(24, 05, 2004));
      
      System.out.println(aluno[0]);

      nascimento[1] = new Data(00, 00, 0000);
      chefe[0] = new Chefe();
      chefe[0].setNome("Carlos Silva");
      chefe[0].setCpf("09876543210");
      chefe[0].setNascimento(nascimento[1]);
      chefe[0].setTelefone("42991647496");
      chefe[0].setMatricula("123456789");
      chefe[0].setNascimento(new Data(15, 08, 1980));

      System.out.println(chefe[0]);

      nascimento[2] = new Data(00, 00, 0000);
      professor[0] = new Professor();
      professor[0].setNome("Maria Oliveira");
      professor[0].setCpf("11122233344");
      professor[0].setNascimento(nascimento[2]);
      professor[0].setTelefone("42991647496");
      professor[0].setMatricula("987654321");
      professor[0].setNascimento(new Data(10, 12, 1985));

      System.out.println(professor[0]);
   }
}
