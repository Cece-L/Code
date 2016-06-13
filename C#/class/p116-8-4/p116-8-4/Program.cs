using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p116_8_4
{
    class Student
    {
        string strname;
        public Student(string name)
        {
            strname = name;
            Console.WriteLine("姓名："+name +"    性别：未知 年龄：未知");
        }
        public Student(string name,string sex)
        {
            strname = name;
            Console.WriteLine("姓名："+name +"   性别："+sex +"   年龄：未知");
        }
        public Student (string name,string sex,int age)
        {
            Console .WriteLine ("姓名："+name +"   性别："+sex+"   年龄："+age );
        }
        static void Main(string[] args)
        {
            Console.WriteLine("输出学生信息：");
            Student stu2 = new Student("张三");
            Student stu1 = new Student("李四","男");
            Student stu3 = new Student("王五","男",19);
        }
    }
}
