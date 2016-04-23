using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p65_5_7
{
    class Program
    {
        static void Main(string[] args)
        {
            bool flag = false;
            do
            {
                Console.WriteLine("请输入您的姓名代号：");
                Console.WriteLine("（1）小王，（2）小李，（3）小程");
                int id = int.Parse(Console.ReadLine().Trim());
                Console.WriteLine("请输入密码：");
                string pwd = Console.ReadLine().Trim();
                switch (id)
                {
                    case 1:
                        if (pwd == "xiaowang")
                        {
                            Console.WriteLine("密码正确！");
                            flag = true;
                        }
                        else
                        {
                            Console.WriteLine("密码错误！");
                        }
                        break;
                    case 2:
                        if (pwd == "xiaoli")
                        {
                            Console.WriteLine("密码正确！");
                            flag = true;
                        }
                        else
                        {
                            Console.WriteLine("密码错误！");
                        }
                        break;
                    case 3:
                        if (pwd == "xiaocheng")
                        {
                            Console.WriteLine("密码正确！");
                            flag = true;
                        }
                        else
                        {
                            Console.WriteLine("密码错误！");
                        }
                        break;
                    default:
                        Console.WriteLine("查无此人");

                        break;

                }
            } while (!flag);
            Console.WriteLine("谢谢使用");
            Console.ReadLine();
        }
    }
}
