package �������ʵϰһ;

public class Xinglijiance {
	public double xinglijiance(Ren chengke,int piaojia) {
		if(chengke.xingli.size()==0) {
			return -1;
		}
		for(int i=0;i<chengke.xingli.size();i++) {
			if(chengke.xingli.get(i).getZhongliang()<0) {
				return -1;
			}
		}
		for(int i=0;i<chengke.xingli.size();i++) {
			if(chengke.xingli.get(i).getChang()<0) {
				return -1;
			}
		}
		for(int i=0;i<chengke.xingli.size();i++) {
			if(chengke.xingli.get(i).getGao()<0) {
				return -1;
			}
		}
		for(int i=0;i<chengke.xingli.size();i++) {
			if(chengke.xingli.get(i).getKuan()<0) {
				return -1;
			}
		}
		if(piaojia<0) {
			return -1;
		}
		double money=0;
		if(chengke.getShifa()=="�й�"&&chengke.getDaoda()=="�й�") 
		{
			if(chengke.getChengkezhonglei()=="ռ��Ӥ��"||chengke.getChengkezhonglei()=="��ռ��Ӥ��") {
				int zhongliang;
				for(int i=0;i<chengke.xingli.size();i++) {
					if(chengke.xingli.get(i).getZhongliang()>10)
					{
						money+=(chengke.xingli.get(i).getZhongliang()-10)*piaojia*0.015;
					}
					if(i-0>=1) {
						money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����𿨻�Ա"||chengke.getChengkezhonglei()=="������˳�����Ӣ")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>60)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-60)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>50)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-50)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>40)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}

			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����������Ա"||chengke.getChengkezhonglei()=="������˾�Ӣ") 
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>50)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-50)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>40)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>30)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-30)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}

			}
			else if(chengke.getChengkezhonglei()=="��ѧ��"||chengke.getChengkezhonglei()=="����"||chengke.getChengkezhonglei()=="��Ա")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>40)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>30)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-30)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>20)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-20)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}

			}
			else {
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>40)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>30)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-30)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>20)
						{
							money+=(chengke.xingli.get(i).getZhongliang()-20)*piaojia*0.015;
						}
						if(i-0>=1) {
							money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
						}
					}
				}
			}
		}
		else if(chengke.getShifa()=="�ձ�"||chengke.getShifa()=="����"||
				chengke.getShifa()=="����"||chengke.getShifa()=="����˹"||
				chengke.getShifa()=="�ϰ�"||/*chengke.getDaoda()=="�ձ�"||
				chengke.getDaoda()=="����"||chengke.getDaoda()=="����"||
				chengke.getDaoda()=="����˹"||chengke.getDaoda()=="�ϰ�"||*/
				(chengke.getShifa()=="�¼���"&&chengke.getDaoda()=="�й�")) 
		{
			if(chengke.getChengkezhonglei()=="��ռ��Ӥ��")
			{
				for(int i=0;i<chengke.xingli.size();i++) {
					if(chengke.xingli.get(i).getZhongliang()>10||
							chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
					{
						return -1;
					}
					if(i>0) {
						return -1;
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����𿨻�Ա"||chengke.getChengkezhonglei()=="������˳�����Ӣ")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2) {
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else {
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) 
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else {
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) {
							if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=43&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else {
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����������Ա"||chengke.getChengkezhonglei()=="������˾�Ӣ") 
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2) {
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else {
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) 
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else {
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) {
							if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=33&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else {
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="��ѧ��"||chengke.getChengkezhonglei()=="����"||chengke.getChengkezhonglei()=="��Ա")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-3==1) {
							money+=1000;
						}
						if(i-3>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
			}
			else 
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
			}
		}
		else if(chengke.getShifa()=="������"/*||chengke.getDaoda()=="������"*/) 
		{
			if(chengke.getChengkezhonglei()=="��ռ��Ӥ��") 
			{
				for(int i=0;i<chengke.xingli.size();i++) {
					if(chengke.xingli.get(i).getZhongliang()>10||
							chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
					{
						return -1;
					}
					if(i>0) {
						return -1;
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����𿨻�Ա"||chengke.getChengkezhonglei()=="������˳�����Ӣ")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2) 
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else {
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) 
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else 
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=0)
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-0==1) {
							money+=450;
						}
						if(i-0>1) {
							money+=1300;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����������Ա"||chengke.getChengkezhonglei()=="������˾�Ӣ") 
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) 
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else 
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=0)
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else 
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-0==1) {
							money+=450;
						}
						if(i-0>1) {
							money+=1300;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="��ѧ��"||chengke.getChengkezhonglei()=="����"||chengke.getChengkezhonglei()=="��Ա")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-3==1) {
							money+=450;
						}
						if(i-3>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
			}
			else {
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-0==1) {
							money+=450;
						}
						if(i-0>1) {
							money+=1300;
						}
					}
				}
			}
		}
		else if(chengke.getShifa()=="���ޱ�"/*||chengke.getDaoda()=="���ޱ�"*/) 
		{
			if(chengke.getChengkezhonglei()=="��ռ��Ӥ��") 
			{
				for(int i=0;i<chengke.xingli.size();i++) {
					if(chengke.xingli.get(i).getZhongliang()>10||
							chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
					{
						return -1;
					}
					if(i>=1) {
						return -1;
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����𿨻�Ա"||chengke.getChengkezhonglei()=="������˳�����Ӣ")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1)
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else 
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1)
						{
							if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=2000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=43&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=2000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����������Ա"||chengke.getChengkezhonglei()=="������˾�Ӣ") 
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1)
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) 
						{
							if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=2000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=33&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=2000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="��ѧ��"||chengke.getChengkezhonglei()=="����"||chengke.getChengkezhonglei()=="��Ա")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-3==1) {
							money+=1000;
						}
						if(i-3>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>=1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=2000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
			}
			else {
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=1000;
						}
						if(i-2>1) {
							money+=2000;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=2000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=1000;
						}
						if(i-1>1) {
							money+=2000;
						}
					}
				}	
			}
		}
		else if(chengke.getShifa()=="����"&&chengke.getDaoda()=="�й�") 
		{
			if(chengke.getChengkezhonglei()=="��ռ��Ӥ��") 
			{
				for(int i=0;i<chengke.xingli.size();i++) {
					if(chengke.xingli.get(i).getZhongliang()>10||
							chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
					{
						return -1;
					}
					if(i>=1) {
						return -1;
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����𿨻�Ա"||chengke.getChengkezhonglei()=="������˳�����Ӣ")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1)
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=0)
						{
							if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=43&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-0==1) {
							money+=450;
						}
						if(i-0>1) {
							money+=1300;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����������Ա"||chengke.getChengkezhonglei()=="������˾�Ӣ") 
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1)
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else 
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=0)
						{
							if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=33&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-0==1) {
							money+=450;
						}
						if(i-0>1) {
							money+=1300;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="��ѧ��"||chengke.getChengkezhonglei()=="����"||chengke.getChengkezhonglei()=="��Ա")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-3==1) {
							money+=450;
						}
						if(i-3>=1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
			}
			else {
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-0==1) {
							money+=450;
						}
						if(i-0>1) {
							money+=1300;
						}
					}
				}
			}
		}
		else 
		{
			if(chengke.getChengkezhonglei()=="��ռ��Ӥ��") {
				for(int i=0;i<chengke.xingli.size();i++) {
					if(chengke.xingli.get(i).getZhongliang()>10||
							chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
					{
						return -1;
					}
					if(i>=1) {
						return -1;
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����𿨻�Ա"||chengke.getChengkezhonglei()=="������˳�����Ӣ")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=43&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return 100000000;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1) 
						{
							if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=43&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>65||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="�Ϻ�����������Ա"||chengke.getChengkezhonglei()=="������˾�Ӣ") 
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=2)
						{
							if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=33&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(i<=1)
						{
							if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=33&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>55||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						else
						{
							if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
							{
								money+=3000;
							}
							else if(chengke.xingli.get(i).getZhongliang()<=23&&
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
									&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
							{
								money+=1000;
							}
							else if(chengke.xingli.get(i).getZhongliang()>45||
									chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
							{
								return -1;
							}
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
			}
			else if(chengke.getChengkezhonglei()=="��ѧ��"||chengke.getChengkezhonglei()=="����"||chengke.getChengkezhonglei()=="��Ա")
			{
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-3==1) {
							money+=450;
						}
						if(i-3>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-3==1) {
							money+=450;
						}
						if(i-3>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�"||chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
			}
			else {
				if(chengke.getJicang()=="ͷ�Ȳ�") 
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="�����")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-2==1) {
							money+=450;
						}
						if(i-2>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���龭�ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==1) {
							money+=450;
						}
						if(i-1>1) {
							money+=1300;
						}
					}
				}
				else if(chengke.getJicang()=="���ò�")
				{
					for(int i=0;i<chengke.xingli.size();i++) {
						if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
						{
							money+=3000;
						}
						else if(chengke.xingli.get(i).getZhongliang()<=23&&
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
								&&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300) 
						{
							money+=1000;
						}
						else if(chengke.xingli.get(i).getZhongliang()>45||
								chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300) 
						{
							return -1;
						}
						if(i-1==0) {
							money+=450;
						}
						if(i-1>0) {
							money+=1300;
						}
					}
				}
			}
		}
		return money;
	}
}
