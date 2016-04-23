using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DeleteArray1
{
    class Program
    {
        static String[] DeleteArray(String[] ArrarBorn, int Index, int Len)
        {
            if (Len <= 0)
                return ArrarBorn;
            if (Index == 0 && Len >= ArrarBorn.Length)  //判断删除长度是不是超过了数组长度
                Len = ArrarBorn.Length;
            else if ((Index + Len) >= ArrarBorn.Length) // 
                Len = ArrarBorn.Length - Index - 1;
            String[] temArray = new String[ArrarBorn.Length - Len];
            for (int i = 0;i <ArrarBorn .Length ;i ++)
            {
                if (i >= Index )
                    temArray [i ] = ArrarBorn [i +Len ];
                else 
                    temArray [i ] = ArrarBorn [i ];
            }
            return temArray;
        }
        static void Main(string[] args)
        {
            String [] arr = new  String  []{"m","r","s","o","f","t"};
            Console.WriteLine("原数组为：");
            foreach (String  i in arr)
            {
                Console.Write(i + " ");
            }
            Console.WriteLine();
            string[] newarr = DeleteArray(arr, 3, 2);
            Console.WriteLine("新的数组为：");
            foreach (String i in newarr)
                Console.Write(i + " ");
            Console.ReadLine();

        }
    }
}
