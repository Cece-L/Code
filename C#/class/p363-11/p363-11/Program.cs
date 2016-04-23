using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p363_11
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 432;
            object obj = i;
            Console.WriteLine("装箱操作：值为{0}，装箱之后的对象为{1}：", i, obj);  //装箱
            int j = (int)obj;
            Console .WriteLine ("拆箱操作：装箱对象为{0}，值为{1}：",obj ,j );  //拆箱
            Console .ReadLine ();
        }
    }
}
