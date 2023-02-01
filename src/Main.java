import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj!");
        Map<String,String> mapa = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String kraj;
        String miasto;
        do {
            System.out.println("Podaj nazwę kraju:");
            kraj = scan.nextLine();
            System.out.println("Podaj nazwę stolicy:");
            miasto = scan.nextLine();
            mapa.put(kraj,miasto);}
        while ((!kraj.equals("/")) || (!miasto.equals("/")));
        System.out.println("Wprowadz nazwe wybranego kraju:");
        kraj = scan.nextLine();
        System.out.println(mapa.get(kraj));
        }
    }