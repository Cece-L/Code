using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p48_4_15
{
    class Program
    {
        static void Main(string[] args)
        {
           int  a = 1;
            int  b = 85;
            bool result1, result4;
            bool c = true ;
            int result2, result3;
            result1 = (a & b)==0;
            Console.WriteLine("result1:" + result1);
            result2 = (a | b );
            Console.WriteLine("result2:" + result2);
            result3 = (a ^ b);
            Console.WriteLine("result3:" + result3);
            result4 = c & (b >45);
            Console.WriteLine("result4:" + result4);
            Console.ReadLine();
        }
    }
}
