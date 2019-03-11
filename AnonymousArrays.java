public class AnonymousArrays
{
		public static void main(String[] args)
		{
			int[] singleDimenArr = new int[] {10,20,30,40,50};
			int[][] doubleAnnonArr = new int[][]{{1,2,3}, {4,5}};
			
			AnonymousArrays.sum(new int[] {4,5,6});
		}
		
		private static void sum(int[] values)
		{
			int total = 0;
			for (int value : values)
				total += value;
			System.out.println("The Sum total is : " + total);
		}
}