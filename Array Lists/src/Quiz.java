
public class Quiz
	{

		public static void main(String[] args)
			{
				int nums [] = {3, 3, 4, 1, 3, 6, 3};
				int sum = 0;
				for (int i = 0; i < nums.length; i++)
					{
						System.out.println(nums[i]);
						sum = sum + nums[i];
					}
				System.out.println(sum);
				int amount = 0;
				for ( int i = 0; i < nums.length; i++)
					{
					if (nums[i] == 3)
					{
					amount++;
					}
					}
				System.out.println(amount);
			}

	}
