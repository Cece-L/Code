using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace p107_7_21
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList list = new ArrayList(); ;
            list.Add("423.55435");
            list.Add("你好");
            Console.WriteLine("集合的元素为");
            foreach (String i in list)
            {
                Console.WriteLine (i);
            }
            Console.ReadLine();
        }
    }
}
