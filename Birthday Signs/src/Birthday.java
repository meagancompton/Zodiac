
public class Birthday
	{
		private int day;
		private int month;
		
		public Birthday (int m, int d)
			{
				month = m;
				day = d;
			} 
		
		
		public int getDate()
			{
				return day;
			}

		public void setName(int day)
			{
				this.day = day;
			}

		public int getMonth()
			{
				return month;
			}

		public void setMonth(int month)
			{
				this.month = month;
			}
	}
