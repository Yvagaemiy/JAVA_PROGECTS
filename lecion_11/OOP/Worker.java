package lecion_11.OOP;

public class Worker {
    int id;
    int salary;
    String first_name;
    String last_name;

    @Override
    public String toString() {
        String res = String.format("id: %d, fn: %s, ln: %s, sai: %d",+id, first_name, last_name, salary);
        return res;
    }
    
    @Override
    public boolean equals(Object obj){
        Worker t = (Worker) obj;
        return  id == t.id && last_name == t.last_name;   
       
    }
    
    @Override
    public int hashCode(){
        return id;
    }
    
}
