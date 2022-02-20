import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Questao2 {
	
	public static boolean validaSenha(String senha) {

        String valida = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(valida);


        if (senha == null) {
            return false;
        }



        Matcher m = p.matcher(senha);

        return m.matches();
    }
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Senha");
        String senha = scanner.next();



        System.out.println("A senha é forte! " + validaSenha(senha));
	}
	
}


