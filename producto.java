package sistemainvefarma;

public class producto {

    private int idProd;
    private String nomProd;
    private String tipoProd;
    private String marca;
//Time fechaVen;
    private String presentacion;
    private double precioProd;

    public producto(int idProd, String nomProd, String tipoProd, String marca, String presentacion, double precioProd) {
        this.idProd = idProd;
        this.nomProd = nomProd;
        this.tipoProd = tipoProd;
        this.marca = marca;
        this.presentacion = presentacion;
        this.precioProd = precioProd;
    }

    public double getPrecioProd() {return precioProd;}
    public void setPrecioProd(double precioProd) {this.precioProd = precioProd;}
    public String getNomProd() {return nomProd;}
    public void setNomProd(String nomProd) {this.nomProd = nomProd;}
    public String getTipoProd() {return tipoProd;}
    public void setTipoProd(String tipoProd) {this.tipoProd = tipoProd;}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public String getPresentacion() {return presentacion;}
    public void setPresentacion(String presentacion) {this.presentacion = presentacion;}
    public int getIdProd() {return idProd;}
    public void setIdProd(int idProd) {this.idProd = idProd;}
}
