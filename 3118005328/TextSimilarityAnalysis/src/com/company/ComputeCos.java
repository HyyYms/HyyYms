package com.company;

import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.IndexTokenizer;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

/**
 * @program: TextSimilarityAnalysis
 * @description: 计算余弦值
 * @author: Mr.Huang
 * @create: 2020-09-23 13:39
 **/
public class ComputeCos {
    static double getCos(String s1, String s2) {
        //Map<String, int[]> ChMap = new HashMap<String, int[]>();//词频
        // 词出现的位置
        Map<String, Vector<Integer>> Offset1=new TreeMap<String,Vector<Integer>>();
        //按键值排序
        Map<String,Vector<Integer> >Offset2=new TreeMap<String,Vector<Integer> >();
        //分词
        List<Term> termList = IndexTokenizer.segment(s1);
        int pos=0;
        for (Term term : termList) {
            String s = term.toString();
            StringBuilder news = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (String.valueOf(c).matches("[\u4e00-\u9fa5]")) {
                    news.append(c);
                }
            }
            if(Offset1.get(news.toString())==null){
                Vector<Integer>off=new Vector<Integer>(100);
                off.add(pos);
                Offset1.put(news.toString(),off);
            }
            Offset1.get(news.toString()).add(pos);
            pos++;
        }//相同方式处理第二个文本
        termList = IndexTokenizer.segment(s2);
        pos=0;
        for (Term term : termList) {
            String s = term.toString();
            StringBuilder news = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (String.valueOf(c).matches("[\u4e00-\u9fa5]")) {
                    news.append(c);
                }
            }
            if(Offset2.get(news.toString())==null){
                Vector<Integer>off=new Vector<Integer>(100);
                off.add(pos);
                Offset2.put(news.toString(),off);
            }
            Offset2.get(news.toString()).add(pos);
            pos++;
        }
        //算余弦
        int cnt=0;
        double up = 0, down1 = 0, down2 = 0,sum=0;
        for(String key:Offset1.keySet()){
            Vector<Integer>off1=Offset1.get(key);
            Vector<Integer>off2=Offset2.get(key);
            //第二个文本中也存在这个词，计算向量
            if(off2!=null){
                up=down1=down2=0;
                for(int i=0;i<off1.size()&&i<off2.size();i++){
                    up+= off1.elementAt(i)*off2.elementAt(i);
                    down1+= off1.elementAt(i)*off1.elementAt(i);
                    down2+=off2.elementAt(i)*off2.elementAt(i);
                }
                down1 = Math.sqrt(down1);
                down2 = Math.sqrt(down2);
                double down = down1 * down2;
                if(down!=0){
                    sum+=up/down;
                }
            }
            cnt++;
        }
        return sum/cnt;
    }
}
