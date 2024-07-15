using System.Security.Cryptography;

namespace Assignment2_Q1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Student student=new Student();
            student.acceptDetails();
            student.printDetails();
            Console.ReadLine();
        }
    }

    struct Student {

        private string name;
        private bool gender;
        private int age;
        private int std;
        private char div;
        private double marks;


        public Student(string n, bool g, int a,
        int s,
        char d,
        double m)
        {
            name = n;
            gender = g;
            age = a;
            std = s;
            div = d;
            marks = m;
        }

       

        public int Age
        {
            get { return age; }
            set { age = value; }
        }


     
        public String Name
        {
            get { return name; }
            set { name = value; }
        }

      

        public int Std
        {
            get { return std; }
            set { std = value; }
        }


        public bool Gender
        {
            get { return gender; }
            set { gender = value; }
        }


      

        public char Div
        {
            get { return div; }
            set { div = value; }
        }


       
      
        public void acceptDetails()
        {
            Console.WriteLine("Enter name");
            name = Console.ReadLine();
            Console.WriteLine("Enter gender");
            gender=Convert.ToBoolean(Console.ReadLine());
            Console.WriteLine("Enter age");
            age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter standard");
            std= Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter division");
            div=Convert.ToChar(Console.ReadLine());
            Console.WriteLine("Enter marks");
            marks=Convert.ToDouble(Console.ReadLine());
        }

        public bool isMale()
        {
            if(gender)
                return true;
            else return false;
        }

        public void printDetails()
        {
            Console.WriteLine("Details about student: ");
            Console.WriteLine("name: "+name);

            if(isMale())
                Console.WriteLine("gender :Male");
            else
                Console.WriteLine("Female");

            Console.WriteLine("age: " + age);
            Console.WriteLine("standard: " + std);
            Console.WriteLine("division: " + div);
            Console.WriteLine("marks: " +marks);
        }
    }
}
