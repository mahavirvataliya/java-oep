package domain;
// Generated 10 May, 2017 2:09:41 PM by Hibernate Tools 4.3.1



/**
 * Asubmitted generated by hbm2java
 */
public class Asubmitted  implements java.io.Serializable {


     private String subid;
     private String asid;
     private String uname;
     private String assignment;

    public Asubmitted() {
    }

	
    public Asubmitted(String subid) {
        this.subid = subid;
    }
    public Asubmitted(String subid, String asid, String uname, String assignment) {
       this.subid = subid;
       this.asid = asid;
       this.uname = uname;
       this.assignment = assignment;
    }
   
    public String getSubid() {
        return this.subid;
    }
    
    public void setSubid(String subid) {
        this.subid = subid;
    }
    public String getAsid() {
        return this.asid;
    }
    
    public void setAsid(String asid) {
        this.asid = asid;
    }
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getAssignment() {
        return this.assignment;
    }
    
    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }




}

