package data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        ListNode l4=new ListNode("Messi", null);
        ListNode l3=new ListNode("Ronaldo", l4);
        ListNode l2=new ListNode("And", l3);
        ListNode l1=new ListNode("Nem", l2);

        ListNode temp = l1;

        // Insert new node
        ListNode l5 = new ListNode("Garrent", null);

        // Insert at the end of Linked List
        while (temp!=null){
            if(temp.next==null){
                temp.next=l5;
                break;
            }
            temp=temp.next;
        }

        System.out.println("Insert Garrett at the end");
        System.out.println(l1.toString());
        l4.setNext(null);
        temp=l1;

        // Insert at index after Nem
        while (temp!=null){
            if(temp.player.equals("Nem")){
                l5.setNext(temp.next);
                temp.setNext(l5);
            }
            temp=temp.next;
        }

        System.out.println();
        System.out.println("insert Garrett after Nem");
        System.out.println(l1.toString());
    }
}
