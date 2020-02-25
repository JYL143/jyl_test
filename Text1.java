package J0518;
import java.util.*;
class Pet{
	   private String name="无名";  //名字1
	   private int health=100;   //健康值
	   private int love=0;   //亲密度
	
	   public Pet(){
		   this.health=95;
		  
	   }
	   public Pet(String name){
		 this.name=name;
	  }
	   
	   
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public void print(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫"+this.getName()+",健康值是"+this.getHealth()+",和主人的亲密度为"+this.getLove());
	
}



}


class Dog extends Pet{
	private String strain;
  Dog(String name,String strain){
   super(name);
  this.strain=strain;
   }
	
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
   public void print(){
	   super.print();
	   System.out.println("我是一只"+this.strain);
   }
	
}


class Penguin extends Pet{
	private String sex;
	Penguin(String name,String sex){
		super(name);
		this.sex=sex;
	}
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	 public void print(){
			super.print();
		   System.out.println("我的性别是"+this.sex);
	   }
}
public class Text1 {


	public static void main(String[] args) {
		
      Pet kt=new Pet();
      kt.print();
      Dog kt1=new Dog( "贝贝","雪纳瑞");
      kt1.print();
      Penguin kt2=new Penguin("企鹅1","q仔");
      kt2.print();
      
	}

}
