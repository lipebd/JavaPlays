package operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.Person;
import entities.Pet;
import entities.enums.TipoPet;

public class OpenList {
	
	static List<Person> lista = new ArrayList<>();

	public static String readRecords(String arquivo) {
		String caminho = "relatórios\\in\\"+arquivo+".csv";
		wait(500);
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String line;
			while ((line = br.readLine()) != null){
				String[] fields = line.split(",");
				TipoPet tipo = Pet.setTipo(Integer.parseInt(fields[2]));
				Pet pet = new Pet(tipo, fields[3], fields[4].charAt(0), Integer.parseInt(fields[5]));
				Person tutor = new Person(fields[0], fields[1], pet, LocalDateTime.now());
				lista.add(tutor);
			}
		}
			catch (IOException e) {
				e.printStackTrace();
		}
		return null;
	}
	
	public static void writeRecords(char resposta)
	{
		if (resposta == 's') {
		File arquivo = new File("relatórios\\relatório.txt");
		    try (FileOutputStream fos = new FileOutputStream(arquivo, true); 
		         PrintWriter writer = new PrintWriter(fos))
		    {
		        
		    	lista.forEach(rec -> writer.println(rec));
		        writer.flush();
		        System.out.println();
		        wait(500);
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
	
	public static void printLista() {
		for (Person pessoa : lista) {
			System.out.println(pessoa.fim());
			wait(500);
			}
		
	}
	
	private static void wait(int ms)
	{
	    try
	    {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex)
	    {
	        Thread.currentThread().interrupt();
	    }
	}
}
