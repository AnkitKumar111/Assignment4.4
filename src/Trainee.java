/* Trainee class inheriting some common features of Employee class
   and adding some of its own 
 */
class Trainee extends Employee
{
    int workinghrs, rate,TA,x;
    //default constructor
    Trainee()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
    }
    void calculatepay()
    {
        rate = 8 * workinghrs;
        x = rate*50;
        TA=(10*x/100);        
    }
    void display()
    {
        System.out.println("=============================="+"\n"+"Trainee Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
        System.out.println("Travel allowance"+TA);
    }
}