using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p383_17
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一串字符串：");
            string str = Console.ReadLine();
            for (int i = 1; i < 5; i++)
            {
                Console.WriteLine(str + ":" + 368 * i);
            }
            Console.ReadLine();
        }
    }
}
