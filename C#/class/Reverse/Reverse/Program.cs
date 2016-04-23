using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Reverse
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一串字符串：");
            string str = Console.ReadLine();
            int n = str.Length;
            char[] a = new char[n];
            for (int  i = 0;i <n;i ++)
            {
                a [i] = str [i ];
            }
            Array .Reverse (a ,0,str.Length );
            Console.WriteLine("反转后的字符串为：{0}", new StringBuilder().Append (a).ToString ());
            Console.ReadLine();
        }
    }
}
