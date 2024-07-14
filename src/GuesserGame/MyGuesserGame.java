/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harjot
 */
package GuesserGame;
import java.util.*;
class Guesser
{
    int GuesserNum;
    public int GuesserNumb()
    {
        Scanner ob=new Scanner(System.in);
        GuesserNum=ob.nextInt();
        return GuesserNum;
    }
}
class Player
{
    int PlayerNum;
    public int PlayerNumb()
    {
        Scanner ob=new Scanner(System.in);
        PlayerNum=ob.nextInt();
        return PlayerNum;
    }
}

class Umpire
{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;
    public void CollectNumFromGuesser()
    {
        System.out.println("Guesser Kindly  guess a number");
        Guesser gu=new Guesser();
        Guessernum=gu.GuesserNumb();
    }
    public void CollectNumFromPlayers()
    {
        System.out.println("Player 1 kindly guess a number");
        Player P1=new Player();
        Playernum1=P1.PlayerNumb();

        System.out.println("Player 2kindly guess a number");
        Player P2=new Player();
        Playernum2=P2.PlayerNumb();

        System.out.println("Player 3 kindly guess a number");
        Player P3=new Player();
        Playernum3=P3.PlayerNumb();
    }

    public void Compare()
    {
        if(Guessernum==Playernum1)
        {
            if(Guessernum==Playernum2 && Guessernum==Playernum3)
            {
                System.out.println("All players won the Game");
            }
            else if(Guessernum==Playernum2)
            {
                System.out.println("Player 1 and Player 2 won the Game");
            }
            else if(Guessernum==Playernum3)
            {
                System.out.println("Player 1 and Player 3 won the Game");
            }
            else
            {
                System.out.println("Only Player 1 won the Game");
            }
        }
        else if(Guessernum==Playernum2)
        {
            if(Guessernum==Playernum3)
            {
                System.out.println("Player 2 and Player 3 won the Game");
            }
            else
            {
                System.out.println("Player 2 won the Game");
            }
        }
        else if(Guessernum==Playernum3)
        {
            System.out.println("Only Player 3 won the Game");
        }
        else 
        {
            System.out.println("All Players lost the Game");
        }
    }
}
public class MyGuesserGame 
{
    public static void main(String[] args) 
    {
        Umpire Um=new Umpire();
        System.out.println("------- Game Started ------");
        Um.CollectNumFromGuesser();
        Um.CollectNumFromPlayers();
        Um.Compare();
        System.out.println("-------Game Over------");
    }
}
