using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p46
{
    class Program
    {
        static void Main(string[] args)
        {
            decimal a = 5.42m;
            decimal b = 6.33m;
            bool result1, result2, result3, result4;
            result1 = a == b;
            Console.WriteLine("result1:"+result1);
            result2 = a != b;
            Console.WriteLine("result2:"+ result2);
            result3 = !(a == b);
            Console.WriteLine("result3:"+ result3);
            result4 = a < b;
            Console.WriteLine("result4:"+ result4);
            Console.ReadLine();

        }
    }
}
