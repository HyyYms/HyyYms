package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @program: TextSimilarityAnalysis
 * @description: 文本文件处理
 * @author: Mr.Huang
 * @create: 2020-09-23 13:28
 **/
public class FileProcessor {
    static String readFileToString(String name) {
        StringBuilder str = new StringBuilder();
        String strLine;
        //将txt文件按行读入str中
        File file = new File(name);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader bufr = new BufferedReader(reader);
            while ((strLine = bufr.readLine()) != null) {
                str.append(strLine);
            }
            reader.close();
            bufr.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    static void writeTxt(Double elem, String name) {
        String ans = Double.toString(elem);
        File file = new File(name);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
            fw.write(ans, 0, (ans.length() > 3 ? 4 : ans.length()));
            fw.write("\r\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
