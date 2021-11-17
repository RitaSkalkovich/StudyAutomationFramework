package com.stormnet.yandex.page_wrappers;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;


public class Files {


    public static String generateFile() throws IOException {
//        File file = new File("txt");
//        System.out.println(file.createNewFile());


        File tempDirectory = new File(System.getProperty("java.io.tmpdir"));
        File fileWithAbsolutePath = new File(tempDirectory.getAbsolutePath() + "/" + generateFileName() + "/.txt");
        try {
            fileWithAbsolutePath.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileWithAbsolutePath.getPath();
    }

    public static String generateFileName() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;

    }
}


