public class ShapeFactory {
    //กำหนดจำนวนการ spawn ได้
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE= 2;
    private static int countCircle = 0;
    private static final int countCircleLimit = 2;
    private static int countRectangle = 0;
    private static final int countRectangleLimit = 2;
    private static int countSquare = 0;
    private static final int countSquareLimit = 2;
    private static int countAll = 0;
    private static final int countAllLimit = 5;
     public static Shape getShape(int type){
         switch(type){
             case TYPE_CIRCLE:
                 if(countCircle < countCircleLimit && countAll < countAllLimit){
                     countCircle++;
                     countAll++;
                     return new Circle();
                 } else{
                     return null;
                 }
             case TYPE_RECTANGLE :
                 if(countRectangle < countRectangleLimit && countAll < countAllLimit){
                     countRectangle++;
                     countAll++;
                     return  new Rectangle();
                 } else{
                     return null;
                 }
             case TYPE_SQUARE :
                 if(countSquare < countSquareLimit && countAll < countAllLimit){
                     countSquare++;
                     countAll++;
                     return  new Square();
                 } else{
                     return null;
                 }
             default :
                 return null;
         }
     }
}
