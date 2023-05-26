package sistemainvefarma;

public class Receta {

    private int idRec;
    private int idMed;
    private int idPac;
//date fechaEmi;
    private int idProd;
    private String indicaciones;

    public Receta(int idRec, int idMed, int idPac, int idProd, String indicaciones) {
        this.idRec = idRec;
        this.idMed = idMed;
        this.idPac = idPac;
        this.idProd = idProd;
        this.indicaciones = indicaciones;
    }

    public String getIndicaciones() {return indicaciones;}
    public void setIndicaciones(String indicaciones) {this.indicaciones = indicaciones;}
    public int getIdRec() {return idRec;}
    public void setIdRec(int idRec) {this.idRec = idRec;}
    public int getIdMed() {return idMed;}
    public void setIdMed(int idMed) {this.idMed = idMed;}
    public int getIdPac() {return idPac;}
    public void setIdPac(int idPac) {this.idPac = idPac;}
    public int getIdProd() {return idProd;}
    public void setIdProd(int idProd) {this.idProd = idProd;}
}
