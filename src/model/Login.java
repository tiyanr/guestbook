package model;
// Generated Mar 8, 2015 6:53:51 PM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private String loginName;
     private String loginPassword;
     private String loginLevel;

    public Login() {
    }

    public Login(String loginName, String loginPassword, String loginLevel) {
       this.loginName = loginName;
       this.loginPassword = loginPassword;
       this.loginLevel = loginLevel;
    }
   
    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }
    
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
    public String getLoginLevel() {
        return this.loginLevel;
    }
    
    public void setLoginLevel(String loginLevel) {
        this.loginLevel = loginLevel;
    }




}


