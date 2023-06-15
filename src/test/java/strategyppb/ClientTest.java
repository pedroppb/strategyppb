package strategyppb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClientTest {
    @Test
    void deveAlugarLivre() {
        Cliente cliente = new Cliente();
        cliente.aluguelLivre("12/05/2023","19/05/2023","Citroen C3","livre");
        assertEquals("descricao da locação:\n" +
                "De: 12/05/2023\n" +
                "Até: 19/05/2023\n" +
                "De: Citroen C3\n" +
                "aluguel por Km livre", cliente.getUtilmoAluguel());
    }

    @Test
    void deveAlugarKMLimitado() {
        Cliente cliente = new Cliente();
        cliente.aluguelKMLimitado("12/05/2023","19/05/2023","Citroen C3","5000");
        assertEquals("descricao da locação:\n" +
                "De: 12/05/2023\n" +
                "Até: 19/05/2023\n" +
                "De: Citroen C3\n" +
                "aluguel por KM: 5000 KM", cliente.getUtilmoAluguel());
    }

    @Test
    void deveAlugarMensal() {
        Cliente cliente = new Cliente();
        cliente.aluguelMensal("12/05/2023","19/05/2023","Citroen C3","mensal");
        assertEquals("descricao da locação:\n" +
                "De: 12/05/2023\n" +
                "Até: 19/05/2023\n" +
                "De: Citroen C3\n" +
                "aluguel por tempo, tipo: mensal", cliente.getUtilmoAluguel());
    }

    @Test
    void deveAlugarAnual() {
        Cliente cliente = new Cliente();
        cliente.aluguelAnual("12/05/2023","19/05/2023","Citroen C3","anual");
        assertEquals("descricao da locação:\n" +
                "De: 12/05/2023\n" +
                "Até: 19/05/2023\n" +
                "De: Citroen C3\n" +
                "aluguel por tempo, tipo: anual", cliente.getUtilmoAluguel());
    }
}
