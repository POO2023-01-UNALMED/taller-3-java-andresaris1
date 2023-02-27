package televisores;

public class TV {

	private static int numTV = 0;
    private String marca;
    private int canal;
    private double precio;
    private boolean estado;
    private int volumen;
    private String control;

    private TV(String marca, boolean estado) {
        this.marca = marca;
        this.canal = 1;
        this.precio = 500.0;
        this.estado = estado;
        this.volumen = 1;
        this.control = null;
        TV.numTV += 1;
    }

    public static TV crearTV(String marca, boolean estado) {
        return new TV(marca, estado);
    }

    public static int getNumTV() {
        return TV.numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        if (this.estado && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void encender() {
        this.estado = true;
    }

    public void apagar() {
        this.estado = false;
    }

    public void subirCanal() {
        if (this.estado && this.canal < 120) {
            this.canal += 1;
        }
    }

    public void bajarCanal() {
        if (this.estado && this.canal > 1) {
            this.canal -= 1;
        }
    }

    public void subirVolumen() {
        if (this.estado && this.volumen < 7) {
            this.volumen += 1;
        }
    }

    public void bajarVolumen() {
        if (this.estado && this.volumen > 0) {
            this.volumen -= 1;
        }
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        if (this.estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public String getControl() {
        return this.control;
    }

    public void setControl(String control) {
        this.control = control;
    }
}