import java.util.Map;

import strategy.BoletoStrategy;
import strategy.CartaoCreditoStrategy;
import strategy.CartaoDebitoStrategy;
import strategy.PayPalStrategy;
import strategy.PixStrategy;
import strategy.principal.MeioPagamentoStrategy;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, MeioPagamentoStrategy> meioPagamento = Map.of(
                "CARTAOCREDITO", new CartaoCreditoStrategy(),
                "CARTAODEBITO", new CartaoDebitoStrategy(),
                "BOLETO", new BoletoStrategy(),
                "PIX", new PixStrategy(),
                "PAYPAL", new PayPalStrategy());
                
        meioPagamento.get("PIX").pagamento("EU", "VOCÊ", 10.50);
    }

}
