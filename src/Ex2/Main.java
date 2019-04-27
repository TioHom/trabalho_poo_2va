package Ex2;

import java.util.ArrayList;

public class Main  {
	
public static void main(String[] args) {

	CDs cd1 = new CDs(15, "CD1", 20);
	CDs cd2 = new CDs(25,"CD2",21);
	DVDs dv1 = new DVDs(200,"DVD1",50);
	DVDs dv2 = new DVDs(100,"DVD2",25);
	Livros lv1 = new Livros("Autor sem nome","Sem nome",500);
	
	ArrayList<Produto> al = new ArrayList<>();
	
	al.add(cd1);
	al.add(lv1);
	al.add(dv2);
	al.add(dv1);
	al.add(cd2);
	
	System.out.println(al);
	
	}
	
}
