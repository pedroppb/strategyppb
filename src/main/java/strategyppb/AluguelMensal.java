package strategyppb;

public class AluguelMensal  implements Aluguel{
    public String Descricao(String tipoAluguel){
        return "aluguel por tempo, tipo: "+tipoAluguel;
    }
}
