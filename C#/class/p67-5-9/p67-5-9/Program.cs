using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p67_5_9
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, j, temp=1, sum=0;
            for (i = 1; i <= 10; i++)
            {
                for (j = 1; j <= i; j++) 
                {
                    temp = temp * j;
                }
                sum = sum + temp;
                temp = 1;
            }
            Console.WriteLine("sun=" + sum);
            Console.ReadLine();
        }
    }
}
