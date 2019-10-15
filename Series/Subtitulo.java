public class Subtitulo {

    private String comentario;

    private String autor;
    
    private Capitulo capitulo;
    
    public Subtitulo() {
    }

    public Subtitulo(String comentario, String autor, Capitulo capitulo) {
        this.comentario = comentario;
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
