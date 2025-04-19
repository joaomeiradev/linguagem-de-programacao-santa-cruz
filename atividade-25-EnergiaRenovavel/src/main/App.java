package main;

import services.EquipamentoEletrico;
import services.DispositivoMonitoramento;
import services.PlacaSolar;

public class App {
    public static void main(String[] args) {
        PlacaSolar[] placas = new PlacaSolar[3];

        placas[0] = new PlacaSolar(
                new EquipamentoEletrico(350.0, "SolarTech"),
                new DispositivoMonitoramento("Temperatura")
        );

        placas[1] = new PlacaSolar(
                new EquipamentoEletrico(400.0, "EcoPower"),
                new DispositivoMonitoramento("Radiação Solar")
        );

        placas[2] = new PlacaSolar(
                new EquipamentoEletrico(300.0, "GreenVolt"),
                new DispositivoMonitoramento("Umidade")
        );

        System.out.println("Placas solares com sensores específicos:");
        for (PlacaSolar placa : placas) {
            System.out.printf(
                    "- Potência: %.1fW | Fabricante: %s | Sensor: %s\n",
                    placa.getEquipamento().getPotencia(),
                    placa.getEquipamento().getFabricante(),
                    placa.getDispositivo().getTipoSensor()
            );
        }
    }
}
