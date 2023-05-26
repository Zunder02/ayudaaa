package sistemainvefarma;

public class Proveedor {

    private int idProv;
    private String nomProv;
    private String direccProv;
    private String telefProv;
    private String emailProv;

    public Proveedor(int idProv, String nomProv, String direccProv, String telefProv, String emailProv) {
        this.idProv = idProv;
        this.nomProv = nomProv;
        this.direccProv = direccProv;
        this.telefProv = telefProv;
        this.emailProv = emailProv;
    }

    public String getEmailProv() {return emailProv;}
    public void setEmailProv(String emailProv) {this.emailProv = emailProv;}
    public int getIdProv() {return idProv;}
    public void setIdProv(int idProv) {this.idProv = idProv;}
    public String getNomProv() {return nomProv;}
    public void setNomProv(String nomProv) {this.nomProv = nomProv;}
    public String getDireccProv() {return direccProv;}
    public void setDireccProv(String direccProv) {this.direccProv = direccProv;}
    public String getTelefProv() {return telefProv;}
    public void setTelefProv(String telefProv) {this.telefProv = telefProv;}
}
