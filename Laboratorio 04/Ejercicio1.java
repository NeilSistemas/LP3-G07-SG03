class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;

    public Contacto(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}


import java.util.ArrayList;
import java.util.Scanner;

public class Lab04 {

    public static void main(String[] args) {
        ArrayList<Contacto> Agenda  = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("AGENDA DE CONTACTOS");
            System.out.println("1) Aniadir contacto");
            System.out.println("2) Buscar contacto");
            System.out.println("3) Modificar contacto");
            System.out.println("4) Borrar contacto");
            System.out.println("5) Mostrar contactos");
            System.out.println("6) Salir");
            System.out.println();
        
            System.out.print("Por favor seleccione la opcion deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.println("Selecciono la opcion 1: ");
                    System.out.println("ANIADIR CONTACTO");
                    System.out.print("Ingrese Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Telefono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese la Direccion: ");
                    String direccion = scanner.nextLine();
                    Contacto NueContacto = new Contacto(nombre,telefono,direccion);
                    Agenda.add(NueContacto);
                    System.out.println("Contacto Aniadido Satisfactoriamente");
                    System.out.println();
                    break;
                
                case 2:
                    System.out.println("Selecciono la opcion 2: ");
                    System.out.println("BUSCAR CONTACTO");
                    System.out.print("Ingrese el nombre del contacto que quiere buscar: ");
                    String BuscarNom = scanner.nextLine();
                    for(Contacto contacto : Agenda){
                        if(contacto.getNombre().equalsIgnoreCase(BuscarNom)){
                            System.out.println("El Nombre es: " + contacto.getNombre());
                            System.out.println("El Telefono es: " + contacto.getTelefono());
                            System.out.println("La Direccion es: " + contacto.getDireccion());
                            break;
                        }else{
                            System.out.println("Contacto no Encontrado");
                        }
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.println("Selecciono la opcion 3: ");
                    System.out.println("MODIFICAR CONTACTO");
                    System.out.println("Ingrese el nombre de contacto que quiere modificar: ");
                    String ModNom = scanner.nextLine();
                    for(Contacto contacto : Agenda){
                        if(contacto.getNombre().equalsIgnoreCase(ModNom)){
                            System.out.print("Ingrese el nuevo Nombre: ");
                            String nueNom = scanner.nextLine();
                            System.out.print("Ingrese el nuevo Telefono: ");
                            String nueTel = scanner.nextLine();
                            System.out.print("Ingrese la nueva Direccion; ");
                            String nuevDir = scanner.nextLine();
                            
                            contacto.setNombre(nueNom);
                            contacto.setTelefono(nueTel);
                            contacto.setDireccion(nuevDir);
                            
                            System.out.println("Contacto Modificado Satisfactoriamente");
                            break;
                        }else{
                            System.out.println("Contacto no encontrado");
                        }
                    }
                    System.out.println();
                    break;
                        
                case 4:
                    System.out.println("Selecciono la opcion 4: ");
                    System.out.println("BORRAR CONTACTO");
                    System.out.print("Ingrese el nombre del contacto que desea borrar: ");
                    String BorCon = scanner.nextLine();
                    Contacto BorrarContacto = null;
                    
                    for(Contacto contacto : Agenda){
                        if(contacto.getNombre().equalsIgnoreCase(BorCon)){
                            BorrarContacto = contacto;
                            break;
                        }
                    }
                    if(BorrarContacto != null){
                        Agenda.remove(BorrarContacto);
                        System.out.println("Contacto Borrado Satisfactoriamente");
                    }else{
                        System.out.println("Contacto no Encontrado");
                    }
                    System.out.println();                   
                    break;
                    
                case 5:
                    System.out.println("Selecciono la opcion 5: ");
                    System.out.println("MOSTRAR CONTACTOS");
                    for(Contacto contacto : Agenda){
                        System.out.println("Nombre: " + contacto.getNombre());
                        System.out.println("Telefono: " + contacto.getTelefono());
                        System.out.println("Direccion: " + contacto.getDireccion());         
                        System.out.println();
                    }
                    System.out.println();                    
                    break;
                    
                case 6:
                    System.out.println("Selecciono la opcion 6: ");
                    System.out.println("SALIR");
                    System.out.println("Saliendo de la Agenda");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opcion Invalida. Vuelva a ingresar");
            }
        }
    }
}

