using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace NowTime
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime dt = DateTime.Now;
            string strDate = string.Format("{0:D}", dt);
            Console.WriteLine("今天的日期为："+strDate );
            string strDate1 = string.Format("{0:T}", dt);
            Console.WriteLine("今天的时间为：" + strDate1);
            string strDate2 = string.Format("{0:F}", dt);
            Console.WriteLine("今天的日期和时间为：" + strDate2);
            Console.ReadLine();
        }
    }
}
