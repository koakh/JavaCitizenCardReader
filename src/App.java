import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import pt.gov.cartaodecidadao.*;

public class App {

  // private String serverUri = "https://192.168.31.206/graphql";

  static {
    try {
      System.loadLibrary("pteidlibj");
      // System.out.println("pteidlibj loaded");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public static void main(String[] args) {
    try {
      PTEID_ReaderSet.initSDK();

      PTEID_EIDCard card;
      PTEID_ReaderContext context;
      PTEID_ReaderSet readerSet;

      readerSet = PTEID_ReaderSet.instance();

      System.out.println(String.format("readerCount %s", readerSet.readerCount()));

      for (int i = 0; i < readerSet.readerCount(); i++) {
        context = readerSet.getReaderByNum(i);
        if (context.isCardPresent()) {
          card = context.getEIDCard();
          System.out.println(card.isActive());

          context.SetEventCallback(new CardEventsCallback(), null);

          if (card.isActive()) {
            PTEID_EId eid = card.getID();
            Citizen citizen = new Citizen(eid);
            System.out.println(citizen);
// send request
// URL url = new URL("https://reqres.in/api/users");
// HttpURLConnection con = (HttpURLConnection) url.openConnection();
// con.setRequestProperty("Content-Type", "application/json; utf-8");
// con.setRequestMethod("POST");
// con.setRequestProperty("Accept", "application/json");
// con.setDoOutput(true);
// String jsonInputString = "{\"name\": \"Upendra\", \"job\": \"Programmer\"}";
// try (OutputStream os = con.getOutputStream()) {
//   byte[] input = jsonInputString.getBytes("utf-8");
//   os.write(input, 0, input.length);
// };
URL url = new URL("https://reqbin.com/echo/post/json");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setRequestMethod("POST");
http.setDoOutput(true);
http.setRequestProperty("Accept", "application/json");
http.setRequestProperty("Authorization", "Bearer {token}");
http.setRequestProperty("Content-Type", "application/json");
String data = "{\n	\"employee\":{ \"name\":\"Emma\", \"age\":28, \"city\":\"Boston\" }\n} ";
byte[] out = data.getBytes(StandardCharsets.UTF_8);
OutputStream stream = http.getOutputStream();
stream.write(out);
System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
http.disconnect();
          } else {
            System.err.println("no card found");
          }
        }
      }

      // A finaliza????o do SDK (?? obrigat??ria) deve ser efectuada atrav??s da invoca????o
      // do m??todo PTEID_releaseSDK(), a invoca????o deste m??todo garante que todos os
      // processos em segundo plano s??o terminados e que a mem??ria alocada ??
      // libertada.
      PTEID_ReaderSet.releaseSDK();
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  // /**
  // * Examples and Recipes
  // * https://openjdk.java.net/groups/net/httpclient/recipes.html
  // */
  // public void post(String uri, String data) throws Exception {
  // HttpClient client = HttpClient.newBuilder().build();
  // HttpRequest request =
  // HttpRequest.newBuilder().uri(URI.create(uri)).POST(BodyPublishers.ofString(data)).build();
  // HttpResponse<?> response = client.send(request, BodyHandlers.discarding());
  // System.out.println(response.statusCode());
  // }

  // public void postJson(URL uri, Citizen data) throws Exception {
  // ObjectMapper objectMapper = new ObjectMapper();
  // String requestBody =
  // objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
  // String requestBody =
  // objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
  // HttpRequest request = HttpRequest.newBuilder(uri).header("Content-Type",
  // "application/json")
  // .POST(BodyPublishers.ofString(requestBody)).build();
  // HttpResponse<?> response = client.send(request, BodyHandlers.discarding());
  // System.out.println(response.statusCode());
  // }
}
