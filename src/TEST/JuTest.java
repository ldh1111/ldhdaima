package TEST;
import 软件测试实习一.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuTest {
	@Test
	public void testXinglijiance1() {                     
		Ren r=new Ren();
		r.setChengkezhonglei("儿童");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(39, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance2() {
		Ren r=new Ren();
		r.setChengkezhonglei("儿童");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(29, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance3() {
		Ren r=new Ren();
		r.setChengkezhonglei("儿童");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(19, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance4() {
		Ren r=new Ren();
		r.setChengkezhonglei("占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(9, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance5() {
		Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(9, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance6() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(59, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance7() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(49, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance8() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(39, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance9() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(49, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance10() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(39, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance11() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(29, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance12() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(39, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance13() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(29, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance14() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(19, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance15() {                     
		Ren r=new Ren();
		r.setChengkezhonglei("儿童");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance16() {
		Ren r=new Ren();
		r.setChengkezhonglei("儿童");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance17() {
		Ren r=new Ren();
		r.setChengkezhonglei("儿童");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(21, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance18() {
		Ren r=new Ren();
		r.setChengkezhonglei("占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(11, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance19() {
		Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(11, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance20() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(61, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance21() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance22() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance23() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance24() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance25() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance26() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("头等舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance27() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("公务舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance28() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("明珠经济舱");
		r.setShifa("中国");
		r.setDaoda("中国");
		r.Setxingli(21, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(7.5, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance29() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance30() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance31() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 57);
		r.Setxingli(51, 50, 50, 5);
		r.Setxingli(51, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance32() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(42, 50, 50, 57);
		r.Setxingli(42, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance33() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		r.Setxingli(41, 50, 50, 5);
		r.Setxingli(41, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance34() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(32, 50, 50, 57);
		r.Setxingli(32, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance35() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance36() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance37() {
		Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(9, 50, 50, 7);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	////
	@Test
	public void testXinglijiance38() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		r.Setxingli(33, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance39() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(24, 50, 50, 57);
		r.Setxingli(24, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(2000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance40() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(6000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance41() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance42() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance43() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance44() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance45() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance46() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(33, -1, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance47() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(46, -2, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance48() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance49() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance50() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance51() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		r.Setxingli(53, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance52() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(44, 50, 50, 57);
		r.Setxingli(44, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(2000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance53() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(6000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance54() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance55() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance56() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance57() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 59);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance58() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance59() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(53, -1, 50, 59);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance60() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(66, -2, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance61() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance62() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance63() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("美洲");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	//////////////////////////
	@Test
	public void testXinglijiance64() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance65() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance66() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 57);
		r.Setxingli(51, 50, 50, 5);
		r.Setxingli(51, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance67() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(42, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance68() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		r.Setxingli(41, 50, 50, 5);
		r.Setxingli(41, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance69() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(32, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance70() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance71() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance72() {
		Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(9, 50, 50, 7);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	////
	@Test
	public void testXinglijiance73() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		r.Setxingli(33, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance74() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance75() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance76() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance77() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance78() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance79() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 59);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance80() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance81() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(33, -1, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance82() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(46, -2, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance83() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(450, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance84() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1750, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance85() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance86() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		r.Setxingli(53, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance87() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);;
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance88() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(64, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance89() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance90() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance91() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance92() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 59);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance93() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance94() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(53, -1, 50, 59);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance95() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(66, -2, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance96() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(450, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance97() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1750, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance98() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("中西亚");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	////////////////////////////////
	@Test
	public void testXinglijiance99() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance100() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance101() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 57);
		r.Setxingli(51, 50, 50, 5);
		r.Setxingli(51, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance102() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(42, 50, 50, 57);
		r.Setxingli(42, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance103() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		r.Setxingli(41, 50, 50, 5);
		r.Setxingli(41, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance104() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(32, 50, 50, 57);
		r.Setxingli(32, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance105() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance106() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance107() {
		Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(9, 50, 50, 7);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	////
	@Test
	public void testXinglijiance108() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		r.Setxingli(33, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance109() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(24, 50, 50, 57);
		r.Setxingli(24, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(4000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance110() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(6000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance111() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance112() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance113() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance114() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance115() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance116() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(33, -1, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance117() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(46, -2, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance118() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance119() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance120() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance121() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		r.Setxingli(53, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance122() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(44, 50, 50, 57);
		r.Setxingli(44, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(4000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance123() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(6000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance124() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance125() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance126() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance127() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 59);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance128() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance129() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(53, -1, 50, 59);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance130() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(66, -2, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance131() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance132() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance133() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("内罗毕");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	/////////
	@Test
	public void testXinglijiance134() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance135() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance136() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 57);
		r.Setxingli(51, 50, 50, 5);
		r.Setxingli(51, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance137() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(42, 50, 50, 57);
		r.Setxingli(42, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance138() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		r.Setxingli(41, 50, 50, 5);
		r.Setxingli(41, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance139() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(32, 50, 50, 57);
		r.Setxingli(32, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance140() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance141() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance142() {
		Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(9, 50, 50, 7);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	////
	@Test
	public void testXinglijiance143() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		r.Setxingli(33, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance144() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(24, 50, 50, 57);
		r.Setxingli(24, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(2000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance145() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(6000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance146() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance147() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance148() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance149() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance150() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance151() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(33, -1, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance152() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(46, -2, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance153() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(450, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance154() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1750, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance155() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance156() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		r.Setxingli(53, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance157() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(44, 50, 50, 57);
		r.Setxingli(44, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(2000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance158() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(6000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance159() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance160() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance161() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance162() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(43, 50, 50, 59);
		r.Setxingli(43, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance163() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance164() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(53, -1, 50, 59);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance165() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(66, -2, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance166() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(450, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance167() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1750, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance168() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance169() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance170() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance171() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(51, 50, 50, 57);
		r.Setxingli(51, 50, 50, 5);
		r.Setxingli(51, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance172() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(42, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance173() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(41, 50, 50, 57);
		r.Setxingli(41, 50, 50, 5);
		r.Setxingli(41, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance174() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠银卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(32, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance175() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(31, 50, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 30, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance176() {
		Ren r=new Ren();
		r.setChengkezhonglei("留学生");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(22, 50, 50, 57);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance177() {
		Ren r=new Ren();
		r.setChengkezhonglei("不占座婴儿");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(9, 50, 50, 7);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(0, X.xinglijiance(r, 500),0.02);
	}
	////
	@Test
	public void testXinglijiance178() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		r.Setxingli(33, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance179() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(24, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance180() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(33, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
	    //System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance181() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("其他");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance182() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance183() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance184() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(23, 50, 50, 59);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance185() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(46, 50, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance186() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(33, -1, 50, 59);
		r.Setxingli(33, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance187() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(46, -2, 50, 257);
		r.Setxingli(46, 50, 50, 5);
		r.Setxingli(46, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance188() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(450, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance189() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1750, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance190() {
		Ren r=new Ren();
		r.setChengkezhonglei("成人");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance191() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		r.Setxingli(53, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(9000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance192() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(44, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance193() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(53, 50, 50, 57);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(3000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance194() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance195() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(-1, 50, 50, 57);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance196() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(-2, 50, 50, 57);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance197() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(43, 50, 50, 59);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1000, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance198() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(66, 50, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance199() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(53, -1, 50, 59);
		r.Setxingli(53, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance200() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(66, -2, 50, 257);
		r.Setxingli(66, 50, 50, 5);
		r.Setxingli(66, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance201() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(22, 44, 50, 49);
		r.Setxingli(22, 50, 50, 5);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(450, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance202() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("头等舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		r.Setxingli(31, 44, 50, 57);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		r.Setxingli(31, 50, 50, 5);
		r.Setxingli(31, 50, 50, 55);
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(1750, X.xinglijiance(r, 500),0.02);
	}
	@Test
	public void testXinglijiance203() {
		Ren r=new Ren();
		r.setChengkezhonglei("南航明珠金卡会员");
		r.setJicang("明珠经济舱");
		r.setShifa("韩国");
		r.setDaoda("中国");
		Xinglijiance X=new Xinglijiance();
		X.xinglijiance(r, 500);
		//System.out.print(X.xinglijiance(r, 500));
		assertEquals(-1, X.xinglijiance(r, 500),0.02);
	}
}
