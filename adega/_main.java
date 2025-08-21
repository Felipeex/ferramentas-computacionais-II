
import java.time.LocalDate;

class Main {
  public static void main(String[] args) {
    Adega adega = new Adega();
    adega.adicionar(new Vinho(TipoVinho.BRANCO, "Natal", 750, LocalDate.of(2025, 8, 19), 50.0), 0, 0);
    adega.adicionar(new Vinho(TipoVinho.TINTO, "Vinho 50 anos", 750, LocalDate.of(1975, 1, 1), 50.0), 0, 1);

    if (adega.vinhoMaisAntigo() != null) {
      System.out.println("Vinho mais antigo: " + adega.vinhoMaisAntigo().getMarca());
    }

    System.out.println("Quantidade de vinhos: " + adega.contarVinhos());
    System.out.println("Quantidade de vinhos branco: " + adega.contarVinhoBranco());
    System.out.println("Quantidade de vinhos tinto: " + adega.contarVinhoTinto());

    System.out.println();

    adega.visualizar();
  }
}