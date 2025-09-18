abstract class Contribuinte implements ITributacao {
  private String nome;
  private String documento;
  private double rendaBruta;

  public Contribuinte(String nome, String documento, double rendaBruta) {
    this.setNome(nome);
    this.setDocumento(documento);
    this.setRendaBruta(rendaBruta);
  }

  public String getNome() {
    return this.nome;
  }

  final public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDocumento() {
    return this.documento;
  }

  final public void setDocumento(String documento) {
    this.documento = documento;
  }

  public double getRendaBruta() {
    return this.rendaBruta;
  }

  final public void setRendaBruta(double rendaBruta) {
    this.rendaBruta = rendaBruta;
  }
}