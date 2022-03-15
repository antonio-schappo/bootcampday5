package Clientes;

import Transacoes.Deposito;
import Transacoes.Transferencia;

public class Executivo extends Cliente implements Deposito, Transferencia {
    public Executivo() {
    }
}
