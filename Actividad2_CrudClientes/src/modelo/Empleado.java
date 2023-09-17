package modelo;
/**
 *
 * @author Luis Sazo
 */
public class Empleado extends Persona{
    private int id;
    private String codigo;
    private String idPuesto;
    Conexion cn;
    
    public Empleado(){
        
    }
    public Empleado(int id, String codigo,String nombres, String apellidos, String direccion, String telefono, String fechaNac, String idPuesto) {
        super(nombres, apellidos, direccion, telefono, fechaNac);
        this.id = id;
        this.codigo = codigo;
        this.idPuesto = idPuesto;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getIdPuesto() {
        return idPuesto;
    }
    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }
    
    // CRUD
   
}
