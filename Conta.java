package lezionePerCasa;
	
public class Conta implements Runnable {
	
	private static int contatore = 1;
	private static int N; // valore massimo da contare
	public Conta(int N) {
		
		Conta.N=N; // ho inserito Conta.N per intendere la N della classe perchè con This.N mi dava un errore
	}
	public synchronized static int Contatore() {
		
		if( contatore > N) {
			
			return -1;
		}
		return contatore++;
	}

	public void run() {
        while (true) {
            // Otteniamo il prossimo numero da contare
            int numero = Conta.Contatore();
            
            if (numero == -1) {
                break; // Se il numero è -1, significa che abbiamo superato N
            }
            System.out.println(Thread.currentThread().getName() + " conta: " + numero);
        }
    }
}