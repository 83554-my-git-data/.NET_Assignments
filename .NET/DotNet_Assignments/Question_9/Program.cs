namespace Question_9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Manager manager = new Manager();
            manager.accept();
            manager.print();
        }
    }


    public class Date
    {
        private int day;

        public int Day
        {
            get { return day; }
            set { day = value; }
        }

        private int month;

        public int Month
        {
            get { return month; }
            set { month = value; }
        }

        private int year;

        public int Year
        {
            get { return year; }
            set { year = value; }
        }

        public Date()
        {
            Day = 1;
            Month = 1;
            Year = 1900;
        }

        public Date(int day, int month, int year)
        {
            Day = day;
            Month = month;
            Year = year;
        }

        public void acceptDate()
        {
            Console.WriteLine("Enter day: ");
            Day = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter month: ");
            Month = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter year: ");
            Year = Convert.ToInt32(Console.ReadLine());
        }

        public void displayDate()
        {
            Console.WriteLine("day : " + Day);
            Console.WriteLine("day : " + Month);
            Console.WriteLine("day : " + Year);
        }

        public override string ToString()
        {
            return "Day: " + Day + "Month: " + Month + "Year: " + Year;
        }

        public bool isValid()
        {
            bool flag = false;

            if (Day < 31 && Day > 0)
                flag = true;
            else
                flag = false;

            if (Month < 12 && month > 0)
                if (Month % 2 == 0 && Day == 30)
                    flag = true;
            if (Month % 2 != 0 && Day == 31)
                flag = true;
            else
                flag = false;

            if (Year > 1900 && year > 2200)
                flag = true;
            else
                flag = false;

            return flag;
        }

        public static Date operator -(Date d1, Date d2)
        {
            Date d3 = new Date();
            d3.Day = d2.Day - d1.Day;
            d3.Month = d2.Month - d1.Month;
            d3.Year = d2.Year - d1.Year;



            return d3;
        }



    }
    public class person
    {
        string name;
        bool gender;
        Date birth;
        string address;

        public person()
        {
            birth = new Date();
        }
        public person(string name, bool gender, Date birth, string address)
        {
            this.name = name;
            this.gender = gender;
            this.birth = birth;
            this.address = address;
        }

        public string Name
        {
            get { return name; }
        }

        public String Gender
        {
            get { return gender ? "Male" : "Female"; }
        }

        public Date Birth
        {
            get { return birth; }
        }

        public string Address
        {
            get { return address; }
        }

        public override string ToString()
        {
            return "name:" + name + " gender: " + gender + " Birth Date: " + birth + " Address: " + Address;
        }

        public void accept()
        {
            Console.WriteLine("Enter your name: ");
            name = Console.ReadLine();

            Console.WriteLine("Enter your gender: ");
            gender = Convert.ToBoolean(Console.ReadLine());

            Console.WriteLine("Enter your Birth Date: ");
            birth.acceptDate();

            Console.WriteLine("Enter your address: ");
            address = Console.ReadLine();

        }

        public void print()
        {
            Console.WriteLine("Name: " + Name);
            Console.WriteLine("Gender: " + Gender);
            Console.WriteLine("Date of birth: " + Birth);
            Console.WriteLine("Address: " + Address);
        }
    }

    public class Employee : person
    {
        private static int id = 0;

        public int Id
        {
            get { return id; }
        }

        private double salary;

        public double Salary
        {
            get { return salary; }
            set { salary = value; }
        }

        private string designation;

        public string Designation
        {
            get { return designation; }
            set { designation = value; }
        }

        public enum DepartmentType
        {
            MANAGER = 1, HR = 2, FINANCE = 3
        };

        private DepartmentType dept;

        public DepartmentType Dept
        {
            get { return dept; }
            set { dept = value; }
        }

        public Employee()
        {
            ++id;
        }
        public Employee(double salary, string designation)
        {
            ++id;
            Salary = salary;
            Designation = designation;
        }

        public void accept()
        {
            base.accept();
            Console.WriteLine("Enter your salary: ");
            Salary = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Enter your Designation: ");
            Designation = Console.ReadLine();

            Console.WriteLine("Enter your Department: 1.Manager, 2.Hr, 3.Finance");
            int choice = Convert.ToInt32(Console.ReadLine());
            switch (choice)
            {
                case 1:
                    Dept = DepartmentType.MANAGER;
                    break;

                case 2:
                    Dept = DepartmentType.HR;
                    break;

                case 3:
                    Dept = DepartmentType.FINANCE;
                    break;


                default:
                    Console.WriteLine("WRONG CHOICE...");
                    break;
            }


        }
        public void print()
        {
            base.print();
            Console.WriteLine("ID is: " + Id);
            Console.WriteLine("Designation is: " + Designation);
            Console.WriteLine("Your Department is: " + Dept);
            Console.WriteLine("Your salary is: " + Salary);
        }

        public override string ToString()
        {
            return base.ToString()+"Id is" + Id + " Designation is: " + Designation + " Department is: " + Dept + " Salary is:" + Salary;
        }
    }
    public class Manager:Employee
    {
        private double bonus;

        public double Bonus
        {
            get { return bonus; }
            set { bonus = value; }
        }
        public Manager()
        {
        }
        public Manager(double bonus)
        {
            Bonus = bonus;
        }

        public void accept()
        {
            base.accept();
            Designation = "Manager";
            Console.WriteLine("Enter your bonus: ");
            Bonus = Convert.ToDouble(Console.ReadLine());
        }

        public void print()
        {
            base.print();
            Console.WriteLine("Your bonus is: "+Bonus);
        }

        public override string ToString()
        {
            return base.ToString()+"Bonus is: "+Bonus;
        }
    }
}
