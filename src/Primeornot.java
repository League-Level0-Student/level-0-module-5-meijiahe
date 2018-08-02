import javax.swing.JOptionPane;

public class Primeornot {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog(null, "What number you want to test?");
	int number=Integer.parseInt(answer);
	boolean ISPRIME=true;
	for(int i=2; i<number;i++) {
		if(number%i==0) {
		
		 ISPRIME=false;
		}	
		
	}
	if(ISPRIME) {
		System.out.println("IS PRIME");
	}
	else {
		System.out.println("NOT PRIME");
	}
	
}


}

