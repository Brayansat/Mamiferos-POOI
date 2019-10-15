
import java.util.Date;

public class Serie {

    private String titulo;

    private Date anio_inicio;

    private String sinopsis;

    private String genero;

    private Personaje personaje;

    private Usuario usuario;

    public Serie() {
    }

    public Serie(Usuario usuario, String titulo, Date anio_inicio, String sinopsis, String genero,Personaje personaje) {
        this.titulo = titulo;
        this.anio_inicio = anio_inicio;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.personaje = personaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getAnio_inicio() {
        return anio_inicio;
    }

    public void setAnio_inicio(Date anio_inicio) {
        this.anio_inicio = anio_inicio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void puntuacionSerie() {
        System.out.println("El usuario puntúo esta serie con : " + usuario.getPuntuarSerie());
    }

    public void marcarFavorito() { 
        if(usuario.getmarcarFav()== true){
            System.out.println("El usuario marcó esta serie como favorita");
       }
    }
}