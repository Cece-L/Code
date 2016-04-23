using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Copy
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = "Csharp";
            string str2;
            str2 = string.Copy(str1);
            Console.WriteLine(str2 );
            Console.ReadLine();
        }
    }
}
