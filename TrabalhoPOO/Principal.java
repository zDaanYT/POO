public class Principal {
   public static void main(String args[]) {
      Data  nascimento[] = new Data[3];
      Aluno alunos[] = new Aluno[3];
      
      nascimento[0] = new Data(00, 00, 0000);
      alunos[0] = new Aluno("Danilo Moreira Ribeiro", "12345678900", nascimento[0], "42991647496", "25031526");
      alunos[0].setNascimento(new Data(24, 05, 2004));
      
      System.out.println(aluno[0]);
      

   }
}
