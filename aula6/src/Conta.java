//nao posso instaciar interface
public interface Conta {
    public final static int taxaSaque = 6;
    public abstract void saque(double valor);
    public abstract void deposito(double valor);
}
