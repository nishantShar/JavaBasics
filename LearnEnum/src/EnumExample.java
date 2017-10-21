enum Mobile{
	
	SAMSUNG(30),APPLE(100),HTC();
	
	int price;
	int pricecheck;
Mobile(){
		
		System.out.println("Check");		
		
		}

Mobile(int pricecheck){
	
	this.pricecheck = pricecheck; 
}
	
	public int getPrice()
	{
		
		return this.pricecheck;
		
		
	} 
	
	}



public class EnumExample {

	public static void main(String[] args) {
		
//		Mobile m = Mobile.SAMSUNG;
//		
//		switch(m){
//		
//		case APPLE:
//			
//			System.out.println(Mobile.APPLE);
//			break;
//		case SAMSUNG:
//			
//			System.out.println(Mobile.SAMSUNG);
//			break;
//		
//			
//		}
		
		
	System.out.println(Mobile.APPLE.getPrice());
	System.out.println(Mobile.SAMSUNG.getPrice());
		
	}

}
