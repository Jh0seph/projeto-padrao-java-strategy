package VeiculoAcao;

import AcaoPrimaria.Movement;

public class BikeMove implements Movement {

    @Override
    public void move() {
        System.out.println("Bicicleta está se movendo...");
    }
}
