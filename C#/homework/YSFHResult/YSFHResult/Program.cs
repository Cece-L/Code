using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace YSFHResult
{
    class Program
    {
        static int[] Jose (int total ,int start , int alter )
        {
            int j, k = 0;
            int [] intCount = new  int [total +1];
            int[] intPers = new int[total + 1];
            for (int i = 0; i < total;i++ )
            {
                intPers[i] = i;
            }
            for (int i = total; i >= 2; i--)
            {
                start = (start + alter - 1) % i;
                if (start == 0)
                    start = i;
                intCount[k] = intPers[start];
                k++;
                for (j = start + 1; j <= i; j++)
                    intPers[j - 1] = intPers[j];
            }
            intCount[k] = intPers[1];
            return intCount;
        }
        static void Main(string[] args)
        {
            int[] intpers = Jose(12, 3, 4);
            Console.WriteLine("出列顺序：");
            for (int i = 0; i < intpers.Length;i++ ) 
            {
                Console.Write(intpers [i]+" ");
            }
            Console.ReadLine();
        }
    }
}
