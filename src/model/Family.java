package model;
// Generated Mar 8, 2015 6:53:51 PM by Hibernate Tools 4.3.1

/**
 * Family generated by hbm2java
 */
public class Family implements java.io.Serializable {

    private String familyId;
    private String familyName;
    private String familySex;
    private String familyPresence;
    private String guestId;
    private String guestName;
    private String bookId;

    public Family() {
    }

    public Family(String familyId, String familyName, String familySex, String familyPresence) {
        this.familyId = familyId;
        this.familyName = familyName;
        this.familySex = familySex;
        this.familyPresence = familyPresence;
    }

    public String getFamilyId() {
        return this.familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilySex() {
        return this.familySex;
    }

    public void setFamilySex(String familySex) {
        this.familySex = familySex;
    }

    public String getFamilyPresence() {
        return this.familyPresence;
    }

    public void setFamilyPresence(String familyPresence) {
        this.familyPresence = familyPresence;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

}
