import java.util.Arrays;

public class CountryOriginal {
	public static void main(String[] args) {
		
		String[] country = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo (Brazzaville)", "Congo (Kinshasa)", "Costa Rica", "Cote dIvoire", "Croatia", "Cuba", "Cyprus", "Czechia", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Greenland", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Mauritania", "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Namibia", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan*", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Trinidad and Tobago", "Tunisia", "Turkey", "US", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan", "Venezuela", "Vietnam", "West Bank and Gaza", "Western Sahara", "Yemen", "Zambia", "Zimbabwe"};
		long[] confirmedCases = {36263, 4880, 27973, 907, 950, 86, 167416, 37390, 15303, 20558, 30446, 382, 39482, 226225, 110, 67251, 66428, 48, 1770, 99, 71181, 10498, 739, 2442375, 141, 10621, 1100, 350, 378, 2328, 226, 17110, 116458, 4599, 922, 347923, 86783, 257101, 354, 3200, 8844, 15841, 15655, 4881, 2532, 1060, 15516, 13761, 5059, 18, 64156, 81161, 92482, 15035, 3071, 265, 2034, 2316, 14547, 27, 7398, 220352, 7189, 326, 1137, 207112, 33624, 4227, 14, 23, 45309, 7055, 1954, 389, 7340, 12, 39741, 4448, 1854, 1480073, 100303, 293606, 112585, 25892, 63985, 246286, 853, 31142, 1176, 84648, 17975, 7413, 64379, 33296, 20, 1219, 3882, 505, 1167, 2827, 86, 2019, 6321, 9690, 3664, 8904, 3369, 2513, 701, 6208, 344, 395489, 23154, 116, 289, 2893, 20887, 1701, 1843, 18752, 53413, 1557, 3439, 1132, 41180, 10213, 9132, 77058, 274289, 61442, 62, 4548, 389717, 82040, 43402, 50299, 109597, 45902, 816680, 1879, 17, 24, 52, 699, 865, 268934, 9764, 24141, 114, 1783, 50838, 2181, 2087, 3196, 452529, 14203, 2305, 272421, 2805, 11424, 1483, 79395, 34477, 674, 462, 7235, 509, 3297, 24, 874, 148, 1455, 227019, 4290259, 1128, 67096, 59177, 301708, 1202, 21209, 15988, 431, 10621, 10, 1691, 4552, 2704};
		System.out.println("Welcome to the Sorting Tester:\n"); //Needs change

        CountryCases[] countryCases= new CountryCases[country.length];
        for(int i=0; i<country.length; i++) {
        	countryCases[i]=new CountryCases(confirmedCases[i], country[i]);
        }
        //bubbleSort(countryCases);
        //insertionSort(countryCases);
        selectionSort(countryCases);
        
        
	}	
	
	public static void bubbleSort(CountryCases[] countryCases) {
		System.out.println("Bubble Sort :");
		long startTime=System.currentTimeMillis();
		boolean swap=false;
		CountryCases temp;
		for(int i=0; i<countryCases.length-1; i++) {
			swap=false;
			for(int j=0; j<countryCases.length-1-i;j++) {
				if(countryCases[j].getConfirmedCases()>countryCases[j+1].getConfirmedCases()) {					
					temp=countryCases[j];
					countryCases[j]=countryCases[j+1];
					countryCases[j+1]=temp;
					swap=true;
				}							
			}
			if(swap==false) {
				break;
			}	
		}
		long endTime=System.currentTimeMillis();
		printData(countryCases);
		
		System.out.println("Time taken: "+(double)(endTime-startTime)+" ms");
	}

	public static void insertionSort(CountryCases[] countryCases) {
		System.out.println("Insertion Sort: ");
		long startTime=System.currentTimeMillis();
		
		for(int i=1; i<countryCases.length; i++) {
			int j=i-1;
			CountryCases key=countryCases[i];
			while(j>=0 && key.getConfirmedCases()<countryCases[j].getConfirmedCases()) {
				countryCases[j+1]=countryCases[j];
				j=j-1;				
			}

			countryCases[j+1]=key;
		}
		long stopTime=System.currentTimeMillis();
		printData(countryCases);
		System.out.println("Time taken: "+(double)(stopTime-startTime)+" ms");
		
	}
	
	public static void selectionSort(CountryCases[] countryCases) {
		System.out.println("Selection Sort: ");
		long startTime=System.currentTimeMillis();
		int countryCasesLength=countryCases.length;
		for(int i=0; i<countryCasesLength-1;i++) {
			int minIndex=i;
			for(int j=i+1; j<countryCasesLength;j++) {
				if(countryCases[minIndex].getConfirmedCases()>countryCases[j].getConfirmedCases()) {
					minIndex=j;
				}
			}if(minIndex!=i) {
				CountryCases tempCases=countryCases[minIndex];
				countryCases[minIndex]=countryCases[i];
				countryCases[i]=tempCases;
			}			
		}
		long stopTime=System.currentTimeMillis();
		printData(countryCases);
		System.out.println("Time taken: "+(double)(stopTime-startTime)+" ms");
	}
	

	public static void printData(CountryCases[] countryCases) {
		System.out.printf("%30s\t%10s\n","Country","Cases");
		System.out.println("_ ".repeat(24));
		for(int i=0; i<countryCases.length; i++) {
        	System.out.printf("%30s\t%10d\n",countryCases[i].getCountry(),countryCases[i].getConfirmedCases());
        }
	}
}

