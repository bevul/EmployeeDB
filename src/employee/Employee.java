/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Mikhail
 */
public class Employee {
    public String name;
    public String scndName;
    public String post;
    public String salary;
    public String experience;
    public Employee(String name, String scndname,String post,String salary,String experience){
        this.name = name;
        this.scndName = scndname;
        this.post = post;
        this.salary = salary;
        this.experience = experience;
    }
}
