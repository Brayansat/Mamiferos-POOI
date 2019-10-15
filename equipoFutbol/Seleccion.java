public class Seleccion {

    private Integer id;

    private String nombre;

    private String apellidos;

    private Integer edad;

    private Futbolistas f1;

    private Masajistas m;

    private Entrenadores e;

    public Seleccion(){
    }

    public Seleccion(Integer id, String nombre, String apellidos, Integer edad){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }

    public Integer getEdad(){
        return edad;
    }

    public void setEdad(Integer edad){
        this.edad=edad;
    }

    public void espacioConcent(){
        System.out.println("La selección de fútbol " + getNombre() + " organiza una concentración, llevando consigo a sus Futbolistas: " + f1.getNombre() + " , a sus Entrenadores: " + e.getNombre() + " y sus masajistas: " + m.getNombre());
    }

    public void orgViaje(){
        System.out.println("La selección de fútbol " + getNombre() + " organiza un viaje, llevando consigo a sus Futbolistas: " + f1.getNombre() + " , a sus Entrenadores: " + e.getNombre() + " y sus masajistas: " + m.getNombre());
    }
}

