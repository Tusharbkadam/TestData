package Scripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Files\\Example.txt");
		
		if(file.exists())
		{
			System.out.println("File Is Present In Files Folder");
		}
		else
		{
			System.out.println("File Is Not Present In Files Folder");
		}
		
//-------------------------------------------------------------------------------------------------------------------
		//Reading Text From File 
		//Predefined Classes Required Are FileReader - BufferReader
		
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);

		System.out.println(br.readLine());
		System.out.println(br.readLine());
	}

}
