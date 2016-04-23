using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p35_10
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 369;
            object obj = i;  //装箱
            Console.WriteLine("1 i的值为{0}，装箱之后的对象为：{1}", i, obj);
            i = 78979;
            Console.WriteLine("2 i的值为{0}，装箱之后的对象为：{1}", i, obj);
            Console.ReadLine();
        }
    }
}
