import java.util.Date;

class Conta {
   String NomeTitular;
   int Numero;
   Data DataAbertura;
   double saldo;
   String agencia;

   void saca(double valor) {
       if (this.saldo < valor) {
           System.out.println("Saldo Insuficiente ");
       } else {
           this.saldo -= valor;
           System.out.println("Saque no valor de " + valor + " realizado com sucesso!");
           saldo = saldo - valor;

       }
   }
    void deposita(double valor)
    {
        if (valor <= 0) {
            System.out.println("Valor indevido ou negativo para depósito!");
        }
        this.saldo += valor;
        System.out.println("Deposito no valor de " + valor + " efetuado com sucesso!");
    }
    double calculaRendimento() {
        return saldo * 0.1;
    }

    String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.NomeTitular;
        dados += "\nNúmero: " + this.Numero;
        dados += "\nsaldo: " + this.saldo;
        dados += "\nAgencia: " + this.agencia;
        dados += "\nDia: " + this.DataAbertura.dia;
        dados += "\nMês: " + this.DataAbertura.mes;
        dados += "\nAno: " + this.DataAbertura.ano;
        return dados;
    }
}

