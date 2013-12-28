import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class bezier extends PApplet {

/*
  Bezier Experiments - Bernard 
  
  Just a bunch of bezier curves w/ a motionblur added 

  @todo : create a function for the curves s

*/

public void setup(){
  size(1100, 750);
  smooth();
  frameRate(2);
 
};

public void draw(){ 
  
  float circ = random(0, 200);
  
   background(15);
   
   fill(random(0,255),random(0,255),random(0,255), random(50, 200)); 
   ellipse(random(width), random(height), circ, circ);
   filter(BLUR,2);
   
   fill(random(0,255),random(0,255),random(0,255), random(50, 200)); 
   ellipse(random(width), random(height), circ/2, circ/2);
   filter(BLUR,2);
      
   fill(random(0,255),random(0,255),random(0,255), random(50, 200)); 
   ellipse(random(width), random(height), circ+30, circ+30);
   filter(BLUR,2);
   
   fill(random(0,255),random(0,255),random(0,255), random(50, 200)); 
   ellipse(random(width), random(height), circ+30, circ+30);
   filter(BLUR,2);
   
   fill(random(0,255),random(0,255),random(0,255),random(50, 200)); 
   ellipse(random(width+25), random(height+25), circ*.5f, circ*.5f);
   filter(BLUR,2);
   
   
   stroke(random(200, 255));
   strokeWeight(random(0,5));
   fill(random(0,150),random(0,150),random(0,150));
   bezier(0,height, random(0,width), random(0,height), random(0,width), random(width,height+10), 
   width + mouseY, height+mouseY);
   filter(BLUR, random(0,4));
   
   fill(random(0,150),random(0,150),random(0,150), 150);   
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height), random(0,width), random(0,height), 
   width, height);
   filter(BLUR, random(0,4));
   
   fill(random(0,150),random(0,150),random(0,150), 25);
   strokeWeight(random(0,5));   
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+30), 
   width, height);
   filter(BLUR, random(0,4));
   
   fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height), random(0,width), random(0,height), 
   width, height);
   filter(BLUR, random(0,4));
   
      
   fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+40), 
   width, height);
   filter(BLUR, random(0,2));
   
   fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height), random(0,width), random(0,height), 
   width, height);
   filter(BLUR, random(0,5));
   
     fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+40), 
   width, height);
   filter(BLUR, random(0,2));
    
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "bezier" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
