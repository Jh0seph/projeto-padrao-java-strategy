package VeiculoAcao;

import AcaoPrimaria.Movement;

public class OnibusMove implements Movement {

    @Override
    public void move() {
        System.out.println("O ônibus está se movendo...");
    }
}
