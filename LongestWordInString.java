class LogestWordInStirng{
	
	public static void main(String[] args){
		
		String str = "Hello World to Java";
		int max =0,b;
		String[] arr = str.split(" ");
		String str2= "";
		
		for(String a: arr){
			b=a.length();
			if(max < b ) {
			 max = b;
			 str2 = a;
			}
		}
		
		System.out.println(max + "  " + str2);
		
	}
}