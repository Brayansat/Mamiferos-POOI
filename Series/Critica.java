
import java.util.Date;

public class Critica {

    private Date fecha;

    private String comentario;
    
    private Serie serie;
    

    public Critica() {
    }

    public Critica(Date fecha, String comentario, Serie serie) {
        this.fecha = fecha;
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}
