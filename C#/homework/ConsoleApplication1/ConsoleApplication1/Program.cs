using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("shuru");
            string str = Console.ReadLine();
            int n = str.Length;
            char[] a = new char [n];
            for (int i = 0; i < n; i++)
            {
                a [i ] = str [i ];
            }
            Array.Reverse(a, 0, str.Length);
            Console.WriteLine("new:" + new StringBuilder().Append(a).ToString());
            Console.ReadLine();
             
        }
       
    }
}
