/*
 * The MIT License
 *
 * Copyright 2014 ajay.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.ajaybhatia.fancyclock.ui;

import java.util.Calendar;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author ajay
 */
public class FancyClock extends Application {
    private Arc a1;
    private Arc a2;
    private Arc a3;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        
        Pane root = new Pane();
        Scene scene = new Scene(root, 275, 275, Color.TRANSPARENT);
        primaryStage.setScene(scene);
        /*
        Rectangle rec = new Rectangle(275, 275);
        rec.setArcHeight(50);
        rec.setArcWidth(50);
        rec.setOpacity(0.5);
        root.getChildren().add(rec);
        */
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - 275);
        primaryStage.setY(0);
        primaryStage.show();        
        
        lauchClock(root.getChildren());
    }    

    private void lauchClock(ObservableList<Node> root) {
        a1 = new Arc(140, 140, 25, 25, 90, 0);
        a2 = new Arc(140, 140, 75, 75, 90, 0);
        a3 = new Arc(140, 140, 125, 125, 90, 0);
        
        a1.setFill(Color.TRANSPARENT);
        a2.setFill(Color.TRANSPARENT);
        a3.setFill(Color.TRANSPARENT);
    
        a1.setStroke(Color.BLUE);
        a2.setStroke(Color.ORANGE);
        a3.setStroke(Color.YELLOW);
        
        a1.setStrokeWidth(12.0);
        a2.setStrokeWidth(12.0);
        a3.setStrokeWidth(12.0);
        
        root.addAll(a1, a2, a3);
        
        Timeline t = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            Calendar time = Calendar.getInstance();
            a1.setLength(-time.get(Calendar.HOUR) / 12.0 * 360.0);
            a2.setLength(-time.get(Calendar.MINUTE) / 60.0 * 360.0);
            a3.setLength(-time.get(Calendar.SECOND) / 60.0 * 360.0);
        }));
        t.setCycleCount(Animation.INDEFINITE);
        t.play();
    }
}
