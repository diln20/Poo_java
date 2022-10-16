
package Logic;

/**
 *
 * @author dilan
 */
public class Poo {

    public static void main(String[] args) {
        System.out.println();
        Alumno alu1=new Alumno(1,"Dilan","Torres");
        Alumno alu2=new Alumno();
        System.out.println("la id del alumno 2 es: "+alu1.getId());
        System.out.println("el nombres es: "+alu1.getNombre());
        System.out.println("el apellido es: "+alu1.getApellido());
        
        
        alu2.setId(2);
        alu2.setNombre("Violeta");
        alu2.setApellido("Perez");
        
        System.out.println("---------------------------------------------");
        System.out.println("la id del alumno 2 es: "+alu2.getId());
        System.out.println("el nombres es: "+alu2.getNombre());
        System.out.println("el apellido es: "+alu2.getApellido());
        
        
        System.out.println("---------------------------------------------");
        alu2.setId(3);
        System.out.println("la id del alumno 2 es: "+alu2.getId());
        System.out.println("el nombres es: "+alu2.getNombre());
        System.out.println("el apellido es: "+alu2.getApellido());
        
        
    }
    
}
