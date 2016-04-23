using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CopyTo
{
    class Program
    {
        static void Main(string[] args)
        {
            string str1 = "Csharp";
            Console.WriteLine("源字符串为："+str1 );
            char[] myChar = new char[5];
            str1.CopyTo(0, myChar, 0, 5);
            Console.WriteLine("新的字符串为：");
            Console.WriteLine(myChar );
            Console.ReadLine();
        }
    }
}
