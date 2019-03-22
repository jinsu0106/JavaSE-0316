package day06;

import sun.swing.StringUIClientPropertyKey;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Douban {
    private static final String DOUBAN_URL = "https://book.douban.com/tag/%E5%B0%8F%E8%AF%B4";

    public static void main(String[] args) throws IOException {
        URL url = new URL(DOUBAN_URL);
        InputStream inputStream = url.openStream();
        // 字节流转换为字符流
        Reader reader = new InputStreamReader(inputStream);
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("subject/m")) {
                    String src = line.substring(line.indexOf("http"), line.length()-1);
                    System.out.println(src);
                }
            }
        }
    }
}
