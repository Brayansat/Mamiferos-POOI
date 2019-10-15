import java.util.*;
public class Carrera
{
    Integer codigo;
    String nombre;
    Integer semestres;
    Integer creditos;
    String titulo;
    String director;
    Date fechaInicio;
    public Carrera(){
    }

    public Carrera(Integer codigo, String nombre, Integer semestres, Integer creditos, String titulo,
    String director, Date fechaInicio)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.semestres=semestres;
        this.creditos=creditos;
        this.titulo=titulo;
        this.director=director;
        this.fechaInicio=fechaInicio;

    }

    public Integer getCodigo(){
        return this.codigo;
    }

    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer getSemestres(){
        return this.semestres;
    }

    public void setSemestres(Integer semestres){
        this.semestres = semestres;
    }

    public  Integer getCreditos(){
        return this.creditos;
    }

    public void setCreditos(Integer creditos){
        this.creditos = creditos;
    }

    public  String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String codigo){
        this.titulo = titulo;
    }

    public String getDirector(){
        return this.director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public Date getFechaInicio(){
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public void promedioCreditos()
    {
        double prom= getCreditos()/getSemestres();
        System.out.println("El promedio de créditos por semestre de la carrera es : " + prom);
    }

}