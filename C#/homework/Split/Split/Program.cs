using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace Split
{
    class Program
    {
        static void Main(string[] args)
        {
       string s = "1.23  5.35  3.45  5.65";
       string[] arr = s.Split(' ');
       double[] dblValues = new double[arr.Length];
       for( int i=0; i<arr.Length; i++ )
       {
        if( !double.TryParse(arr[i], out dblValues[i]) )
            Console.WriteLine("{0}",dblValues[i]);

        continue;
       }
            }
        }
    }
}
