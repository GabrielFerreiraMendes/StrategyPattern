package strategy;

import strategy.principal.MeioPagamentoStrategy;

public class PayPalStrategy implements MeioPagamentoStrategy{

    @Override
    public void pagamento(String pagante, String recebedor, Double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagamento'");
    }
    
}
