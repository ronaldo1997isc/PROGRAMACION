/*
el polimorfismo permite definir distintos comportamientos para un objeto dependiendo la
manera en que se realize la implementación 
actualmente se uso el polimorfismo dinamico con Override
 */
package polimorfismo2;
import Instrumentos.Instrumentomusical;
import Instrumentos.Piano;
import Instrumentos.Tambor;
/**
 *
 * @author henryronaldo
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Instrumentomusical a=new Instrumentomusical() {
             @Override
             public void Sonar() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         };
         Piano p=new Piano();
         Tambor t=new Tambor();
    
         p.setNombre("Piano");
         t.setNombre("Tambor");
         
         //Llamada a los metodos polimorficos
         //por medio de la REDEFINICION DE METODOS
     
         System.out.println(p.getNombre());
         p.Sonar();
         System.out.println(t.getNombre());
         t.Sonar();
    }
    
}
