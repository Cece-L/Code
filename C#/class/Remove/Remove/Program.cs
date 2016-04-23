using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Remove
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一串字符串：");
            string str = Console.ReadLine();
            string str1 = str.Remove(2);
            Console.WriteLine(str1);
            string str2 = str.Remove(1, 1);
            Console.WriteLine(str2);
            Console.ReadLine();
        }
    }
}
