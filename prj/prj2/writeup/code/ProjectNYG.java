
/**
 * file: ProjectNYG.java 
 * author: William Esposito 
 * course: CMPT 220
 * assignment: Project 2  
 * due date: Wednesday, May 10 
 * version: 1.3
 * 
 * This file contains a program with answer for designated problem
 */
import java.util.Scanner; // Scanner is within the Java.util package

public class ProjectNYG {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declare Global Variables
    while (true) {
      int directionNumberOffense = 0;
      int directionNumberDefense = 0;
      int directionNumberSpecialTeams = 0;

      // Prompt user to enter offense or defense or Special Teams
      System.out.println("Please enter 1 for Offense, 2 for Defense, or 3 for Special Teams.");
      int offenseOrDefence = input.nextInt();

      // This is the initial selection process for Offense, Defense, and Special
      // Teams.
      if (offenseOrDefence == 1) {
        directionNumberOffense++; // Equals 1
        System.out.println("You have selected Offense!");
      } else if (offenseOrDefence == 2) {
        directionNumberDefense++; // Equals 1
        System.out.println("You have selected Defense!");
      } else if (offenseOrDefence == 3) {
        directionNumberSpecialTeams++; // Equals 1
        System.out.println("You have Selected Special Teams!");
      } else {
        System.out
            .println("The only valid inputs here are 1 for Offense," + "/n2 for Defense," + "/n3 for Special teams.");
      }

      // This is layer 2, after the user selects Offense, Defense, or Special
      // Teams.
      if (directionNumberOffense == 1) {
        // Prompt user to enter QB, RB, WR, or lineman.
        System.out.println("Please enter 1 for QB," + "\n2 for RB," + "\n3 for WR," + "\nor 4 for Lineman.");
        int offensePosition = input.nextInt();
        if (offensePosition == 1) {
          directionNumberOffense++; // Equals 2 for QB
        } else if (offensePosition == 2) {
          directionNumberOffense += 2; // Equals 3 for RB
        } else if (offensePosition == 3) {
          directionNumberOffense += 3; // Equals 4 for WR
        } else if (offensePosition == 4) {
          directionNumberOffense += 4; // Equals 5 for Linemen
        } else {
          System.out.println("The only valid inputs here are 1, 2, 3, or 4.");
        }
      }

      // This is where user selects from Defensive Positions.
      if (directionNumberDefense == 1) {
        System.out.println("Please enter 1 for CornerBack, 2 for Safety, 3 for Linebacker, or 4 for Lineman");
        int defensePosition = input.nextInt();
        if (defensePosition == 1) {
          directionNumberDefense++; // Equals 2 FOR CB
        } else if (defensePosition == 2) {
          directionNumberDefense += 2; // Equals 3 FOR Safety
        } else if (defensePosition == 3) {
          directionNumberDefense += 3; // Equals 4 FOR Linebacker
        } else if (defensePosition == 4)
          directionNumberDefense += 4; // Equals 5 for Lineman
        else {
          System.out.println(
              "The only valid inputs here are 1 for CornerBack, 2 for Safety, 3 for Linebacker, or 4 for Lineman.");
        }
      }

      // QB
      if (directionNumberOffense == 2) {
        System.out.println("Eli Manning has been the franchise QB for the NY Giants since 2004."
            + "\nThe 2 time Super Bowl MVP saw another year of solid production with" + ""
            + "\n4027 yards passing and 26 TDs.");
      } // QB

      // RB
      if (directionNumberOffense == 3) {
        System.out.println("Veteran Reshan Jennings was the running back for the the NY Giants in the 2017 season."
            + "\nHe finished the season with 593 yards and 3 TDs.");
      } // RB

      // Recievers
      if (directionNumberOffense == 4) {
        System.out
            .println("You are looking for a Wide Reciever." + "\nIf you are looking for Odell Beckham Jr., enter 1. "
                + "\nFor Victor Cruz, enter 2. " + "\nFor Sterling Shepard, enter 3.");
        int recieverPosition = input.nextInt();
        if (recieverPosition == 1) {
          System.out.println(
              "Since entering the league in 2014, Odell Beckham Jr. has been one of the best recievers in the NFL."
                  + " \nIn just 3 seasons he has emerged as one of the best recievers in the NFL, and quite possibly the most talented and gifted player in the league."
                  + "\nHe was voted to the Pro Bowl for the 2017 season, meaning he was voted by the public as one of the best players at his position."
                  + "\nHe finished the season with 1367 recieving yards, 101 receptions, and 10 TDs.");
        } else if (recieverPosition == 2) {
          System.out
              .println("Fan favorite Victor Cruz played his first season in 2016 after a season ending injury in 2014."
                  + "\nVictor Cruz had the lowest production of his career but still made plays where it counted."
                  + "\nHowever, due to never fully recovering from his injury Cruz is no longer a Giant for the 2017 season.");
        } else if (recieverPosition == 3) {
          System.out.println(
              "Despite being just a rookie, Sterling Shepard made a large impact on the field in his first season."
                  + "\nHe lead all rookie recievers with 8 TDs and also caught 65 receptions for 683 yards.");

        } else {
          System.out.println(
              "The only acceptable inputs here are 1 for Odell Beckham Jr, 2 for Victor Cruz, and 3 for Sterling Shepard.");

        }
      } // Receivers

      // Offensive linemen
      if (directionNumberOffense == 5) {
        System.out.println(
            "You are looking for an Offensive Lineman. " + "\nIf you are looking for Left Tackle f Flowers, enter 1. "
                + "\nIf you are looking for Left Guard Justin pugh, enter 2. "
                + "\nIf you are looking for Center Weston Richburg, enter 3. "
                + "\nIf you are looking for Right Guard John Jerry, enter 4. "
                + "\nIf you are looking for Right Tackle Marshall Newhouse, enter 5.");
        int olinePosition = input.nextInt();
        if (olinePosition == 1) {
          System.out.println("Erik Flowers is the Left Tackle for the NY Giants."
              + "\nHe would not start for any other team in the NFL, meaning in the 2016 season he may have been one of"
              + " \nthe worst starting Left Tackle in the league.");
        } else if (olinePosition == 2) {
          System.out.println("Justin Pugh is the Left Guard for the NY Giants."
              + "\nHe is a decent starter and valueable member of the team.");
        } else if (olinePosition == 3) {
          System.out.println("Justin Wichburg is the Center for the NY Giants."
              + "\nHe plays an an all pro level and is one of the most underated players in the NFL.");
        } else if (olinePosition == 4) {
          System.out.println(
              "John Jerry is the Right Guard for the NY Giants." + "\n He also sucks and needs to be replaced.");
        } else if (olinePosition == 5) {
          System.out.println("Marshall Newhouse is the Right Tackle for the NY Giants."
              + "\nHe would be abench player for most NFL teams that have an actual Right Tackle.");
        } else {
          System.out.println("The only acceptable inputs are 1, 2, 3, 4, or 5.");
        }

      } // Offensive linemen

      // Corner Backs
      if (directionNumberDefense == 2) {
        System.out.println("You are looking for a Corner Back. If you are looking for Jenoris Jenkins press 1."
            + "\nIf you are looking for Dominique Rodgers-Cromartie, press 2. "
            + "\nIf you are looking for Eli Apple, press 3.");
        int cbPosition = input.nextInt();
        if (cbPosition == 1) {
          System.out.println("Jenoris Jenkins was one of the highest rated Corner Backs in the NFL for the 2016 season."
              + "\n He lined up opposite of an oppossing team's best wide reciever and consistently was able to contain them."
              + "\nHe was voted to the Pro Bowl for the 2017 season, meaning he was "
              + "\nvoted by the public as one of the best players at his position.");
        } else if (cbPosition == 2) {
          System.out.println(
              "Dominique Rodgers-Cromartie saw many of his snaps come from the slot position this past season. "
                  + "\nHe is still one of the best man to man cover corners in the NFL"
                  + "\n and was able to snag 6 total interceptions this past season"
                  + "\nincluding a game ending one in the season finale versus the rival Washington Redskins.");
        } else if (cbPosition == 3) {
          System.out.println(
              "Eli Apple was the Giant's first round draft selection in the 2016 draft to the suprise of many. "
                  + "\nDespite being just a rookie, Apple showed vast improvement"
                  + "\n throughout the year and is proving to be a viable option in the future. "
                  + "\nHowever, much of his success can be currently attributed to the"
                  + "\n fantastic players currently surrounding him on the defnesive side of the ball.");
        } else {
          System.out.println("The only valid inputs here are 1, 2, or 3.");
        }
      } // Corner Backs

      // Defensive Line Layer
      if (directionNumberDefense == 5) {
        System.out.println("You have selected Defensive Lineman. Enter 1 for Left End, 2 for Nose Tackle,"
            + "\n 3 for Defensive Tackle, and 4 for Right End.");
        int dLine = input.nextInt();
        if (dLine == 1) {
          System.out.println(" Jason Pierre-Paul is the Left End for the NY Giants. "
              + "\nJPP, blew off a few of his fingers in a fireworks accident, "
              + "\nbut is still a productive player and essential piece of the NY Giants Defense."
              + "\nHe finished the season with 7 sacks");
        } else if (dLine == 2) {
          System.out.println("Damon 'Snacks' Harrison is the Nose Tackle for the NY Giants. "
              + "\nHe was released by the neighboring NY Jets and in his first year as a NY Giant"
              + "\n he was named First Team All Pro Selection, "
              + "\nmeaning he was voted to be the best at his position.");
        } else if (dLine == 3) {
          System.out.println("Johnathan Hankins was another Defensive Tackle for the NY Giants. "
              + "\nHe had a solid season, however, will not be returning to the team in the 2017 season after "
              + "\nsigning with the Colts for a price the Giants would not pay.");
        } else if (dLine == 4) {
          System.out.println("Olivier Vernon is the Right End for the NY Giants. "
              + "\nHe was signed a massive contract coming from the Miami Dolphins and "
              + "\nfinished the season with 8.5 sacks. He is a gifted pass rusher"
              + "\n and a valued member of the Giants defense.");
        } else {
          System.out.println("The only valid inputs here are 1, 2, 3, or 4.");
        }
      } // Defensive linemen

      // Safeties
      if (directionNumberDefense == 3) {
        System.out.println("You have selected Safeties. Enter 1 for Strong Safety." + "\n Enter 2 for Free Safety.");
        int safety = input.nextInt();
        if (safety == 1) {
          System.out.println(" Collins was the best safety in the NFL for the 2016 season."
              + "\nFor a safety, his stats were monstrous totalling 100 tackles, 4 sacks,"
              + "\n5 interceptions, and 1 TD." + "\nHe was voted All Pro 1st Team and to the Pro Bowl.");
        } else if (safety == 2) {
          System.out.println("Leon Hall was the Free Safety for the NY Giants in the 2017 season."
              + "\nThe veteran was signed from the Cincinnati Bengals for the 2017 season."
              + "\nHe had 31 total tackles, 2 sacks, and an interception.");
        } else {
          System.out.println("The only valid inputs here are 1 or 2.");
        }
      } // Safeties

      // Linebackers
      if (directionNumberDefense == 4) {
        System.out
            .println("You have selected Linebackers. Enter 1 for Left Outside Linebacker, 2 for Middle Linebacker,"
                + "\n or 3 for Right Outside Linebacker.");
        int linebacker = input.nextInt();
        if (linebacker == 1) {
          System.out.println("Devon Kenardis the Left Outside Linebacker for the NY Giants."
              + "In 2016 he had 61 tackles, 1 sack, and 1 pass defended.");
        } else if (linebacker == 2) {
          System.out.println("Kelvin Sheppard is the Middle Linebacker for the NY Giants."
              + "\nIn 2016 he had 50 tackles, and 2 passes defended.");
        } else if (linebacker == 3) {
          System.out.println("Jonathan Casillas is the Right Outside Linebacker for the NY Giants."
              + "\nIn 2016 he had 96 tackles, 1.5 sacks, and 8 passes defended");
        } else {
          System.out.println("The only valid inputs here are 1, 2, or 3.");
        }
      } // Linebackers

      // Special Teams Layer
      if (directionNumberSpecialTeams == 1) {
        System.out.println("Please enter 1 for Long Snapper, 2 for Kicker, 3 for Punter.");
        int SpecialTeamsPosition = input.nextInt();
        if (SpecialTeamsPosition == 1) {
          System.out.println("Zak DeOssie is the Long Snapper for the NY Giants. He is a long time veteran "
              + "\nand was apart of both the 2008 and 2011 super bowl winning teams. "
              + "\nHis father, Steve DeOssie was also the long snapper for the NY Giants from 1989 - 1993. "
              + "\nThey are the only father, son duo to win a superbowl for the same franchise in NFL history.");
        } else if (SpecialTeamsPosition == 2) {
          System.out.println("The Kicker position for the NY Giants in the 2016 at first featured Josh Brown, "
              + "\nhowever, due to domestic violence issues he was released by the team. "
              + "\nAfter him, long time Chicago Bear Robbie Gould was the kicker.");
        } else if (SpecialTeamsPosition == 3) {
          System.out.println("Brad Wing is the cool Australian kicker for the NY Giants.");
        } else {
          System.out.println("The only valid inputs here are 1, 2, or 3.");
        }
      } // Special Teams
      System.out.println("\n\n Press 0 to exit and 1 to continue");
      if (input.nextInt() == 0) {
        return;
      }
    }
  } // Method
} // Class
