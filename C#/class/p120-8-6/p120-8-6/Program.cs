using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p120_8_6
{
    class Program
    {
        public static  int Add(int x,int y)
        {
            return x+y ;
        }
        static void Main(string[] args)
        {
            Console.WriteLine("{0}+{1}={2}",23,34,Add (23,34));
            Console.ReadLine();
        }
    }
}
