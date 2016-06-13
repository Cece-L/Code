using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p116_8_3
{
    class Car
    {
        public Car(string company , string brand ,int total,int sell)
        {
            int innage = total - sell;
            Console.WriteLine(company +brand +"总量为："+total+"，即将卖出："+sell +"辆，剩余："+innage +"辆");
        }
        ~Car() 
        {
            Console.WriteLine("信息已处理完毕");
        }
        static void Main(string[] args)
        {
            Car Benz = new Car("**公司","奔驰",20000,15000);          
        } 
    }
}
