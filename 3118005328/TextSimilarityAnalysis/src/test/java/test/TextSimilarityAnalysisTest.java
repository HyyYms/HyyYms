package test;

import com.company.algorithm.ComputeCos;
import com.company.fileUtil.FileProcessor;
import org.junit.Assert;
import org.junit.Test;

/**
 * @program: TextSimilarityAnalysis
 * @description: 项目测试
 * @author: Mr.Huang
 * @create: 2020-09-23 16:48
 **/
public class TextSimilarityAnalysisTest {

    @Test
    public void origAndAdd() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_add.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndDel() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_del.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndMix() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_mix.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndRep() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_rep.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndDis1() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_dis_1.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndDis3() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_dis_3.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndDis7() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_dis_7.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndDis10() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_dis_10.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }

    @Test
    public void origAndDis15() {
        String s1 = FileProcessor.readFileToString("testfile/orig.txt");
        String s2 = FileProcessor.readFileToString("testfile/orig_0.8_dis_15.txt");
        double sum = ComputeCos.computeCos(s1, s2);
        Assert.assertEquals(0.8, sum, 0.2);
    }
}
