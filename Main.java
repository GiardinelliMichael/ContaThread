package lezionePerCasa;

import java.util.Scanner;

public static void Main(String[] args) {
	
    Scanner scanner = new Scanner(System.in);
    // Chiedi all'utente di inserire i valori di T e N
    System.out.println("Inserisci il numero di thread (T): ");
    int T = scanner.nextInt();
    
    System.out.println("Inserisci il valore massimo da contare (N): ");
    int N = scanner.nextInt();
    
    scanner.close();
    
    // Creiamo e avviamo T thread
    for (int i = 0; i < T; i++) {
        new Thread(new ConteggioRunnable()).start();
    }
}
