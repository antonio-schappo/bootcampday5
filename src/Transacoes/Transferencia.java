package Transacoes;

public interface Transferencia extends Transacao {

    @Override
    default void transacaoOk() {
        System.out.println("TransferĂȘncia realizada com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Problema ao realizar sua transferĂȘncia. Favor verificar com a gerĂȘncia.");
    }

}
