package sistemainvefarma;

public class Medico {

    private int IdMed;
    private String nomMed;
    private String apellMed;
    private String especialdad;
    private String telefono;
    private String email;

    public Medico(int IdMed, String nomMed, String apellMed, String especialdad, String telefono, String email) {
        this.IdMed = IdMed;
        this.nomMed = nomMed;
        this.apellMed = apellMed;
        this.especialdad = especialdad;
        this.telefono = telefono;
        this.email = email;
    }

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public int getIdMed() {return IdMed;}
    public void setIdMed(int IdMed) {this.IdMed = IdMed;}
    public String getNomMed() {return nomMed;}
    public void setNomMed(String nomMed) {this.nomMed = nomMed;}
    public String getApellMed() {return apellMed;}
    public void setApellMed(String apellMed) {this.apellMed = apellMed;}
    public String getEspecialdad() {return especialdad;}
    public void setEspecialdad(String especialdad) {this.especialdad = especialdad;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
