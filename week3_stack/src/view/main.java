package view;
import java.util.Scanner;
import list.LinkedList;

public class main {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);

        LinkedList<String> sample1 = new LinkedList();

        while (true) {
            System.out.println("1: add, 2: delete, 3: size 4: search");
            int condition = input.nextInt();
            switch (condition) {
                case 1:
                    String s = input.next();
                    sample1.add(s);
                    break;
                case 2:
                    int a = input.nextInt();
                    sample1.removeLast();
                    break;
                case 3:
                    System.out.println(sample1.size());
                    break;
                case 4:
                    String asdf = input.next();
                    System.out.println(sample1.search(asdf));
                    break;
            }
        }

    }
}
