package emp;
import add.Address;
public class Employee
{
private int Empid;
private String EmpName;
private Address peraddress;
private Address locaddress;

public void setRollno(int Empid)
{this.Empid=Empid;
}

public void setName(String EmpName)
{this.EmpName=EmpName;
}

public int getEmpid()
{return Empid;
}

public String getEmpName()
{return EmpName;
}


public void setperaddress(Address peraddress)
{this.peraddress=peraddress;
}

public Address getperaddress()
{return peraddress;
}

public void setlocaddress(Address locaddress)
{this.locaddress=locaddress;
}

public Address getlocaddress()
{return locaddress;
}
}