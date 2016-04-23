using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p64_5_6
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入您的姓名：");
            string strinput = Console.ReadLine().Trim();
            while (strinput != string.Empty)
            {
                Console.WriteLine("您好，{0}\n欢迎来到本系统！",strinput );
                Console.WriteLine("请输入您的姓名：");
                strinput = Console.ReadLine().Trim();
            }
            Console.WriteLine("没有输入有效姓名！");
            Console.ReadLine();
        }
    }
}
