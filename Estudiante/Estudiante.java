public class Estudiante 
{
    Integer codigo;
    String nombre;
    Integer telefono;
    String email;
    String direccion;
    Integer edad;
    Integer documento;
    String tipoDocumento;
    Integer creditosCursados;
    Integer semestresCursados;
    String estado;
    Carrera carrera;
    public Estudiante(){
    }

    public Estudiante( Integer codigo, String nombre, Integer telefono, String email, String direccion,Integer edad, 
    Integer documento, String tipoDocumento, Integer creditosCursados, Integer semestresCursados, String estado)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.telefono=telefono;
        this.email=email;
        this.direccion=direccion;
        this.edad=edad;
        this.documento=documento;
        this.tipoDocumento=tipoDocumento;
        this.creditosCursados=creditosCursados;
        this.semestresCursados=semestresCursados;
        this.estado=estado;
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

    public Integer getTelefono(){
        return this.telefono;
    }

    public void setTelefono(Integer telefono){
        this.telefono = telefono;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public Integer getEdad(){
        return this.edad;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }

    public Integer getDocumento(){
        return this.documento;
    }

    public void setDocumento(Integer documento){
        this.documento = documento;
    }

    public String getTipoDocumento(){
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getCreditosCursados(){
        return this.creditosCursados;
    }

    public void setCreditosCursados(Integer creditosCursados){
        this.creditosCursados = creditosCursados;
    }

    public Integer getSemestresCursados(){
        return this.semestresCursados;
    }

    public void setSemestresCursados(Integer semestresCursados){
        this.semestresCursados = semestresCursados;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void calcularMayoriaEdad()
    {
        if(getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else{
            System.out.println("El estudiante es menor de edad");
        }
    }

    public void totalidadCreditos()
    {
        if(getCreditosCursados()== carrera.getCreditos()){
            System.out.println("Estas a un paso de ser" + carrera.getTitulo());
        }      
    }

    public void calcularProyectoGrado()
    {
        if((getCreditosCursados()>=(carrera.getCreditos()*0.70))&&
        getSemestresCursados()>=7){
            System.out.println("El estudiante puede matricular proyecto de grado");
        }
    }

    public String actualizarEstadoPFU()
    {
        if(getSemestresCursados()>=(carrera.getSemestres()*2))
        {
            this.estado= "PFU";  
        }
        return estado;
    }
} 