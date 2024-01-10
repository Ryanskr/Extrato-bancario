import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        double saldo = 2500.00;
        Scanner leitura = new Scanner(System.in);
        double decisao = leitura.nextDouble();
        while (decisao != 4) {
            System.out.println("Digite a operação desejada");
            if (decisao == 1) {
                System.out.println(saldo);
            } else if (decisao == 2) {
                Scanner leituraDeRecebimento = new Scanner(System.in);
                double valorRecebido = leituraDeRecebimento.nextDouble();
                System.out.println("Digite o valor");
                saldo += valorRecebido;
            }


        }
    }}
