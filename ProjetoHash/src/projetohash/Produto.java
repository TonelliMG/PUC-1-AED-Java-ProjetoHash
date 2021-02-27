package projetohash;

import java.util.*;

public class Produto {
public int Codigo;
public String CodProduto;
public String Nome;
public Double Valor;
public Double Venda;
public String Desc;

public Produto(int j){
    Scanner S=new Scanner(System.in);
    System.out.print("CODIGO DO PRODUTO:");
    j=S.nextInt();
    this.Codigo= j;
    this.CodProduto= Integer.toString(Codigo);
}

public void LêProduto(){
Scanner S=new Scanner(System.in);
System.out.print("NOME DO PRODUTO:");
this.Nome=S.nextLine();
System.out.print("VALOR DO PRODUTO:");
this.Valor=S.nextDouble();
S.nextLine();
System.out.print("VALOR DE VENDA:");
this.Venda=S.nextDouble();
S.nextLine();
System.out.print("DESCRIÇÃO DO PRODUTO:");
this.Desc=S.nextLine();
System.out.print("\n=====================================\n");
}

}