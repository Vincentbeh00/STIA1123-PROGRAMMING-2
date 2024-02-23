
public class Person {
    private String name;
    private String icNo;
    
    
    public Person (String name, String icNo){
        this.name = name;
        this.icNo = icNo;
    }

    @Override
    public String toString(){
   return "name= " + name + ", icNo= " + icNo;
   }

    public String getName() {
        return name;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }
    
    
    
}
