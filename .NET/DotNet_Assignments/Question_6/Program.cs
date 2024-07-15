using System.Runtime.CompilerServices;

namespace Question_6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Date dobj1=new Date(1,1,2000);
            Date dobj = new Date(2, 2, 3000);

            
            //dobj.acceptDate();
           // Console.WriteLine(dobj);
           // bool flag=dobj.isValid();
           // Console.WriteLine(flag);

            Date dobj2 = new Date();
            dobj2 = dobj1 - dobj;
            dobj2.displayDate();


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
            Date d3 =new Date();
            d3.Day=d2.Day-d1.Day;
            d3.Month = d2.Month - d1.Month;
            d3.Year=d2.Year - d1.Year;



            return d3;
        }



    }
}
