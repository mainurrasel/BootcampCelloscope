package example11;

public class Requests {
    private String requestMethod;
    private String fileName;
    private String fileExtension;
    private String encodedVal;

    public Requests(String requestMethod, String fileName, String fileExtension, String encodedVal) {
        this.requestMethod = requestMethod;
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.encodedVal = encodedVal;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getEncodedVal() {
        return encodedVal;
    }

    public void setEncodedVal(String encodedVal) {
        this.encodedVal = encodedVal;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }
}
