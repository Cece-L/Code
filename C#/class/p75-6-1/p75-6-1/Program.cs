using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p75_6_1
{
    class Program
    {
        static void Main(string[] args)
        {
            char letter = 'a';
           
            Console .WriteLine ("判断letter是否为字母：{0}" ,Char .IsLetter (letter ));
            Console.WriteLine("转换letter为大写：{0}", Char.ToUpper  ( letter));
            Console.ReadLine();
        }
    }
}
