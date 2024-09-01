/* 
 * @ (#) Rectangle.java  1.0    8/25/2024
 *
 *  Copyright (c) 2024 IUH  All rights reserved.
*/

package iuh.fit.se;


/*
 * @description:  
 * @author:  Hien, Do Thi Hien
 * @version: 1.0
 * @created: 1/9/2024
 */

public class Rectangle {
    private double length;
    private double width;

    // Constructor mặc định
    public Rectangle() {
        this.length = 1.0; // Giá trị mặc định
        this.width = 1.0;
    }

    // Constructor có tham số
    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải lớn hơn 0.");
        }
        this.length = length;
        this.width = width;
    }

    // Phương thức lấy chiều dài
    public double getLength() {
        return length;
    }

    // Phương thức đặt chiều dài
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Chiều dài phải lớn hơn 0.");
        }
        this.length = length;
    }

    // Phương thức lấy chiều rộng
    public double getWidth() {
        return width;
    }

    // Phương thức đặt chiều rộng
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Chiều rộng phải lớn hơn 0.");
        }
        this.width = width;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return length * width;
    }
}
