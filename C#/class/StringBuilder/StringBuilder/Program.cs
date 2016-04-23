using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace StringBuilder1
{
    class Program
    {
        static void Main(string[] args)
        {
            int Num = 358;
            StringBuilder SBuilder = new StringBuilder("明日科技", 100);
            SBuilder.Append("》C#编程词典");
            Console.WriteLine(SBuilder);

            SBuilder.AppendFormat("{0:C}", Num);
            Console.WriteLine(SBuilder );

            SBuilder.Insert(0, "软件：");
            Console.WriteLine(SBuilder);


            Console.ReadLine();
        }
    }
}
