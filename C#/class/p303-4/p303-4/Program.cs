using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p303_4
{
    class Program
    {
        static void Main(string[] args)
        {
            bool bl = false;
            Console.WriteLine("请输入第一个数字；");
            int m = Convert.ToInt32(Console.ReadLine ());
            Console.WriteLine("请输入第二个数字；");
            int n = Convert.ToInt32(Console.ReadLine());
            bl = m >= n;
            Console.WriteLine("结果为：" + bl);
            Console.ReadLine();
        }
    }
}
