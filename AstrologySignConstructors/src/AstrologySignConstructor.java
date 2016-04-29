
public class AstrologySignConstructor
	{
		private String sign, monthTwo, monthOne;
		
		public AstrologySignConstructor (String s, String m, String n) 
				//String p, String h, String c, String l)
			{
				sign = s;
				monthTwo = m;
				monthOne = n;

			}

		public String getSign()
			{
				return sign;
			}

		public void setSign(String sign)
			{
				this.sign = sign;
			}

		public String getMonthTwo()
			{
				return monthTwo;
			}

		public void setMonthTwo(String monthTwo)
			{
				this.monthTwo = monthTwo;
			}

		public String getMonthOne()
			{
				return monthOne;
			}

		public void setMonthOne(String monthOne)
			{
				this.monthOne = monthOne;
			}
	}
