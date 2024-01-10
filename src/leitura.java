import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliaçao = 0;
        double nota = 0;
        int numeroTotalDeNotas = 0;
        while (nota != -1) {
            System.out.println("Digite uma nota ou -1 para cancelar");
            nota = leitura.nextDouble();
          if (nota != -1) {
              mediaAvaliaçao += nota;
              numeroTotalDeNotas++;
             }
        }
        if (numeroTotalDeNotas == 0) {
            System.out.println("ok");
        } else {
        double resultado = mediaAvaliaçao/numeroTotalDeNotas;
        System.out.println("A media é: " + resultado);
       }
    }
}
