package com.company;
import	java.util.EmptyStackException;

import com.company.algorithm.ComputeCos;
import com.company.fileUtil.FileProcessor;

public class Main {
    public static void main(String[] args){
        String file1 = FileProcessor.readFileToString(args[0]);
        String file2 = FileProcessor.readFileToString(args[1]);
        String anstext = args[2];
        double ans = ComputeCos.computeCos(file1, file2);
        FileProcessor.writeTxt(ans, anstext);
    }
}
