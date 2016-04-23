using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p323_6
{
    class SampleClass {
        public int a = 10;
    }
    class Program
    {
        static void Main(string[] args)
        {
            object b;                                          //定义object类型的引用变量
            b = 1;
            Console.WriteLine("一你用变量初始值：" + b);
            b = new SampleClass();                             //创建引用类型变量//实例化类并赋值给变量？？
            SampleClass classRef;                              //声明一个类对象？？
            classRef = (SampleClass)b;                         //使用引用变量实例化类对象？？
            Console.WriteLine("引用变量值；" + classRef.a);
            Console.ReadLine();
        }
    }
}
