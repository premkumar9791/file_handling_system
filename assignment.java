
//  Topic: File Handling

package test;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		 
		//I created a File Handling System in Java.
		//The features of this File Handling System are
		//Get a value from User and insert in the input.txt file.
		//Collect data from input.txt file and sum all the integers, store the value in output.txt file.
		//It will print input.txt file and output.txt file.
		//It will also clear all the datas from both the files.
		
		    main();
		
		}

	private static void main() {
		 String input="C:/Users/SunLand/Desktop/assignment/input.txt";
		 String output="C:/Users/SunLand/Desktop/assignment/output.txt";
		 Scanner scanner = new Scanner(System.in);
		 boolean loop=true;
		 
		 while(loop) {
		 System.out.println("1. Enter the value to input file \n2. Sum the values to get in output file \n3. Show all values in input file \n4. Show all values in output file \n5. Clear all values in input file \n6. clear all values in output file \n7. Exit \nEnter the number 1 to 7:");
		 int number=scanner.nextInt(); 
		 switch(number){
		 case 1:{
			 enter_values_input();
			 break;
		 }
		 case 2:{
			 sum_values_output();
			 break;
		 }
		 case 3:{
			 show_values_input();
			 break;
		 }
		 case 4:{
			 show_values_output();
			 break;
		 }
		 case 5:{
			 clear_input();
			 break;
		 }
		 case 6:{
			 clear_output();
			
			 break;
		 }
		 case 7:{
			 loop=false;
			 System.out.println("you exited!");
			 System.out.println("---------------------------------------------");
			 break;
	     }
		 default:{
			 System.out.println("you eneter a wrong input!");
			 System.out.println("---------------------------------------------");
			 break;}
		 }}
	}

	private static void clear_output() {
		 String output="C:/Users/SunLand/Desktop/assignment/output.txt";
		 try {
			    FileWriter fileClear = new FileWriter(output, false);
			    fileClear.close();
			    System.out.println("output file data is clear");
			    System.out.println("---------------------------------------------");
			} catch (IOException e) {
			    System.out.println("Error clearing the file.");
			    System.out.println("---------------------------------------------");
			}
		
	}

	private static void clear_input() {
		String input="C:/Users/SunLand/Desktop/assignment/input.txt";
		 try {
			    FileWriter fileClear = new FileWriter(input, false);
			    fileClear.close();
			    System.out.println("input file data is clear");
			    System.out.println("---------------------------------------------");
			} catch (IOException e) {
			    System.out.println("Error clearing the file.");
			    System.out.println("---------------------------------------------");
			}
		
	}

	private static void show_values_output() {
		 String output="C:/Users/SunLand/Desktop/assignment/output.txt";
		 try {
	            File file = new File(output);
	            Scanner scan= new Scanner(file);
	            
	            System.out.println("All values in output:");
	            while (scan.hasNextLine()) {
	            	 String line = scan.nextLine().trim();
	            	 System.out.println(line);
	            }
	            System.out.println("---------------------------------------------");
	            scan.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Input file not found.");
	            System.out.println("---------------------------------------------");
	        } 
		
	}

	private static void show_values_input() {
		 String input="C:/Users/SunLand/Desktop/assignment/input.txt";
		 
		 try {
	            File file = new File(input);
	            Scanner scan= new Scanner(file);
	            
	            System.out.println("All values in input:");
	            while (scan.hasNextLine()) {
	            	 String line = scan.nextLine().trim();
	            	 System.out.println(line);
	            }
	            System.out.println("---------------------------------------------");
	            scan.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Input file not found.");
	            System.out.println("---------------------------------------------");
	        } 
		
	}

	private static void sum_values_output() {
		 String input="C:/Users/SunLand/Desktop/assignment/input.txt";
		 String output="C:/Users/SunLand/Desktop/assignment/output.txt";
		int sum = 0;
		try {
            File file = new File(input);
            Scanner scan = new Scanner(file);
            
            while (scan.hasNextLine()) {
            	 String line = scan.nextLine().trim();

                 if (!line.isEmpty()) {
                     int num = Integer.parseInt(line);  
                     sum += num;
                 }
            }
            scan.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            writer.write(String.valueOf(sum));
            writer.newLine();
            writer.close();

            System.out.println("sum of the inputfile values:"+sum);
            System.out.println("---------------------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
            System.out.println("---------------------------------------------");
        } catch (IOException e) {
            System.out.println("error in output file.");
            System.out.println("---------------------------------------------");
        }
		
	}

	private static void enter_values_input() {
		 String input="C:/Users/SunLand/Desktop/assignment/input.txt";
		try {
			 FileWriter file = new FileWriter(input);
			 Scanner scan =new Scanner(System.in);
			 int input_value;
			 BufferedWriter writer = new BufferedWriter(file);
			 boolean loop_2=true;
			 while(loop_2) {
				 System.out.println("Enter value 1 or 2 \n1. Enter value in input \n2. Exit in input value file");
				 int run=scan.nextInt();
				 switch(run) {
				 case 1:{
					 System.out.println("Enter value to input:");
					 input_value=scan.nextInt();
					 scan.nextLine(); 
					 writer.write(String.valueOf(input_value));
					 writer.newLine();
					 System.out.println("your enter value "+ input_value +" is submitted successfully!");
					 System.out.println("---------------------------------------------");
					 break;
				 }
				 case 2:{
					 loop_2=false;
					 break;
				 }
				 default:{
					 System.out.println("you enter wrong input");
					 System.out.println("---------------------------------------------");
					 break;
				 }	
				 }
				 
			 }			 
	            writer.close();
	            System.out.println("exit successfully");
	            System.out.println("---------------------------------------------");
	        } catch (IOException e) {
	            System.out.println("error in output file.");
	            System.out.println("---------------------------------------------");
	        }
		
	}		
	}


