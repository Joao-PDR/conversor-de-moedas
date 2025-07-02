import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public String buscaCotacao(String moedaBase) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/cd67f610c56e5ff8c6c2ec22/" + moedaBase);

        // A MUDANÇA ESTÁ AQUI:
        // O HttpClient agora é criado dentro dos parênteses do 'try'
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível obter a cotação. Verifique a API Key, sua conexão ou a moeda digitada.");
        }
    }
}