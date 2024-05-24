class product_app
{
	public static void main(String arg[])
	{
           String name="srikanth";
	   int   code=98760;
	   int   price=10;
	   int   quantity=10;
  	   int   total=price*quantity;
	   int   add=0;
	   double discount=0;
	   String trasaction="credit";

			System.out.println(name+"  total "  +total);

		
		if(total<250)
		{
			discount=total-total*2/100;
			System.out.println("discount_2% percent ="+discount);
		} 
		else if(total>=250&&total<500)
		{
			discount=total-total*5/100;
			System.out.println("discount_5% percent="+discount);
		}
		else if(total>=500&&total<1000)
		{
			discount=total-total*10/100;
			System.out.println("discount_10% percent ="+discount);
		}
		else if(total>=1000&&total<1500)
		{
			discount=total-total*15/100;
			System.out.println("discount_15% percent ="+discount);
		}
		else
		{
			discount=total-total*25/100;
			System.out.println("discount_25% percent ="+discount);
		}
		double with_gst=discount+discount*10/100;
		System.out.println("'total with gst ="+with_gst);
	
	
		
	
		if(trasaction=="phonepay")
		{
			add=(int)with_gst-25;
			System.out.println("added 25rs discount to "+with_gst+"and now total ="+add);
		}
		else if(trasaction=="google_pay")
		{
			add=(int)with_gst-30;
			System.out.println("added 30rs discount to"+with_gst+"and now total ="+add);
		}
		else
		{
			trasaction="credit";
			add=(int)(with_gst+(with_gst*2/100));
			System.out.println("added credit card offer 2 percent ="+with_gst+"  now total is  "+add);
		}
	}
}


Never get any discount for you.....

		
		
			
			
			   
				
			
			
		

	
