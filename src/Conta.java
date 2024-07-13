public class Conta {
   
    private static final  int AGENCIA_PADRAO = 1 ;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente; 
    private String titular;
    private String chavePix;

    public Conta(Cliente cliente, String chavePix){
        this.agencia = AGENCIA_PADRAO ;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.printf(String.format("Titular: %s%n", this.cliente.getNome()));
        System.out.printf(String.format("Agência: %d%n", this.agencia));
        System.out.printf(String.format("Número: %d%n", this.numero));
        System.out.printf(String.format("Saldo: %.2f%n", this.saldo));
    }


    public void realizarPix(String chavePixDestino, double valor, Conta[] contas) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
            return;
        }

        Conta contaDestino = null;
        for (Conta conta : contas) {
            if (conta.getChavePix().equals(chavePixDestino)) {
                contaDestino = conta;
                break;
            }
        }

        if (contaDestino == null) {
            System.out.println("Conta destino não encontrada.");
            return;
        }

        this.saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println("Transferência PIX de R$ " + valor + " para " + contaDestino.getTitular() + " realizada com sucesso.");
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){

        saldo -= valor ;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String getTitular() {
        return titular;
    }

    public String getChavePix() {
        return chavePix;
    }
    
}
