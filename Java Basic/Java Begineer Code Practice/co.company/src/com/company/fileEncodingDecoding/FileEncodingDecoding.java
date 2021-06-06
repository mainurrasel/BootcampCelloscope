package com.company.fileEncodingDecoding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class FileEncodingDecoding {

    public static String encodeFileToBase64Binary(File file) throws Exception{
        FileInputStream fileInputStreamReader =  new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStreamReader.read(bytes);
        return new String(Base64.getEncoder().encodeToString(bytes));
    }

    public static void decodeFileToImage(String base64string , String path) throws Exception
    {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        byte[] bytes =Base64.getDecoder().decode(base64string);
        fileOutputStream.write(bytes);
    }

    public static void main(String[] args) throws Exception{

        File f = new File("/home/mainur/Desktop/base64/bike1.png");
        String encodedString =  encodeFileToBase64Binary(f);
        System.out.println(encodedString);

        String outputPath = "/home/mainur/Desktop/base64/bike1_output.png";
        decodeFileToImage(encodedString , outputPath );

    }
}
