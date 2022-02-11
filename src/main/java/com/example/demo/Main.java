package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;


import javafx.scene.Group;


public class Main extends Application {
    @Override
    public void start(Stage stage) {


        Label label = new Label("Test");
        Button button = new Button("My button");
        Button button1 = new Button("My button1");
        Button button2 = new Button("Click me!");

        label.setLayoutX(0);
        label.setLayoutY(0);

        button.setLayoutX(0);
        button.setLayoutY(30);

        button1.setLayoutX(0);
        button1.setLayoutY(60);

        button2.setLayoutX(0);
        button2.setLayoutY(90);

        AtomicInteger buttonClicks = new AtomicInteger();
        Label buttonLabel = new Label("The button was clicked " + buttonClicks + " times");
        Label boxLabel = new Label("""
                First
                Second
                Third
                """);


        button.setOnAction(actionEvent -> {
            buttonClicks.getAndIncrement();
            buttonLabel.setText("The button was clicked " + buttonClicks + " times");
        });


        CheckBox checkBox1 = new CheckBox();
        CheckBox checkBox2 = new CheckBox();
        CheckBox checkBox3 = new CheckBox();
        Group group = new Group(button);
        group.getChildren().add(label);
        group.getChildren().add(button1);
        group.getChildren().add(button2);



        checkBox1.setOnAction(actionEvent -> setCheck(boxLabel, checkBox1, checkBox2, checkBox3));
        checkBox2.setOnAction(actionEvent -> setCheck(boxLabel, checkBox1, checkBox2, checkBox3));
        checkBox3.setOnAction(actionEvent -> setCheck(boxLabel, checkBox1, checkBox2, checkBox3));

        button1.setOnAction(actionEvent -> {
            label.setText("button " + button1.getText() + " вы нажали кнопку!");
            label.setTextFill(Paint.valueOf("WHITE"));

            Button button4 = new Button("Generated");
            button4.setLayoutX(0);
            button4.setLayoutY(150);
            group.getChildren().add(button4);
        });

        Scene scene = new Scene(group, 300, 150, Color.TOMATO);

        stage.setScene(scene);
        stage.setTitle("My new tittle");

        stage.show();

    }

    private void setCheck(Label boxLabel, CheckBox checkBox1, CheckBox checkBox2, CheckBox checkBox3) {
    }


    public static void main(String[] args) {
        launch();
    }
}