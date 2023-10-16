import Veiculo.Veiculo;
import VeiculoAcao.BicicletaMove;
import VeiculoAcao.CarroMove;
import VeiculoAcao.MotoMove;
import VeiculoAcao.OnibusMove;

public class Main {
    public static void main(String[] args) {
        // Comando do carro
        Veiculo carro = new Veiculo(new CarroMove());
        carro.move();

        // Comando do bicicleta
        Veiculo bicibleta = new Veiculo(new BicicletaMove());
        bicibleta.move();

        // Comando do moto
        Veiculo moto = new Veiculo(new MotoMove());
        moto.move();

        // Comando do onibus
        Veiculo onibus = new Veiculo(new OnibusMove());
        onibus.move();
    }
}
