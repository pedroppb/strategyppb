package strategyppb;

public class Locacao {
    private String inicio;
    private String fim;
    private String carro;
    private String tipoAluguel;

    public Locacao(String inicio, String fim, String carro, String tipoAluguel) {
        this.inicio = inicio;
        this.fim = fim;
        this.carro = carro;
        this.tipoAluguel=tipoAluguel;
    }
    public String Descricao(Aluguel aluguel){
        String S = "descricao da locação:"+
                "\nDe: "+inicio+
                "\nAté: "+fim+
                "\nDe: "+carro+
                "\n"+aluguel.Descricao(tipoAluguel);
        return S;
    }
}
