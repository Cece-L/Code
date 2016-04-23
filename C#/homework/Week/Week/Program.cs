using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Week
{
    enum MyDate 
    {
        Sun = 0 ,
        Mon = 1 ,
        Tue = 2 ,
        Wed = 3 ,
        Thi = 4 ,
        Fri = 5 ,
        Sat = 6 

    }
    class Program
    {
        static void Main(string[] args)
        {
            int k = (int)DateTime.Now.DayOfWeek;
            switch (k)
            {
                case (int)MyDate.Sun: Console.WriteLine("今天是星期天"); break;
                case (int)MyDate.Mon : Console.WriteLine("今天是星期一"); break;
                case (int)MyDate.Tue : Console.WriteLine("今天是星期二"); break;
                case (int)MyDate.Wed : Console.WriteLine("今天是星期三"); break;
                case (int)MyDate.Thi : Console.WriteLine("今天是星期四"); break;
                case (int)MyDate.Fri : Console.WriteLine("今天是星期五"); break;
                case (int)MyDate.Sat : Console.WriteLine("今天是星期六"); break;
            }
            Console.ReadLine();
        }
    }
}
