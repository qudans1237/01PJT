package jp02.part05;

public class OuterClass01 {
	
	private String outer = "OuterClass 의 Field";
	
	public OuterClass01() {
	}
	
	public void outerMethod() {
		System.out.println("::"+this.getClass().getName()+" start");
		
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("::"+this.getClass().getName()+" end");
	}
	
	public class InnerClass{
		
		private String inner = "InnerClass의 Field";
		
		public InnerClass() {
		}
		
		public void innerMethod() {
			System.out.println("==> "+this.getClass().getName()+" start");
			System.out.println(outer); /// Outer class Field
			// System.out.println(this.outer); ==> compile error
			System.out.println(OuterClass01.this.outer);// this 를 사용하고 싶으면 Outerclass01 에서 찾아야함
			System.out.println(inner);
			System.out.println("::"+this.getClass().getName()+" end");
		}
	}
	
	public static void main(String[] args) {
		new OuterClass01().outerMethod();
	}
}
// Outerclass01$Innerclass.class