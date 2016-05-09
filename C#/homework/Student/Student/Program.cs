using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Student
{
    public class Student
    {
        public  String name;
        public String Name 
        {
            get { return name; }
            set { name = value; }
        }
        public  String sex;
        public String Sex
        {
            get {return  sex ;}
        }
        public  int age;
        public int Age 
        {
            get { return age; }
            set { age = value; }
        }
        public  double[] grade =  new double [3] ;

        public  double this[int index]
        {
            get 
            {
                return grade[index];
            }
            set
            {
                grade[index] = value; 
            }
        }

    }
    class Program
    {
        static void Main(string[] args)
        {
            Student stu = new Student();
            stu.name = "Tom";
            stu.sex = "man";
            stu.age = 20;
            stu.grade[0] = 89.5;
            stu.grade[1] = 90.00;
            stu.grade[2] = 100.00;
            Console.Write("该学生的信息为：【Name :"+stu .name +" , sex:"+stu.sex +" ,age : "+stu .age +" , grade:");
            foreach (int n in stu.grade)
            {
                Console.Write(n +" ");
            }
            Console.Write("】");
            Console.ReadLine();

        }
    }
}
