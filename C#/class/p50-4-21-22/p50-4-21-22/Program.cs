using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p50_4_21_22
{
    class Program
    {
        static void Main(string[] args)
        {
            // 不知道怎么位移
            uint intmax = 4294967295;
            uint bytemask1, bytemask2;
            bytemask1 = intmax << 8;
            Console.WriteLine(bytemask1);
            bytemask2 = intmax >> 16;
            Console.WriteLine(bytemask2);
            Console.ReadLine();
        }
    }
}
