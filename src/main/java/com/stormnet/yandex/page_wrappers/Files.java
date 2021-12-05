package com.stormnet.yandex.page_wrappers;

import java.io.File;
import java.io.IOException;

import static java.util.UUID.randomUUID;


public class Files {

    //    public static String generateFile() throws IOException {
    //        File file = new File("txt");
    //        System.out.println(file.createNewFile());
    public static File generateFile() {
        File file = new File(generateFileName().concat(".txt"));
        try {
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
//        File tempDirectory = new File(System.getProperty("java.io.tmpdir"));
//        File fileWithAbsolutePath = new File(tempDirectory.getAbsolutePath() + "/" + generateFileName() + "/.txt");
//        try {
//            fileWithAbsolutePath.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return fileWithAbsolutePath.getPath();
    }

    public static String generateFileName() {
//        byte[] array = new byte[7];
//        new Random().nextBytes(array);
//        String generatedString = new String(array, Charset.forName("UTF-8"));
//        return generatedString;
        return randomUUID().toString().replaceAll("-", "").substring(0, 5);

    }
}


