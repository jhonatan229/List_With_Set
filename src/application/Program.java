package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import model.service.LoginService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		File file = new File("C:\\projeto-java\\play-with-set\\set-List\\List\\logInsList.txt");
		Set<LoginService> service = new HashSet<>();
		
	    try(BufferedReader br = new BufferedReader(new FileReader(file))){
	    	
	    	String log =  br.readLine();
	    	while(log != null) {
	    	
	    	String[] vect = log.split(" ");
	    	Date date = Date.from(Instant.parse(vect[1]));
	    	service.add(new LoginService(vect[0], date));
	    	log = br.readLine();
	    	
	    	}
	    }
	    catch(IOException e ) {
	    	System.out.println(e.getMessage());
	    }
	 
	    int total = service.size();
	    System.out.println(total);

	}

}
