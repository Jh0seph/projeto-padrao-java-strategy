package Veiculo;

import AcaoPrimaria.Movement;

public class Veiculo {
    private Movement movement;

    public Veiculo(Movement movement) {
        this.movement = movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public void move() {
        movement.move();
    }
}
