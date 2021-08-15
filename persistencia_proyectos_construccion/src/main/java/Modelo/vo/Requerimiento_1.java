package Modelo.vo;

public class Requerimiento_1 {

    private String ciudad;
    private String acabado;
    private String clasificacion;
    private String bancoVinculado;
    private String constructora;

    public Requerimiento_1() {
    }

    public Requerimiento_1(String ciudad, String acabado, String clasificacion, String bancoVinculado,
            String constructora) {
        this.ciudad = ciudad;
        this.acabado = acabado;
        this.clasificacion = clasificacion;
        this.bancoVinculado = bancoVinculado;
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAcabado() {
        return acabado;
    }

    public void setAcabado(String acabado) {
        this.acabado = acabado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
}
