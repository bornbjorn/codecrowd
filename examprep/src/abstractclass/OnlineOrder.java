/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author A142400
 */
public class OnlineOrder extends Order {

  private String couponCode;

  public OnlineOrder(String coupon, long amount){
      this(amount);
      couponCode = coupon; 
      System.out.println("inside default Online Order constructor");
  }
  public OnlineOrder(long amount){ 
      super(amount);
      this.couponCode = "default coupon";
      System.out.println("inside Online Order ");
  }
  @Override
  public void process() {
    // TODO Auto-generated method stub
  }

    @Override
    public void validate() {
    }
    public void printDetails() {
      System.out.println("coupon:" + this.couponCode );
      super.printDetails();
  }
    
}
