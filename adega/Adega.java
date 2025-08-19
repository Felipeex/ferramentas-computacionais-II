class Adega {
  private final int ADEGA_LINHAS = 20;
  private final int ADEGA_COLUNAS = 10;
  private final Vinho[][] adega;

  public Adega() {
    adega = new Vinho[this.ADEGA_LINHAS][this.ADEGA_COLUNAS];
  }

  boolean isExiste(int linha, int coluna) {
    return adega[linha][coluna] != null;
  }

  boolean isExiste(Vinho vinho) {
    return vinho != null;
  }

  public void adicionar(Vinho vinho, int linha, int coluna) {
    if (linha < 0 || coluna < 0) {
      throw new Error("Esse posição não existe na adega.");
    }

    if (linha >= ADEGA_LINHAS || coluna >= ADEGA_COLUNAS) {
      throw new Error("Esse posição não existe na adega.");
    }

    if (!this.isExiste(linha, coluna)) {
      adega[linha][coluna] = vinho;
    }
  }

  private int contarVinhoPorTipo(TipoVinho tipo) {
    int contador = 0;

    for (int linha = 0; linha < ADEGA_LINHAS; linha++) {
      for (Vinho vinho: adega[linha]) {
        if (this.isExiste(vinho) && vinho.getTipo() == tipo) {
          contador++;
        }
      }
    }

    return contador;
  }

  public int contarVinhoBranco() {
    return this.contarVinhoPorTipo(TipoVinho.BRANCO);
  }

  public int contarVinhoTinto() {
    return this.contarVinhoPorTipo(TipoVinho.BRANCO);
  }

  public Vinho vinhoMaisAntigo() {
    
  }

  public void visualizar() {
    System.out.printf("%4s", "");

    for (int coluna = 0; coluna < ADEGA_COLUNAS; coluna++) {
      System.out.printf("%-3s", coluna);
    }

    System.out.println();

    for (int linha = 0; linha < ADEGA_LINHAS; linha++) {
      if (linha < 10) {
        System.out.printf("0");
      }

      System.out.printf(linha + " ");

      for (Vinho vinho: adega[linha]) {
        if (this.isExiste(vinho)) {
          System.out.printf("[x]");
        } else {
          System.out.printf("[ ]");
        }
      }

      System.out.println();
    }
  }
}