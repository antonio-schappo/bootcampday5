package Transacoes;

public interface Deposito extends Transacao {

    @Override
    default void transacaoOk() {
        System.out.println("Depósito realizado com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Problema ao realizar seu depósito. Favor verificar com a gerência.");
    }
}
