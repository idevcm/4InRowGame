package Execution;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

/**
 * The type Execute.
 */
public class ExecutionProgram {
    private String playerOneName;
    private String playerTwoName;
    /**
     * runs the application.
     */
    protected void run() {
        borrowScreen();

        enterNamePlayers();

        borrowScreen();

        PlayGame software = new PlayGame();
        software.playGame(playerOneName, playerTwoName);

        finalMessage();

    }

    /**
     * Borrow the screen on powershell
     */
    private void borrowScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * This method declares the names of the two players, which are requested to be input through the keyboard.
     */
    private void enterNamePlayers() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("../sonidos/metroid.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(clip.LOOP_CONTINUOUSLY);
            printData("### 4 IN A ROW ###");
            System.out.println();
            playerOneName = enterName(1);
            System.out.println();
            playerTwoName = enterName(2);
            clip.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     *This method functions like a println(), except that the letters
     * are printed at a specific speed alongside a keyboard sound.
     *
     * @param text That which you want to print
     */
    protected void printData(String text) {
        int i = 0;

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("../sonidos/sonidoTexto.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            while (i < text.length()) {
                System.out.print(text.charAt(i));
                i++;
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            clip.stop();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *This method is used to enter the names of the players,
     * and is linked to the enterNamePlayers method.
     *
     * @param turn Player's turn
     * @return Player's name
     */
    private String enterName(int turn) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                printData("Welcome player " + turn + "!! Or better yet... How would you like me to call you?");
                String name = sc.nextLine();
                printData("So your name is " + name + ", I'll call you that then.");
                return name;
            } catch (Exception e) {
                printData("Please enter a valid name");
            }
        }
    }

    /**
     * This method prints a gratitude message, I'm using an infinite loop to keep
     * the audio playing once the text has finished printing.
     */
    private void finalMessage(){
        int i = 0;

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("../sonidos/final.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }catch (Exception e){
            e.printStackTrace();
        }

        while (true){
            try{
                if(i == 0){
                    System.out.println();

                    printData(playerOneName + ", " + playerTwoName + "... Thank you for downloading this game. ");
                    printData("I'm only a spanish student who wants to improve and be a better programmer and" +
                            "enjoys learning a little bit everyday. ");

                    System.out.println();

                    printData("I hope you have enjoyed this game, I know it still has room for improvement, so " +
                            "I would appreciate any feedback you can provide.");

                    System.out.println();

                    printData("¡¡¡ Muchas gracias !!!");
                    i++;
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
