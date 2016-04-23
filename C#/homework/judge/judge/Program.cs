using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace judge
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一个整数：");
            int a = Convert.ToInt32(Console .ReadLine ());
            StringBuilder sb = new StringBuilder();
            StringBuilder b = (a %2==0)?sb .Append ("这是一个偶数"):sb .Append ("这是一个奇数");
            Console .WriteLine (b );
            Console .ReadLine ();
        }
    }
}
