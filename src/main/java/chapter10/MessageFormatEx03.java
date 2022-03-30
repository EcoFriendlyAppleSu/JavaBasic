package chapter10;

import java.text.MessageFormat;
import java.text.ParseException;

public class MessageFormatEx03 {
    public static void main(String[] args) throws ParseException {
        String[] userData = {
                "INSERT INTO USER_TABLE VALUES ('Lee','02-123-456','28','02-16');",
                "INSERT INTO USER_TABLE VALUES ('Kim','02-123-456','22','12-16');"
        };

        String pattern = "INSERT INTO USER_TABLE VALUES ({0},{1},{2},{3});";
        MessageFormat ms = new MessageFormat(pattern);

        for (int i = 0; i < userData.length; i++) {
            Object[] objs = ms.parse(userData[i]);
            for (int j = 0; j < objs.length; j++) {
                System.out.print(objs[j] + ", ");
            }
            System.out.println();
        }
    }
}
