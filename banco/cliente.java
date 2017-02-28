
/**
 * Write a description of class cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cliente
{
  String nombre;
  int edad;
  cuentab cuenta;

  public cliente(String nom, int ed)
  {
      nombre=nom;
      edad=ed;
    }
  public void abrirc()
  {
     cuenta=new cuentab();
     System.out.println("Creamos una cuenta bancaria");
    }
    
    public void consultarSaldo()
  {
     cuenta.consultarSaldo();
    }
       public void meterd(float d)
  {
     cuenta.meterd(d);
    }
         public void sacard(float d)
  {
     cuenta.sacard(d);
    }
    
    
  
    
}
