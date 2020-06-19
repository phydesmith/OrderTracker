package io.javasmithy.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class AppController{

    @FXML AnchorPane mainPane, entryPane, tablePane, searchPane;

    @FXML public void showEntryPane(){
        hideAllExcept(entryPane);
    }
    @FXML public void showTablePane(){
        hideAllExcept(tablePane);
    }
    @FXML public void showSearchPane(){
        hideAllExcept(searchPane);
    }
    private void hideAllExcept(Pane pane){
        for (Node node:
             mainPane.getChildren()) {
            if ( node.equals(pane) ) {
                node.setVisible(true);
            } else {
                if (node instanceof Pane){
                    node.setVisible(false);
                }
            }
        }
    }

    @FXML public void submit(){
        StringBuilder sb = new StringBuilder();
        for (Node node: entryPane.getChildren()) {
            if (node instanceof TextField || node instanceof TextArea){
                sb.append( ((TextInputControl) node).getText());
                sb.append(System.lineSeparator());
            }
        }
        System.out.println(sb.toString());
    }

    @FXML public void search(){

    }
}

