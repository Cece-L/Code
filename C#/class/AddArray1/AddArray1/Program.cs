using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AddArrar1
{
    class Program
    {
        static   int [] AddArray(int[] ArrayBorn, int Index, int Value)
        {
            if (Index >= (ArrayBorn.Length + 1))
            {
                Console.WriteLine("插入位置不合理,将返回原来的数组！！！");

            }
            if (Index  <= ArrayBorn .Length )
            {
                int[] TemArray = new int[ArrayBorn.Length + 1];      //新的数组比老数组多一个元素

                for (int i = 0; i < TemArray.Length; i++)         //对新的数组进行操作
                {
                    if (Index >= 0)                                 //插入的位置大于0
                    {
                        if (i < (Index))
                            TemArray[i] = ArrayBorn[i];           //插入位置前数组的元素不动
                        else if (i == (Index))
                            TemArray[i] = Value;                  //新的元素插入
                        else
                            TemArray[i] = ArrayBorn[i - 1];        //后面的元素后以一个位置
                    }
                    else
                    {
                        if (i == 0)                                 //档插入位置是0 时
                            TemArray[i] = Value;
                        else
                            TemArray[i] = ArrayBorn[i - 1];
                    }
                }
                return TemArray;
            }
            return ArrayBorn ;
           

            
            
        }



        static void Main(string[] args)
        {
            int [] arr = new int []{0,1,2,3,4};
            Console .WriteLine ("原数组为：");
            foreach (int n in arr )
            {
                Console .Write (n + " ");
            }
            Console .WriteLine ();
            arr = AddArray (arr ,6, 5);
            Console .WriteLine ("插入新的元素后数组为：");
            foreach (int n in arr )
            {
                Console .Write (n +" ");
            }
            Console .ReadLine ();

        }
    }
}
