import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //chiedo l'intero all'utente
        System.out.println("Inserisci un numero di elementi: ");
        int N = sc.nextInt();
        sc.nextLine();

//dichiaro e utilizzo l'arraylist
        ArrayList<Integer> parole= new ArrayList<>();
        HashSet<String> paroleDistinte = new HashSet<>();
        HashSet<String> duplicati = new HashSet<>();
        System.out.println("Inserisci " + N + " parole: ");
        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci " + (i+1) + " parole: ");
            String parola = sc.nextLine();
            if (!paroleDistinte.add(parola)) {
                duplicati.add(parola);

            }


        }
        // Passo 3: Stampare le parole duplicate
        System.out.println("Parole duplicate: " + duplicati);

        // Passo 4: Stampare il numero di parole distinte
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        // Passo 5: Stampare l'elenco delle parole distinte
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);



    }
}