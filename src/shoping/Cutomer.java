package shoping;

/**
 *
 * @author Duc
 */
public class Cutomer {
    private String id;
    private String name;
    private String email;
    private String birthday;
    private double balance;
    private String avatar;
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cutomer:" + 
                "id=" + this.getId() +
                ".\n name=" + this.getName() + 
                ".\n email=" + this.getEmail() + 
                ".\n birthday=" + this.getBirthday() +
                ".\n balance=" + this.getBalance() +
                ".\n avatar=" + this.getAvatar() + 
                ".\n status=" + this.getStatus() +
                '}';
    }

    

    
    
    
}
