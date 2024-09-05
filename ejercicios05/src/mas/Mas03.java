package mas;

public class Mas03 {

	public static void main(String[] args) {
	
		for (int i=0; i<16; i++) {
			for (int j=0; j<8; j=j+2) {
				for (int k=0; k<4; k=k+4) {
					for (int l=0; l<2; l=l+8) {
						System.out.println(i+"-"+j+"-"+k+"-"+l);
					}
				}
			}
		}
	}
}
