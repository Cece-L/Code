using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CustomOutInfo
{
    class Program
    {
        private double divide(int x, int y)
        {
            if (x == 0)
            {
                ArithmeticException ae = new ArithmeticException("虽然在运算法则中允许被除数为零，但在本程序中不允许被除数为零");
                ae.HelpLink = "www.google.hk";
                throw ae;
            }
            if (y == 0)
            {
                DivideByZeroException dbze = new DivideByZeroException("在数学运算法则中规定，除数是不允许为零的！");
                dbze.HelpLink = "www.google.cn";
                throw dbze;
            }
            return x / y;
        }
        private void myfun()
        {
            try
            {
                int x = 0;
                int y = 3;
                double z = divide(x, y);
                Console.WriteLine("{0}/{1}={2}", x, y, z);
            }
            catch (System.DivideByZeroException dbze)
            {
                Console.WriteLine(dbze.Message);
                Console.WriteLine(dbze.HelpLink);
            }
            catch (System.ArithmeticException ae)
            {
                Console.WriteLine(ae.Message);
                Console.WriteLine(ae.HelpLink);
            }
            catch (System.Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
        static void Main(string[] args)
        {
            Program pro = new Program();
            pro.myfun();
            Console.Read();
        }
    }
}
