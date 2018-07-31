import java.util.Scanner;
class Converter{
        Converter(){
            System.out.println("Select Alphabet associted with measurements");
            float output;
            System.out.println("LENGTH      : A");
            System.out.println("CURRENCY    : B");
            System.out.println("WEIGHT      : C");
            System.out.println("AREA        : D");
            System.out.println("VOLUME      : E");
            System.out.println("TEMPERATURE : F");
            System.out.println("PRESSURE    : G");
            System.out.println("POWER       : H");
            System.out.println("MILEAGE     : I");
            System.out.println("FUEL        : J");
            System.out.println("TIME        : K");
        	Scanner obj  = new Scanner(System.in);
            String s = obj.nextLine();
            char c = s.charAt(0);
		switch(c){
		case 'A': output = length();
        System.out.println(output);			
        	break;
		case 'a': output = length();
        System.out.println(output);			
        	break;
		case 'B': output = currency();
		System.out.println(output);
			break;
		case 'b': output = currency();
		System.out.println(output);
			break;
		case 'C': output = weight();
        System.out.println(output);		
        	break;		
		case 'c': output = weight();
        System.out.println(output);		
        	break;
		case 'D': output = area();
                System.out.println(output);			
			break;
		case 'd': output = area();
        System.out.println(output);			
        	break;
		case 'E': output = volume();
        System.out.println(output);			
        	break;
		case 'e': output = volume();
        System.out.println(output);			
        	break;
		case 'F': output = temperature();			
        	break;
		case 'f': output = temperature();
        System.out.println(output);			
        	break;      
		case 'G': output = pressure();
        System.out.println(output);			
        	break;
		case 'g': output = pressure();
        System.out.println(output);			
        	break;
		case 'H': output = power();
        System.out.println(output);			
        	break;
		case 'h': output = power();
        System.out.println(output);			
        	break;
		case 'I': output = mileage();
        System.out.println(output);
        	break;
		case 'i': output = mileage();
        System.out.println(output);
        	break;
		case 'J': output = fuel();
        System.out.println(output);			
			break;
		case 'j': output = fuel();
        System.out.println(output);			
        break;
		case 'K': output = time();
                System.out.println(output);			
			break;
		case 'k': output = time();
        System.out.println(output);			
        	break;
		default: System.out.println("Invalid Input");
		}
	}
	private float mileage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select associated number for Input mileage");
		System.out.println("MILES     : 0");
		System.out.println("KILOMETER : 1"+"\n");
		int i = scan.nextInt();	
		System.out.println("Select associated number for Output mileage");
		System.out.println("MILES     : 0");
		System.out.println("KILOMETER :1"+"\n");
		int o = scan.nextInt();
		System.out.println("Enter Value"+"\n");	
		float n = scan.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			 
			return (float)(n*1.604);
		}
				else if(i == 1 && o == 0){
			return (float) (n*(1/1.604));
		}
		
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	}
	private float power() {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Power");
		System.out.println("WATT   : 0");
		System.out.println("MHP    : 1"+"\n");
		int i = scan.nextInt();	
		System.out.println("Output Power");
		System.out.println("WATT   : 0");
		System.out.println("MHP    : 1"+"\n");
		int o = scan.nextInt();
		System.out.println("Enter Value"+"\n");	
		float n = scan.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			 
			return (float)(n*0.00136);
		}
				else if(i == 1 && o == 0){
			return (float) (n*(1/0.00136));
		}
		
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	}		
	private float pressure() {
			
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input Pressure");
		System.out.println("PASCAL   : 0");
		System.out.println("BAR      : 1"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output Pressure");
		System.out.println("PASCAL   : 0");
		System.out.println("BAR      : 1"+"\n");
		int o = scanc.nextInt();
		System.out.println("Enter Value"+"\n");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			 
			return (float)(n*(1/100000));
		}
				else if(i == 1 && o == 0){
			return (float) (n*100000);
		}
		
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	}		
	private float temperature() {
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input temperature");
		System.out.println("FAHRENHEIT    : 0");
		System.out.println("KELVIN        : 1");
		System.out.println("CELCIUS       : 2"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output temperature");
		System.out.println("FAHRENHEIT    : 0");
		System.out.println("KELVIN        : 1");
		System.out.println("CELCIUS       : 2"+"\n");	
		int o = scanc.nextInt();
		System.out.println("Enter Value"+"\n");	
		float n = scanc.nextFloat();
		if(i == 1 && n<0) {
			System.out.println("Invalid value of Kelvin");	
		}
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			if((n+459.67)*(5/9)<0) {
				System.out.println("Invalid value of Kelvin");
				return 0;
			}
		else
			return (float) ((n+459.67)*(5/9));
		}
		else if(i == 0 && o == 2){
			
			return  ((n-32)*(5/9));
		}
		else if(i == 1 && o == 0){
			return  (float) ((n*(9/5))-459.67);
		}
		else if(i == 1 && o == 2){
			return (float) (n-273.15);
		}
		else if(i == 2 && o == 0){
			return  (n*(9/5)+32);
		}
		else if(i == 2 && o == 1){
			if(n+273.15<0) {
				System.out.println("Invalid value of Kelvin");
				return 0;
			}
		else
			return  (float) (n+273.15);
		}		
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	}
	private float volume() {
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input Volume");
		System.out.println("LITRE    : 0");
		System.out.println("ML       : 1"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output Volume");
		System.out.println("LITRE    : 0");
		System.out.println("ML       : 1"+"\n");
		int o = scanc.nextInt();
		System.out.println("Enter Value"+"\n");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			 
			return (float)(n*1000);
		}
				else if(i == 1 && o == 0){
			return (float) (n*(1/1000));
		}
		
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	}     
		
	private float time() {
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input TIME");
		System.out.println("HOUR      : 0");
		System.out.println("MINUTE    : 1");
		System.out.println("SECONDS   : 2"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output TIME");
		System.out.println("HOUR      : 0");
		System.out.println("MINUTE    : 1");
		System.out.println("SECONDS   : 2"+"\n");	
		int o = scanc.nextInt();
		System.out.println("Enter Value :" + "\n");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			
			return (float)(n*60);
		}
		else if(i == 0 && o == 2){
			
			return (float) (n*60*60);
		}
		else if(i == 1 && o == 0){
			return (float) (n*(1/60));
		}
		else if(i == 1 && o == 2){
			return (float) (n*60);
		}
		else if(i == 2 && o == 0){
			return (float) (n*(1/3600));
		}
		else if(i == 2 && o == 1){
			return (float) (n*(1/60));
		}
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	}
	private float fuel() {
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input Volume");
		System.out.println("LITRES     : 0");
		System.out.println("MILILITRES : 1"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output Length");
		System.out.println("LITRES     : 0");
		System.out.println("MILILITRES : 1"+"\n");	
		int o = scanc.nextInt();
		System.out.println("Enter Value :"+"\n");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			
			return (float)(n*1000);
		}
		else if(i == 1 && o == 0){
			
			return (float) (n*(1/1000));
		}
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	}
	private float area() {
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input Area");
		System.out.println("ACRES    : 0");
		System.out.println("HECTARES : 1"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output Length");
		System.out.println("ACRES    : 0");
		System.out.println("HECTARES : 1"+"\n");	
		int o = scanc.nextInt();
		System.out.println("Enter Value :"+"\n");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			
			return (float)(n*0.405);
		}
		else if(i == 1 && o == 0){
			
			return (float) (n*(1/0.405));
		}
		else {
			System.out.println("Invalid Entry");
			return 0;	
		}
	
		}
	private float length() {
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input Length");
		System.out.println("METER      : 0");
		System.out.println("CENTIMETER : 1");
		System.out.println("INCHES     : 2"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output Length");
		System.out.println("METER      : 0");
		System.out.println("CENTIMETER : 1");
		System.out.println("INCHES     : 2"+"\n");	
		int o = scanc.nextInt();
		System.out.println("Enter Value :");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			
			return (float)(n*100);
		}
		else if(i == 0 && o == 2){
			
			return (float) (n*39.37);
		}
		else if(i == 1 && o == 0){
			return (float) (n*(1/100));
		}
		else if(i == 1 && o == 2){
			return (float) (n*0.394);
		}
		else if(i == 2 && o == 0){
			return (float) (n*(1/39.37));
		}
		else if(i == 2 && o == 1){
			return (float) (n*(1/0.3937));
		}
		else {
			System.out.println("Invalid Entry");
			return 1;
		}
	}
	private float weight() {
		float a;
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input Weight");
		System.out.println("KILOGRAMS    : 0");
		System.out.println("GRAMS        : 1");
		System.out.println("MILIGRAMS    : 2");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output Weight");
		System.out.println("KILOGRAMS    : 0");
		System.out.println("GRAMS : 1");
		System.out.println("MILIGRAMS    : 2");	
		int o = scanc.nextInt();
		System.out.println("Enter Value"+"\n");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			a= (float) (n*1000);
			return a;
		}
		else if(i == 0 && o == 2){
			
			return (float) (n*100000);
		}
		else if(i == 1 && o == 0){
			return (float) (n*(1/1000));
		}
		else if(i == 1 && o == 2){
			return (float) (n*100);
		}
		else if(i == 2 && o == 0){
			return (float) (n*(1/100000));
		}
		else if(i == 2 && o == 1){
			return (float) (n*(1/100));
		}		
		else {
			System.out.println("Invalid Entry");
			return 1;
		}
	}
	private float currency(){
		Scanner scanc = new Scanner(System.in);
		System.out.println("Select associated number for Input currency");
		System.out.println("EURO      : 0");
		System.out.println("DOLLAR    : 1");
		System.out.println("RUPEE     : 2"+"\n");
		int i = scanc.nextInt();	
		System.out.println("Select associated number for Output Currency");
		System.out.println("EURO      : 0");
		System.out.println("DOLLAR    : 1");
		System.out.println("RUPEE     : 2"+"\n");	
		int o = scanc.nextInt();
		System.out.println("Enter Value"+"\n");	
		float n = scanc.nextFloat();
		if(i == o){
			return n;
		}
		else if(i == 0 && o == 1){
			 
			return (float)(n*1.4389);
		}
		else if(i == 0 && o == 2){
			
			return (float) (n*80.37);
		}
		else if(i == 1 && o == 0){
			return (float) (n*(1/1.4389));
		}
		else if(i == 1 && o == 2){
			return (float) (n*68.62);
		}
		else if(i == 2 && o == 0){
			return (float) (n*(1/80.37));
		}
		else if(i == 2 && o == 1){
			return (float) (n*(1/68.62));
		}		
		else {
			System.out.println("Invalid Entry");
			return 1;
		}
	}     
        public static void main(String args[]) throws Exception{
		new Converter();
        }
}

