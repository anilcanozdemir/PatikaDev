

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear)
    {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax()
    {
        if(salary<1000)
        {
            return 0;
        }
        else
          return   salary*3/100;
    }
    double bonus()
    {
        return (workHours-40)*30;
    }
    double raiseSalary()
    {
        if(2021-hireYear<10)
        {
            return salary*5/100;
        }
        else if(2021-hireYear>9 && 2021-hireYear<20)
        {
            return salary*10/100;
        }
        else
            return salary*15/100;
    }
    @Override
    public String toString()
    {
        String string="";
        string+="Adı :"+name+"\n";
        string+="Maaşı :"+salary+"\n";
        string+="Çalışma Saati :"+workHours+"\n";
        string+="Başlangıç Yılı :"+hireYear+"\n";
        string+="Vergi :"+tax()+"\n";
        string+="Bonus :"+bonus()+"\n";
        string+="Maaş Artışı :"+raiseSalary()+"\n";
        string+="Vergi ve Bonuslar ile birlikte maaş : "+(salary-tax()+bonus())+"\n";
        string+="Toplam Maaş :"+(salary+raiseSalary())+"\n";
        return string;
    }

}
