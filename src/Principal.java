import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Principal {

	public static void main(String[] args) {
		FileOutputStream os = null;  
        String porta = "LPT1";  
        try {  
            try {
				os = new FileOutputStream(porta);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
            PrintStream ps = new PrintStream(os);  
            ps.println("Q320,019");

	}finally {
		
	}

	}
	
}
