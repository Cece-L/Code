using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Yichang
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("请输入一个被除数和除数：");
                int a = int.Parse(Console.ReadLine());
                int b = int.Parse(Console.ReadLine());
                if (b == 0)
                {
                    throw new DivideByZeroException();
                }
                int num = a / b;
                Console.WriteLine("得数为：" + num);
                object obj = null;
                int N = (int)obj;
            }
            catch (DivideByZeroException c)
            {
                Console.WriteLine("用零做除数引发异常！");
                Console.WriteLine(c.Message);
            }
            catch (Exception ex)
            {
                Console.WriteLine("捕获异常：" + ex);
            }
            finally
            {
                Console.WriteLine("程序结束！");
            }
            Console.ReadLine();
        }
    }
}
