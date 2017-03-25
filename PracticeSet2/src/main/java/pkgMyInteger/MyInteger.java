package pkgMyInteger;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	
	public boolean isEven(){
		if (iValue % 2== 0) {
			return true;
		}else
			return false;
	}
	
	public boolean isOdd(){
		if (iValue % 2==0) {
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean isPrime(){
		for(int p = 1; p < iValue; ++p)
		{
			if(iValue % p == 0)
				{
					return false;
					
			
				}
		}		
		return true;
				
	}
	
	/**
	* Static methods 
	*
	*/
	
	public static boolean isEven(int x)
	{
		if(x % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(int x)
	{
		if(x % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean isPrime(int x)
	{
		for(int p = 1; p < x; ++p)
		{
			if(x % p == 0)
			{
				return false;
			}			
		}
		return true;
	}
	
	/**
	 * 
	 *  Methods (MyInteger)
	 */
	
	public static boolean isEven(MyInteger x) {
		if (x.getiValue() % 2 == 0) {
			return true;
		} else
			return false;
	} 
	public static boolean isOdd(MyInteger x) {
	if (x.getiValue() % 2 != 0) {
		return true;
	} else
		return false;
	}
	
	public static boolean isPrime(MyInteger x) {
		for (int p = 2; p < x.getiValue(); ++p) {
			if (x.getiValue() % p == 0) {
				return false;
					
				}
			}	
			return true;
	}


	public boolean equals(int x)
	{
		if (x==iValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(MyInteger x)
	{
		if (x.iValue == iValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
}
