package jb03.part05;

public class Developer1Test {
	public static void main(String[] args) {
		Developer1 developer = new Developer1();
		
		System.out.println("이름은: "+developer.name);
		System.out.println("직업은: "+developer.job);
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("PJT경력은: "+developer.projectCareer);
			
		System.out.println("===============");
		
		developer.participateProject();
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("project 참여 경력은: "+developer.projectCareer);
		
		System.out.println("\n=============");
		developer.instruct();
		System.out.println("평균수입은: "+developer.avgIncome);
		
		System.out.println("\n=============");
		String projectName= "한미은행";
		developer.participateProject(projectName);
		
		System.out.println("평균수입은:" + developer.avgIncome);
		System.out.println("project참여 경력은: "+developer.projectCareer);
		
		System.out.println("\n=============");
		int lectureCount = 2;
		developer.instruct(lectureCount);
		System.out.println("평균수입은: "+developer.avgIncome);
	}//end of main
}//end of class
