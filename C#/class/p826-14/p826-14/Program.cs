using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p826_14
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一段文字：");
            string strOld = Console.ReadLine();
            string[] strNews = strOld.Split(',');
            string strNew = "";
            for (int i = 0; i < strNews.Length; i++)
            {
                if (strNew == "")
                    strNew = " " + strNews[i].ToString();
                else
                    strNew += ",\n" + strNews[i].ToString();
            }
            Console.WriteLine("\n新的字符串：\n" + strNew);
            Console.ReadLine();

        }
    }
}
