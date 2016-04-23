using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace foreach1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一组数字");
            double[] arr = new double[5];
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = Convert.ToDouble(Console .ReadLine ());
            }
            double max = double.MinValue;
            double min = double.MaxValue;
            foreach (double value in arr)
            {
                if (value < min)
                    min = value;
                if (value > max)
                    max = value;
            }
            Console.WriteLine("最大数："+max +"；最小数："+min );
            Console.ReadLine();
        }
    }
}
