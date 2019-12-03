//int x=10;
//int y=490;
int dX=(int)random(500);
int dY=(int)random(500);
void setup(){
 size(500, 500);
    background(50, 25, 50); 
  
  
  
  
  
  
  
}



void draw(){
 
  makeMagical();
  for (int i=0; i<300; i++){
    
    
    fill(#FF0000);
    //dX=(int)random(500);
 //dY=(int)random(500);
    
    dX=(int)getWormX(i);
    dY=(int)getWormY(i);
    ellipse (dX,dY, 15, 15);
   // x=x+5;
   // y=y-5;
   
  }
}
  
 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
 
  
  
  
  
