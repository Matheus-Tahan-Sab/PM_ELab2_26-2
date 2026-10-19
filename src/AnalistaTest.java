import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class AnalistaTest {
    

    @Test 
    public void adicionaHorasExtrasDeFormaCorretamenta(){

        Analista analista = new Analista("sabugador9000", "12345678910");
        
        double valorAReceber = analista.addHorasExtras(10);

        assertEquals(10,valorAReceber,0.01);


    }

    @Test 
    public void calculaPagamentoDoJeitoCerto(){
       
        Analista analista = new Analista("sabugador9000", "12345678910");

        double valorFinal = analista.registrarPagamento();
        assertEquals(4836,valorFinal,0.01);
    }



}
