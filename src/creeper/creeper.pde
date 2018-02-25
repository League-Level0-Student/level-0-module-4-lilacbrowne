PImage creeper;
int cx = 285;
int cy = 380;
boolean isNear;

void setup() {
PImage minecraft = loadImage("minecraft.jpg");
background(minecraft);
size(1280, 960);
creeper = loadImage("creeper.png");
creeper.resize(40,40);
image(creeper, cx, cy);
}


void draw() {
  if (mousePressed) {
  ellipse(mouseX,mouseY,50,50);
  } //if (mouseX > 255 && mouseX < 325 && (360 < mouseY && mouseY < 420)) {
  //fill(0,255,0);
  //} else {
  //  fill (255,0,0); }
      if (isNear(mouseX,cx) && (isNear(mouseY,cy))) {
        fill (255,0,0);
        textSize(50);
        text("You found the creeper", 500,400);
        fill(0,255,0);
      } else {
        fill(255,0,0); }
       if (mousePressed) {
  ellipse(mouseX,mouseY,50,50);
  } 
  }


  boolean isNear(int x, int y) {
    if (abs( x -  y) <20)
    return true;
    else
    return false;
  }
  
  
  
  
  
  