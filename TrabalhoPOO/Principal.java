public class Principal {
   public static void main(String args[]) {
      Data  nascimento[] = new Data[6];
      Aluno aluno[] = new Aluno[1];
      Funcionario chefe[] = new Chefe[1];
      
      nascimento[0] = new Data(00, 00, 0000);
      aluno[0] = new Aluno();
      aluno[0].setNome("Danilo Moreira Ribeiro");
      aluno[0].setCpf("12345678900");
      aluno[0].setNascimento(nascimento[0]);
      aluno[0].setTelefone("42991647496");
      aluno[0].setMatricula("25031526");
      aluno[0].setNascimento(new Data(24, 05, 2004));
      
      System.out.println(aluno[0]);
      // teste de commt
      
   }
}
