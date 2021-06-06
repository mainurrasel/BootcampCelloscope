public class Handler {
    EncodeDecode encodeDecode = new EncodeDecode();
    String path;
    public void handler(Request request){
        if (request.getMethod().equals("send")){
            path = "/home/mainur/Desktop/base64/"+request.getFilename()+"_uploaded"+"."+request.getFileExt();
            encodeDecode.decoder(request.getData(),path);
        }else {
            System.out.println("For fetch");
        }
    }
}
