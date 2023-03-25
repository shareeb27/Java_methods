import java.util.Scanner;

public class Task_2 {

				//buying mobile phones
	public static void main(String[] args) {
		System.out.println("ENTER YOUR SMART PHOONE PRICE :");
	
		Scanner s = new Scanner(System.in);
		 	
		int mobile_price =s.nextInt();
		
					  if(mobile_price > 6000 && mobile_price < 10000) {
						  
						  System.out.println("INFINIX NOTE 12(jewel blue ,64GB)£9999"
						  		
								  + "MOTOROLA e40(carbon gray,64GB)£8999"
						  		
								  + "REDMI 10A (slate grey ,64GB)£8437"
						  		
								  + "IKALL Z12 PRO (SKY colored,64GB)£6899"
								  
								  + "VIVO Y15s (mystic blue, 32GB)£9499");
					  
				}else if (mobile_price > 10000 && mobile_price < 20000) {
					
					System.out.println( "REDEMI 10(midnight black,64GB)£17000\n\n"
							
							+ "SAMSUNG GALAXY F13(waterfall blue 64GB)£20000,\n\n"
							
							+ "POCO C31(royal blue,64GB)£15000\n\n"
							
							+ "REALME C31(dark green ,32GB)£12000");
					
				}else if(mobile_price >20000 && mobile_price < 30000) {
					
					System.out.println("SAMSUNG S20 FE 5G(cloud navy,128GB)£21000\n\n"
							
							+"OPPO RENO 2 5G(shimmer gold,128GB)£29000\n\n"
							
							+ "ONEPLUS NORD 2T(gray shadow,128 GB)£28999\n\n"
							
							+ "REALME 9 pro 5G (aurora green,128GB)£20999");
				
				}else if(mobile_price >30000 && mobile_price < 50000) {
					
					System.out.println("APPLE IPHONE 11(white,128GB)£42000\n\n"
							
							+ "REALME GT 2 (steel black,256GB)£34000\n\n"
							
							+ "SAMSUNG Galaxy S20 plus 5G (phantom black 128GB)£49000\n\n"
							
							+ "MOTOROLA Edge 30 Fusion(solar gold,128 GB)£42000\n\n"
							
							+ "OPPO RENO 8 pro 5G (glazed black ,256GB)£45999");
				
				}else if(mobile_price > 50000  && mobile_price < 70000) {
						
					System.out.println("APPLE IPHONE 13(starlight ,128GB)£59990\n\n"
							
							+ "SAMSUNG Galaxy S22 plus 5G(phatom black, 128GB)£69999\n\n"
							
							+ "XIAOMI 12 PRO 5G (opera maluve ,256GB)£52990\n\n"
							
							+ "MOTOROLA Edge 30 ULTRA(interseller black,128GB)£59000\n\n"
							
							+ "APPLE IPHONE 13(midnight ,256GB)£68990"); 
				}
	
	
			}

		} 
	

	

