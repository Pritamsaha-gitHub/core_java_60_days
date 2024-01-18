package com.example.Core.Java.Record;

public record Point(int x , int y) {
    public Point translate(int offsetX , int offsetY) {
        return new Point(x + offsetX, y + offsetY);
    }
}
