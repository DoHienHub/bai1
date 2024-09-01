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
 * @created: 9/1/2024
 */

import java.sql.SQLOutput;

public class TestRactangle {

    public static void main(String[] args) {
        try {
            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle(20.5, 4.0);
            System.out.println("Chiều dài của r2: " + r2.getLength());
            System.out.println("Chiều rộng của r2: " + r2.getWidth());

            // r1.setLength(20);
            r2.setWidth(-10); // Dòng này sẽ ném ra ngoại lệ
            System.out.println("Diện tích của r2: " + r2.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
