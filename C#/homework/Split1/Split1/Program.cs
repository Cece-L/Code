using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SplitTest1
{
    class Program
    {
        static void Main(string[] args)
        {
            string strInput;
            string[] strarry;
            double[] dbarry;
            Console.WriteLine("请输入一串数据，使用，或空格分隔开:");
            strInput = Console.ReadLine();
            strarry = strInput.Split(',', ' ');
            int n = 0;
            int k = 0;
            dbarry = new double[strarry.Length];
            for (n = 0; n < strarry.Length; n++)
            {
                try
                {
                    if (strarry[n] != String.Empty)
                    {
                        dbarry[k++] = Convert.ToDouble(strarry[n]);
                    }
                }
                catch (Exception)
                {
                }
            }
            foreach (double dd in dbarry)
            {
                Console.Write("{0:0.##0}  ", dd);
            }
            Console.WriteLine();

            double[] dbarrynew = new double[k];
            for (int i = 0; i < dbarrynew.Length; i++)
                dbarrynew[i] = dbarry[i];
            Console.WriteLine("当前double数组的值为：");
            int number = 0;
            foreach (double d in dbarrynew)
            {
                Console.Write("{0:0#.##0}  ", d);
                number++;
                if (number % 5 == 0) Console.WriteLine();
            }
            Console.WriteLine();
            Console.WriteLine("总共有{0}个double数据。", number);
            Console.ReadLine();
        }
    }
}
