//package jb01.part01;

public class Developer1Test 
{
	public static void main(String[] args) 
	{
		Developer1 developer = new Developer1();

		System.out.println("이름은: "+developer.name);
		System.out.println("직업은: "+developer.job);
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("PJT경력은: "+developer.projectCareer);

		System.out.println("========================");

		developer.participateProject();
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("PJT경력은: "+developer.projectCareer);

		System.out.println("========================");

		developer.instruct();
		System.out.println("평균수입은: "+developer.avgIncome);

		System.out.println("========================");
		
		String projectName = "한미은행";
		developer.participateProject(projectName);
		//hong1.participate("한미은행");
		System.out.println("평균수입은: "+developer.avgIncome);
		System.out.println("PJT경력은: "+developer.projectCareer);

		System.out.println("========================");

		int lectureCount = 2;
		developer.instruct(lectureCount);
		//hong1.instruct(2);
		System.out.println("평균수입은: "+developer.avgIncome);

	}//end of main
}//end of class
