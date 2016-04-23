using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Compare
{
    class Program
    {
        static void Main(string[] args)
        {
            string a = "Chsharp";
            string b = "ASP.NET";
            Console.WriteLine(string .Compare (a , b ));
            Console.WriteLine(string.Compare(a ,a ));
            Console.WriteLine(string.Compare(b ,a ));
            Console.ReadLine();
        }
    }
}
