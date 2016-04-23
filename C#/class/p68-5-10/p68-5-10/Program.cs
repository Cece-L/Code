using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p68_5_10
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] strNames = { "das", "adas", "dasd", "ada", "da" };
            List<string> lists = new List<string>(strNames);
            foreach (string str in lists)
            {
                Console.Write(str + " ");
            }
            Console.ReadLine();
        }
    }
}
