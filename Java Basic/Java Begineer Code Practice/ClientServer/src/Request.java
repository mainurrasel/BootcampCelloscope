public class Request {
    private String filename;
    private  String fileExt;
    private String fileEncode;
    private String data;
    private String method;

    public Request ( String filename, String fileExt,String fileEncode, String data, String method){
        this.filename = filename;
        this.data = data;
        this.fileEncode = fileEncode;
        this.method = method;
        this.fileExt = fileExt;
    }
    public Request(){

    }

    public String getFilename() {return filename;}
    public void setFilename(String filename){this.filename= filename;}

    public String getMethod() {return method;}
    public void setMethod(String method){this.method= method;}
    public String getFileExt() {return fileExt;}
    public void setFileExt(String fileExt){this.fileExt= fileExt;}
    public String getFileEncode() {return fileEncode;}
    public void setFileEncode(String fileEncode){this.fileEncode= fileEncode;}
    public String getData() {return data;}
    public void setData(String data){this.data= data;}


}
