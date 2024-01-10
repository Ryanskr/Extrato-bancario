import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("***************************************");
        System.out.println("Dados inicias do cliente");
        System.out.println("Nome:             Ryan Matheus");
        System.out.println("Tipo conta:       Corrente");
        System.out.println("Saldo:            R$ 2500,00");
        System.out.println("***************************************");
        System.out.println();
        System.out.println("Operações");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair");
        System.out.println();

        double saldo = 2500.00;
        Scanner leitura = new Scanner(System.in);
        double decisao = 0;
        Scanner leituraDeRecebimento = new Scanner(System.in);
        double valorRecebido = 0;
        Scanner leituraDePagamento = new Scanner(System.in);
        double valorTransferido = 0;

          while (decisao != 4) {
              System.out.println("Digite a operação desejada");
             decisao = leitura.nextDouble();
                if (decisao == 1) {
                  System.out.println(saldo);
              } if (decisao == 2) {
                  System.out.println("Digite o valor");
                  valorRecebido = leituraDeRecebimento.nextDouble();
                  saldo += valorRecebido;
              } if (decisao == 3) {
                  System.out.println("Digite o valor");
                  valorTransferido = leituraDeRecebimento.nextDouble();
                  if (valorTransferido > saldo) {
                      System.out.println("Não é possivel");
                  } else {
                      saldo = saldo - valorTransferido;
                  }
              }
          }

    }
}



