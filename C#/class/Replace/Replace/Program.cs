using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Replace
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一串字符串：");
            string strOld = Console.ReadLine();
            Console.WriteLine("请输入要替换的字符串：");
            string strTemp = Console.ReadLine();
            Console.WriteLine("请输入替换的字符：");
            string strReplace = Console.ReadLine();
            string strNew = strOld.Replace(strTemp, strReplace);
            Console.WriteLine("原来的字符串为："+strOld );
            Console.WriteLine("新的字符串为："+strNew );
            Console.ReadLine();

        }
    }
}
