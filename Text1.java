package J0518;
import java.util.*;
class Pet{
	   private String name="����";  //����
	   private int health=100;   //����ֵ
	   private int love=0;   //���ܶ�
	
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
		System.out.println("������԰ף�");
		System.out.println("�ҵ����ֽ�"+this.getName()+",����ֵ��"+this.getHealth()+",�����˵����ܶ�Ϊ"+this.getLove());
	
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
	   System.out.println("����һֻ"+this.strain);
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
		   System.out.println("�ҵ��Ա���"+this.sex);
	   }
}
public class Text1 {


	public static void main(String[] args) {
		
      Pet kt=new Pet();
      kt.print();
      Dog kt1=new Dog( "����","ѩ����");
      kt1.print();
      Penguin kt2=new Penguin("���1","q��");
      kt2.print();
      
	}

}
