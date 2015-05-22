public class Challenges
	{
	public static void findNine()
		{
		int counter = 0;
		int newArray[][] =
			{
				{ 2, 4, 6, 8 },
				{ 3, 6, 9, 12 },
				{ 4, 8, 12, 16 } };
		for (int i = 0; i < 3; i++)
			{

			System.out.println();
			for (int x = 0; x < 4; x++)
				{
				System.out.print(newArray[counter][x] + "\t");
				}
			counter = counter + 1;
			}
		System.out.println("\n" + newArray[1][2]);
		}

	public static void printMustangs()
		{
		String[][] mustArray = new String[5][3];
		String must = "Mustangs";
		for (int y = 0; y < 5; y++)
			{
			for (int m = 0; m < 3; m++)
				{
				mustArray[y][m] = must;
				}
			}
		for (int row = 0; row < 5; row++)
			{
			System.out.println("\n");
			for (int column = 0; column < 3; column++)
				{
				System.out.print(mustArray[row][column] + "\t");
				}
			}

		}

	public static void print10s();

		{
		int helpMe=0;
		int[][] printTen = new int[3][3];
		for (int ghostnappa = 0; ghostnappa < 3; ghostnappa++)
			{
			for (int krilin = 0; krilin < 3; krilin++)
				{
					printTen[ghostnappa][krilin]=((1+helpMe)*10);
				}
			
			}
		}

	public static void main(String[] args)
		{
		findNine();
		printMustangs();

		}

	}
