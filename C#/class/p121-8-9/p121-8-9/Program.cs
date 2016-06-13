using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p121_8_9
{
    class Program
    {
        string sentence;
        public Program(string strsentence)
        {
            sentence = strsentence;
            Console.WriteLine(sentence );
        }
        static void Main(string[] args)
        {
            Program english = new Program("English people speaking :\"My name is U.k\"");
            Program Chianes = new Program("中国人说：“我的名字叫" + "中国！”");
        }
    }
}
