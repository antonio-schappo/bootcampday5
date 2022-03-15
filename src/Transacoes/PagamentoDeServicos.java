package Transacoes;

public interface PagamentoDeServicos extends Transacao{

    @Override
    default void transacaoOk() {
        System.out.println("Pagamento de serviços realizado com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Problema ao realizar seu pagamento de serviços. Favor verificar com a gerência.");
    }
}
