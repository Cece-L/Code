using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p115_8_2
{
    class Bird
    {
        public Bird() 
        {
            Console.WriteLine("小鸟说：“我是小鸟，飞翔使我的选择！”");
        }
        public Bird(string name)
        {
            Console.WriteLine(name +"说：“我是一只小小小鸟，怎么飞也飞不高！”");
        }
        static void Main(string[] args)
        {
            Bird bird = new Bird();
            Bird sprrow = new Bird("麻雀");
            Console.ReadLine();
        }
    }
}
