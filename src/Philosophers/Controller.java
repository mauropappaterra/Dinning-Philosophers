package Philosophers;

import javafx.event.ActionEvent; // All JavaFX imports

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="chopstickSocrates4"
    private ImageView chopstickSocrates4; // Value injected by FXMLLoader

    @FXML // fx:id="noodlesSocrates"
    private ImageView noodlesSocrates; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickConfucius1"
    private ImageView chopstickConfucius1; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickConfucius2"
    private ImageView chopstickConfucius2; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickSocrates0"
    private ImageView chopstickSocrates0; // Value injected by FXMLLoader

    @FXML // fx:id="imgDiminuteNoodleCup14"
    private ImageView imgDiminuteNoodleCup14; // Value injected by FXMLLoader

    @FXML // fx:id="imgDiminuteNoodleCup12"
    private ImageView imgDiminuteNoodleCup12; // Value injected by FXMLLoader

    @FXML // fx:id="imgDiminuteNoodleCup13"
    private ImageView imgDiminuteNoodleCup13; // Value injected by FXMLLoader

    @FXML // fx:id="lblHobbes"
    private Label lblHobbes; // Value injected by FXMLLoader

    @FXML // fx:id="txtConsole"
    private TextArea txtConsole; // Value injected by FXMLLoader

    @FXML // fx:id="bttnReset"
    private Button bttnReset; // Value injected by FXMLLoader

    @FXML // fx:id="lblScoreConfucius"
    public Label lblScoreConfucius; // Value injected by FXMLLoader

    @FXML // fx:id="imgSocrates"
    private ImageView imgSocrates; // Value injected by FXMLLoader

    @FXML // fx:id="imgBackground"
    private ImageView imgBackground; // Value injected by FXMLLoader

    @FXML // fx:id="lblConfucius"
    private Label lblConfucius; // Value injected by FXMLLoader

    @FXML // fx:id="imgHobbes"
    private ImageView imgHobbes; // Value injected by FXMLLoader

    @FXML // fx:id="imgConfucius"
    private ImageView imgConfucius; // Value injected by FXMLLoader

    @FXML // fx:id="noodlesZizek"
    private ImageView noodlesZizek; // Value injected by FXMLLoader

    @FXML // fx:id="lblDescartes"
    private Label lblDescartes; // Value injected by FXMLLoader

    @FXML // fx:id="lblScoreDescartes"
    public Label lblScoreDescartes; // Value injected by FXMLLoader

    @FXML // fx:id="imgIJLogo"
    private ImageView imgIJLogo; // Value injected by FXMLLoader

    @FXML // fx:id="lblScoreHobbes"
    public Label lblScoreHobbes; // Value injected by FXMLLoader

    @FXML // fx:id="imgTable"
    private ImageView imgTable; // Value injected by FXMLLoader

    @FXML // fx:id="imgDiminuteNoodleCup3"
    private ImageView imgDiminuteNoodleCup3; // Value injected by FXMLLoader

    @FXML // fx:id="bttnStop"
    private Button bttnStop; // Value injected by FXMLLoader

    @FXML // fx:id="imgDiminuteNoodleCup2"
    private ImageView imgDiminuteNoodleCup2; // Value injected by FXMLLoader

    @FXML // fx:id="chopstick1"
    private ImageView chopstick1; // Value injected by FXMLLoader

    @FXML // fx:id="chopstick0"
    private ImageView chopstick0; // Value injected by FXMLLoader

    @FXML // fx:id="lblScoreZizek"
    public Label lblScoreZizek; // Value injected by FXMLLoader

    @FXML // fx:id="chopstick3"
    private ImageView chopstick3; // Value injected by FXMLLoader

    @FXML // fx:id="chopstick2"
    private ImageView chopstick2; // Value injected by FXMLLoader

    @FXML // fx:id="noodlesConfucius"
    private ImageView noodlesConfucius; // Value injected by FXMLLoader

    @FXML // fx:id="chopstick4"
    private ImageView chopstick4; // Value injected by FXMLLoader

    @FXML // fx:id="imgSmallNoodleCup2"
    private ImageView imgSmallNoodleCup2; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickDescartes2"
    private ImageView chopstickDescartes2; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickDescartes3"
    private ImageView chopstickDescartes3; // Value injected by FXMLLoader

    @FXML // fx:id="imgSmallNoodleCup1"
    private ImageView imgSmallNoodleCup1; // Value injected by FXMLLoader

    @FXML // fx:id="imgBigNoodleCup"
    private ImageView imgBigNoodleCup; // Value injected by FXMLLoader

    @FXML // fx:id="imgSmallNoodleCup0"
    private ImageView imgSmallNoodleCup0; // Value injected by FXMLLoader

    @FXML // fx:id="imgZizez"
    private ImageView imgZizez; // Value injected by FXMLLoader

    @FXML // fx:id="lblScoreSocrates"
    private Label lblScoreSocrates; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickZizek4"
    private ImageView chopstickZizek4; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickHobbes0"
    private ImageView chopstickHobbes0; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickZizek3"
    private ImageView chopstickZizek3; // Value injected by FXMLLoader

    @FXML // fx:id="chopstickHobbes1"
    private ImageView chopstickHobbes1; // Value injected by FXMLLoader

    @FXML // fx:id="panel"
    private Pane panel; // Value injected by FXMLLoader

    @FXML // fx:id="imgSmallNoodleCup4"
    private ImageView imgSmallNoodleCup4; // Value injected by FXMLLoader

    @FXML // fx:id="imgSmallNoodleCup3"
    private ImageView imgSmallNoodleCup3; // Value injected by FXMLLoader

    @FXML // fx:id="lblZizek"
    private Label lblZizek; // Value injected by FXMLLoader

    @FXML // fx:id="imgChopsitcksBackground"
    private ImageView imgChopsitcksBackground; // Value injected by FXMLLoader

    @FXML // fx:id="imgDescartes"
    private ImageView imgDescartes; // Value injected by FXMLLoader

    @FXML // fx:id="noodlesHobbes"
    private ImageView noodlesHobbes; // Value injected by FXMLLoader

    @FXML // fx:id="lblSocrates"
    private Label lblSocrates; // Value injected by FXMLLoader

    @FXML // fx:id="bttnStart"
    private Button bttnStart; // Value injected by FXMLLoader

    @FXML // fx:id="lblTitle"
    private Label lblTitle; // Value injected by FXMLLoader

    @FXML // fx:id="noodlesDescartes"
    private ImageView noodlesDescartes; // Value injected by FXMLLoader

    @FXML // fx:id="lblBTYB"
    private Label lblBTYB; // Value injected by FXMLLoader

    Philosopher[] philosophers = new Philosopher[5]; // Array of Philosophers.
    ExecutorService executorService = Executors.newFixedThreadPool(5); // each philosophers has its own thread.
    ReentrantLock[] chopsticks = new ReentrantLock[5]; // Array of chopsticks. Chopsticks are locks.
    String aux = "";

    //int counterHobbes = 100;
    //int counterConfucius = 0;
    //int counterDescarters = 0;
    //int counterZizek = 0;
    //int counterSocrates = 0;

    @FXML
    void clickStart(ActionEvent event) { // Start Simulation

        imgSmallNoodleCup0.setVisible(true);
        imgSmallNoodleCup1.setVisible(true);
        imgSmallNoodleCup2.setVisible(true);
        imgSmallNoodleCup3.setVisible(true);
        imgSmallNoodleCup4.setVisible(true);

        chopstick0.setVisible(true);
        chopstick1.setVisible(true);
        chopstick2.setVisible(true);
        chopstick3.setVisible(true);
        chopstick4.setVisible(true);

        bttnReset.setDisable(true);
        bttnStop.setDisable(false);
        bttnStart.setDisable(true);

        //lblScoreHobbes.setText("x " + 1);

        aux = txtConsole.getText();
        txtConsole.setText("INITIALIZING SIMULATION...\n\n" + txtConsole.getText());

        for (int j = 0; j < 5; j++){
            executorService.execute(philosophers[j]); // start all threads
        }

    }

    @FXML
    public synchronized void clickStop(ActionEvent event) throws IOException { // I DO NOT UNDERSTAND WHY THIS IS NOT WORKING
/*
        bttnReset.setDisable(9false);
        bttnStop.setDisable(true);

            for (Philosopher philosopher : philosophers){
                philosopher.stop();
            }



        try {

            executorService.shutdown();
            Thread.sleep(50000); // finish all threads

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            */
    }

        @FXML
    void clickReset(ActionEvent event) {
/*
        bttnReset.setDisable(true);
        bttnStop.setDisable(true);
        bttnStart.setDisable(false);

        txtConsole.clear();

        noodlesConfucius.setVisible(false);
        noodlesHobbes.setVisible(false);
        noodlesSocrates.setVisible(false);
        noodlesZizek.setVisible(false);
        noodlesDescartes.setVisible(false);

        chopstickConfucius1.setVisible(false);
        chopstickConfucius2.setVisible(false);
        chopstickHobbes1.setVisible(false);
        chopstickHobbes0.setVisible(false);
        chopstickSocrates4.setVisible(false);
        chopstickSocrates0.setVisible(false);
        chopstickZizek3.setVisible(false);
        chopstickZizek4.setVisible(false);
        chopstickDescartes2.setVisible(false);
        chopstickDescartes3.setVisible(false);

        initialize();
                    */
    }




    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert chopstickSocrates4 != null : "fx:id=\"chopstickSocrates4\" was not injected: check your FXML file 'dinning.fxml'.";
        assert noodlesSocrates != null : "fx:id=\"noodlesSocrates\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickConfucius1 != null : "fx:id=\"chopstickConfucius1\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickConfucius2 != null : "fx:id=\"chopstickConfucius2\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickSocrates0 != null : "fx:id=\"chopstickSocrates0\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgDiminuteNoodleCup14 != null : "fx:id=\"imgDiminuteNoodleCup14\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgDiminuteNoodleCup12 != null : "fx:id=\"imgDiminuteNoodleCup12\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgDiminuteNoodleCup13 != null : "fx:id=\"imgDiminuteNoodleCup13\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblHobbes != null : "fx:id=\"lblHobbes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert txtConsole != null : "fx:id=\"txtConsole\" was not injected: check your FXML file 'dinning.fxml'.";
        assert bttnReset != null : "fx:id=\"bttnReset\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblScoreConfucius != null : "fx:id=\"lblScoreConfucius\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgSocrates != null : "fx:id=\"imgSocrates\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgBackground != null : "fx:id=\"imgBackground\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblConfucius != null : "fx:id=\"lblConfucius\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgHobbes != null : "fx:id=\"imgHobbes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgConfucius != null : "fx:id=\"imgConfucius\" was not injected: check your FXML file 'dinning.fxml'.";
        assert noodlesZizek != null : "fx:id=\"noodlesZizek\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblDescartes != null : "fx:id=\"lblDescartes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblScoreDescartes != null : "fx:id=\"lblScoreDescartes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgIJLogo != null : "fx:id=\"imgIJLogo\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblScoreHobbes != null : "fx:id=\"lblScoreHobbes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgTable != null : "fx:id=\"imgTable\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgDiminuteNoodleCup3 != null : "fx:id=\"imgDiminuteNoodleCup3\" was not injected: check your FXML file 'dinning.fxml'.";
        assert bttnStop != null : "fx:id=\"bttnStop\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgDiminuteNoodleCup2 != null : "fx:id=\"imgDiminuteNoodleCup2\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstick1 != null : "fx:id=\"chopstick1\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstick0 != null : "fx:id=\"chopstick0\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblScoreZizek != null : "fx:id=\"lblScoreZizek\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstick3 != null : "fx:id=\"chopstick3\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstick2 != null : "fx:id=\"chopstick2\" was not injected: check your FXML file 'dinning.fxml'.";
        assert noodlesConfucius != null : "fx:id=\"noodlesConfucius\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstick4 != null : "fx:id=\"chopstick4\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgSmallNoodleCup2 != null : "fx:id=\"imgSmallNoodleCup2\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickDescartes2 != null : "fx:id=\"chopstickDescartes2\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickDescartes3 != null : "fx:id=\"chopstickDescartes3\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgSmallNoodleCup1 != null : "fx:id=\"imgSmallNoodleCup1\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgBigNoodleCup != null : "fx:id=\"imgBigNoodleCup\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgSmallNoodleCup0 != null : "fx:id=\"imgSmallNoodleCup0\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgZizez != null : "fx:id=\"imgZizez\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblScoreSocrates != null : "fx:id=\"lblScoreSocrates\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickZizek4 != null : "fx:id=\"chopstickZizek4\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickHobbes0 != null : "fx:id=\"chopstickHobbes0\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickZizek3 != null : "fx:id=\"chopstickZizek3\" was not injected: check your FXML file 'dinning.fxml'.";
        assert chopstickHobbes1 != null : "fx:id=\"chopstickHobbes1\" was not injected: check your FXML file 'dinning.fxml'.";
        assert panel != null : "fx:id=\"panel\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgSmallNoodleCup4 != null : "fx:id=\"imgSmallNoodleCup4\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgSmallNoodleCup3 != null : "fx:id=\"imgSmallNoodleCup3\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblZizek != null : "fx:id=\"lblZizek\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgChopsitcksBackground != null : "fx:id=\"imgChopsitcksBackground\" was not injected: check your FXML file 'dinning.fxml'.";
        assert imgDescartes != null : "fx:id=\"imgDescartes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert noodlesHobbes != null : "fx:id=\"noodlesHobbes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblSocrates != null : "fx:id=\"lblSocrates\" was not injected: check your FXML file 'dinning.fxml'.";
        assert bttnStart != null : "fx:id=\"bttnStart\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblTitle != null : "fx:id=\"lblTitle\" was not injected: check your FXML file 'dinning.fxml'.";
        assert noodlesDescartes != null : "fx:id=\"noodlesDescartes\" was not injected: check your FXML file 'dinning.fxml'.";
        assert lblBTYB != null : "fx:id=\"lblBTYB\" was not injected: check your FXML file 'dinning.fxml'.";

        for (int i = 0; i < 5; i++){
            chopsticks [i] = new ReentrantLock(); // fill chopsticks array
        }

        philosophers[0] = new Philosopher("Thomas Hobbes", chopsticks[0], chopsticks[1]); // Table layout
        philosophers[1] = new Philosopher("Confucius", chopsticks[1], chopsticks[2]);
        philosophers[2] = new Philosopher("René Descartes", chopsticks[2], chopsticks[3]);
        philosophers[3] = new Philosopher("Slavoj Žižek", chopsticks[3], chopsticks[4]);
        philosophers[4] = new Philosopher("Socrates", chopsticks[4], chopsticks[0]);

        imgSmallNoodleCup0.setVisible(false);
        imgSmallNoodleCup1.setVisible(false);
        imgSmallNoodleCup2.setVisible(false);
        imgSmallNoodleCup3.setVisible(false);
        imgSmallNoodleCup4.setVisible(false);

        chopstick0.setVisible(false);
        chopstick1.setVisible(false);
        chopstick2.setVisible(false);
        chopstick3.setVisible(false);
        chopstick4.setVisible(false);

        bttnReset.setVisible(false);
        bttnStop.setVisible(false);
        bttnStart.setText("Start Simulation");

    }

    public class Philosopher implements Runnable { // Philosophers Class starts here

        private String name;
        private ReentrantLock leftChopstick;
        private ReentrantLock rightChopstick;
        private int platesEaten = 0;
        String aux = "";

        public AtomicBoolean isFull = new AtomicBoolean(false);
        private Random generateRandom = new Random(); // Randomizer

        public Philosopher(String newPhilosopher, ReentrantLock leftChopstick, ReentrantLock rightChopstick) { // Constructor Method
            this.name = newPhilosopher;
            this.leftChopstick = leftChopstick;
            this.rightChopstick = rightChopstick;
        }

        public String getName(){
            return this.name;
        }
        public int getPlatesEaten(){
            return platesEaten;
        }

        @Override
        public void run() {

            while ( !isFull.get()) {
                try {
                    think();
                    if (pickupLeftChopstick() && pickupRightChopstick()) {
                        eat();
                    }
                    putDownChopSticks();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        private void think() throws InterruptedException {
            System.out.println(this.getName()+ " is thinking...");
            System.out.flush();

            Thread.sleep(generateRandom.nextInt(5000));

            this.updateGUI("thinking");


        }

        private void eat() throws InterruptedException {
            System.out.println(this.getName() + " is eating. *nom nom burp*...");
            System.out.flush();

            this.platesEaten++;

            Thread.sleep(generateRandom.nextInt(5000));

            this.updateGUI("eating");

        }

        private boolean pickupLeftChopstick() throws InterruptedException {
            if (leftChopstick.tryLock(10, TimeUnit.MILLISECONDS)) {
                System.out.println(this.getName()+ " picked up the left chopstick.");
                System.out.flush();

                Thread.sleep(1000);
                updateGUI("pickLeft");

                return true;
            }
            return false;
        }

        private boolean pickupRightChopstick() throws InterruptedException {
            if (rightChopstick.tryLock(10, TimeUnit.MILLISECONDS)) {
                System.out.println(this.getName() + " picked up the right chopstick.");
                System.out.flush();

                Thread.sleep(1000);
                updateGUI("pickRight");

                return true;
            }
            return false;
        }

        private void putDownChopSticks() throws InterruptedException {

            if (leftChopstick.isHeldByCurrentThread()) {
                leftChopstick.unlock();
                System.out.println(this.getName() + " put down the left chopstick.");
                System.out.flush();

                Thread.sleep(1000);
                updateGUI("downLeft");
            }

            if (rightChopstick.isHeldByCurrentThread()) {
                rightChopstick.unlock();
                System.out.println(this.getName() + " put down the right chopstick.");
                System.out.flush();

                Thread.sleep(1000);
                updateGUI("downRight");
            }
        }

        private void updateGUI(String action)throws InterruptedException {

            if (action.equals("eating")){

                if (this.getName().equals("Thomas Hobbes")){
                    noodlesHobbes.setVisible(true);
                    //Thread.sleep(1000);
                    //lblScoreHobbes.setText("x " + this.getPlatesEaten()); // I DO NOT UNDERSTAND WHY THIS IS NOT WORKING
                }

                if (this.getName().equals("Confucius")){
                    noodlesConfucius.setVisible(true);
                   //lblScoreConfucius.setText("x " + this.getPlatesEaten());
                }

                if (this.getName().equals("René Descartes")){
                    noodlesDescartes.setVisible(true);
                    //lblScoreDescartes.setText("x " + this.getPlatesEaten());
                }

                if (this.getName().equals("Slavoj Žižek")){
                    noodlesZizek.setVisible(true);
                    //lblScoreZizek.setText("x " + this.getPlatesEaten());
                }

                if (this.getName().equals("Socrates")){
                    noodlesSocrates.setVisible(true);
                    //lblScoreSocrates.setText("x " + this.getPlatesEaten());
                }

                aux = txtConsole.getText();
                txtConsole.setText(this.getName()+ " is eating. *nom nom burp*...\n" + aux);
            }

            if (action.equals("thinking")){

                if (this.getName().equals("Thomas Hobbes")){
                    noodlesHobbes.setVisible(false);
                }

                if (this.getName().equals("Confucius")){
                    noodlesConfucius.setVisible(false);
                }

                if (this.getName().equals("René Descartes")){
                    noodlesDescartes.setVisible(false);
                }

                if (this.getName().equals("Slavoj Žižek")){
                    noodlesZizek.setVisible(false);
                }

                if (this.getName().equals("Socrates")){
                    noodlesSocrates.setVisible(false);
                }

                aux = txtConsole.getText();
                txtConsole.setText(this.getName() + " is thinking...\n" + aux);
            }

            if (action.equals("pickLeft")){

                if (this.getName().equals("Thomas Hobbes")){
                    chopstick0.setVisible(false);
                    chopstickHobbes0.setVisible(true);
                }

                if (this.getName().equals("Confucius")){
                    chopstick1.setVisible(false);
                    chopstickConfucius1.setVisible(true);
                }

                if (this.getName().equals("René Descartes")){
                    chopstick2.setVisible(false);
                    chopstickDescartes2.setVisible(true);
                }

                if (this.getName().equals("Slavoj Žižek")){
                    chopstick3.setVisible(false);
                    chopstickZizek3.setVisible(true);
                }

                if (this.getName().equals("Socrates")){
                    chopstick4.setVisible(false);
                    chopstickSocrates4.setVisible(true);
                }

                aux = txtConsole.getText();
                txtConsole.setText(this.getName() + " picked up the left chopstick.\n" + aux);
            }

            if (action.equals("pickRight")){

                if (this.getName().equals("Thomas Hobbes")){
                    chopstick1.setVisible(false);
                    chopstickHobbes1.setVisible(true);
                    noodlesHobbes.setVisible(true);
                }

                if (this.getName().equals("Confucius")){
                    chopstick2.setVisible(false);
                    chopstickConfucius2.setVisible(true);
                    noodlesConfucius.setVisible(true);
                }

                if (this.getName().equals("René Descartes")){
                    chopstick3.setVisible(false);
                    chopstickDescartes3.setVisible(true);
                    noodlesDescartes.setVisible(true);
                }

                if (this.getName().equals("Slavoj Žižek")){
                    chopstick4.setVisible(false);
                    chopstickZizek4.setVisible(true);
                    noodlesZizek.setVisible(true);
                }

                if (this.getName().equals("Socrates")){
                    chopstick0.setVisible(false);
                    chopstickSocrates0.setVisible(true);
                    noodlesSocrates.setVisible(true);
                }

                aux = txtConsole.getText();
                txtConsole.setText(this.getName() + " picked up the right chopstick.\n" + aux);
            }

            if (action.equals("downLeft")){

                if (this.getName().equals("Thomas Hobbes")){
                    chopstick0.setVisible(true);
                    chopstickHobbes0.setVisible(false);
                }

                if (this.getName().equals("Confucius")){
                    chopstick1.setVisible(true);
                    chopstickConfucius1.setVisible(false);
                }

                if (this.getName().equals("René Descartes")){
                    chopstick2.setVisible(true);
                    chopstickDescartes2.setVisible(false);
                }

                if (this.getName().equals("Slavoj Žižek")){
                    chopstick3.setVisible(true);
                    chopstickZizek3.setVisible(false);
                }

                if (this.getName().equals("Socrates")){
                    chopstick4.setVisible(true);
                    chopstickSocrates4.setVisible(false);
                }

                aux = txtConsole.getText();
                txtConsole.setText(this.getName() + " put down the left chopstick.\n" + aux);
            }

            if (action.equals("downRight")){

                if (this.getName().equals("Thomas Hobbes")){
                    chopstick1.setVisible(true);
                    chopstickHobbes1.setVisible(false);
                    noodlesHobbes.setVisible(false);
                }

                if (this.getName().equals("Confucius")){
                    chopstick2.setVisible(true);
                    chopstickConfucius2.setVisible(false);
                    noodlesConfucius.setVisible(false);
                }

                if (this.getName().equals("René Descartes")){
                    chopstick3.setVisible(true);
                    chopstickDescartes3.setVisible(false);
                    noodlesDescartes.setVisible(false);
                }

                if (this.getName().equals("Slavoj Žižek")){
                    chopstick4.setVisible(true);
                    chopstickZizek4.setVisible(false);
                    noodlesZizek.setVisible(false);
                }

                if (this.getName().equals("Socrates")){
                    chopstick0.setVisible(true);
                    chopstickSocrates0.setVisible(false);
                    noodlesSocrates.setVisible(false);
                }

                aux = txtConsole.getText();
                txtConsole.setText(this.getName() + " put down the right chopstick.\n" + aux);
            }
        }
    }
}