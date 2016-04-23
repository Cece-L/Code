using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p52_4_24
{
    class Program
    {
        static void Main(string[] args)
        {
            string str = "这是一个字符串";
            object obj = str;
            string temp = obj as string;
            Console.WriteLine(temp );
            Console.ReadLine();
        }
    }
}
