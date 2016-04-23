using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Inset
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = "Sha";
            Console.WriteLine("原字符串为："+str );
            string str1;
            str1 = str.Insert(0, "C");
            string str2 = str1.Insert(3, "ar");
            Console.WriteLine("新的字符串为："+str2);
            Console.ReadLine();
        }
    }
}
