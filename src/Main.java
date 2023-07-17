import javax.lang.model.util.AbstractElementVisitor14;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        System.out.println("Введите лист A");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            A.add(input);
        }
        System.out.println(A);

        System.out.println("Введите лист B");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            B.add(input);
        }
        System.out.println(B);

        Collections.reverse(B);
        System.out.println(B);

        for (int i = 0; i < A.size(); i++) {
            C.addAll(i, Collections.singleton(A.get(i)));
        }

        int k = 1;
        for (int j = 0; j < B.size(); j++) {
            C.addAll(k, Collections.singleton(B.get(j)));
            k += 2;
        }
        System.out.println(C);

        C.sort(Comparator.comparing(String::length));
        System.out.println(C);

    }
}
