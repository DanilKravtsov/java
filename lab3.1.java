public class Main {
	public static void main(String[] args) {
	    for(int i=2; i <= 100; i++) {
	        int x=2;
	        while(x<=i){
    	            if(i % x == 0){
    	                if(x==i){System.out.print(x +" ");}
    	                break;
    	            }
        	    x++;
	        }	     
	    }
	}
}