package shoping;

/**
 *
 * @author Duc
 */
public class Shoping extends Cutomer{

    public  Shoping(){
        super();
    }
    public Shoping(String id, String name, String email, String birthday, double balance, String avatar, int status) {
            super();
            this.setId(id);
            this.setName(name);
            this.setEmail(email);
            this.setBirthday(birthday);
            this.setBalance(balance);
            this.setAvatar(avatar);
            this.setStatus(status);	
	}
    
    public void selectProduct(String productName){
            System.out.println("Khách hàng đã chọn sản phẩm: " + productName + ".");
	}
    
    public void checkOut(){
            System.out.println("Khách hàng đã thực hiện thanh toán hoá đơn.");
	}
    public static void main(String[] args) {
        Shoping shoping = new Shoping("15","Ngoc Trinh","dominhduchdth92@gmial.com","14/05/2017",52000,"0001.jpg",10);
	System.out.println(shoping.toString());
	shoping.selectProduct("aobo");
	shoping.checkOut();
    }

    

    
}
