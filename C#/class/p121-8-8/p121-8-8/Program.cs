using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p121_8_8
{
    class Program
    {
        public int Add(int x, int y)
        {
            return x + y;
        }
        public string Add(string a,string b)
        {
            return a + b;
        }
        static void Main(string[] args)
        {
            Program n = new Program();
            Program str = new Program();
            Console.WriteLine("{0}+{1}={2}",23,34,n.Add (23,34));
            Console.WriteLine("{0}+{1}={2}","wel","com",str.Add ("wel","com"));
            Console.ReadLine();
        }
    }
}
