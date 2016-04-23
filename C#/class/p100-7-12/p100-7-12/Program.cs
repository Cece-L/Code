using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p100_7_12
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[5] { 2, 5, 7, 5, 2 };
            foreach (int n in arr)
            {
                Console.Write(n +" ");
            }
            Console.ReadLine();
        }
    }
}
