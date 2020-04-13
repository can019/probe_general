package view;
        import java.util.Scanner;
        import list.LinkedStack;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        LinkedStack<String> sample1 = new LinkedStack();

        while (true) {
            System.out.println("1: push, 2: pop, 3: size");
            int condition = input.nextInt();
            switch (condition) {
                case 1:
                    String s = input.next();
                    sample1.push(s);
                    break;
                case 2:
                    System.out.println("삭제된 데이터 : "+sample1.pop());
                    break;
                case 3:
                    System.out.println(sample1.getSize());
                    break;
                default :
                    System.out.println("잘못된 입력");
                    break;
            }
        }

    }
}
