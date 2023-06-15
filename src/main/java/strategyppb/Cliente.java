package strategyppb;

public class Cliente {
    private String utilmoAluguel;

    public String getUtilmoAluguel(){
        return utilmoAluguel;
    }

    public void aluguelLivre(String inicio, String fim, String carro, String tipoAluguel){
        Locacao locacao = new Locacao(inicio, fim, carro, tipoAluguel);
        this.utilmoAluguel=locacao.Descricao(new AluguelLivre());
    }
    public void aluguelKMLimitado(String inicio, String fim, String carro, String tipoAluguel){
        Locacao locacao = new Locacao(inicio, fim, carro, tipoAluguel);
        this.utilmoAluguel=locacao.Descricao(new AluguelKMLimitado());
    }
    public void aluguelMensal(String inicio, String fim, String carro, String tipoAluguel){
        Locacao locacao = new Locacao(inicio, fim, carro, tipoAluguel);
        this.utilmoAluguel=locacao.Descricao(new AluguelMensal());
    }
    public void aluguelAnual(String inicio, String fim, String carro, String tipoAluguel){
        Locacao locacao = new Locacao(inicio, fim, carro, tipoAluguel);
        this.utilmoAluguel=locacao.Descricao(new AluguelAnual());
    }
}
