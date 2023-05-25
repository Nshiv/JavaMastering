package javaObjectClass;

class Test extends Object {
    public static void main(String[] jff)
    {
      Students stu = new Students("shiv", 33);
        System.out.println(stu.toString());
        System.out.println(stu);
    }
}

class  Students
{
    private String name;
    private int age;

    Students(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

  /*  @Override
    public String toString() {
        return super.toString();
    }*/

    @Override
    public String toString() {
        return name + "  and age is "+ age;
        /*return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';*/
    }
}
