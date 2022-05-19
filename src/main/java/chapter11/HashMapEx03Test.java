package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx03Test {

    static HashMap<String, Object> hashMap = new HashMap<>();

    public static void main(String[] args) {
        addPhoneNo("study", "lee", "010-2222-2222");
        addPhoneNo("study", "choi", "010-3333-3333");
        addPhoneNo("study", "park", "010-4444-4444");
        addPhoneNo("book", "kim", "010-5555-5555");
        addPhoneNo("book", "lim", "010-6666-6666");
        addPhoneNo("book", "min", "010-7777-7777");
        addPhoneNo("세탁", "010-1111-1111");

        printList();
    }

    private static void printList() {
        Set<Map.Entry<String, Object>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Object> next = iterator.next();
            // group에 따라 한 번 더 들어가서 entrySet을 만드는 과정
            Set telAndNameSet = ((HashMap) next.getValue()).entrySet();
            Iterator it = telAndNameSet.iterator();

            // print : groupName, each group Size
            System.out.println(" * " + next.getKey() + "[" + telAndNameSet.size() + "]");

            while (it.hasNext()) {
                Map.Entry next1 = (Map.Entry) it.next();
                String getTel = (String) next1.getKey();
                String getName = (String) next1.getValue();

                System.out.println(getName + " " + getTel);
            }
            System.out.println();
        }
    }

    private static void addPhoneNo(String groupName, String name, String tel) {
        groupCheck(groupName);
        HashMap group = (HashMap) hashMap.get(groupName); // This HashMap has name and tel number
        group.put(tel, name);
    }

    private static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);

    }

    private static void groupCheck(String groupName) {
        if (!hashMap.containsKey(groupName)) {
            hashMap.put(groupName, new HashMap<>());
        }
    }


}
