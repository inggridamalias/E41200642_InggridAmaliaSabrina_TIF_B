/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author User
 */
public class person {
    String fName;
    String IName;
    int stuId;
    String stuStatus;
    
    /**
     *
     * @param fName
     * @param IName
     * @param stuId
     * @param stuStatus
     */
    public person(String fName, String IName, int stuId, String stuStatus){
        this.fName = fName;
        this.IName = IName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    
    person(String fName, String IName, String stuStatus, int stuId){
        
    }

    person(String arial, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getfName(){
        return fName;
    }
    public void setfName(String fName){
        this.fName = fName;
    }
    public String getIName(){
        return IName;
    }
    public void setIname(String IName){
        this.IName = IName;
    }
    public int getStuId(){
        return stuId;
    }
    public void setStuId(int stuId){
        this.stuId = stuId;
    }
    public String getStuStatus(){
        return stuStatus;
    }
    public void setStuStatus(String stuStatus){
        this.stuStatus = stuStatus;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize variable
        String fName, IName, stuId, stuStatus;
        fName = "Lisa Palombo";
        IName = "Lisa";
        stuStatus = "Active";
        stuId = "1234567989";
        //show
        System.out.println("Student Name:" + fName);
        System.out.println("IName:" + IName);
        System.out.println("Student Status:" + stuStatus);
        System.out.println("Student ID:" + stuId);
    
    }

    boolean getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
