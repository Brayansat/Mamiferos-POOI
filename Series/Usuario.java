
import java.util.Date;

public class Usuario {

    private String nombre;

    private String apellido;

    private String email;

    private Date fecha_nacimiento;

    private Critica critica;

    private Serie serie;

    private Integer puntuarSerie;

    private Boolean marcarFav;

    private Capitulo capitulo;

    public Usuario() {
    }

    public Usuario(Capitulo capitulo, String marcarFav, Integer puntuarSerie, String nombre, String apellido, String email, Date fecha_nacimiento, Critica critica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Integer getPuntuarSerie() {
        return puntuarSerie;
    }

    public void setPuntuarSerie() {
        this.puntuarSerie = puntuarSerie;
    }

    public Boolean getmarcarFav() {
        return marcarFav;
    }

    public void setMarcarFav() {
        this.marcarFav = marcarFav;
    }

    public void capVistos() {
        if(capitulo.getEstado()== "Visto"){ 
            System.out.println("El usuario ha visto estos capítulos: " + capitulo.getTitulo());
        }
    }

}