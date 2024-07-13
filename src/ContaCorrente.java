public class ContaCorrente extends Conta {



    public ContaCorrente(Cliente cliente,String chavePix) {
        super(cliente,chavePix);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
     
        super.transferir(valor, contaDestino);
    }

    @Override
    public void depositar(double valor) {
      
        super.depositar(valor);
    }

    @Override
    public int getAgencia() {
        
        return super.getAgencia();
    }

    @Override
    public int getNumero() {
       
        return super.getNumero();
    }

    @Override
    public double getSaldo() {
       
        return super.getSaldo();
    }

    @Override
    public void sacar(double valor) {
     
        super.sacar(valor);
    }

}
