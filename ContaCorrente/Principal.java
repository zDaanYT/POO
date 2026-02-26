public class Principal{
   public static void main(String args[]) {
      ContaCorrente conta1, conta2;
      
      conta1 = new ContaCorrente();
      conta2 = new ContaCorrente();
      
      conta1.nome = "Danilo Moreira Ribeiro";
      conta1.numero = 1914;
      conta1.agencia = 001;
      
      conta1.depositar(2000);
      conta1.imprimir();
   }
}