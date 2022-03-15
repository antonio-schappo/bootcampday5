package Transacoes;

public interface SaqueEmDinheiro extends Transacao {
    @Override
    default void transacaoOk() {
        System.out.println("Saque realizado com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Problema ao realizar seu saque. Favor checar seu saldo ou verificar com a gerência.");
    }
}
