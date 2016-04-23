using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Format
{
    class Program
    {
        static void Main(string[] args)
        {
            string a = "Csharp";
            string b = "ASP.NET";
            string newstr = string.Format("{0}是{1}最佳的后台程序语言！",a ,b );
            Console.WriteLine(newstr);
            Console.ReadLine();
        }
    }
}
