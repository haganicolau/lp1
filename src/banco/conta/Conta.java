package banco.conta;

public class Conta {
    private int numeroConta;
    private int agencia;
    private TipoConta tipoConta;
    private double saldo;
    private static int totalContas;

    public Conta(int numeroConta, int agencia, double saldoInicial) throws AbrirContaException{
        this.numeroConta = numeroConta;
        this.agencia = agencia;

        if(saldoInicial < 50) {
            throw new AbrirContaException();
        }
        this.saldo = saldoInicial;
        totalContas++;
        System.out.println("Total Contas: " + totalContas);
    }

    public double sacar(double valor) throws Exception {
        if(salqueImposssivel(valor)) {
            throw new Exception("Saldo insuficiente para saque");
        }
        this.saldo = this.saldo - valor;
        return valor;
    }

    public boolean salqueImposssivel(double valor) {
        if(valor > this.saldo) {
            return true;
        }
        return false;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotalContas() {
        return totalContas;
    }
}
