package com.munawar.johar.shape;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class Sphere extends Shape{
   Sphere(int dim1){
    super(dim1,-1);
   }
   public double area(){
    return 4*Math.PI*this.dim1*this.dim1;
   }
}