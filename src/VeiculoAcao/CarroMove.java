package VeiculoAcao;

import AcaoPrimaria.Movement;

public class CarroMove implements Movement {

    @Override
    public void move() {
        System.out.println("O carro está se movendo...");
    }
}
