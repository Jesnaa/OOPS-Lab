class Complex
{
        int r,i;
        public Complex(int re,int img)
        {
                this.r=re;
                this.i=img;
        }
        public void display()
        {
        System.out.print(this.r + " +i" + this.i);
    }
         public static Complex add(Complex n1,Complex n2)
    {
        Complex res = new Complex(0, 0);
        res.r = n1.r + n2.r;
                res.i = n1.i+ n2.i;
                return res;
    }
        public static void main(String args[])
        {
                Complex c1 =new Complex(2,5);
                Complex c2 =new Complex(11,8);
                System.out.println("First Complex Number:");
                c1.display();
                System.out.println("Second Complex Number:");
                c2.display();
                Complex res=add(c1,c2);
                System.out.println("First Complex Number:");
                res.display();
        }
}