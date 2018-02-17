 PImage tail;
void setup() {
 PImage donkey = loadImage("donkey.png");
 size(360,297);
 image(donkey,0,0);
 PImage tail = loadImage("tail.jpg");

image(tail,0,0);
}


void draw() {
  if (mousePressed) {
    image(tail, mouseX, mouseY);
loadImage("tail.jpg");
tail.resize(260,250);
}}