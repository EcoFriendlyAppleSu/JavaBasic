package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx03 {
    /**
     * String : groupName
     * Object : HashMap<String, String>
     *          name, tel
     */
    static HashMap<String, Object> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addPhoneNo("친구", "Lee", "010-111-1111");
        addPhoneNo("친구", "Lee", "010-222-2222");
        addPhoneNo("친구", "Lee", "010-333-3333");
        addPhoneNo("회사", "Lee", "010-444-4444");
        addPhoneNo("회사", "Lee", "010-555-5555");
        addPhoneNo("회사", "Lee", "010-666-6666");
        addPhoneNo("세탁", "010-777-7777");

        printList();
    }

    private static void printList() {

        Set<Map.Entry<String, Object>> entries = phoneBook.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Object> next = iterator.next();

            Set subSet = ((HashMap) next.getValue()).entrySet();
            Iterator subIterator = subSet.iterator();

            System.out.println(" * " + next.getKey() + "[" + subSet.size() + "]");

            while (subIterator.hasNext()) {
                Map.Entry subNext = (Map.Entry) subIterator.next();
                String telNo = (String) subNext.getKey();
                String name = (String) subNext.getValue();

                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }

    /**
     * @overload method addPhoneNo. It has 2 Params
     * When you fill the phoneNumber without groupName. it could fill "기타" on the groupName
     * @param name
     * @param tel
     */
    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    /**
     * @overload method addPhoneNo. It has 3 Params
     * @param groupName
     * @param name
     * @param tel
     */
    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName); //
        group.put(tel, name); // new HashMap<>()
    }

    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap<>()); // phoneBook(groupName, HashMap<String, String> : name, tel)
        }
    }
}
