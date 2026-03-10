public class ContaCorrente {
      private String nome;
      private int numero;
      private int agencia;
      private double saldo;
      private double limite;
      
      public ContaCorrente (String nome, int numero, int agencia, double saldo, double limite) {
         this.nome = nome;
         this.numero = numero;
         this.agencia = agencia;
         this.saldo = saldo;
         this.limite = limite;
      }
      
      public ContaCorrente (String nome, int numero, int agencia, double saldo) {
         this.nome = nome;
         this.numero = numero;
         this.agencia = agencia;
         this.saldo = saldo;
      }
      
      public ContaCorrente (String nome, int numero, int agencia) {
         this.nome = nome;
         this.numero = numero;
         this.agencia = agencia;
      }
      
      public void setNome (String nome) {
         this.nome = nome;
      }
      
      public String getNome () {
         return this.nome;
      }
      
      public void setNumero (int numero) {
         if (numero > 0) {
            this.numero = numero;
         } else 
            System.out.println("Numero invalido.");
      }
      
      public int getNumero (){
         return this.numero;
      }
      
      public void setAgencia (int agencia) {
         if (agencia > 0) {
            this.agencia = agencia;
         } else 
            System.out.println("Numero de conta invalido.");
      }
      
      public int getAgencia () {
         return this.agencia;
      }
      
      public void setSaldo (double saldo) {
         if (saldo >= 0) {
            this.saldo = saldo;
         } else 
            System.out.println("Voce e pobre! Nao foi possivel sacar.");
      }
      
      public double getSaldo () {
         return this.saldo;
      }
      
      public void setLimite (double limite) {
         if (limite >= 0) {
            this.limite = limite;
         } else 
            System.out.println("Pare de dever, pobre!");
      }
      
      public double getLimite () {
         return this.limite;
      } 
      
      
      public void atualizar (double saldo, double limite) {
         setSaldo(saldo);
         setLimite(limite);
      }
      
      public void atualizar (String nome, int numero) {
         setNome(nome);
         setNumero(numero);
      }
      
      
      public void sacar(double valor) {
         if (valor > 0 && valor <= saldo && limite >= valor){
            saldo = saldo - valor;
         } else {
            System.out.println("Impossivel sacar.");
         }
      }
      
      public void depositar(double valor){
         if (valor > 0) {
            saldo = saldo + valor;
         } else {
            System.out.println("Impossivel depositar.");
         }
      }
      
      public void imprimir(){
         System.out.println("Nome: " + nome);
         System.out.println("Numero: " + numero);
         System.out.println("Agencia: " + agencia);
         System.out.println("Saldo: " + saldo);
         System.out.println("Limite: " + limite + "\n");
         
      }      
}