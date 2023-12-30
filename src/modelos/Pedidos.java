package modelos;

public class Pedidos {
    
    //Variables Globales
    private int id;
    private String fecha;
    private String descrip;
    private double monto;
    private String direc;
    private String tlf;
    private String formaP;
    private boolean pgdo;
    private boolean etgdo;
    private String delivery;

    /*--- MÉTODOS GETTER'S-SETTER'S ---*/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getFormaP() {
        return formaP;
    }

    public void setFormaP(String formaP) {
        this.formaP = formaP;
    }

    public boolean isPgdo() {
        return pgdo;
    }

    public void setPgdo(boolean pgdo) {
        this.pgdo = pgdo;
    }

    public boolean isEtgdo() {
        return etgdo;
    }

    public void setEtgdo(boolean etgdo) {
        this.etgdo = etgdo;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    
}
