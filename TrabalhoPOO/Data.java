public class Data {
   private int dia;
   private int mes;
   private int ano;
   
   public Data (int dia, int mes, int ano) {
      setDia(dia); // já validado.
      setMes(mes); // já validado.
      setAno(ano); // já validado.
   }
   
   public void setDia (int dia) {
      if (dia > 0 && dia <= 31) {
         this.dia = dia;
      } else {
         System.out.println("[ERRO] Dia invalido.\n");
      }
   }
   
   public void setMes (int mes) {
      if (mes > 0 && mes <= 12) {
         this.mes = mes;
      } else {
         System.out.println("[ERRO] Mes invalido.\n");
      }   
   }

   public void setAno (int ano) {
      if (ano > 0 && ano >= 1950 && ano <= 2026) {
         this.ano = ano;
      } else {
         System.out.println("[ERRO] Ano invalido.\n");
      }    
   } 
   
   public int getDia () {
      return this.dia;
   }
   
   public int getMes () {
      return this.mes;
   }
   
   public int getAno () {
      return this.ano;
   }
}