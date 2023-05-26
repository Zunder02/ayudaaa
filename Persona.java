package sistemainvefarma;

public abstract class Persona {
    public int codigo;
    public String nombres; 
    public String apellido;
    public String sexo;
    public String direccion;
    public int docIden;
    public int telefono;
    public String email;


public Persona(int codigo, String nombres, String sexo, String direccion, int docIden, int telefono, String email){
    this.codigo = codigo;
    this.nombres = nombres;
    this.sexo = sexo;
    this.direccion = direccion;
    this.docIden = docIden;
    this.telefono = telefono;
    this.email = email;
    }

    public int getcodigo() {return codigo;}
    public void setcodigo(int codigo) {this.codigo = codigo;}
    public String getnombres() {return nombres;}
    public void setnombres(String nombres) {this.nombres = nombres;}
    public String getapellido() {return apellido;}
    public void setapellido(String apellido) {this.apellido = apellido;}
    public String setsexo() {return sexo;}
    public void setsexo(String sexo) {this.sexo = sexo;}
    public String setdireccion(){return direccion;}
    public int getdocIden() {return docIden;}
    public void setdocIden(int docIden) {this.docIden = docIden;}
    public int gettelefono(){return telefono;}
    public void settelefono(int telefono) {this.telefono = telefono;}
    public String getemail(){return email;}
    public void setemail(String email) {this.email = email;}

}
