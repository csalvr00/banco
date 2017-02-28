
/**
 * Write a description of class cuentab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cuentab
{
   double saldo;
   double interes;
   cliente dueño;
   
   public cuentab()
   {
    saldo=0;
    interes=2.5;
   }
   
     public void consultarSaldo()
  {
      
      System.out.println(saldo);
  }
  
  public void meterd(double d)
  {
      saldo= saldo + d;
      System.out.println("Tras ingresar " + d + " euros .Ahora tengo " + saldo);
  }
   public void sacard(double d)
  {
      saldo= saldo - d;
      System.out.println("Tras sacar " + d + " euros .Ahora tengo " + saldo);
  }
}
