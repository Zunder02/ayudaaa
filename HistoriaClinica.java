package sistemainvefarma;

public class HistoriaClinica {
    int idHisCli;
//date fecha;
    double peso;
    String Diagnostico;

    public HistoriaClinica(int idHisCli, double peso, String Diagnostico) {
        this.idHisCli = idHisCli;
        this.peso = peso;
        this.Diagnostico = Diagnostico;
    }

    public int getIdHisCli() {return idHisCli;}
    public void setIdHisCli(int idHisCli) {this.idHisCli = idHisCli;}
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    public String getDiagnostico() {return Diagnostico;}
    public void setDiagnostico(String Diagnostico) {this.Diagnostico = Diagnostico;}
    //public actualizar historial
    // public consultar historial 
    
}
