public class BeerSong {
    public static void Main(String[] args) {   
    	Ninety_Nine_Bottles_of_Beer(); 
    }
    public static void Ninety_Nine_Bottles_of_Beer() {
    	int i = 100;
     	while (i > 0) {
     		Sysem.out.println((i) + " bottles of beer on the wall, " + (i) + " bottles of beer take one down, pass it around, " + (i-1) +" bottles of beer on the wall.");
     		i--;
     	}
    }
}