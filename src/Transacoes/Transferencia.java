package Transacoes;

public interface Transferencia extends Transacao {

    @Override
    default void transacaoOk() {
        System.out.println("Transferência realizada com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Problema ao realizar sua transferência. Favor verificar com a gerência.");
    }

}
