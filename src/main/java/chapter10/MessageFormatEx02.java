package chapter10;

import java.text.MessageFormat;

public class MessageFormatEx02 {
    final static String tableName = "USER_TABLE";
    public static void main(String[] args) {

        String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',''{2}'',''{3}'');";

        Object[][] Argus = {
                {"Lee", "02-123-456", "28", "02-16"},
                {"Kim", "02-123-456", "21", "12-06"}
        };

        String result = "";
        for (int i = 0; i < Argus.length; i++) {
            result = MessageFormat.format(msg, Argus[i]);
            System.out.println(result);
        }
    }
}
