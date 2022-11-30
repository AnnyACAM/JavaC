import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> conta = new ArrayList<Conta>();

    public void adiciona(Conta c){
        conta.add(c);
    }

    public Conta pegaConta(int x)
    {
        return conta.get(x);
    }
    public int pegaTotalContas()
    {
        return conta.size();
    }
}