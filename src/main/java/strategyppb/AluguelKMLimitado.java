package strategyppb;

public class AluguelKMLimitado implements Aluguel {
    public String Descricao(String tipoAluguel) {
        return "aluguel por KM: " + tipoAluguel+" KM";
    }
}
