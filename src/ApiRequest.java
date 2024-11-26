import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequest {


    public Coins getCoins(Double valor, String moedaPais) throws InterruptedException {
        Coins coins = new Coins();
        String api = "https://v6.exchangerate-api.com/v6/";
        String apiKey = "889d2edce5e8480bc787616c";
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(api + apiKey + "/latest/" + moedaPais))
                    .build();



            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();

            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            coins.setUSD(conversionRates.get("USD").getAsDouble());
            coins.setBRL(conversionRates.get("BRL").getAsDouble());
            coins.setARS(conversionRates.get("ARS").getAsDouble());
            coins.setCOP(conversionRates.get("COP").getAsDouble());


        } catch (IOException e) {
            System.out.println("Api não está respondendo");
        }
        return coins;


    }
    }

