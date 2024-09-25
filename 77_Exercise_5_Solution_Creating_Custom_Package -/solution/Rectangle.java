package com.munawar.johar.shape;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class Rectangle extends Shape{
   Rectangle(int dim1,int dim2){
    super(dim1,dim2);
   }
   public int area(){
    return this.dim1*this.dim2;
   }
}