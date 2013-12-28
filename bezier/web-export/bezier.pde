/*
  Bezier Experiments - Bernard 
  
  Just a bunch of bezier curves

  @todo : create a function for the curves s

*/

void setup(){
  size(750, 500);
  smooth();
  frameRate(10);
 
};

void draw(){ 
   background(15);
   stroke(random(200, 255));
   strokeWeight(random(0,5));
   fill(random(0,150),random(0,150),random(0,150));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+10), 
   width + mouseY, height+mouseY);
   filter(BLUR, random(0,10));
   
   fill(random(0,150),random(0,150),random(0,150), 150);   
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+20), 
   width, height);
   filter(BLUR, random(0,9));
   
   fill(random(0,150),random(0,150),random(0,150), 25);
   strokeWeight(random(0,5));   
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+30), 
   width, height);
   filter(BLUR, random(0,5));
   
   fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+40), 
   width, height);
   filter(BLUR, random(0,22));
   
      
   fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+40), 
   width, height);
   filter(BLUR, random(0,5));
   
     fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+40), 
   width, height);
   filter(BLUR, random(0,15));
   
     fill(random(0,150),random(0,150),random(0,150), 10);
   strokeWeight(random(0,5));
   bezier(0,height, random(0,width), random(0,height/2), random(0,width), random(width,height+40), 
   width, height);
   
   filter(BLUR, random(0,2));


  }
 
  


