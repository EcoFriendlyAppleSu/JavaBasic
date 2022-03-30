package chapter09;

import java.util.StringTokenizer;

public class stTokenizerEx01 {
    public static void main(String[] args) throws Exception {

        String source = "100,300,200,500";
        StringTokenizer st = new StringTokenizer(source, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        }
}
