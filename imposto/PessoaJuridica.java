class PessoaJuridica extends Contribuinte {
  private int anoDeFundacao;

  public PessoaJuridica(String nome, int anoDeFundacao, String cnpj, double rendaBruta) {
    super(nome, cnpj, rendaBruta);
    this.setAnoDeFundacao(anoDeFundacao);
  }

  public int getAnoDeFundacao() {
    return this.anoDeFundacao;
  }

  final public void setAnoDeFundacao(int anoDeFundacao) {
    this.anoDeFundacao = anoDeFundacao;
  }

  @Override
  public double calcImposto() {
    return this.getRendaBruta() * 0.1;
  }
}