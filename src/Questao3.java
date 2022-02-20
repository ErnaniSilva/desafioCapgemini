import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String pri, seg;
		
		System.out.print("Digite uma palavra: ");
		pri = ler.nextLine();
		System.out.print("Digite a segunda palavra: ");
		seg = ler.nextLine();
		
		
	    if (pri.length() != seg.length()) {
	    	System.out.print("não é anagrama");
	    }
		
	    char[] char1 = pri.toCharArray();
	    char[] char2 = seg.toCharArray();
	    
	    Arrays.sort(char1);
	    Arrays.sort(char2);
	    
	    String sc1 = new String(char1);
	    String sc2 = new String(char2);
	    System.out.println(sc1 + sc2);
	    System.out.println("anagrama: " + sc1.equals(sc2));
	}

}
