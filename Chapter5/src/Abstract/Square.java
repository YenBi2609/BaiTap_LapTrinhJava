package Abstract;

public class Square extends  Rectangle{
    Square() {
    }
    // phải tạo thêm 1 hàm tạo 1 tham số ở lớp Rectangle
    Square(double width){
        super(width);
    }
    // phải tạo thêm 1 hàm tạo 3 tham số ở lớp Rectangle
    Square(String color, boolean filled, double width) {

        super(color, filled, width);
    }
    double getSide(){
        return getWidth();
    }
    void setSide(double width1){
        setWidth(width1);
    }

    @Override
    public String toString() {
        return "Square{" +
                "Side="+ getWidth()+
                "}";
    }
}
