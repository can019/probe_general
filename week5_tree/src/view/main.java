package view;
import tree.LinkedTree;
import java.util.Scanner;
public class main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        LinkedTree<Integer> tree = new LinkedTree<>();
        int a;
        int b;
        System.out.print("1.입력:" );
        tree.add(input.nextInt());
        System.out.print("2.입력:" );
        tree.add(input.nextInt());
        System.out.print("3.입력:" );
        tree.add(input.nextInt());
        System.out.print("4.입력:" );
        tree.add(input.nextInt());
        System.out.print("5.입력:" );
        tree.add(input.nextInt());
        System.out.print("6.입력:" );
        tree.add(input.nextInt());
        System.out.print("1.입력_부모:" );
        a = input.nextInt();
        b = input.nextInt();
        tree.add(a,b);
        System.out.print("2.입력_부모:" );
        tree.add(a,b);



    }

}
