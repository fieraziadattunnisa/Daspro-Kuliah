package algoritma2;

public class Tugas2 {
    int x , y, width, height;
    public Tugas2 (int x1, int y1, int w, int h){
        x= x1;
        y= y1;
        width = w;
        height = h;
    }

    void moveLeft(){
        if (x>0){
        x = x-1;
        PrintPosition();
        detecCollision();
        }
    }

    void moveRight(){
       if (x< width){
        x = x+1;
        PrintPosition();
        detecCollision();
       }
    }
    void moveUp(){
        if (y >0){
        y = y-1;
        PrintPosition();
        detecCollision();
        }
    }

    void moveDown(){
        if (y<height){
        y = y+1;
        PrintPosition();
        detecCollision();
        }
    }

    void PrintPosition(){
        System.out.printf("(%d %d)\n", x, y);
    }
    
    void detecCollision () {
        if (x<= 0 || y<=0 || x>= width || y >= height){
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {
        Tugas2 d = new Tugas2(2, 2, 0, 0);
        d.PrintPosition();
        d.moveRight();
        d.moveDown();
        d.moveUp();
        d.moveLeft();
    }

}
