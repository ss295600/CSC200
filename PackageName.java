/* 
assignment info: Write an application that will get a list of web addresses (one address per line), convert them to package names, and print them (one name per line).   Read Java package name before starting this problem.  
name: said ahmed 
date: 26 june 2018
*/ 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PackageName {
	public static final ArrayList<String> KEYWORDS = new ArrayList<String>(Arrays.asList(
			"abstract", "assert", "boolean", "break", "byte",
			"case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else",
			"enum", "extends", "false", "final", "finally",
			"float", "for", "goto", "if", "implements",
			"import", "instanceof", "int", "interface", "long",
			"native", "new", "null", "package", "public",
			"protected", "public", "return", "short", "static",
			"strictfp", "super", "switch", "synchronized", "this",
			"throw", "throws", "transient", "true", "try",
			"void", "volatile", "while"
			));

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String filename ;
		ArrayList<String> webAddresses = null, packageNames;

		System.out.print("Enter the filename containing web addresses: ");
		filename = in.nextLine();

		try {
			webAddresses = readFile(filename);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		packageNames = convert(webAddresses);

		System.out.printf("%-50s %-50s\n", "Web address", "Package name");
		for(int i= 0; i < webAddresses.size(); i++)
			System.out.printf("%-50s %-50s\n", webAddresses.get(i), packageNames.get(i));


	}
	public static ArrayList<String> readFile(String filename) throws FileNotFoundException{
		ArrayList<String> webAddresses = new ArrayList<String>();
		Scanner infile = new Scanner(new File(filename));
		while(infile.hasNextLine())
			webAddresses.add(infile.nextLine());

		infile.close();
		return webAddresses;

	}
	public static ArrayList<String> convert(ArrayList<String> webAddresses){
		ArrayList<String> packageNames = new ArrayList<String>();
		for(String s : webAddresses)
		{
			s = s.toLowerCase().trim().replace(" ", "");
			String[] parts = s.split("\\.");
			int len = parts.length;
			String pname = parts[len - 1];
			for(int i = len-2; i>=0; i--)
			{
				if(KEYWORDS.contains(parts[i]))
					parts[i] = parts[i] + "_";
				else if(!Character.isAlphabetic(parts[i].charAt(0)))
					parts[i] = "_" + parts[i];
				pname += "." + parts[i];
			}
			packageNames.add(pname);
		}

		return packageNames;
	}
}

/* 
sample output: 
  ----jGRASP exec: java PackageName
 Enter the filename containing web addresses: webaddr.txt
 Web address                                        Package name                                      
 webaddr.txt                                        txt.webaddr                                       
                                                                                                      
 abc.com                                            com.abc                                           
 hello.com                                          com.hello                                         
 okay.com                                           com.okay                                          
 
  ----jGRASP: operation complete.
*/ 