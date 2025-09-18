class Main {
  public static void main(String[] args) {
    PagadoresImposto pagadoresImposto = new PagadoresImposto();

    pagadoresImposto.inserirContribuinte(new PessoaFisica("Felipe Lima Santos", Sexo.MASCULINO, "727.471.910-60", 2500));
    pagadoresImposto.inserirContribuinte(new PessoaFisica("Edivaldo Lima Santos", Sexo.MASCULINO, "836.155.940-02", 4000));

    pagadoresImposto.inserirContribuinte(new PessoaFisica("Lorena Lima Santos", Sexo.FEMININO, "797.600.100-03", 1450));

    System.out.printf("Total imposto: %.2f\n", pagadoresImposto.getTotalImposto());
    System.out.printf("Porcentagem de Contribuintes femininos: %.2f%%\n", pagadoresImposto.porcentagemDeContribuintesFeminino());
  }
}