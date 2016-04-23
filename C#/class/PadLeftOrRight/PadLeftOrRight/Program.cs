using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PadLeftOrRight
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = "Csharp";
            string str2 = str1.PadLeft(str1.Length+1, '《');
            string str3 = str2.PadRight(str2.Length+1, '》');
            Console.WriteLine(str1 );
            Console.WriteLine(str3);
            Console.ReadLine();
        }
    }
}
