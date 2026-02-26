public class ContaCorrente {
   private double saldo;
   
   public String nome;
   public int numero;
   public int agencia;
   
      public void sacar(double valor) {
         if (valor > 0 && valor <= saldo){
            saldo = saldo - valor;
         } else {
            System.out.println("Impossível sacar.");
         }
      }
      
      public void depositar(double valor){
         if (valor > 0) {
            saldo = saldo + valor;
         } else {
            System.out.println("Impossível depositar.");
         }
      }
      
      public void imprimir(){
         System.out.println("Nome: " + nome);
         System.out.println("Numero: " + numero);
         System.out.println("Agencia: " + agencia);
         System.out.println("Saldo: " + saldo);
      }
}