package project2;

import java.util.Scanner;
import java.util.ArrayList;

public class Scholarship {
	String college;
	String major;
	String grade;
	int number;
	String peoplename;
	String time;
	String awardname;
	String awardlevel;
	String teacher;
	String department;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return peoplename;
	}

	public void setName(String peoplename) {
		this.peoplename = peoplename;
	}

	public String getWinningTime() {
		return time;
	}

	public void setWinningTime(String time) {
		this.time = time;
	}

	public String getAwardName() {
		return awardname;
	}

	public void setAwardName(String awardname) {
		this.awardname = awardname;
	}

	public String getAwardlevel() {
		return awardlevel;
	}

	public void setAwardlevel(String awardlevel) {
		this.awardlevel = awardlevel;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Scholarship> array = new ArrayList<Scholarship>();
		while (true) {
			System.out.println("正在进入学生获奖信息收集与管理系统");
			System.out.println("1.查看所有学生获奖信息");
			System.out.println("2.添加学生及奖项");
			System.out.println("3.删除个人获奖信息");
			System.out.println("4.修改个人获奖信息");
			System.out.println("5.退出");
			System.out.println("请选择您的操作");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				findStudent(array);
				break;
			case 2:
				addStudent(array);
				break;
			case 3:
				deleteStudent(array);
				break;
			case 4:
				replaceStudent(array);
				break;
			case 5:
				System.out.println("正在退出学生获奖信息收集与管理系统");
				break;
			}
		}
	}

	public static void addStudent(ArrayList<Scholarship> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学院");
		String college = sc.next();
		System.out.println("请输入专业");
		String major = sc.next();
		System.out.println("请输入年级");
		String grade = sc.next();
		System.out.println("请输入学号");
		int number = sc.nextInt();
		System.out.println("请输入姓名");
		String peoplename = sc.next();
		System.out.println("请输入获奖时间");
		String time = sc.next();
		System.out.println("请输入奖项名称");
		String awardname = sc.next();
		System.out.println("请输入获奖等级");
		String awardlevel = sc.next();
		System.out.println("请输入指导老师");
		String teacher = sc.next();
		System.out.println("请输入授奖部门");
		String department = sc.next();
		Scholarship a = new Scholarship();
		a.setCollege(college);
		a.setMajor(major);
		a.setGrade(grade);
		a.setNumber(number);
		a.setName(peoplename);
		a.setWinningTime(time);
		a.setAwardName(awardname);
		a.setAwardlevel(awardlevel);
		a.setTeacher(teacher);
		a.setDepartment(department);
		array.add(a);
		System.out.println("该学生获奖信息已添加");
	}

	public static void findStudent(ArrayList<Scholarship> array) {

		if (array.size() == 0) {
			System.out.println("暂无学生获奖");
		} else {
			System.out.println("学院" + "  " + "专业" + "  " + "年级" + "  " + "学号" + "  " + "姓名" + "  " + "获奖时间" + "  "
					+ "奖项名称" + "  " + "获奖等级" + "  " + "指导老师" + "  " + "授奖部门");
			for (int i = 0; i < array.size(); i++) {
				Scholarship b = array.get(i);
				System.out.println(b.getCollege() + "    " + b.getMajor() + "    " + b.getGrade() + "     "
						+ b.getNumber() + "    " + b.getName() + "    " + b.getWinningTime() + "    " + b.getAwardName()
						+ "    " + b.getAwardlevel() + "    " + b.getTeacher() + "    " + b.getDepartment());
			}
		}
	}

	public static void deleteStudent(ArrayList<Scholarship> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("正在使用删除功能，请输入要删除的获奖学生学号");
		int newnum = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			Scholarship c = array.get(i);
			if (newnum == c.getNumber()) {
				array.remove(i);
			}
		}
		System.out.println("已将该学生获奖信息删除");
	}

	public static void replaceStudent(ArrayList<Scholarship> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("正在使用修改信息功能，请输入要修改的学生学号:");
		int oldnum = sc.nextInt();
		System.out.println("请输入学院");
		String college1 = sc.next();
		System.out.println("请输入专业");
		String major1 = sc.next();
		System.out.println("请输入年级");
		String grade1 = sc.next();
		System.out.println("请输入学号");
		int number1 = sc.nextInt();
		System.out.println("请输入姓名");
		String peoplename1 = sc.next();
		System.out.println("请输入获奖时间");
		String time1 = sc.next();
		System.out.println("请输入奖项名称");
		String awardname1 = sc.next();
		System.out.println("请输入获奖等级");
		String awardlevel1 = sc.next();
		System.out.println("请输入指导老师");
		String teacher1 = sc.next();
		System.out.println("请输入授奖部门");
		String department1 = sc.next();
		Scholarship d = new Scholarship();
		d.setCollege(college1);
		d.setMajor(major1);
		d.setGrade(grade1);
		d.setNumber(number1);
		d.setName(peoplename1);
		d.setWinningTime(time1);
		d.setAwardName(awardname1);
		d.setAwardlevel(awardlevel1);
		d.setTeacher(teacher1);
		d.setDepartment(department1);

		for (int i = 0; i < array.size(); i++) {
			Scholarship old = array.get(i);
			if (oldnum == old.getNumber()) {
				array.set(i, d);
				break;
			}
		}
		System.out.println("获奖信息已修改");
	}

}
