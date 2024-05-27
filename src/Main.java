import gb_collections.GbList;
import gb_collections.lists.GbLinkedList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list = new GbLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.removeIndex(2);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
    }
}