package projetohash;

import java.util.Scanner;
import java.util.*;

public class Caixa {
public Hashtable CadProduto;
public int Codigo;
public String CodProd;
public double Saida;
public double aux;

public Caixa(int i){
CadProduto=new Hashtable();
this.Codigo= i;
this.CodProd= Integer.toString(Codigo);
}

public void GravaDados(Produto x){
CadProduto.put(x.CodProduto, x);
}

public void ListaProdutos(){
Set<String> SetOfProdutos=CadProduto.keySet();
int tamanho=1;
for(String ChaveProduto:SetOfProdutos){
Produto xProd=(Produto)CadProduto.get(ChaveProduto);
System.out.println("\n==============================");
System.out.printf("PRODUTO: %1$s\n", tamanho);
System.out.printf("CODIGO: %1$s\n", xProd.CodProduto);
System.out.printf("NOME: %1$s\n", xProd.Nome);
System.out.printf("VALOR: %1$s\n",xProd.Valor);
System.out.printf("VALOR VENDA: %1$s\n",xProd.Venda);
System.out.printf("DESCRIÇÃO: %1$s\n", xProd.Desc);
System.out.println("==============================\n");
tamanho++;
}
}

public void RemoveProduto(){
Scanner S=new Scanner(System.in);
String obj;
System.out.printf("CODIGO DO PRODUTO A REMOVER:");
obj=S.nextLine();
System.out.println("==============================\n");
CadProduto.remove(obj);
}

public double SaidaProduto(double entrada){
Scanner S=new Scanner(System.in);
String obj;
System.out.printf("CODIGO DO PRODUTO A SAIR:");
obj= S.nextLine();
System.out.println("==============================\n");
Produto xProd=(Produto)CadProduto.get(obj);
CadProduto.remove(obj);
entrada = entrada - xProd.Venda;
System.out.println("Valor:" +entrada+"");
double newent;
newent = entrada;
return newent;
}


}