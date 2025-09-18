
import java.util.ArrayList;
import java.util.List;

class PagadoresImposto {
  List<Contribuinte> contribuintes;

  public PagadoresImposto() {
    this.contribuintes = new ArrayList<>();
  }

  public void inserirContribuinte(Contribuinte contribuinte) {
    contribuintes.add(contribuinte);
  }

  public double getTotalImposto() {
    double totalImposto = 0;

    for (Contribuinte contribuinte: contribuintes) {
      totalImposto += contribuinte.calcImposto();
    }

    return totalImposto;
  }

  public double porcentagemDeContribuintesFeminino() {
    double quantidadeContribuintesFeminino = 0;
    double quantidadeContribuintesPessoasTotal = 0;

    for (Contribuinte contribuinte: contribuintes) {
      if (contribuinte instanceof PessoaFisica pessoa) {
        if (pessoa.getSexo() == Sexo.FEMININO) {
          quantidadeContribuintesFeminino++;
        }

        quantidadeContribuintesPessoasTotal++;
      }
    }
    
    return (quantidadeContribuintesFeminino / quantidadeContribuintesPessoasTotal) * 100;
  }
}