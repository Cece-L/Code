using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p120_8_7
{
    class Program
    {
        public int Add(int x,int y)
        {
            return x + y;
        }
        static void Main(string[] args)
        {
            Program n = new Program();
            Console.WriteLine("{0}+{1}+{2}",23,34,n.Add(23,34));
            Console.ReadLine();
        }
    }
}
