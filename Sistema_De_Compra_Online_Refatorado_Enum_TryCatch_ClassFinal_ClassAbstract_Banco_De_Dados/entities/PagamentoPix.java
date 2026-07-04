package Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract_Banco_De_Dados.entities;

public final class PagamentoPix extends Pagamento {
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento no pix valor de:" + valor);
    }
}
