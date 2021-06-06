package example11;

public class Handler {

    public void handler(Requests requests, String decodedFilePath){
        if (requests.getRequestMethod().equals("SEND")) {
            EncodeDecode.decoder(requests.getEncodedVal(), decodedFilePath);
        }
    }
}
