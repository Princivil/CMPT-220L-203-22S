package base;

public class Main {

    public static void main(String[] args){
        ListItem first = new ListItem(1);
        ListItem second = new ListItem(2);
        ListItem third = new ListItem(3);
        ListItem fourth = new ListItem(4);
        ListItem fifth = new ListItem(5);

        first.nextNode = second;
        second.nextNode = third;
        third.nextNode = fourth;
        fourth.nextNode = fifth;
    }
}
