package Transacoes;

public interface ConsultaDeSaldo extends Transacao {

    @Override
    default void transacaoOk() {
        System.out.println("Conferência realizada com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Problema ao realizar sua conferência. Favor verificar com a gerência.");
    }
}
