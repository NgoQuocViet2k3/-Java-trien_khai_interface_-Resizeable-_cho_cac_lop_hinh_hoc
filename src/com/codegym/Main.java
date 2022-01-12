package com.codegym;

import ResizeableShape.Resizable;
import ResizeableShape.ResizableCircle;
import ResizeableShape.ResizableRectangle;
import ResizeableShape.ResizableSquare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ResizableCircle cir1 = new ResizableCircle(4, "white", true);
        ResizableSquare sqr1 =new ResizableSquare(5);
        ResizableRectangle rec1 = new ResizableRectangle("black",true,5,4);
        Resizable[] arr = new Resizable[]{cir1,sqr1,rec1};

        System.out.println("Pre-resize:");
        System.out.print(ObjectArrayToString(arr));

        System.out.print("Enter new size(%): ");
        double percent = scanner.nextDouble();
        for (Resizable resizable : arr) {
            resizable.resize(percent);
        }

        System.out.println("After-resize:");
        System.out.print(ObjectArrayToString(arr));

    }
    public static String ObjectArrayToString(Object[] arr) {
        String res = "";
        for (Object obj : arr) {
            res = res.concat(obj.toString() + "\n");
        }
        return res;
    }

}
