import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

class pegarCotacao {
    private String key;

    public void ConsultaCotacao(String apiKey) {
        this.key = apiKey;
    }

    public pegarCotacao(String apiKey) {
        key = apiKey;
    }

    public double obterTaxaDeCambio(String valorInicial, String valorFinal) {

        try { //o latest nao tava funcionando entao achei esse pair em um outro exemplo
            String endereco = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + valorInicial + "/" + valorFinal;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject resposta = gson.fromJson(response.body(), JsonObject.class);
            return resposta.get("conversion_rate").getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter a taxa de câmbio.");
        }
    }
}