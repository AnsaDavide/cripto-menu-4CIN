import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire una frase: ");
        String frase = in.nextLine();
        System.out.println("Inserire una chiave: ");
        String chiave = in.nextLine();
        String cesare = Cryto.Cesar (frase, chiave.length());
        System.out.println(cesare);
        String cesared = Cryto.Cesar (cesare, chiave.length() *-1);
        System.out.println(cesared);

        String xor = Cryto.xorAlgo(frase, chiave);
        System.out.println(xor);
        String xord = Cryto.xorAlgo(xor, chiave);
        System.out.println(xord);
    }
}
