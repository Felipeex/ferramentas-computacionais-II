enum Sexo {
  MASCULINO,
  FEMININO,
  OUTRO
}

class PessoaFisica extends Contribuinte {
  private Sexo sexo;

  public PessoaFisica(String nome, Sexo sexo, String cpf, double rendaBruta) {
    super(nome, cpf, rendaBruta);
    this.setSexo(sexo);
  }

  public Sexo getSexo() {
    return this.sexo;
  }

  final public void setSexo(Sexo sexo) {
    this.sexo = sexo;
  }

  @Override
  public double calcImposto() {
    if (this.getRendaBruta() > 1400 && this.getRendaBruta() <= 2100) {
      return 100;
    }
    
    if (this.getRendaBruta() > 2100 && this.getRendaBruta() <= 2800) {
      return 270;
    }

    if (this.getRendaBruta() > 2800 && this.getRendaBruta() <= 3600) {
      return 500;
    }

    if (this.getRendaBruta() > 3600) {
      return 700;
    }

    return 0; 
  }
}