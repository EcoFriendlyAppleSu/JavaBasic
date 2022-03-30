package chapter10;

import java.text.MessageFormat;

public class MessageFormatEx01 {
    public static void main(String[] args) {
        String msg = "Name : {0} \n Tel: {1} \n Age : {2} \n BirthDay : {3}";
        Object[] Argus = {"Lee", "02-123-456", "28", "02-16"};

        String result = MessageFormat.format(msg, Argus);

        System.out.println(result);
    }
}
