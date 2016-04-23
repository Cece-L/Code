using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p313_5
{  enum MonthOfYear{
Jan=1,Feb,Mar,Apr,May,June,July,Agu,Sep,Oct,Nov,Dec
} 
    class Program
    {
        static void Main(string[] args)
        {
            
            MonthOfYear month;                           //定义一个枚举类型
            month = MonthOfYear.Oct;                     //引用一个枚举类型
            Console.WriteLine("本月是:" +month  );      //输出本月
          
            Console.ReadLine();

        }
    }
}
