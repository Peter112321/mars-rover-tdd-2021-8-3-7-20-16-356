package com.afs.tdd;

import java.lang.reflect.Array;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX=locationX;
        this.locationY=locationY;
        this.direction=direction;
    }

    public String executeMultipleCommand(String command){
        for(int  i=0; i<command.length(); i++){
        executeCommand(""+command.charAt(i));}
        return String.format("%d %d %s", this.locationX, this.locationY,this.direction);
    }


    public String executeCommand(String command){
        return execute(command);
    }



    public String execute(String command ){

        if (command.equals("M")) move();
        if (command.equals("L")) turnleft();
        if (command.equals("R")) turnright();
        return String.format("%d %d %s", this.locationX, this.locationY,this.direction);
    }

    private void move(){
        if(this.direction.equals("N")) this.locationY=this.locationY+1;
        if(this.direction.equals("E")) this.locationX=this.locationX+1;
        if(this.direction.equals("S")) this.locationY=this.locationY-1;
        if(this.direction.equals("W")) this.locationX=this.locationX-1;

    }

    private void turnleft(){
        switch(this.direction){
            case "N":
                this.direction="W";
                break;
            case "S":
                this.direction="E";
                break;
            case "E":
                this.direction="N";
                break;
            case "W":
                this.direction="S";
                break;

        }}
    private void turnright(){
        switch(this.direction){
            case "N":
                this.direction="E";
                break;
            case "S":
                this.direction="W";
                break;
            case "E":
                this.direction="S";
                break;
            case "W":
                this.direction="N";
                break;

        }}
    }

