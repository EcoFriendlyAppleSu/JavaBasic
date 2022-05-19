package chapter11;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("abcd", "1234");
        hash.put("asel", "1234");
        hash.put("relw", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id, pw 입력해주세요");
            System.out.print("id :");
            String id = scanner.nextLine().trim();
            System.out.print("pw :");
            String pw = scanner.nextLine().trim();
            System.out.println(
            );

            if (!hash.containsKey(id)) {
                System.out.println("입력한 Id가 존재하지 않습니다. " + "다시 입력해주세요");
                continue;
            }

            if (!(hash.get(id).equals(pw))) {
                System.out.println("비밀번호가 잘못 되었습니다.");

            } else {
                System.out.println("id, pw 일치");
                break;
            }
        }
    }
}
