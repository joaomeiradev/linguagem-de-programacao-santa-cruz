package services;

public class DispositivoMonitoramento {
    private String tipoSensor;

    public DispositivoMonitoramento(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }
}
