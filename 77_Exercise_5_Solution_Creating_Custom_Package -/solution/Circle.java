package com.munawar.johar.shape;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class Circle extends Shape{
   Circle(int dim1){
    super(dim1,-1);
   }
   public double area(){
    return Math.PI*this.dim1*this.dim2;
   }
}