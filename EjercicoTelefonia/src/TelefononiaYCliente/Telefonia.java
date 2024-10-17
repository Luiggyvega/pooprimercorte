package TelefononiaYCliente;

public class Telefonia {
    private String nombrePlan;
    private String descripcionPlan;
    private String tipoPlan;
    private String cantidadMinutos;
    private String gigas;
    private double precioPlan;

    public Telefonia(String nombrePlan, String descripcionPlan, String tipoPlan, String cantidadMinutos, String gigas, double precioPlan) {
        this.nombrePlan = nombrePlan;
        this.descripcionPlan = descripcionPlan;
        this.tipoPlan = tipoPlan;
        this.cantidadMinutos = cantidadMinutos;
        this.gigas = gigas;
        this.precioPlan = precioPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public String getDescripcionPlan() {
        return descripcionPlan;
    }

    public double getPrecioPlan() {
        return precioPlan;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public String getCantidadMinutos() {
        return cantidadMinutos;
    }

    public String getGigas() {
        return gigas;
    }
}
