import java.io.*;
import java.util.*;

class DuplicateDelete {
	public static void main(String[] args) {
		String filePath = "./javaDUP.txt";
		deleteDuplicates(filePath);
	}

	static void deleteDuplicates(String filePath) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			Set<String> uniqueLines = new LinkedHashSet<String>();
			String s;
			for(s = br.readLine(); s != null; s = br.readLine())
				uniqueLines.add(s);
			br.close();
			PrintWriter pw = new PrintWriter(new FileWriter(filePath));
			for(String s_: uniqueLines)
				pw.println(s_);
			pw.flush();
			pw.close();
			System.out.println("Duplicate lines removed successfully");
		} catch(Exception e) { 
			System.out.println("File error: " + e); 
		}
	}
}