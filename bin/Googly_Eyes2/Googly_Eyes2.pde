int px = 350;
int py = 250;
void setup() {
  size(1000,500);
  
}
void draw () {
  px = mouseX;
  py = mouseY;
  if(mouseX < 310) {
    px = 310;
  } else if (mouseX > 390) {
    px = 390; }
    
  if(mouseY > 260) {
    py = 260;
  } else if (mouseY < 235) {
    py = 235;
  }
ellipse(350,250,150,100); 
ellipse(650,250,150,100);
fill(0,0,0);

 ellipse(px,py,45,45);
 ellipse(px + 300,py,45,45);
 fill(255,255,255);
  
} 