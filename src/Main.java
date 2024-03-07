import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // inizializzazione dello scanner per leggere dati da tastiera
        System.out.println("Inserire una frase: ");
        String frase = in.nextLine(); // lettura nella variabile "frase"
        System.out.println("Inserire una chiave: ");
        String chiave = in.nextLine(); // lettura nella variabile "chiave"
        String cesare = Cryto.Cesar (frase, chiave.length()); // crittografia di cesare con spostamento pari alla lunghezza della chiave
        System.out.println(cesare);
        String cesared = Cryto.Cesar (cesare, chiave.length() *-1); // decrittografia della frase in base alla lunghezza della chiave "moltiplicata per -1"
        System.out.println(cesared);

        String xor = Cryto.xorAlgo(frase, chiave); // crittografia basata su xor con "frase" e "chiave"
        System.out.println(xor);
        String xord = Cryto.xorAlgo(xor, chiave); // decrittazione basata su xor con "frase crittata" e "chiave"
        System.out.println(xord);
    }
}
