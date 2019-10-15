
import java.util.Date;

public class Temporada {

    private Date fecha_produccion;

    private Date fecha_estreno;

    private Integer capitulos;

    private Integer num_temporada;

    private String estado;

    private Serie serie;

    private Capitulo capitulo;

    public Temporada() {
        Serie serie = new Serie();
    }

    public Temporada(Date fecha_produccion, Date fecha_estreno, Integer capitulos, Serie serie, Integer num_temporada) {
        this.fecha_produccion = fecha_produccion;
        this.fecha_estreno = fecha_estreno;
        this.capitulos = capitulos;
        this.serie = serie;
        this.num_temporada = num_temporada;
    }

    public Date getFecha_produccion() {
        return fecha_produccion;
    }

    public void setFecha_produccion(Date fecha_produccion) {
        this.fecha_produccion = fecha_produccion;
    }

    public Date getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(Date fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public Integer getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Integer capitulos) {
        this.capitulos = capitulos;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setFecha_produccion(Serie serie) {
        this.serie = serie;
    }

    public Integer getnum_Temporada() {
        return num_temporada;
    }

    public void setnum_Temporada(Integer num_temporada) {
        this.num_temporada = num_temporada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void marcarEmpezada() {
        if(capitulo.getEstado()== "Visto"){
            this.estado = "Empezada";
        }
    }
    
    public void marcarCancelada() {
        if(getEstado()=="Cancelada"){
            System.out.println("El usuario marcó esta serie como cancelada");
        }
    }
    
    public void marcarVista() {
        if(capitulo.getEstado()== "Visto"){
            this.estado = "Vista";
        }
    }

}
