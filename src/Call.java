import java.util.*;
public class Call {

	public static void main(String[] args) 
	{
		
		Scanner userinput = new Scanner(System.in);
		int age = ager(userinput);
		int str = str();
		int con = con();
		int intel = intel();
		int pow = pow();
		int edu = edu();
		int size = size();
		int dex = dex();
		int app = app();
		int luck = luck();
		printers(age, str, con, intel, pow, edu, size, dex, app, luck);
		
		if(age >=15 && age <= 19)
		{
			int l2 = luck();
			int hold = age1mod(userinput);
			
			if(luck < l2)
			{
				System.out.println("improved luck!");
				luck = l2;
			}
			edu -= 5;
			str -= hold;
			size -= (5 - hold);
			
		}
		else if(age >=20 && age <= 39)
		{
			int edu2 = (int)((Math.random() * 100) + 1);
			if(edu2 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
		}
		else if(age >=40 && age <= 49)
		{
			int edu2 = (int)((Math.random() * 100) + 1);
			int edu3 = (int)((Math.random() * 100) + 1);
			int[] hold = age0mod(5, userinput);
			
			if(edu2 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu3 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			
			app -= 5;
			str -= hold[0];
			con -= hold[1];
			dex -= (5 - (hold[1]+hold[0]));
			
		}
		else if(age >=50 && age <= 59)
		{
			int edu2 = (int)((Math.random() * 100) + 1);
			int edu3 = (int)((Math.random() * 100) + 1);
			int edu4 = (int)((Math.random() * 100) + 1);
			int[] hold = age0mod(10, userinput);
			
			if(edu2 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu3 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu4 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			
			app -= 10;
			str -= hold[0];
			con -= hold[1];
			dex -= (10 - (hold[1]+hold[0]));
			
		}
		else if(age >=60 && age <= 69)
		{
			int edu2 = (int)((Math.random() * 100) + 1);
			int edu3 = (int)((Math.random() * 100) + 1);
			int edu4 = (int)((Math.random() * 100) + 1);
			int edu5 = (int)((Math.random() * 100) + 1);
			int[] hold = age0mod(20, userinput);
			
			if(edu2 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu3 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu4 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu5 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			
			app -= 15;
			str -= hold[0];
			con -= hold[1];
			dex -= (20 - (hold[1]+hold[0]));
			
		}
		else if(age >=70 && age <= 79)
		{
			int edu2 = (int)((Math.random() * 100) + 1);
			int edu3 = (int)((Math.random() * 100) + 1);
			int edu4 = (int)((Math.random() * 100) + 1);
			int edu5 = (int)((Math.random() * 100) + 1);
		
			int[] hold = age0mod(40, userinput);
			
			if(edu2 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu3 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu4 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu5 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
		
			
			app -= 20;
			str -= hold[0];
			con -= hold[1];
			dex -= (40 - (hold[1]+hold[0]));
			
		}
		else if(age >=80 && age <= 90)
		{
			int edu2 = (int)((Math.random() * 100) + 1);
			int edu3 = (int)((Math.random() * 100) + 1);
			int edu4 = (int)((Math.random() * 100) + 1);
			int edu5 = (int)((Math.random() * 100) + 1);
			int[] hold = age0mod(80, userinput);
			
			if(edu2 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu3 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu4 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			if(edu5 > edu)
			{
				edu += (int)((Math.random() *10)+1);
				System.out.println("improved edu! New edu is: "+ edu );
			}
			
			
			app -= 25;
			str -= hold[0];
			con -= hold[1];
			dex -= (80 - (hold[1]+hold[0]));
			
		}
		printers(age, str, con, intel, pow, edu, size, dex, app, luck);
		
	}
	public static int age1mod(Scanner userinput)
	{
		
		System.out.println();
		System.out.print("Age penalty: Deduct 5 points among STR and SIZE, ");
		System.out.println("Decide how many points you would like to deduct from STR, the rest will be done automatically");
		int j = userinput.nextInt();
		userinput.close();
		
		if(j >=0 && j <=5)
		{
			return j;
		}
		else
		{
			System.out.print("You exceeded the amount to reduce, try again");
			age1mod(userinput);
		}
		return j;
	}
	public static int[] age0mod(int y, Scanner userinput)
	{
		
		System.out.println();
		System.out.print("Age penalty: Deduct " + y + " points among STR CON and DEX, ");
		System.out.println("Decide how many points you would like to deduct from STR, then CON, then the rest will be done automatically");
		int j = userinput.nextInt();
		int k = userinput.nextInt();
		userinput.close();
		int[] hol = {j,k};
		if(j+k >=0 && j+k <=y)
		{
			return hol;
		}
		else
		{
			System.out.print("You exceeded the amount to reduce, try again");
			age0mod(y, userinput);
		}
		return hol;
	}
	public static void printers(int age, int str, int con, int intel, int pow, int edu, int size, int dex, int app, int luck)
	{
		System.out.println("");
		System.out.println("Your age is: " + age);
		System.out.println("Strength is:     " + str + "%" + "    1/2 value is: " + str/2 + "%" + "    1/5 value is: " + str/5+"%");
		System.out.println("Constitution is: " + con + "%" + "    1/2 value is: " + con/2 + "%" +"    1/5 value is: " + con/5+"%");
		System.out.println("Intellegence is: " + intel + "%" + "    1/2 value is: " + intel/2 + "%" +"    1/5 value is: " + intel/5+"%");
		System.out.println("Power is:        " + pow + "%" + "    1/2 value is: " + pow/2 + "%" +"    1/5 value is: " + pow/5+"%");
		System.out.println("Education is:    " + edu + "%" + "    1/2 value is: " + edu/2 + "%" +"    1/5 value is: " + edu/5+"%");
		System.out.println("Size is:         " + size + "%" + "    1/2 value is: " + size/2 + "%" +"    1/5 value is: " + size/5+"%");
		System.out.println("Dexterity is:    " + dex + "%" + "    1/2 value is: " + dex/2 + "%" +"    1/5 value is: " + dex/5+"%");
		System.out.println("Apperance is:    " + app + "%" + "    1/2 value is: " + app/2 + "%" +"    1/5 value is: " + app/5 +"%");
		System.out.println("Luck is:         " + luck);
		dee(str, size);
		System.out.println("You have " + dee2(con, size) + " hit points");
		System.out.println("You movement speed is: " + move(dex, str, size, age));
	}
	public static int ager(Scanner userinput)
	{
		System.out.println("Enter your age");
		
		int j = userinput.nextInt();
		
		if(j >= 15 && j < 91)
		{
			return j;
		}
		else
		{
			System.out.println("Please enter an age between 15 and 90");
			
		}
		return ager(userinput);
		
		
	}
	public static int str()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c =(int)((Math.random() * 6) + 1);
		return (a + b + c)*5;
	}
	public static int con()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c =(int)((Math.random() * 6) + 1);
		return (a + b + c)*5;
	}
	public static int intel()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c = 6;
		return (a + b + c)*5;
	}
	public static int edu()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c = 6;
		return (a + b + c)*5;
	}
	public static int size()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c = 6;
		return (a + b + c)*5;
	}
	public static int pow()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c =(int)((Math.random() * 6) + 1);
		return (a + b + c)*5;
	}
	public static int dex()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c =(int)((Math.random() * 6) + 1);
		return (a + b + c)*5;
	}
	public static int app()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c =(int)((Math.random() * 6) + 1);
		return (a + b + c)*5;
	}
	public static int luck()
	{
		int a =(int)((Math.random() * 6) + 1);
		int b =(int)((Math.random() * 6) + 1);
		int c =(int)((Math.random() * 6) + 1);
		return (a + b + c)*5;
	}
	
	public static void dee(int s, int sz)
	{
		int hold = s + sz;
		if(hold < 65)
		{
			System.out.println("Damage bonus: -2  ");
			System.out.println("Build: -2");
		}
		else if(hold < 85)
		{
			System.out.println("Damage bonus: -1  ");
			System.out.println("Build: -1");
		}
		else if(hold < 125)
		{
			System.out.println("Damage bonus: 0  ");
			System.out.println("Build: 0");
		}
		else if(hold < 165)
		{
			System.out.println("Damage bonus: +1D4  ");
			System.out.println("Build: 1");
		}
		else
		{
			System.out.println("Damage bonus: +1D6  ");
			System.out.println("Build: 2");
		}
	}
	public static int dee2(int s, int c)
	{
		return (s+c)/10;
	}
	public static int move(int dex, int str, int size, int age)
	{
		int speed;
		if(dex > size && str > size)
		{
			speed = 9;
		}
		else if(dex >= size || str >= size)
		{
			speed = 8;
		}
		else
		{
			speed = 7;
		}
		
		
		if(age >= 40 && age < 50)
		{
			speed -=1;
		}
		else if(age >= 50 && age < 60)
		{
			speed -=2;
		}
		else if(age >= 60 && age < 70)
		{
			speed -=3;
		}
		else if(age >= 70 && age < 80)
		{
			speed -=4;
		}
		else if(age >= 80 && age < 90)
		{
			speed -=5;
		}
		else
		{
			
		}
		
		return speed;
	}
	
			
	

}
