import ddf.minim.*;   
AudioSample sound1;     

 PImage tail;
 PImage donkey;
void setup() {
  Minim minim = new Minim(this); 
  sound1 = minim.loadSample("heehaw.mp3"); 
donkey = loadImage("donkey.jpg");
background(donkey);
size(450,371);
image(donkey,0,0);
tail = loadImage("tail.png");
tail.resize(200,200);

}


void draw() {
  if (mousePressed) { 
{
}
   if (320 < mouseX && mouseX < 420 && (60 < mouseY && mouseY < 100)) {
  image(tail,mouseX-60,mouseY-35);
  sound1.trigger();
   } else {
     

 
//(320,60)
//(420,60)
//(320,100)
//(420,100)
   } }}