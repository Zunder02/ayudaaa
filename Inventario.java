package sistemainvefarma;

public class Inventario {
    private int idInv;
    private int cantidadIng;
//date fechaing;
//date fechaSal;
    private int cantidadSal;

    public Inventario(int idInv, int cantidadIng, int cantidadSal) {
        this.idInv = idInv;
        this.cantidadIng = cantidadIng;
    }

    public int getIdInv() {return idInv;}
    public void setIdInv(int idInv) {this.idInv = idInv;}
    public int getCantidadIng() {return cantidadIng;}
    public void setCantidadIng(int cantidadIng) {this.cantidadIng = cantidadIng;}
    public int getcantidadSal(){return cantidadSal;}
    public void setcantidadSal(int cantidadSal){this.cantidadSal = cantidadSal;}
    //public fechaing
    //
}
