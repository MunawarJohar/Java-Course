package com.munawar.johar.shape;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class Square extends Shape{
   Square(int dim1){
    super(dim1,-1);
   }
   public double area(){
    return this.dim1*this.dim2;
   }
}