package unl.cse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * This us a typical hello world style programm
 * 
 * @author zabolotsky The only method in this class is {@link #main(String[])}
 *         main method
 *
 */
public class HelloWolrd {
	public static void main(String[] args) {
		/**
		 * This is the main method
		 */
		// single line
		/* multiple line comments */
		/*
		 * char x = '\u263A'; String firstName = "Chris"; String secondName = "Bourke";
		 * String fullName = firstName + " " + secondName; System.out.println(fullName);
		 * System.out.println("Hello World!" + x + x + x); int a = 10; double pi = 3.14;
		 * char c = 'C'; boolean flag = true; String s = "hello"; String t = s; s =
		 * "HELLO"; String u = t.toUpperCase(); System.out.println(s);
		 * System.out.println(t); System.out.println(u);
		 * 
		 * int e = 10; int f = 20; double j = e / f; int d = (int) 10.5;
		 * System.out.println(j); System.out.println(d);
		 * 
		 * String ss = new String("Hello"); String ts = new String("Hello");
		 * 
		 * if (ss.compareTo(ts) == 0) { System.out.println("Equal"); } else {
		 * System.out.println("NOT Equal"); } double ppi = 3.14159265;
		 * System.out.printf("%f\n", ppi); System.out.printf("%.2f\n", ppi);
		 * System.out.printf("%.50f\n", ppi); for (double i = 0; i < 10; i += 0.1) {
		 * System.out.println(i); } int i = 0; while (i < 10) { System.out.println(i);
		 * i++; } double prime[] = new double[8]; for (int jj = 0; jj < prime.length;
		 * jj++) { prime[jj] = (double) jj; } double primes[] = { 2, 3, 5, 7, 11, 13,
		 * 17, 19 }; for (int jj = 0; jj < primes.length; jj++) {
		 * System.out.println(prime[jj]); System.out.println(primes[jj]); } for (double
		 * xx : primes) { System.out.println(xx); }
		 * 
		 * List<Integer> myList = new ArrayList<Integer>(); myList.add(10);
		 * myList.add(20); myList.add(30); myList.add(1, 40);
		 * System.out.println(myList); myList.remove(1); int n = myList.size(); for (int
		 * jj = 0; jj < n; jj++) { System.out.println(myList.get(jj)); } Set<Integer>
		 * mySet = new HashSet<Integer>(); mySet.add(10); mySet.add(20); mySet.add(30);
		 * mySet.add(10); mySet.add(10); mySet.add(10); mySet.add(10);
		 * System.out.println(mySet); mySet.remove(10);
		 * System.out.println(mySet.size()); System.out.println(mySet); for (int xx :
		 * mySet) { System.out.println(xx); }
		 * 
		 * 
		 * Map<Integer,String> myMap = new HashMap(); myMap.put(10, "Chris");
		 * myMap.put(20, "Kyle"); myMap.put(30, "Deren"); System.out.println(myMap);
		 * String myString = myMap.get(10); System.out.println(myString);
		 * System.out.println(myMap.get(40)); for(Integer sss : myMap.keySet()) {
		 * System.out.println(sss + " maps to " + myMap.get(sss)); } StringBuilder str =
		 * new StringBuilder("Aa123456"); str.append("   7"); str.insert(0,
		 * "Password "); str.replace(8, 10, "AD"); System.out.println(str);
		 * 
		 * double b = Math.PI; System.out.println(Math.cos(b)); double res =
		 * HelloWolrd.euclideanDistance(2,2,4,5); System.out.println(res);
		 * HelloWolrd.calcDist(); HelloWolrd.readFile(); HelloWolrd.writeFile();
		 *//*
			 * int a = 10; int b = 1; int z = 0; try { z = a / b; } catch
			 * (ArithmeticException ae) { // e.printStackTrace(); z = 1; throw new
			 * RuntimeException(ae); //catch and release it is better to do like this
			 * //System.exit(0); } catch (ArrayStoreException ase) { throw new
			 * RuntimeException(ase); } catch (ClassCastException cce) { throw new
			 * RuntimeException(cce); } catch (Exception e) { throw new RuntimeException(e);
			 * } System.out.println("Exception works"); System.out.println(z);
			 */
		List<Integer> a = Arrays.asList(5, 6, 3, 2, 7, 1);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		List<String> str = Arrays.asList("apple", "zebra", "orange", "Apples", "Horse", "Apple", "Pineapple", "Pie");
		System.out.println((str));
		Collections.sort(str);
		System.out.println((str));
		Comparator<Integer> descIntCmp = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				int c = 0;
				if(a > b) {
					c = 1;
				} else if(a < b) {
					c = -1;
				} else if(a == b) {
					c = 0;
				}
				return c;
			}
		};
		Collections.sort(a, descIntCmp);
		System.out.println(a);
		int x = Collections.binarySearch(a, 7);
		System.out.println("Found k at index " + x);

	}

	public static double euclideanDistance(double x0, double y0, double x1, double y1) {
		return Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));

	}

	public static void calcDist() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x1");
		double x1 = s.nextDouble();
		System.out.println("Enter y1");
		double y1 = s.nextDouble();
		System.out.println("Enter x2");
		double x2 = s.nextDouble();
		System.out.println("Enter y2");
		double y2 = s.nextDouble();
		System.out.println(HelloWolrd.euclideanDistance(x2, y2, x1, y1));
	}

	public static void readFile() {
		try {
			Scanner s = new Scanner(new File("/home/zabolotsky/eclipse-workspace/java_tut/src/unl/cse/data/hello.txt"));
			String line;
			while (s.hasNext()) {
				line = s.nextLine();
				String tokens[] = line.split(",");
				System.out.println(Arrays.toString(tokens));
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeFile() {
		try {
			PrintWriter pw = new PrintWriter(
					new File("/home/zabolotsky/eclipse-workspace/java_tut/src/unl/cse/data/hello_out.txt"));
			pw.println("How are you doing");
			pw.println("12 3 4 5 6");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
	}

}
