package Transacoes;

public interface ConsultaDeSaldo extends Transacao {

    @Override
    default void transacaoOk() {
        System.out.println("ConferĂȘncia realizada com sucesso!");
    }

    @Override
    default void transacaoNaoOk() {
        System.out.println("Problema ao realizar sua conferĂȘncia. Favor verificar com a gerĂȘncia.");
    }
}
