package strategyppb;

public class AluguelAnual implements Aluguel {
    public String Descricao(String tipoAluguel) {
        return "aluguel por tempo, tipo: " + tipoAluguel;
    }
}
