package TestNG;
import �������ʵϰһ.*;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
  
  @DataProvider(name = "test1")
  public static Object[][] primeNumbers() {
	   return new Object[][] 
		{ { "��ͯ", "ͷ�Ȳ�","�й�","�й�",39, 50, 50, 57, 500,0.0},
		  { "��ͯ", "ͷ�Ȳ�","�й�","�й�",39, 50, 50, 57, 500,0.0},
		};
  }
  @Test(dataProvider = "test1")
  public void f(String chengkezhonglei,String jicang,String shifa,String daoda,int a,int b,int c,int d,int e,double f) {
	    Ren r=new Ren();
		r.setChengkezhonglei(chengkezhonglei);
		r.setJicang(jicang);
		r.setShifa(shifa);
		r.setDaoda(daoda);
		r.Setxingli(a, b, c, d);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, e);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0.0,X.xinglijiance(r, 500),"Right");
  }
/*  @Test
  public void f2() {
	  Ren r=new Ren();
		r.setChengkezhonglei("��ͯ");
		r.setJicang("ͷ�Ȳ�");
		r.setShifa("�й�");
		r.setDaoda("�й�");
		r.Setxingli(39, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0.0,X.xinglijiance(r, 500),"Right");
  }*/
}
