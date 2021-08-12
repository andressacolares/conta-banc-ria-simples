public class Conta {
    private int numero_conta;
    private double saldo_bancario;
    private double NaoLimite;
    private double limite;
    private double[] extrato_conta = new double [10];

    public NovaConta (int numero_conta, double saldo_bancario){
        this.conta=numero_conta;
        this.saldo_bancario=saldo_bancario;
    }

    public int getnumero_conta(){
        return getnumero_conta;
    }
    public void Setnumero_conta (int numero_conta){
        this.numero_conta=numero_conta;
    }
    public int getsaldo_bancario(){
        return getsaldo_bancario;
    }
    public void Setsaldo_bancario (int saldo_bancario){
        this.saldo_bancario=saldo_bancario;
    }

    public double getNaoLimite(){
        return getNaoLimite;
    }
    public void SetNaoLimite (double NaoLimite){
        this.NaoLimite=NaoLimite;
    }
    public double getlimite(){
        return getlimite;
    }
    public void Setlimite (double limite){
        this.limite=limite;
    }
    public double getextrato_conta(){
        return getextrato_conta;
    }
    public void Setextrato_conta (double extrato_conta){
        this.extrato_conta = extrato_conta;
    }

    public double [] verExtrato_conta(){
        return extrato_conta;
    }
    public boolean depositar (double valor){
        saldo_bancario += valor;
        
            if (valor < 0.0){
                System.out.println("Nao eh possivel depositar valores negativos"+valor);
                return false;
            } else {
                System.out.println("Novo saldo"+saldo_bancario);
                    return true;
            }

    public void novoLimite (double valor){
        if (valor > 0.00){
            limite+=valor;
        } else if (limite > 100.00) {
        saldo_bancario+=(limite - 100.00);
        limite = saldo_bancario;
    } else if (saldo_bancario < 0.00) {
        saldo_bancario = 0.00;
        saldo_bancario += limite;
        System.out.println( "Saldo"+saldo_bancario);
    }

    public boolean saque (double valor){
        if ((valor > 0.00) && (valor <= saldo_bancario)){
            novoLimite(-valor);
        } return true;
         { {
             return false;
        }

    public boolean trasferencia (int destinatario, double valor){
        if (valor < 0.0){
            System.out.println("Nao eh possivel depositar valores negativos"+valor);
            return false;
    }    
    
    else if ((valor > 0.00)&& (valor <=getsaldo_bancario())){
        novoLimite(-valor);
        System.out.println("Transferencia concluida"+novoLimite-valor);
        return true;
    } 
        {
        return false;
    }

}


    
