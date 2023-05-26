package sistemainvefarma;

public class Paciente {

    int docIdenPac;
    String nomPac;
    String apePac;
    String tipoSangre;
    char sexoPac;
    String direcPac;
    String telePac;
    String emailPac;

    public Paciente(int docIdenPac, String nomPac, String apePac, String tipoSangre, char sexoPac, String direcPac, String telePac, String emailPac) {
        this.docIdenPac = docIdenPac;
        this.nomPac = nomPac;
        this.apePac = apePac;
        this.tipoSangre = tipoSangre;
        this.sexoPac = sexoPac;
        this.direcPac = direcPac;
        this.telePac = telePac;
        this.emailPac = emailPac;
    }

    public int getDocIdenPac() {return docIdenPac;}
    public void setDocIdenPac(int docIdenPac) {this.docIdenPac = docIdenPac;}
    public String getNomPac() {return nomPac;}
    public void setNomPac(String nomPac) {this.nomPac = nomPac;}
    public String getApePac() {return apePac;}
    public void setApePac(String apePac) {this.apePac = apePac;}
    public String getTipoSangre() {return tipoSangre;}
    public void setTipoSangre(String tipoSangre) {this.tipoSangre = tipoSangre;}
    public char getSexoPac() {return sexoPac;}
    public void setSexoPac(char sexoPac) {this.sexoPac = sexoPac;}
    public String getDirecPac() {return direcPac;}
    public void setDirecPac(String direcPac) {this.direcPac = direcPac;}
    public String getTelePac() {return telePac;}
    public void setTelePac(String telePac) {this.telePac = telePac;}
    public String getEmailPac() {return emailPac;}
    public void setEmailPac(String emailPac) {this.emailPac = emailPac;}
}
