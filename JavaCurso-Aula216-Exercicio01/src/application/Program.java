package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// instantiate input Scanner
		Scanner sc = new Scanner(System.in);
		
		// instantiate Map
		Map<String, Integer> candidateVotes = new LinkedHashMap<>();
		
		// ask for file path
		System.out.print("Enter file full path: ");
		String filePath = sc.nextLine();
		
		// instantiate file reader		
		try (BufferedReader readFile = new BufferedReader(new FileReader(filePath))) {
		
		// split line, add to map
		String line = readFile.readLine();
		while (line != null) {
			String[] splitLine = line.split(",");
			String candName = splitLine[0];
			int count = Integer.parseInt(splitLine[1]);
			
			// check witch candidate get the votes
			if(candidateVotes.containsKey(candName)) {
				int votesCount = candidateVotes.get(candName);
				candidateVotes.put(candName,  count + votesCount);
				
			} else {
				candidateVotes.put(candName, count);
			}
			
			line = readFile.readLine();
		}
		
		for (String key : candidateVotes.keySet()) {
			System.out.println(key + ": " + candidateVotes.get(key));
		}
		
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		
		sc.close();
		
	}

}
