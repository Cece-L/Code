
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GetGirth
{
    class Program
    {
        const double pi = 3.1415926;
        double GetGirth(double r)
        {
            return 2 * pi * r;
        }
        double GetGirth(double width, double hight)
        {
            return 2 * (width + hight);
        }
        static void Main(string[] args)
        {
            Program pro = new Program();
            Console.WriteLine("请输入圆形半径");
            try
            {
                double dec_r = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("圆形周长是：" + pro.GetGirth(dec_r));
                Console.WriteLine("请输入矩形的长和宽，并以逗号分隔");
                string strRecValue = Console.ReadLine();
                string[] strValue = strRecValue.Split(new char[] { ',' });
                double declength = Convert.ToDouble(strValue[0]);
                double decwidth = Convert.ToDouble(strValue[1]);
                Console.WriteLine("矩形的周长是" + pro.GetGirth(decwidth, declength));
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            } Console.ReadLine();
        }
    }
}

