import java.io.*;
import java.net.*;

public class Main {

    private static String excutePost(String targetURL, String parameter) {
        // Allow us to connect to the incoming url
        URL url = null;

        // Store the response of request
        String response = "";

        try {

            // Since in the curl is used
            // -G will use GET request
            // --data-urlencode I have to encode the parameter for UTF-8 format
            url = new URL(targetURL + "?data=" + URLEncoder.encode(parameter, "UTF-8"));

            // Read the response from the url
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            // Concatenate the response into one string
            for( String line; (line = reader.readLine()) != null; )
                response += line;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }

    public static void main(String[] args) {
        // The url of the server
        String url = "http://121.254.173.77:2357/agdistis/run";

        // The parameter of the request
        // Can be changed
        String parameter = "{\"query\": \"SELECT ?v4 WHERE { ?v4 ?v2 ?v6 ; ?v7 ?v3 . } \", \"slots\": [{\"p\": \"is\", \"s\": \"v7\", \"o\": \"<http://lodqa.org/vocabulary/sort_of>\" }, {\"p\": \"is\", \"s\": \"v3\", \"o\": \"rdf:Class\"}, {\"p\": \"verbalization\", \"s\": \"v3\", \"o\": \"rivers\"},\n" +
                "{\"p\": \"is\", \"s\": \"v2\", \"o\": \"rdf:Property\"}, {\"p\": \"verbalization\", \"s\": \"v2\", \"o\": \"flow\"},\n" +
                "{\"p\": \"is\", \"s\": \"v6\", \"o\": \"rdf:Resource|rdfs:Literal\"}, {\"p\": \"verbalization\", \"s\": \"v6\", \"o\": \"Seoul\"}],\n" +
                "\"score\": \"1.0\", \"question\": \"Which rivers flow through Seoul\"}";

        // Printing out the response
        System.out.print(excutePost(url, parameter));
    }
}
