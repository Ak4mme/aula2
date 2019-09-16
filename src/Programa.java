import com.sun.xml.internal.ws.util.xml.CDATA;
class Programa {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Data data = new Data();


        c1.NomeTitular = "Thiers";
        c1.Numero = 1;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.DataAbertura = data;

        c1.deposita(100.0);
        System.out.println("saldo atual:" + c1.saldo);
        c1.saca(35);
        System.out.println("saldo atual:"+ c1.saldo);
        System.out.println("rendimento mensal:" + c1.calculaRendimento());

        Conta c2 = new Conta();
        c2.NomeTitular = "Thiers2";
        c2.Numero = 2;
        c2.agencia = "78945-6";
        c2.saldo = 100;
        c2.DataAbertura = data;

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        System.out.println("dados da conta::" + c1.recuperaDadosParaImpressao());
    }

}