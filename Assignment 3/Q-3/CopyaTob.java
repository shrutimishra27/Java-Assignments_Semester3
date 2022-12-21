import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyaTob {
    public static void main(String[] args) throws IOException {
		
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	FileInputStream fis = null;
	FileOutputStream fos = null;
		
	try {
		fis = new FileInputStream("chill.txt");
		bis = new BufferedInputStream( fis);
		fos = new FileOutputStream(args[0]);
		bos = new BufferedOutputStream(fos);

		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		bos.flush();
	}
	catch(IOException ex) {
		System.err.println(ex.getMessage());
	}
	
	finally {
		if(fis!=null) fis.close();
		if(bis!=null) bis.close();
		if(fos!=null) fos.close();
		if(bos!=null) bos.close();	
	}

	System.out.println("File has been Copied");
}
}

