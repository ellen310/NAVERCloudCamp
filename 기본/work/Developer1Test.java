//package jb01.part01;

public class Developer1Test 
{
	public static void main(String[] args) 
	{
		Developer1 developer = new Developer1();

		System.out.println("�̸���: "+developer.name);
		System.out.println("������: "+developer.job);
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT�����: "+developer.projectCareer);

		System.out.println("========================");

		developer.participateProject();
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT�����: "+developer.projectCareer);

		System.out.println("========================");

		developer.instruct();
		System.out.println("��ռ�����: "+developer.avgIncome);

		System.out.println("========================");
		
		String projectName = "�ѹ�����";
		developer.participateProject(projectName);
		//hong1.participate("�ѹ�����");
		System.out.println("��ռ�����: "+developer.avgIncome);
		System.out.println("PJT�����: "+developer.projectCareer);

		System.out.println("========================");

		int lectureCount = 2;
		developer.instruct(lectureCount);
		//hong1.instruct(2);
		System.out.println("��ռ�����: "+developer.avgIncome);

	}//end of main
}//end of class
