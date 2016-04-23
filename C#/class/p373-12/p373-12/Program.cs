using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p373_12
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 45;
            const int b = 456;
            Console.WriteLine("变量a= {0}", a);
            Console.WriteLine("常量b= {0}", b );
            a = 123;
            Console.WriteLine("变量a= {0}", a);
            Console.ReadLine();
        }
    }
}
