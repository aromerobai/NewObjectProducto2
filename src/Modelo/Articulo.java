package Modelo;

public class Articulo {
    private String codigo;
    private String descripcion;
    private Float precio;
    private Float gastosEnvio;
    private int preparacion;

    public Articulo(String codigo, String despcripcion, Float precio, Float gastosEnvio, int preparacion){
        //Donde se incializa la clase Articulo.
        this.codigo = codigo;
        this.descripcion = despcripcion;
        this.precio = precio;
        this.gastosEnvio = gastosEnvio;
        this.preparacion = preparacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(Float gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public Integer getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(Integer preparacion) {
        this.preparacion = preparacion;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", gastosEnvio=" + gastosEnvio +
                ", preparacion=" + preparacion +
                '}';
    }
}
