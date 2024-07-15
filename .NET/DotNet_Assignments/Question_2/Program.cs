namespace Assignment_1_2
{
    internal class Program
    {
        public static int add(int x,int y)
        {
            return x + y;
        }

        public static int sub(int x, int y)
        {
            return x - y;
        }

        public static int mult(int x, int y)
        {
            return x * y;
        }

        public static int div(int x, int y)
        {
            return x /y;
        }

        public static int menu()
        {
            Console.WriteLine("1.Addition");
            Console.WriteLine("2.Substraction");
            Console.WriteLine("3.Multiplication");
            Console.WriteLine("4.Division");
            Console.WriteLine("Enter choice:");
           
            String choice1=Console.ReadLine();
            int choice=Convert.ToInt32(choice1);
            return choice;
        }
        static void Main(string[] args)
        {
            int ch1;
           
            
            Console.WriteLine("Enter X: ");
            String a= Console.ReadLine();
            int x=Convert.ToInt32(a);

            Console.WriteLine("Enter Y: ");
            String b = Console.ReadLine();
            int y = Convert.ToInt32(a);


            do
            {
                switch ((ch1 = menu()))
                {
                    case 1:
                        Console.WriteLine("Addition is : " + add(x, y));
                        break;

                    case 2:
                        Console.WriteLine("Substraction is : " + sub(x, y));
                        break;

                    case 3:
                        Console.WriteLine("Multiplication is : " + mult(x, y));
                        break;

                    case 4:
                        Console.WriteLine("Division is : " + div(x, y));
                        break;
                }
            }while(ch1!=0);
        }
    }
}
