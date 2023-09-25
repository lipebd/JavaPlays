package operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import entities.Person;

public class SaveList {
	
	public static void writeRecords(List<Person> records, char resposta)
	{
		if (resposta == 's') {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Digite o nome do arquivo final: ");
		//String nome = sc.next();
	    // File arquivo = new File("relatórios\\" + nome + ".txt");
		File arquivo = new File("relatórios\\relatório.txt");
	    sc.close();
		    try (FileOutputStream fos = new FileOutputStream(arquivo, true); 
		         PrintWriter writer = new PrintWriter(fos))
		    {
		        
		    	records.forEach(rec -> writer.println(rec));
		        writer.flush();
		        System.out.println();
		        System.out.println("Arquivo salvo com sucesso em " + arquivo.getAbsolutePath());
		        
		    } catch (IOException e) {
				e.printStackTrace();
		    }
		}
		else if (resposta == 'n' ) {
			System.out.println();
			System.out.println("Nenhum registro será feito.");
		}
	}
}