package week3_zhangtianlu.practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String fileName = "nikujaga.txt";
		try {
			File file = new File(fileName);
			if(!file.exists()) {
				file.createNewFile();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileWriter fw = new FileWriter(fileName);
				BufferedWriter bw = new BufferedWriter(fw)
				){
			bw.write("carrot");
			bw.newLine();
			bw.write("potato");
			bw.newLine();
			bw.write("meat");
			bw.newLine();
			bw.write("onion");
			bw.newLine();
		}catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)
				){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
