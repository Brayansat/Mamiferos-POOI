public class Capitulo {

    private String titulo;

    private Integer duracion;

    private String sinopsis;

    private String estado;

    private Temporada temporada;
    
    private Critica critica;
    
    public Capitulo() {
    }

    public Capitulo(String titulo, Integer duracion, String sinopsis, String estado, Critica critica) {
        
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
