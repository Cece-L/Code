using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace difffiled
{
    public  class Test { 
         public  string Name;
    }

    class Program
    {
        static void Main(string[] args)
        {
            Test obj1 = new Test () { Name = "小科" };
            Test obj2 = new Test () { Name = "东方 "};
            int v1 = 2;
            int v2 = 5;
            Console.WriteLine("v1={0},v2={1}", v1, v2);
            Console.WriteLine("obj1={0},obj2={1}", obj1 , obj2 );
            v2 = v1;
            obj2 = obj1;
            obj2.Name = "顺丰东方";
            Console.WriteLine("v1={0},v2={1}", v1, v2);
            Console.WriteLine("obj1={0},obj2={1}", obj1, obj2);
            v2 = 10;
            obj2 = new Test() { Name = "大海" };
            Console.WriteLine("v1={0},v2={1}", v1, v2);
            Console.WriteLine("obj1={0},obj2={1}", obj1, obj2);
            Console.ReadLine();


        }

    }
}
