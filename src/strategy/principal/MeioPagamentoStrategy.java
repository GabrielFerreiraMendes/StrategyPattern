package strategy.principal;

public interface MeioPagamentoStrategy {
    public void pagamento(String pagante, String recebedor, Double valor);
}
