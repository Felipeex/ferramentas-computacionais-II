import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

enum TipoVinho {
  BRANCO,
  TINTO
}

class Vinho {
  private TipoVinho tipo;
  private String marca;
  private int volumeML;
  private LocalDate dataDeProducao;
  private Double valor;

  public Vinho(TipoVinho tipo, String marca, int volumeML, LocalDate dataDeProducao, Double valor) {
    this.tipo = tipo;
    this.marca = marca;
    this.volumeML = volumeML;
    this.dataDeProducao = dataDeProducao;
    this.valor = valor;
  }

  public TipoVinho getTipo() {
    return this.tipo;
  }

  public void setTipo(TipoVinho tipo) {
    this.tipo = tipo;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getVolumeML() {
    return this.volumeML;
  }

  public void setVolumeML(int volumeML) {
    if (volumeML < 0) {
      throw new Error("O valor deve ser positivo.");
    }

    this.volumeML = volumeML;
  }

  public LocalDate getDataDeProducao() {
    return this.dataDeProducao;
  }

  public Long getDataDeProducaoInDias() {
    final LocalDate now = LocalDate.now();
    return this.dataDeProducao.until(now,  ChronoUnit.DAYS);
  }

  public void setDataDeProducao(LocalDate dataDeProducao) {
    this.dataDeProducao = dataDeProducao;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    if (valor < 0) {
      throw new Error("O valor deve ser positivo.");
    }

    this.valor = valor;
  }  
}