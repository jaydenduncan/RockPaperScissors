package com.example.rockpaperscissors;

public class RockPaperScissors {

    public boolean isDraw(Weapon p, Weapon c){

        boolean result = false;

        if(p.equals(c)){
            result = true;
        }

        return result;

    }

    public boolean isPlayerWinner(Weapon p, Weapon c){
        boolean result = false;

        if(p.toString().equals("Rock")){
            if(c.toString().equals("Scissors")){
                result = true;
            }
        }

        if(p.toString().equals("Paper")){
            if(c.toString().equals("Rock")){
                result = true;
            }
        }

        if(p.toString().equals("Scissors")){
            if(c.toString().equals("Paper")){
                result = true;
            }
        }

        return result;
    }

    public boolean isComputerWinner(Weapon p, Weapon c){
        boolean result = false;

        if(c.toString().equals("Rock")){
            if(p.toString().equals("Scissors")){
                result = true;
            }
        }

        if(c.toString().equals("Paper")){
            if(p.toString().equals("Rock")){
                result = true;
            }
        }

        if(c.toString().equals("Scissors")){
            if(p.toString().equals("Paper")){
                result = true;
            }
        }

        return result;
    }

}
