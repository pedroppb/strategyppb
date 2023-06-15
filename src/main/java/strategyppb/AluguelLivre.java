package strategyppb;

public class AluguelLivre implements Aluguel{
    public String Descricao(String tipoAluguel){
        return "aluguel por Km "+tipoAluguel;
    }
}
