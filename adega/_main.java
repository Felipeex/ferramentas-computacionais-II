
import java.time.LocalDate;

class Main {
  public static void main(String[] args) {
    Adega adega = new Adega();
    Vinho vinho = new Vinho(TipoVinho.BRANCO, "Natal", 750, LocalDate.now(), 50.0);

    adega.adicionar(vinho, 15, 5);

    adega.visualizar();
  }
}