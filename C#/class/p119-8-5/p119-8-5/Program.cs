using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p119_8_5
{
    class Cat
    {
        public Cat(string name) 
        {
            Console.WriteLine("我是："+name );
        }
        public void interest() 
        {
            Console.WriteLine("兴趣是晒太阳");
        }
        public void action() 
        {
            Console.WriteLine("捉老鼠");
        }
        static void Main(string[] args)
        {
            Cat smallcat = new Cat("小花猫");
            smallcat.interest();
            Cat bigcat = new Cat("大花猫");
            bigcat.action();
            Console.ReadLine();
        }
    }
}
