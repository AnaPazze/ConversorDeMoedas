import java.util.Scanner;

public class ConversorDeMoedas {
    private final pegarCotacao consultaCotacao;


    public ConversorDeMoedas(String apiKey) {
        this.consultaCotacao = new pegarCotacao(apiKey);
    }

    public void CurrencyCode(String valorInicial , String valorFinal ) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor em " + valorInicial  + ": ");
            double valor = Double.parseDouble(scanner.nextLine());

            double taxa = consultaCotacao.obterTaxaDeCambio(valorInicial , valorFinal );
            double resultado = valor * taxa;
            System.out.println("Valor em " + valorFinal  + ": " + resultado + "\n");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}