public class Principal {
   public static void main (String args[]) {
      ContaCorrente contas[] = new ContaCorrente[3];
      
      contas[0] = new ContaCorrente("Danilo", 1914, 001, 5000, 1000);
      contas[1] = new ContaCorrente("Danilo M.", 1915, 002, 5000);
      contas[2] = new ContaCorrente("Danilo M. R.", 1916, 003);
      
      contas[0].sacar(1000);
      contas[0].imprimir();
      
      contas[1].sacar(1000);
      contas[2].sacar(1000);
     
      
   }
}