using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Substring
{
    class Program
    {
        static void Main(string[] args)
        {
            string strAllpath = "D:\\Personally\\C#\\class\\CompareTo";
            string strpath = strAllpath.Substring(0, strAllpath.LastIndexOf("\\") + 1);
            string strName = strAllpath.Substring(strAllpath.LastIndexOf("\\") + 1);
            Console.WriteLine("文件路径："+strpath );
            Console.WriteLine("文件名："+strName );
            Console.ReadLine();
        }
    }
}
