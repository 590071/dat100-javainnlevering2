package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
		public static void skrivUt(int[] tabell) {
	        
	        for (int i : tabell) {
	            System.out.print(i + ", ");
	          
	    		}
	        }
	      
	        
		

	// b)
	public static String tilStreng(int[] tabell) {
		
		
		String melding ="[";
		
		
		
		for (int i = 0; i<tabell.length; i++) {
			melding += tabell[i] + ",";
		}
		if (melding.endsWith(",")) {
			melding = melding.substring(0, melding.length() - 1);
		}
		melding = melding + "]";
		
		System.out.println(melding);
		
		return melding;
		
        
      }
	     

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for (int tall : tabell) {
			sum += tall;
		}
		System.out.println(sum);
		
		return sum;
		
	
		}
	public static int summerWhile(int[] tabell) {
		
			int[] tall = tabell;
		
			int sum = 0;
		
			int index = 0;
			while(index < tabell.length) {
				sum += tabell[index];
				
				index++;
				
		}
			System.out.println(sum);
			return sum;
		
		}
	  public static int summerUtvidetFor(int[] tabell) {
			int[] tall = tabell;
			
			int sum = 0;
			
			for (int i = 0; i<tabell.length; i++) {
				sum += tabell[i];
			}
			System.out.println(sum);
			
			return sum;
		}
	
				
		

		
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		

		boolean funnet = false;
		
		for(int i : tabell) {
			if (i == tall) {
				funnet = true;
				break;
			
		}
		
		}
			return funnet;	
	}
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int arrayLength = tabell.length;
		int[] newArray = new int[arrayLength];
		int index = 0;
		
		for (int i = arrayLength - 1; i >= 0; i--) {
			newArray[index] = tabell[i];
			index++;
			
		}
		return newArray;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int min = Math.min(tabell1.length, tabell2.length);
		int max = Math.max(tabell1.length, tabell2.length);
		
		int[] newArray = new int[min + max];
		int index = 0;
		int i = 0;
		for (i = 0; i < min * 2; i +=2) {
			newArray[i] = tabell1[index];
			newArray[i + 1] = tabell2[index];
			index++;		
	}
		while (i < min + max) {
			if (tabell1.length > tabell2.length) {
				newArray[i] = tabell1[index];
			} else if (tabell2.length > tabell1.length) {
				newArray[i] = tabell2[index];
			}
			i++;
			index++;
		}
		
		return newArray;
		
	}
}
