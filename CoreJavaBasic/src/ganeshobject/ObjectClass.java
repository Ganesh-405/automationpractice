package ganeshobject;

public class ObjectClass
{
	

		static int last_roll = 100;
		int roll_no;

		// Constructor
		ObjectClass()
	    {
	        roll_no = last_roll;//100
	        last_roll++;//101
	    }
		@Override
	    public int hashCode()
	    {
	        return roll_no;
	    }

		// Driver code
		public static void main(String args[]) {
			ObjectClass s = new ObjectClass();

			// Below two statements are equivalent
			System.out.println(s);
			System.out.println(s.toString());
			System.out.println(s.hashCode());
		}

	}



