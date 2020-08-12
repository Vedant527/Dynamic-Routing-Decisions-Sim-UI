package drd.intern.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MyController{

    public String merchantNumber;
    public int bin_Counter = 1;
    public int midnwid_Counter = 1;
    public int binnwid_Counter10 = 1;
    public int binnwid_Counter20 = 1;
    public int binnwid_Counter30 = 1;
    public int binnwid_Counter40 = 1;
    public int bucket_Counter = 1;
    //Bin row 1 parsed values
    public long BIN1;
    public int BINLEN1;
    public String BINNWID10;
    public String BINNWID1_L;
    public String BINNWID11;
    public String BINNWID11_L;
    public String BINNWID12;
    public String BINNWID12_L;
    public String BINNWID13;
    public String BINNWID13_L;
    public String BINNWID14;
    public String BINNWID14_L;
    public String BINNWID15;
    public String BINNWID15_L;
    public String BINNWID16;
    public String BINNWID16_L;
    //Bin Row 1 FXML Values
    @FXML TextField BIN10;
    @FXML TextField BINLEN_1;
    @FXML TextField BINNWID_10;
    @FXML TextField BINNWID_11;
    @FXML TextField BINNWID_12;
    @FXML TextField BINNWID_13;
    @FXML TextField BINNWID_14;
    @FXML TextField BINNWID_15;
    @FXML TextField BINNWID_16;
    //Bin Row 2 parsed values
    public long BIN2;
    public int BINLEN2;
    public String BINNWID20;
    public String BINNWID2_L;
    public String BINNWID21;
    public String BINNWID21_L;
    public String BINNWID22;
    public String BINNWID22_L;
    public String BINNWID23;
    public String BINNWID23_L;
    public String BINNWID24;
    public String BINNWID24_L;
    public String BINNWID25;
    public String BINNWID25_L;
    public String BINNWID26;
    public String BINNWID26_L;
    //Bin Row 2 FXML Values
    @FXML TextField BIN20;
    @FXML TextField BINLEN_2;
    @FXML TextField BINNWID_20;
    @FXML TextField BINNWID_21;
    @FXML TextField BINNWID_22;
    @FXML TextField BINNWID_23;
    @FXML TextField BINNWID_24;
    @FXML TextField BINNWID_25;
    @FXML TextField BINNWID_26;
    //Bin Row 3 parsed values
    public long BIN3;
    public int BINLEN3;
    public String BINNWID30;
    public String BINNWID3_L;
    public String BINNWID31;
    public String BINNWID31_L;
    public String BINNWID32;
    public String BINNWID32_L;
    public String BINNWID33;
    public String BINNWID33_L;
    public String BINNWID34;
    public String BINNWID34_L;
    public String BINNWID35;
    public String BINNWID35_L;
    public String BINNWID36;
    public String BINNWID36_L;
    //Bin Row 3 FXML Values
    @FXML TextField BIN30;
    @FXML TextField BINLEN_3;
    @FXML TextField BINNWID_30;
    @FXML TextField BINNWID_31;
    @FXML TextField BINNWID_32;
    @FXML TextField BINNWID_33;
    @FXML TextField BINNWID_34;
    @FXML TextField BINNWID_35;
    @FXML TextField BINNWID_36;
    //Bin Row 4 parsed values
    public long BIN4;
    public int BINLEN4;
    public String BINNWID40;
    public String BINNWID4_L;
    public String BINNWID41;
    public String BINNWID41_L;
    public String BINNWID42;
    public String BINNWID42_L;
    public String BINNWID43;
    public String BINNWID43_L;
    public String BINNWID44;
    public String BINNWID44_L;
    public String BINNWID45;
    public String BINNWID45_L;
    public String BINNWID46;
    public String BINNWID46_L;
    //Bin Row 4 FXML Values
    @FXML TextField BIN40;
    @FXML TextField BINLEN_4;
    @FXML TextField BINNWID_40;
    @FXML TextField BINNWID_41;
    @FXML TextField BINNWID_42;
    @FXML TextField BINNWID_43;
    @FXML TextField BINNWID_44;
    @FXML TextField BINNWID_45;
    @FXML TextField BINNWID_46;
    //Merchant NWIDID and MID FXML Values
    @FXML TextField MID;
    @FXML TextField MIDNWID_0;
    @FXML TextField MIDNWID_1;
    @FXML TextField MIDNWID_2;
    @FXML TextField MIDNWID_3;
    @FXML TextField MIDNWID_4;
    @FXML TextField MIDNWID_5;
    @FXML TextField MIDNWID_6;
    //Merchant NWIDID parsed values
    public String MIDNWID0;
    public String MIDNWID1;
    public String MIDNWID2;
    public String MIDNWID3;
    public String MIDNWID4;
    public String MIDNWID5;
    public String MIDNWID6;
    @FXML Button BIN_ADD;
    @FXML Button BIN_REMOVE;
    @FXML Button MIDNWID_ADD;
    @FXML Button MIDNWID_REMOVE;
    @FXML Button BINNWID_ADD_1;
    @FXML Button BINNWID_REMOVE_1;
    @FXML Button BINNWID_ADD_2;
    @FXML Button BINNWID_REMOVE_2;
    @FXML Button BINNWID_ADD_3;
    @FXML Button BINNWID_REMOVE_3;
    @FXML Button BINNWID_ADD_4;
    @FXML Button BINNWID_REMOVE_4;
    @FXML Button BUILD;
    @FXML Button CLEAR;
    @FXML GridPane BINPANE11;
    @FXML GridPane BINPANE111;
    @FXML GridPane BINPANE1111;
    @FXML Button BUCKET_ADD;
    @FXML Button BUCKET_REMOVE;
    //Buckets
    @FXML GridPane BUCKET1;
    @FXML GridPane BUCKET2;
    @FXML GridPane BUCKET3;
    @FXML GridPane BUCKET4;
    @FXML GridPane BUCKET5;
    @FXML GridPane BUCKET6;
    //BUCKET SET 1
    @FXML TextField BUCKET_MIN_1;
    @FXML TextField BUCKET_MAX_1;
    @FXML TextField BUCKET_NWID_1;
    @FXML TextField BUCKET_NWID_11;
    @FXML TextField BUCKET_NWID_111;
    @FXML TextField BUCKET_NWID_1111;
    public int BUCKETMIN1;
    public int BUCKETMAX1;
    public int BUCKETNWID1;
    public int BUCKETNWID11;
    public int BUCKETNWID111;
    public int BUCKETNWID1111;
    //BUCKET SET 2
    @FXML TextField BUCKET_MIN_2;
    @FXML TextField BUCKET_MAX_2;
    @FXML TextField BUCKET_NWID_2;
    @FXML TextField BUCKET_NWID_22;
    @FXML TextField BUCKET_NWID_222;
    @FXML TextField BUCKET_NWID_2222;
    public int BUCKETMIN2;
    public int BUCKETMAX2;
    public int BUCKETNWID2;
    public int BUCKETNWID22;
    public int BUCKETNWID222;
    public int BUCKETNWID2222;
    //BUCKET SET 3
    @FXML TextField BUCKET_MIN_3;
    @FXML TextField BUCKET_MAX_3;
    @FXML TextField BUCKET_NWID_3;
    @FXML TextField BUCKET_NWID_33;
    @FXML TextField BUCKET_NWID_333;
    @FXML TextField BUCKET_NWID_3333;
    public int BUCKETMIN3;
    public int BUCKETMAX3;
    public int BUCKETNWID3;
    public int BUCKETNWID33;
    public int BUCKETNWID333;
    public int BUCKETNWID3333;
    //BUCKET SET 4
    @FXML TextField BUCKET_MIN_4;
    @FXML TextField BUCKET_MAX_4;
    @FXML TextField BUCKET_NWID_4;
    @FXML TextField BUCKET_NWID_44;
    @FXML TextField BUCKET_NWID_444;
    @FXML TextField BUCKET_NWID_4444;
    public int BUCKETMIN4;
    public int BUCKETMAX4;
    public int BUCKETNWID4;
    public int BUCKETNWID44;
    public int BUCKETNWID444;
    public int BUCKETNWID4444;
    //BUCKET SET 5
    @FXML TextField BUCKET_MIN_5;
    @FXML TextField BUCKET_MAX_5;
    @FXML TextField BUCKET_NWID_5;
    @FXML TextField BUCKET_NWID_55;
    @FXML TextField BUCKET_NWID_555;
    @FXML TextField BUCKET_NWID_5555;
    public int BUCKETMIN5;
    public int BUCKETMAX5;
    public int BUCKETNWID5;
    public int BUCKETNWID55;
    public int BUCKETNWID555;
    public int BUCKETNWID5555;
    //BUCKET SET 6
    @FXML TextField BUCKET_MIN_6;
    @FXML TextField BUCKET_MAX_6;
    @FXML TextField BUCKET_NWID_6;
    @FXML TextField BUCKET_NWID_66;
    @FXML TextField BUCKET_NWID_666;
    @FXML TextField BUCKET_NWID_6666;
    public int BUCKETMIN6;
    public int BUCKETMAX6;
    public int BUCKETNWID6;
    public int BUCKETNWID66;
    public int BUCKETNWID666;
    public int BUCKETNWID6666;
    //Host and Port
    @FXML TextField HOST;
    @FXML TextField PORT;
    @FXML Button HELP;
    public String host;
    public int port;
    //Errors
    @FXML Label MID_ERROR;
    @FXML Label BIN_ERROR;
    @FXML Label BINLENGTH_ERROR;
    @FXML Label BINNWID_ERROR;
    @FXML Label BUCKET_ERROR;
    @FXML Label BucketBoundLabel;
    @FXML Label BucketNWIDBoundLabel;
    public boolean midError1,midError2,midError3,midError4,midError5,midError6,midError7,midError8;
    public boolean binError1,binError2,binError3,binError4;
    public boolean lengthError1,lengthError2,lengthError3,lengthError4;
    public boolean binnwidError1,binnwidError2,binnwidError3,binnwidError4,binnwidError5,binnwidError6,
            binnwidError7,binnwidError8,binnwidError9,binnwidError10,binnwidError11,binnwidError12,binnwidError13,
            binnwidError14,binnwidError15,binnwidError16,binnwidError17,binnwidError18,binnwidError19,binnwidError20,
            binnwidError21,binnwidError22,binnwidError23,binnwidError24,binnwidError25,binnwidError26,binnwidError27,binnwidError28;
    public boolean bucketError;
    public boolean[] clearAll = {midError1,midError2,midError3,midError4,midError5,midError6,midError7,midError8,
            binError1,binError2,binError3,binError4,lengthError1,lengthError2,lengthError3,lengthError4,
            binnwidError1,binnwidError2,binnwidError3,binnwidError4,binnwidError5,binnwidError6,
            binnwidError7,binnwidError8,binnwidError9,binnwidError10,binnwidError11,binnwidError12,binnwidError13,
            binnwidError14,binnwidError15,binnwidError16,binnwidError17,binnwidError18,binnwidError19,binnwidError20,
            binnwidError21,binnwidError22,binnwidError23,binnwidError24,binnwidError25,binnwidError26,binnwidError27};
    public boolean mandatory1, mandatory2,mandatory3,mandatory4,mandatory5,mandatory6,mandatory7,mandatory8,mandatory9,mandatory10;

    public void initialize() {
        if(new File("C:/Users/" + userName + "/Documents/drd-gui-data.txt").isFile()) {
            readData();
        }

        final Tooltip tooltipBuild = new Tooltip();
        tooltipBuild.setText("Generate Event");
        BUILD.setTooltip(tooltipBuild);

        final Tooltip tooltipBin_1 = new Tooltip();
        tooltipBin_1.setText("Enter A Bin Number");
        BIN10.setTooltip(tooltipBin_1);

        final Tooltip tooltipMID_1 = new Tooltip();
        tooltipMID_1.setText("Enter Merchant ID Number");
        MID.setTooltip(tooltipMID_1);

        final Tooltip tooltipBIN_NWID_1 = new Tooltip();
        tooltipBIN_NWID_1.setText("Enter A BIN Network ID e.g. 41,E");
        BINNWID_10.setTooltip(tooltipBIN_NWID_1);

        final Tooltip tooltipClear = new Tooltip();
        tooltipClear.setText("Clear All Entries");
        CLEAR.setTooltip(tooltipClear);

        final Tooltip tooltipMID_NWID_1 = new Tooltip();
        tooltipMID_NWID_1.setText("Enter A Merchant Network ID");
        MIDNWID_0.setTooltip(tooltipMID_NWID_1);

        final Tooltip tooltipMID_NWID_ADD = new Tooltip();
        tooltipMID_NWID_ADD.setText("Add Merchant NWID");
        MIDNWID_ADD.setTooltip(tooltipMID_NWID_ADD);

        final Tooltip tooltipBINLEN1 = new Tooltip();
        tooltipBINLEN1.setText("Enter Bin# Length");
        BINLEN_1.setTooltip(tooltipBINLEN1);

        final Tooltip tooltipBUCKETMAX1 = new Tooltip();
        tooltipBUCKETMAX1.setText("Enter Bucket Upper Boundary");
        BUCKET_MAX_1.setTooltip(tooltipBUCKETMAX1);

        final Tooltip tooltipBUCKETMIN1 = new Tooltip();
        tooltipBUCKETMIN1.setText("Enter Bucket Lower Boundary");
        BUCKET_MIN_1.setTooltip(tooltipBUCKETMIN1);



    }
    @FXML
    public void handleButtonClick(ActionEvent event) {

        if(event.getSource() == BUILD){
            whiteoutBuckets();
            whiteoutBucketNWIDS();

            closeUnused();
            setFieldsMid();
            setFieldsBin1();
            if(BIN20.isVisible())
                setFieldsBin2();
            if(BIN30.isVisible())
                setFieldsBin3();
            if(BIN40.isVisible())
                setFieldsBin4();

            setFieldsBuckets1();
            if(BUCKET2.isVisible()) {
                setFieldsBuckets2();
            }
            if(BUCKET3.isVisible()) {
                setFieldsBuckets3();
            }
            if(BUCKET4.isVisible()) {
                setFieldsBuckets4();
            }
            if(BUCKET5.isVisible()) {
                setFieldsBuckets5();
            }
            if(BUCKET6.isVisible()) {
                setFieldsBuckets6();
            }

            if(binnwidError1||binnwidError2||binnwidError3||binnwidError4||binnwidError5||binnwidError6||binnwidError7||
                    binnwidError8||binnwidError9||binnwidError10||binnwidError11||binnwidError12|binnwidError13||
                    binnwidError14||binnwidError15||binnwidError16||binnwidError17||binnwidError18||binnwidError19||binnwidError20||
                    binnwidError21||binnwidError22||binnwidError23||binnwidError24||binnwidError25||binnwidError26||binnwidError27||binnwidError28){
                BINNWID_ERROR.setVisible(true);
            } else{
                BINNWID_ERROR.setVisible(false);
            }

            if(binError1|| binError2 || binError3 || binError4) {
                BIN_ERROR.setVisible(true);
            } else{
                BIN_ERROR.setVisible(false);
            }

            if(lengthError1||lengthError2 || lengthError3 || lengthError4) {
                BINLENGTH_ERROR.setVisible(true);
            } else {
                BINLENGTH_ERROR.setVisible(false);
            }

            checkBuckets();
            mandatory10 = checkBucketNWIDs();
            ArrayList<Bucket> finalBucketsBuild = bucketLogic();

            boolean mandatoryFields = false;
            if(mandatory1||mandatory2||mandatory3||mandatory4||mandatory5||mandatory6||mandatory7||mandatory8||mandatory9||mandatory10){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Missing Required Fields");
                alert.setHeaderText(null);
                alert.setContentText("Please enter valid values in the highlighted fields");
                alert.showAndWait();

            } else {
                mandatoryFields = true;
            }
            if(!(BINNWID_ERROR.isVisible() || BIN_ERROR.isVisible() || BINLENGTH_ERROR.isVisible() || BucketBoundLabel.isVisible() || BucketNWIDBoundLabel.isVisible()) && mandatoryFields) {
                try{
                    run("enable");
                    run("Mid");
                    run("Bin1");
                    if(BIN20.isVisible() && !(BIN20.getText().isEmpty()))
                        run("Bin2");
                    if(BIN30.isVisible() && !(BIN30.getText().isEmpty()))
                        run("Bin3");
                    if(BIN40.isVisible() && !(BIN40.getText().isEmpty()))
                        run("Bin4");
                    ArrayList<String> list = buildBucket(finalBucketsBuild);
                    for(int i = 0; i < list.size(); i++ ){
                        run(list.get(i));
                    }
                    Alert hostFailed = new Alert(Alert.AlertType.INFORMATION);
                    hostFailed.setTitle("Confirmation");
                    hostFailed.setHeaderText(null);
                    hostFailed.setContentText("Query was received by the DRD");
                    hostFailed.showAndWait();
                } catch (IOException | InterruptedException ioException) {
                    Alert hostFailed = new Alert(Alert.AlertType.ERROR);
                    hostFailed.setTitle("Connection Error");
                    hostFailed.setHeaderText(null);
                    hostFailed.setContentText("Invalid Host and Port, ensure that the Host and Port provided are active!");
                    hostFailed.showAndWait();
                }

                saveData();

            }

        }
        if(event.getSource() == CLEAR) {
            try{
                run("clear");
                clearFields();
                new File("C:/Users/" + userName + "/Documents/drd-gui-data.txt").delete();
                Alert hostFailed = new Alert(Alert.AlertType.INFORMATION);
                hostFailed.setTitle("Confirmation");
                hostFailed.setHeaderText(null);
                hostFailed.setContentText("Query was received by the DRD");
                hostFailed.showAndWait();
            } catch (IOException | InterruptedException ioException) {
                ioException.printStackTrace();
                Alert hostFailed = new Alert(Alert.AlertType.ERROR);
                hostFailed.setTitle("Connection Error");
                hostFailed.setHeaderText(null);
                hostFailed.setContentText("Unable to Send Clear Response to DRD");
                hostFailed.showAndWait();
            }

        }
        if(event.getSource() == MIDNWID_ADD ) {
            addMIDNWID();
        }
        if(event.getSource() == MIDNWID_REMOVE) {
            removeMIDNWID();
        }
        if(event.getSource() == BINNWID_ADD_1) {
            addBINNWID1();
        }
        if(event.getSource() == BINNWID_REMOVE_1) {
            removeBINNWID1();
        }
        if(event.getSource() == BIN_ADD) {
            addColBin();
        }
        if(event.getSource() == BIN_REMOVE) {
            removeColBin();
        }
        if(event.getSource() == BINNWID_ADD_2) {
            addBINNWID2();
        }
        if(event.getSource() == BINNWID_REMOVE_2) {
            removeBINNWID2();
        }
        if(event.getSource() == BINNWID_ADD_3){
            addBINNWID3();
        }
        if(event.getSource() == BINNWID_REMOVE_3) {
            removeBINNWID3();
        }
        if(event.getSource() == BINNWID_ADD_4){
            addBINNWID4();
        }
        if(event.getSource() == BINNWID_REMOVE_4) {
            removeBINNWID4();
        }
        if(event.getSource() == BUCKET_ADD) {
            addBucket();
        }

        if(event.getSource() == BUCKET_REMOVE) {
            removeBucket();
        }

        if(event.getSource() == HELP) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Opening External File");
            alert.setHeaderText(null);
            alert.setResizable(false);
            alert.setContentText("Would you like to open the help file?");

            Optional<ButtonType> result = alert.showAndWait();
            ButtonType button = result.orElse(ButtonType.CANCEL);

            if (button == ButtonType.OK) {
                if(new File("C:/Users/" + userName + "/Documents/drd-gui-instructions.txt").isFile()) {
                    new File("C:/Users/" + userName + "/Documents/drd-gui-instructions.txt").delete();
                }
                try {
                    File file = new File("C:/Users/" + userName + "/Documents/drd-gui-instructions.txt");
                    FileWriter fw = new FileWriter(file);
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("GBS Debit Routing Intern Project Summer 2020\n" +
                            "Interns: Vedant Bhat & Rakesh Gorrepati\n" +
                            "Mentor: Eric Poliashenko\n" +
                            "\n" +
                            "About: A simple gui tool which allows for queries to the DRD and provides capability for groups, who work with the DRD, \n" +
                            "       to quickly receive a pseudo-response from DRD without having to do all the extra work/time to acquire it through\n" +
                            "       its normally tedious process. The gui also allows for persistence, i.e. user's inputted values will save after\n" +
                            "       closing the application, granted that \"clear\" was not used.\n" +
                            "\n" +
                            "Tech Stack: Java & JavaFX\n" +
                            "\n" +
                            "Instructions:\n" +
                            "    *Merchant\n" +
                            "        *Enter Merchant ID\n" +
                            "        *Fill out NWID(s) from left to right, without leaving empty text fields in between NWIDs\n" +
                            "    *Bin\n" +
                            "        *Enter BIN#\n" +
                            "        *Enter PAN Length\n" +
                            "        *Enter NWID and Capability Tag\n" +
                            "            *Capabilities include : P = Pinned\n" +
                            "                                    L = Billpay-Pinless\n" +
                            "                                    B = Pinned/Billpay-Pinless\n" +
                            "                                    A = POS-Pinless\n" +
                            "                                    C = Billpay-Pinless/POS-Pinless\n" +
                            "                                    D = Pinned/POS-Pinless\n" +
                            "                                    E = Pinned/Billpay-Pinless/POS-Pinless\n" +
                            "                                    F = Signature Debit\n" +
                            "                                    X = Ecommerce Only\n" +
                            "            * Format : NWID+CAPA\n" +
                            "                       41E\n" +
                            "                       30L\n" +
                            "    *Buckets\n" +
                            "        *Enter Min and Max\n" +
                            "        *Enter NWID(s) : In the order of NWID1, NWID2, NWID3, NWID4\n" +
                            "\t*Minimum required fields:\n" +
                            "\t    * Merchant ID and 1 associated NWID\n" +
                            "\t    * 1 Bin# and 1 associated NWID\n" +
                            "\t    * 1 Bucket and associated NWID\n" +
                            "\t    * Host & Port\n" +
                            "\n" +
                            "Acronyms:\n" +
                            "\t*MID# : Merchant ID number, a numerical value\n" +
                            "\t*MID NWID : Network ID associated with the merchant id number\n" +
                            "\t*PAN Length : Numerical value\n" +
                            "\t*BIN# : Numerical value\n" +
                            "\t*BIN NWID : Network ID and Capability Tag, e.g. 41,E\n" +
                            "\t*Bucket Min : Numerical value, must be less than associated max\n" +
                            "\t*Bucket Max : Numerical value, must be less than associated min\n" +
                            "\t*Bucket NWID : Network ID associated with the Bucket\n" +
                            "\t*Host & Port : DRD related information, where the query will be sent to form the GUI\n" +
                            "\t*NWID(s) : Any integer between 0 - 74\n" +
                            "\n" +
                            "Buttons:\n" +
                            "    *Clear : Sends clear request to DRD, clears all text fields in gui.\n" +
                            "    *Build : Sends query to DRD. Given that there are no errors and minimum required fields are fill out.\n" +
                            "    *Add(\"+\") : Adds text fields\n" +
                            "    *Delete(\"-\") : Removes text fields\n" +
                            "\n");


                    pw.close();
                    Desktop.getDesktop().open(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
    public String enable() {
        String enable = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><enable>true</enable></sim_routes></drd>";
        int len = enable.length();
        return "00"+ len+ enable;
    }
    public String clear() {
        String clear = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><clear>all</clear></sim_routes></drd>";
        int len = clear.length();
        return "00" + len + clear;
    }
    public String buildMid() {
        String Mid = "";
        TextField[] midFields = {MIDNWID_0,MIDNWID_1,MIDNWID_2,MIDNWID_3,MIDNWID_4,MIDNWID_5,MIDNWID_6};
        String [] midString = {MIDNWID0,MIDNWID1,MIDNWID2,MIDNWID3,MIDNWID4,MIDNWID5,MIDNWID6};

        for(int i = 0; i < midFields.length; i++) {
            if(!(midFields[i].getText().isEmpty())) {

                Mid = Mid + "<ntwk_id>" + midString[i] + "</ntwk_id>";

            } else {
                i++;
            }
        }
        String midResponse = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_merch><mtid>" + merchantNumber + "</mtid><ntwks>" + Mid + "</ntwks></set_merch></sim_routes></drd>";
        int len = midResponse.length();
        return "00"+len + midResponse;
        //return midResponse;
    }

    public String buildBin1() {
        String bin1nwid = "";
        TextField[] binNwid = {BINNWID_10,BINNWID_11,BINNWID_12, BINNWID_13, BINNWID_14,BINNWID_15,BINNWID_16};
        String[] bin1nwidString = {BINNWID10,BINNWID11,BINNWID12,BINNWID13,BINNWID14,BINNWID15,BINNWID16,};
        String[] bin1nwidStringLetter = {BINNWID1_L,BINNWID11_L,BINNWID12_L,BINNWID13_L,BINNWID14_L,BINNWID15_L,BINNWID16_L};

        for(int i = 0; i < binNwid.length; i++){
            if(!(binNwid[i].getText().isEmpty())){

                bin1nwid = bin1nwid +  "<ntwk>" + "<id>" + bin1nwidString[i] + "</id>" + "<capa>" + bin1nwidStringLetter[i] + "</capa>" + "</ntwk>";

            }else {
                i++;
            }
        }

        String binResponse1 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bin><len>"+ BINLEN1 +"</len><bin>"+BIN1+"</bin><ntwks>" + bin1nwid +"</ntwks></set_bin></sim_routes></drd>";
        int length = binResponse1.length();
        return "00"+length + binResponse1;

    }

    public String buildBin2() {
        String bin2nwid = "";
        TextField[] bin2Nwid = {BINNWID_20,BINNWID_21,BINNWID_22, BINNWID_23, BINNWID_24,BINNWID_25,BINNWID_26};
        String[] bin2nwidString = {BINNWID20,BINNWID21,BINNWID22,BINNWID23,BINNWID24,BINNWID25,BINNWID26,};
        String[] bin2nwidStringLetter = {BINNWID2_L,BINNWID21_L,BINNWID22_L,BINNWID23_L,BINNWID24_L,BINNWID25_L,BINNWID26_L};

        for(int i = 0; i < bin2Nwid.length; i++){
            if(!(bin2Nwid[i].getText().isEmpty())){

                bin2nwid = bin2nwid +  "<ntwk>" + "<id>" + bin2nwidString[i] + "</id>" + "<capa>" + bin2nwidStringLetter[i] + "</capa>" + "</ntwk>";

            }else {
                i++;
            }
        }

        String binResponse2 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bin><len>"+ BINLEN2 +"</len><bin>"+BIN2+"</bin><ntwks>" + bin2nwid +"</ntwks></set_bin></sim_routes></drd>";
        int length = binResponse2.length();
        return "00"+length + binResponse2;

    }

    public String buildBin3() {
        String bin3nwid = "";
        TextField[] bin3Nwid = {BINNWID_30,BINNWID_31,BINNWID_32, BINNWID_33, BINNWID_34,BINNWID_35,BINNWID_36};
        String[] bin3nwidString = {BINNWID30,BINNWID31,BINNWID32,BINNWID33,BINNWID34,BINNWID35,BINNWID36,};
        String[] bin3nwidStringLetter = {BINNWID3_L,BINNWID31_L,BINNWID32_L,BINNWID33_L,BINNWID34_L,BINNWID35_L,BINNWID36_L};

        for(int i = 0; i < bin3Nwid.length; i++){
            if(!(bin3Nwid[i].getText().isEmpty())){

                bin3nwid = bin3nwid +  "<ntwk>" + "<id>" + bin3nwidString[i] + "</id>" + "<capa>" + bin3nwidStringLetter[i] + "</capa>" + "</ntwk>";

            }else {
                i++;
            }
        }

        String binResponse3 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bin><len>"+ BINLEN3 +"</len><bin>"+BIN3+"</bin><ntwks>" + bin3nwid +"</ntwks></set_bin></sim_routes></drd>";
        int length = binResponse3.length();
        return "00"+length + binResponse3;

    }

    public String buildBin4() {
        String bin4nwid = "";
        TextField[] bin4Nwid = {BINNWID_40,BINNWID_41,BINNWID_42, BINNWID_43, BINNWID_44,BINNWID_45,BINNWID_46};
        String[] bin4nwidString = {BINNWID40,BINNWID41,BINNWID42,BINNWID43,BINNWID44,BINNWID45,BINNWID46,};
        String[] bin4nwidStringLetter = {BINNWID4_L,BINNWID41_L,BINNWID42_L,BINNWID43_L,BINNWID44_L,BINNWID45_L,BINNWID46_L};

        for(int i = 0; i < bin4Nwid.length; i++){
            if(!(bin4Nwid[i].getText().isEmpty())){

                bin4nwid = bin4nwid +  "<ntwk>" + "<id>" + bin4nwidString[i] + "</id>" + "<capa>" + bin4nwidStringLetter[i] + "</capa>" + "</ntwk>";

            }else {
                i++;
            }
        }

        String binResponse4 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bin><len>"+ BINLEN4 +"</len><bin>"+BIN4+"</bin><ntwks>" + bin4nwid +"</ntwks></set_bin></sim_routes></drd>";
        int length = binResponse4.length();
        return "00"+length + binResponse4;

    }

    public ArrayList<String> buildBucket(ArrayList<Bucket> finalBucketsBuild) {
        String bucket0 = "";
        String bucketNwid0="";
        String bucket1 = "";
        String bucketNwid1="";
        String bucket2 = "";
        String bucketNwid2="";
        String bucket3 = "";
        String bucketNwid3="";
        String bucket4 = "";
        String bucketNwid4="";
        String bucket5 = "";
        String bucketNwid5="";
        String bucket6 = "";
        String bucketNwid6="";
        String bucket7 = "";
        String bucketNwid7="";
        String bucket8 = "";
        String bucketNwid8="";
        String bucket9 = "";
        String bucketNwid9="";
        String bucket10 = "";
        String bucketNwid10="";
        String bucket11 = "";
        String bucketNwid11="";
        ArrayList<String> finalString = new ArrayList<>();
        int mySize = finalBucketsBuild.size();
        if( 0 < mySize && finalBucketsBuild.get(0).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(0).getNWIDS() != null && finalBucketsBuild.get(0).getNWIDS().get(i) != null) {
                    bucketNwid0 = bucketNwid0 + "<ntwk>"+"<id>" + finalBucketsBuild.get(0).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket0 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(0).getMin() + "</min><max>" + finalBucketsBuild.get(0).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid0+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket0.length();
            bucket0 = "00" + len + bucket0;
        }
        if(1 < mySize && finalBucketsBuild.get(1).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(1).getNWIDS() != null && finalBucketsBuild.get(1).getNWIDS().get(i) != null) {
                    bucketNwid1 = bucketNwid1 + "<ntwk>" + "<id>" + finalBucketsBuild.get(1).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket1 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(1).getMin() + "</min><max>" + finalBucketsBuild.get(1).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid1+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket1.length();
            bucket1 = "00" + len + bucket1;

        }
        if(2 < mySize && finalBucketsBuild.get(2).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(2).getNWIDS() != null && finalBucketsBuild.get(2).getNWIDS().get(i) != null) {
                    bucketNwid2 = bucketNwid2 + "<ntwk>" + "<id>"  + finalBucketsBuild.get(2).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket2 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(2).getMin() + "</min><max>" + finalBucketsBuild.get(2).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid2+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket2.length();
            bucket2 = "00" + len + bucket2;

        }
        if( 3 < mySize && finalBucketsBuild.get(3).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(3).getNWIDS() != null && finalBucketsBuild.get(3).getNWIDS().get(i) != null) {
                    bucketNwid3 = bucketNwid3 +  "<ntwk>" + "<id>" + finalBucketsBuild.get(3).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket3 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(3).getMin() + "</min><max>" + finalBucketsBuild.get(3).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid3+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket3.length();
            bucket3 = "00" + len + bucket3;

        }
        if( 4 < mySize && finalBucketsBuild.get(4).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(4).getNWIDS() != null && finalBucketsBuild.get(4).getNWIDS().get(i) != null) {
                    bucketNwid4 = bucketNwid4 +  "<ntwk>" + "<id>" + finalBucketsBuild.get(4).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket4 = "<drd><rti>00000070</rti><echo>"+userName+"_drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(4).getMin() + "</min><max>" + finalBucketsBuild.get(4).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid4+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket4.length();
            bucket4 = "00" + len + bucket4;
        }

        if(5 < mySize && finalBucketsBuild.get(5).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(5).getNWIDS() != null && finalBucketsBuild.get(5).getNWIDS().get(i) != null) {
                    bucketNwid5 = bucketNwid5 + "<ntwk>" + "<id>" + finalBucketsBuild.get(5).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket5 = "<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(5).getMin() + "</min><max>" + finalBucketsBuild.get(5).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid5+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket5.length();
            bucket5 = "00" + len + bucket5;
        }
        if(6 < mySize && finalBucketsBuild.get(6).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(6).getNWIDS() != null && finalBucketsBuild.get(6).getNWIDS().get(i) != null) {
                    bucketNwid6 = bucketNwid6 + "<ntwk>" + "<id>" + finalBucketsBuild.get(6).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket6 = "<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(6).getMin() + "</min><max>" + finalBucketsBuild.get(6).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid6+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket6.length();
            bucket6 = "00" + len + bucket6;
        }
        if(7 < mySize && finalBucketsBuild.get(7).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(7).getNWIDS() != null && finalBucketsBuild.get(7).getNWIDS().get(i) != null) {
                    bucketNwid7 = bucketNwid7 + "<ntwk>" + "<id>" + finalBucketsBuild.get(7).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket7 = "<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(7).getMin() + "</min><max>" + finalBucketsBuild.get(7).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid7+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket7.length();
            bucket7 = "00" + len + bucket7;
        }
        if( 8 < mySize && finalBucketsBuild.get(8).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(8).getNWIDS() != null && finalBucketsBuild.get(8).getNWIDS().get(i) != null) {
                    bucketNwid8 = bucketNwid8 + "<ntwk>" + "<id>" + finalBucketsBuild.get(8).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket8 = "<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(8).getMin() + "</min><max>" + finalBucketsBuild.get(8).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid8+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket8.length();
            bucket8 = "00" + len + bucket8;
        }
        if(9 < mySize && finalBucketsBuild.get(9).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(9).getNWIDS() != null && finalBucketsBuild.get(9).getNWIDS().get(i) != null) {
                    bucketNwid9 = bucketNwid9 + "<ntwk>" + "<id>" + finalBucketsBuild.get(9).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket9 = "<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(9).getMin() + "</min><max>" + finalBucketsBuild.get(9).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid9+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket9.length();
            bucket9 = "00" + len + bucket9;
        }
        if( 10 < mySize && finalBucketsBuild.get(10).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(10).getNWIDS() != null && finalBucketsBuild.get(10).getNWIDS().get(i) != null) {
                    bucketNwid10 = bucketNwid10 + "<ntwk>" + "<id>" + finalBucketsBuild.get(10).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket10 = "<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(10).getMin() + "</min><max>" + finalBucketsBuild.get(10).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid10+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket10.length();
            bucket10 = "00" + len + bucket10;
        }
        if(11 < mySize && finalBucketsBuild.get(11).getMin() != -1) {
            for(int i = 0; i < 4 ; i++){
                if(finalBucketsBuild.get(11).getNWIDS() != null && finalBucketsBuild.get(11).getNWIDS().get(i) != null) {
                    bucketNwid11 = bucketNwid11 + "<ntwk>" + "<id>" + finalBucketsBuild.get(11).getNWIDS().get(i) + "</id>" + "</ntwk>";
                }
            }
            bucket11 = "<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>" + finalBucketsBuild.get(11).getMin() + "</min><max>" + finalBucketsBuild.get(11).getMax() + "</max></amount><mtid>"+merchantNumber+"</mtid><ntwks>"+bucketNwid11+"</ntwks></set_bucket></sim_routes></drd>";
            int len = bucket11.length();
            bucket11 = "00" + len + bucket11;
        }
        String[] arr = {bucket0,bucket1,bucket2,bucket3,bucket4,bucket5,bucket6,bucket7,bucket8,bucket9,bucket10,bucket11};

        for(int i = 0; i < arr.length; i++) {
            if(!(arr[i].equals(""))){
                finalString.add(arr[i]);
            }
        }

        return finalString;
    }
    //<drd><rti>00000070</rti><echo>drd_sim_routing</echo><sim_routes><set_bucket><amount><min>1001</min><max>100000000</max></amount><mtid>23437736627</mtid><ntwks><ntwk_id>30</ntwk_id><ntwk_id>41</ntwk_id></ntwks></set_bucket></sim_routes></drd>
    public void run(String input) throws IOException, InterruptedException {
        String confirmation = "00090<drd><echo>"+userName+"_drd_sim_routing</echo><rti>00000070</rti><respCode>000</respCode></drd>";
        String Response="";
        if(input.equals("enable")){
            Response = enable();
            System.out.println("ENABLE RESPONSE: " + Response);
        } else if(input.equals("clear")){
            Response = clear();
            System.out.println("CLEAR RESPONSE: " + Response);
        } else if(input.equals("Mid")){
            Response = buildMid();
            System.out.println("MID RESPONSE: " + Response);
        } else if(input.equals("Bin1")){
            Response = buildBin1();
            System.out.println("BIN1 RESPONSE: " + Response);
        } else if(input.equals("Bin2")){
            Response = buildBin2();
            System.out.println("BIN2 RESPONSE: " + Response);
        } else if(input.equals("Bin3")){
            Response = buildBin3();
            System.out.println("BIN3 RESPONSE: " + Response);
        } else if(input.equals("Bin4")){
            Response = buildBin4();
            System.out.println("BIN4 RESPONSE: " + Response);
        }else{
            Response = input;
            System.out.println("BUCKET RESPONSE: " + Response);

        }
        //Socket socket = new Socket("r3dvap1131" ,11121);
        Socket socket = new Socket(host, port);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(Response);

        char[] c = new char[95];
        int test = in.read(c, 0, 95);
        if(confirmation.equals(new String(c))) {
            System.out.print("DRD RESPONSE: ");
            System.out.print(c);
        } else{
            throw new IOException();
        }
        System.out.println();

        TimeUnit.MILLISECONDS.sleep(200);
        out.close();
        TimeUnit.MILLISECONDS.sleep(200);
        in.close();
        TimeUnit.MILLISECONDS.sleep(200);
        socket.close();


    }

    private void closeUnused() {
        TextField[] MID_Inputs = {MIDNWID_1, MIDNWID_2, MIDNWID_3,
                MIDNWID_4, MIDNWID_5, MIDNWID_6};
        TextField[] BINNWIDS_10 = {BINNWID_11, BINNWID_12, BINNWID_13, BINNWID_14 ,BINNWID_15 ,BINNWID_16};
        TextField[] BINNWIDS_20 = {BINNWID_21, BINNWID_22, BINNWID_23, BINNWID_24 ,BINNWID_25 ,BINNWID_26};
        TextField[] BINNWIDS_30 = {BINNWID_31, BINNWID_32, BINNWID_33, BINNWID_34 ,BINNWID_35 ,BINNWID_36};
        TextField[] BINNWIDS_40 = {BINNWID_41, BINNWID_42, BINNWID_43, BINNWID_44 ,BINNWID_45 ,BINNWID_46};
        TextField[] BUCKET_1 = {BUCKET_MIN_1, BUCKET_MAX_1, BUCKET_NWID_1, BUCKET_NWID_11, BUCKET_NWID_111, BUCKET_NWID_1111};
        TextField[] BUCKET_2 = {BUCKET_MIN_2, BUCKET_MAX_2, BUCKET_NWID_2, BUCKET_NWID_22, BUCKET_NWID_222, BUCKET_NWID_2222};
        TextField[] BUCKET_3 = {BUCKET_MIN_3, BUCKET_MAX_3, BUCKET_NWID_3, BUCKET_NWID_33, BUCKET_NWID_333, BUCKET_NWID_3333};
        TextField[] BUCKET_4 = {BUCKET_MIN_4, BUCKET_MAX_4, BUCKET_NWID_4, BUCKET_NWID_44, BUCKET_NWID_444, BUCKET_NWID_4444};
        TextField[] BUCKET_5 = {BUCKET_MIN_5, BUCKET_MAX_5, BUCKET_NWID_5, BUCKET_NWID_55, BUCKET_NWID_555, BUCKET_NWID_5555};
        TextField[] BUCKET_6 = {BUCKET_MIN_6, BUCKET_MAX_6, BUCKET_NWID_6, BUCKET_NWID_66, BUCKET_NWID_666, BUCKET_NWID_6666};
        TextField[][] BUCKETS = {BUCKET_1, BUCKET_2, BUCKET_3, BUCKET_4, BUCKET_5, BUCKET_6};

        int bucketNum = bucket_Counter;
        if (BUCKET2.isVisible() && BUCKET_2[0].getText().isEmpty() && BUCKET_2[1].getText().isEmpty()) {
            BUCKET2.setVisible(false);
            bucketNum--;
            System.out.println(bucketNum);
        }
        if (BUCKET3.isVisible() && BUCKET_3[0].getText().isEmpty() && BUCKET_3[1].getText().isEmpty()) {
            BUCKET3.setVisible(false);
            bucketNum--;
            System.out.println(bucketNum);
        }
        if (BUCKET4.isVisible() && BUCKET_4[0].getText().isEmpty() && BUCKET_4[1].getText().isEmpty()) {
            BUCKET4.setVisible(false);
            bucketNum--;
            System.out.println(bucketNum);
        }
        if (BUCKET5.isVisible() && BUCKET_5[0].getText().isEmpty() && BUCKET_5[1].getText().isEmpty()) {
            BUCKET5.setVisible(false);
            bucketNum--;
            System.out.println(bucketNum);
        }
        if (BUCKET6.isVisible() && BUCKET_6[0].getText().isEmpty() && BUCKET_6[1].getText().isEmpty()) {
            BUCKET6.setVisible(false);
            bucketNum--;
            System.out.println(bucketNum);
        }
        bucket_Counter = bucketNum;

        int MIDNWID_count = 1;
        for (int i = 0; i < MID_Inputs.length; i++) {
            if (!MID_Inputs[i].isVisible() || MID_Inputs[i].getText().isEmpty()) {
                MID_Inputs[i].setVisible(false);
            } else {
                MIDNWID_count++;
            }
        }
        midnwid_Counter = MIDNWID_count;

        int BINNWID1_count = 1;
        for (int i = 0; i < BINNWIDS_10.length; i++) {
            if (!BINNWIDS_10[i].isVisible() || BINNWIDS_10[i].getText().isEmpty()) {
                BINNWIDS_10[i].setVisible(false);
            } else {
                BINNWID1_count++;
            }
        }
        binnwid_Counter10 = BINNWID1_count;

        int BINNWID2_count = 1;
        for (int i = 0; i < BINNWIDS_20.length; i++) {
            if (!BINNWIDS_20[i].isVisible() || BINNWIDS_20[i].getText().isEmpty()) {
                BINNWIDS_20[i].setVisible(false);
            } else {
                BINNWID2_count++;
            }
        }
        binnwid_Counter20 = BINNWID2_count;

        int BINNWID3_count = 1;
        for (int i = 0; i < BINNWIDS_30.length; i++) {
            if (!BINNWIDS_30[i].isVisible() || BINNWIDS_30[i].getText().isEmpty()) {
                BINNWIDS_30[i].setVisible(false);
            } else {
                BINNWID3_count++;
            }
        }
        binnwid_Counter30 = BINNWID3_count;

        int BINNWID4_count = 1;
        for (int i = 0; i < BINNWIDS_40.length; i++) {
            if (!BINNWIDS_40[i].isVisible() || BINNWIDS_40[i].getText().isEmpty()) {
                BINNWIDS_40[i].setVisible(false);
            } else {
                BINNWID4_count++;
            }
        }
        binnwid_Counter40 = BINNWID4_count;
    }

    private void addBucket(){
        if (bucket_Counter <= 5) {
            if (bucket_Counter == 1) {
                BUCKET2.setVisible(true);
            } else if (bucket_Counter == 2) {
                BUCKET3.setVisible(true);
            } else if (bucket_Counter == 3) {
                BUCKET4.setVisible(true);
            } else if (bucket_Counter == 4) {
                BUCKET5.setVisible(true);
            } else if (bucket_Counter == 5) {
                BUCKET6.setVisible(true);
            }

            bucket_Counter++;
        }
    }

    private void removeBucket() {
        int i = 1;

        if (bucket_Counter == 6) {
            BUCKET6.setVisible(false);
            BUCKET_MIN_6.clear();
            BUCKET_MAX_6.clear();
            BUCKET_NWID_6.clear();
            BUCKET_NWID_66.clear();
            BUCKET_NWID_666.clear();
            BUCKET_NWID_6666.clear();
            i = 0;
        } else if (bucket_Counter == 5) {
            BUCKET5.setVisible(false);
            BUCKET_MIN_5.clear();
            BUCKET_MAX_5.clear();
            BUCKET_NWID_5.clear();
            BUCKET_NWID_55.clear();
            BUCKET_NWID_555.clear();
            BUCKET_NWID_5555.clear();
            i = 0;
        } else if (bucket_Counter == 4) {
            BUCKET4.setVisible(false);
            BUCKET_MIN_4.clear();
            BUCKET_MAX_4.clear();
            BUCKET_NWID_4.clear();
            BUCKET_NWID_44.clear();
            BUCKET_NWID_444.clear();
            BUCKET_NWID_4444.clear();
            i = 0;
        } else if (bucket_Counter == 3) {
            BUCKET3.setVisible(false);
            BUCKET_MIN_3.clear();
            BUCKET_MAX_3.clear();
            BUCKET_NWID_3.clear();
            BUCKET_NWID_33.clear();
            BUCKET_NWID_333.clear();
            BUCKET_NWID_3333.clear();
            i = 0;
        } else if (bucket_Counter == 2) {
            BUCKET2.setVisible(false);
            BUCKET_MIN_2.clear();
            BUCKET_MAX_2.clear();
            BUCKET_NWID_2.clear();
            BUCKET_NWID_22.clear();
            BUCKET_NWID_222.clear();
            BUCKET_NWID_2222.clear();

            i = 0;
        }

        if (i == 0) {
            bucket_Counter--;
        }
    }

    public boolean validateNumber(String text) {
        return text.matches("[0-9]*");
    }

    public boolean validateLetter(String text) {
        char[] arr = {'P','L','B','A','C','D','E','F','X'};
        boolean response = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == text.charAt(0)){
                response = true;
                break;
            } else{
                response = false;
            }
        }
        int p = 0;
        return response;
        //return text.matches("[a-zA-Z]+");
    }

    public String[] validateBins(TextField bin, String num, String let, boolean error) {
        String[] arr = new String[3];
        int len = bin.getText().length();
        if(len == 2){
            if(validateNumber(bin.getText().substring(0,1))) {
                num = (bin.getText());
                num = num.substring(0, 1);
                arr[0] = num;
                bin.setStyle("");
                error = false;
                if(validateLetter(bin.getText().substring(1,2))) {
                    let = bin.getText().substring(1,2);
                    arr[1] = let;
                }else {
                    bin.setStyle("-fx-text-inner-color: red");
                    error = true;
                }
            }

        }else if(len == 3) {
            num = bin.getText();
            num = num.substring(0,2);
            arr[0] = num;
            bin.setStyle("");
            error = false;
            if(validateLetter(bin.getText().substring(2,3))) {
                let = bin.getText().substring(2,3);
                arr[1] = let;
            } else {
                bin.setStyle("-fx-text-inner-color: red");
                error = true;
            }
        } else {
            bin.setStyle("-fx-text-inner-color: red");
            error = true;

        }

        arr[2] = String.valueOf(error);
        return arr;

    }

    private void setFieldsMid() {
        if(!(MID.getText().isEmpty()) && validateNumber(MID.getText())) {
            merchantNumber = (MID.getText());
            MID.setStyle("");
            midError1 = false;
            mandatory1 = false;
            //System.out.println(merchantNumber);
        }else if(MID.getText().isEmpty()){
            //System.out.println("Error MID is Empty");
            MID.setStyle("-fx-control-inner-background: #ff000099");
            mandatory1 = true;
            midError1 = false;
        } else if(!(validateNumber(MID.getText()))) {
            //System.out.println("Error Invalid MID");
            MID.setStyle("-fx-text-inner-color: red");
            midError1 = true;
            mandatory1 = false;
        }
        int k = 0;
        if (HOST.getText().isEmpty()) {
            mandatory9 = true;
            HOST.setStyle("-fx-control-inner-background: #ff000099");
            k++;
        } else {
            host =  HOST.getText();
            mandatory9 = false;
            HOST.setStyle("");
        }
        if (PORT.getText().isEmpty() || !validateNumber(PORT.getText())) {
            mandatory9 = true;
            PORT.setStyle("-fx-control-inner-background: #ff000099");
            k++;
        } else if (validateNumber(PORT.getText()) && !(Integer.parseInt(PORT.getText()) >= 0 && Integer.parseInt(PORT.getText()) <= 65535)) {
            mandatory9 = true;
            PORT.setStyle("-fx-text-inner-color: red");
        } else {
            port = Integer.parseInt(PORT.getText());
            mandatory9 = false;
            PORT.setStyle("");
        }
        if (k > 0) {
            mandatory9 = true;
        }

        if(!(MIDNWID_0.getText().isEmpty())) {
            if(validateNumber(MIDNWID_0.getText())) {
                MIDNWID0 = (MIDNWID_0.getText());
                MIDNWID_0.setStyle("");
                midError2 = false;
                mandatory2 = false;
                //System.out.println(MIDNWID0);
            }else {
                //System.out.println("Invalid MID NWID1");
                MIDNWID_0.setStyle("-fx-text-inner-color: red");
                midError2 = true;
                mandatory2 = false;
            }
        } else {
            //System.out.println("Error Required MID NWID1 is Empty");
            mandatory2 = true;
            MIDNWID_0.setStyle("-fx-control-inner-background: #ff000099");
        }

        if(!(MIDNWID_1.getText().isEmpty()) && MIDNWID_1.isVisible()) {
            if(validateNumber(MIDNWID_1.getText())) {
                MIDNWID1 = (MIDNWID_1.getText());
                MIDNWID_1.setStyle("");
                midError3 = false;
                //System.out.println(MIDNWID1);
            }else {
                //System.out.println("Invalid MID NWID2");
                MIDNWID_1.setStyle("-fx-text-inner-color: red");
                midError3 = true;
            }
        }

        if(!(MIDNWID_2.getText().isEmpty()) && MIDNWID_2.isVisible()) {
            if(validateNumber(MIDNWID_2.getText())) {
                MIDNWID2 = (MIDNWID_2.getText());
                MIDNWID_2.setStyle("");
                midError4 = false;
                //System.out.println(MIDNWID2);
            }else {
                //System.out.println("Invalid MID NWID3");
                MIDNWID_2.setStyle("-fx-text-inner-color: red");
                midError4 = true;
            }
        }

        if(!(MIDNWID_3.getText().isEmpty()) && MIDNWID_3.isVisible()) {
            if(validateNumber(MIDNWID_3.getText())) {
                MIDNWID3 = (MIDNWID_3.getText());
                MIDNWID_3.setStyle("");
                midError5 = false;
                //System.out.println(MIDNWID3);
            }else {
                //System.out.println("Invalid MID NWID4");
                MIDNWID_3.setStyle("-fx-text-inner-color: red");
                midError5 = true;
            }
        }

        if(!(MIDNWID_4.getText().isEmpty()) && MIDNWID_4.isVisible()) {
            if(validateNumber(MIDNWID_4.getText())) {
                MIDNWID4 = (MIDNWID_4.getText());
                MIDNWID_4.setStyle("");
                midError6 = false;
                //System.out.println(MIDNWID4);
            }else {
                //System.out.println("Invalid MID NWID5");
                MIDNWID_4.setStyle("-fx-text-inner-color: red");
                midError6 = true;
            }
        }

        if(!(MIDNWID_5.getText().isEmpty()) && MIDNWID_5.isVisible()) {
            if(validateNumber(MIDNWID_5.getText())) {
                MIDNWID5 = (MIDNWID_5.getText());
                MIDNWID_5.setStyle("");
                midError7 = false;
                //System.out.println(MIDNWID5);
            }else {
                //System.out.println("Invalid MID NWID6");
                MIDNWID_5.setStyle("-fx-text-inner-color: red");
                midError7 = true;
            }
        }

        if(!(MIDNWID_6.getText().isEmpty()) && MIDNWID_6.isVisible()) {
            if(validateNumber(MIDNWID_6.getText())) {
                MIDNWID6 = (MIDNWID_6.getText());
                MIDNWID_6.setStyle("");
                midError8 = false;
                //System.out.println(MIDNWID6);
            }else {
                //System.out.println("Invalid MID NWID7");
                MIDNWID_6.setStyle("-fx-text-inner-color: red");
                midError8 = true;
            }
        }
        if(midError1 || midError2 || midError3 || midError4 || midError5 || midError6 || midError7 || midError8    ){
            MID_ERROR.setVisible(true);
        } else{
            MID_ERROR.setVisible(false);
        }

    }

    private void setFieldsBin1() {
        //Validate and set Bin Number 1
        if (!(BIN10.getText().isEmpty()) && validateNumber(BIN10.getText())) {

            BIN1 = Long.parseLong(BIN10.getText());
            BIN10.setStyle("");
            binError1 = false;
            mandatory3 = false;
            //System.out.println(BIN1);
        }else if(BIN10.getText().isEmpty()){
            BIN10.setStyle("-fx-control-inner-background: #ff000099");
            //System.out.println("Error Bin 1 is Empty");
            mandatory3 = true;
            binError1 = false;
        } else if(!(validateNumber(BIN10.getText()))) {
            BIN10.setStyle("-fx-text-inner-color: red");
            //System.out.println("Error Invalid Bin1");
            binError1 = true;
            mandatory3 = false;
        }
        //Validate and set Bin Len 1
        if(!(BINLEN_1.getText().isEmpty()) && validateNumber(BINLEN_1.getText())) {
            BINLEN1 = Integer.parseInt(BINLEN_1.getText());
            BINLEN_1.setStyle("");
            lengthError1 = false;
            //System.out.println(BINLEN1);
        } else if((BINLEN_1.getText().isEmpty())) {
            BINLEN_1.setStyle("-fx-control-inner-background: #ff000099");
            //System.out.println("Error Bin 1 Length is Empty");
            lengthError1 = false;
            mandatory4 = true;
        } else if(!(validateNumber(BINLEN_1.getText()))) {
            BINLEN_1.setStyle("-fx-text-inner-color: red");
            //System.out.println("Error Invalid Bin1 Length");
            lengthError1 = true;
            mandatory4 = false;
        }
        //Validate and set BINNWID1 & Letter
        if(!(BINNWID_10.getText().isEmpty())) {
            int len = BINNWID_10.getText().length();
            if(len == 2) {
                if (validateNumber(BINNWID_10.getText().substring(0, 1))) {
                    BINNWID10 = (BINNWID_10.getText());
                    BINNWID10 = BINNWID10.substring(0, 1);
                    BINNWID_10.setStyle("");
                    binnwidError1 = false;
                    mandatory5 = false;
                    //System.out.println(BINNWID10);
                    if (validateLetter(BINNWID_10.getText().substring(1, 2))) {
                        BINNWID1_L = BINNWID_10.getText().substring(1, 2);
                        //System.out.println(BINNWID1_L);
                    } else {
                        BINNWID_10.setStyle("-fx-text-inner-color: red");
                        binnwidError1 = true;
                    }
                }
            } else if(len == 3) {
                if (validateNumber(BINNWID_10.getText().substring(0, 2))) {
                    BINNWID10 = (BINNWID_10.getText());
                    BINNWID10 = BINNWID10.substring(0, 2);
                    BINNWID_10.setStyle("");
                    binnwidError1 = false;
                    mandatory5 = false;
                    //System.out.println(BINNWID10);
                    if (validateLetter(BINNWID_10.getText().substring(2, 3))) {
                        BINNWID1_L = BINNWID_10.getText().substring(2, 3);
                        //System.out.println(BINNWID1_L);
                    } else {
                        BINNWID_10.setStyle("-fx-text-inner-color: red");
                        binnwidError1 = true;
                    }
                }
            } else {
                //System.out.println("Invalid NWID10");
                BINNWID_10.setStyle("-fx-text-inner-color: red");
                binnwidError1 = true;
                mandatory5 = false;

            }
        } else {
            //System.out.println("Error Required Bin NWID 10 is Empty");
            BINNWID_10.setStyle("-fx-control-inner-background: #ff000099");
            binnwidError1 = false;
            mandatory5 = true;
        }

        //Validate and set BINNWID2 & Letter
        if(!(BINNWID_11.getText().isEmpty()) && BINNWID_11.isVisible() ) {
            String[] arr = validateBins(BINNWID_11,BINNWID11,BINNWID11_L,binnwidError2);
            BINNWID11 = arr[0];
            BINNWID11_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError2 = true;
            } else {
                binnwidError2 = false;
            }
        }
        //Validate and set BINNWID3 & Letter
        if(!(BINNWID_12.getText().isEmpty()) && BINNWID_12.isVisible() ) {
            String[] arr = validateBins(BINNWID_12,BINNWID12,BINNWID12_L,binnwidError3);
            BINNWID12 = arr[0];
            BINNWID12_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError3 = true;
            } else {
                binnwidError3 = false;
            }
        }
        if(!(BINNWID_13.getText().isEmpty()) && BINNWID_13.isVisible()) {
            String[] arr = validateBins(BINNWID_13,BINNWID13,BINNWID13_L,binnwidError4);
            BINNWID13 = arr[0];
            BINNWID13_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError4 = true;
            } else {
                binnwidError4 = false;
            }
        }
        if(!(BINNWID_14.getText().isEmpty()) && BINNWID_14.isVisible()) {
            String[] arr = validateBins(BINNWID_14,BINNWID14,BINNWID14_L,binnwidError5);
            BINNWID14 = arr[0];
            BINNWID14_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError5 = true;
            } else {
                binnwidError5 = false;
            }
        }
        if(!(BINNWID_15.getText().isEmpty()) && BINNWID_15.isVisible()) {
            String[] arr = validateBins(BINNWID_15,BINNWID15,BINNWID15_L,binnwidError6);
            BINNWID15 = arr[0];
            BINNWID15_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError6 = true;
            } else {
                binnwidError6 = false;
            }
        }
        if(!(BINNWID_16.getText().isEmpty()) && BINNWID_16.isVisible()) {
            String[] arr = validateBins(BINNWID_16,BINNWID16,BINNWID16_L,binnwidError7);
            BINNWID16 = arr[0];
            BINNWID16_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError7 = true;
            } else {
                binnwidError7 = false;
            }

        }

    }

    private void setFieldsBin2() {
        //Validate and set Bin Number 2
        if (!(BIN20.getText().isEmpty()) && validateNumber(BIN20.getText())) {
            BIN2 =  Long.parseLong(BIN20.getText());
            BIN20.setStyle("");
            binError2 = false;
            //System.out.println(BIN2);
        } else if(!(validateNumber(BIN20.getText()))) {
            //System.out.println("Error Invalid Bin1");
            BIN20.setStyle("-fx-text-inner-color: red");
            binError2 = true;
        }

        //Validate and set Bin Len 2
        if(!(BINLEN_2.getText().isEmpty()) && validateNumber(BINLEN_2.getText())) {
            BINLEN2 = Integer.parseInt(BINLEN_2.getText());
            BINLEN_2.setStyle("");
            lengthError2 = false;
            //System.out.println(BINLEN2);
        } else if(!(validateNumber(BINLEN_2.getText()))) {
            BINLEN_2.setStyle("-fx-text-inner-color: red");
            //System.out.println("Error Invalid Bin2 Length");
            lengthError2 = true;
        }

        //Validate and set BINNWID20 & Letter
        if(!(BINNWID_20.getText().isEmpty())) {
            String[] arr = validateBins(BINNWID_20,BINNWID20,BINNWID2_L,binnwidError8);
            BINNWID20 = arr[0];
            BINNWID2_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError8 = true;
            } else {
                binnwidError8 = false;
            }
        }
        //Validate and set BINNWID21 & Letter
        if(!(BINNWID_21.getText().isEmpty()) && BINNWID_21.isVisible()) {
            String[] arr = validateBins(BINNWID_21,BINNWID21,BINNWID21_L,binnwidError9);
            BINNWID21 = arr[0];
            BINNWID21_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError9 = true;
            } else {
                binnwidError9 = false;
            }
        }
        //Validate and set BINNWID22 & Letter
        if(!(BINNWID_22.getText().isEmpty()) && BINNWID_22.isVisible() ) {
            String[] arr = validateBins(BINNWID_22,BINNWID22,BINNWID22_L,binnwidError10);
            BINNWID22 = arr[0];
            BINNWID22_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError10 = true;
            } else {
                binnwidError10 = false;
            }
        }
        if(!(BINNWID_23.getText().isEmpty()) && BINNWID_23.isVisible()) {
            String[] arr = validateBins(BINNWID_23,BINNWID23,BINNWID23_L,binnwidError11);
            BINNWID23 = arr[0];
            BINNWID23_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError11 = true;
            } else {
                binnwidError11 = false;
            }
        }
        if(!(BINNWID_24.getText().isEmpty()) && BINNWID_24.isVisible()) {
            String[] arr = validateBins(BINNWID_24,BINNWID24,BINNWID24_L,binnwidError12);
            BINNWID24 = arr[0];
            BINNWID24_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError12 = true;
            } else {
                binnwidError12 = false;
            }
        }
        if(!(BINNWID_25.getText().isEmpty()) && BINNWID_25.isVisible()) {
            String[] arr = validateBins(BINNWID_25,BINNWID25,BINNWID25_L,binnwidError13);
            BINNWID25 = arr[0];
            BINNWID25_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError13 = true;
            } else {
                binnwidError13 = false;
            }
        }
        if(!(BINNWID_26.getText().isEmpty()) && BINNWID_26.isVisible()) {
            String[] arr = validateBins(BINNWID_26,BINNWID26,BINNWID26_L,binnwidError14);
            BINNWID26 = arr[0];
            BINNWID26_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError14 = true;
            } else {
                binnwidError14 = false;
            }
        }
    }

    private void setFieldsBin3() {
        //Validate and set Bin Number 3
        if (!(BIN30.getText().isEmpty()) && validateNumber(BIN30.getText())) {
            BIN3 =  Long.parseLong(BIN30.getText());
            BIN30.setStyle("");
            binError3 = false;
            //System.out.println(BIN3);
        } else if(!(validateNumber(BIN30.getText()))) {
            BIN30.setStyle("-fx-text-inner-color: red");
            //System.out.println("Error Invalid Bin3");
            binError3 = true;
        }

        //Validate and set Bin Len 3
        if(!(BINLEN_3.getText().isEmpty()) && validateNumber(BINLEN_3.getText())) {
            BINLEN3 = Integer.parseInt(BINLEN_3.getText());
            BINLEN_3.setStyle("");
            lengthError3 = false;
            //System.out.println(BINLEN3);
        } else if(!(validateNumber(BINLEN_3.getText()))) {
            BINLEN_3.setStyle("-fx-text-inner-color: red");
            //System.out.println("Error Invalid Bin3 Length");
            lengthError3 = true;
        }

        //Validate and set BINNWID30 & Letter
        if(!(BINNWID_30.getText().isEmpty())) {
            String[] arr = validateBins(BINNWID_30,BINNWID30,BINNWID3_L,binnwidError15);
            BINNWID30 = arr[0];
            BINNWID3_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError15 = true;
            } else {
                binnwidError15 = false;
            }
        }
        //Validate and set BINNWID31 & Letter
        if(!(BINNWID_31.getText().isEmpty()) && BINNWID_31.isVisible()) {
            String[] arr = validateBins(BINNWID_31,BINNWID31,BINNWID31_L,binnwidError16);
            BINNWID26 = arr[0];
            BINNWID26_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError16 = true;
            } else {
                binnwidError16 = false;
            }
        }
        //Validate and set BINNWID22 & Letter
        if(!(BINNWID_32.getText().isEmpty()) && BINNWID_32.isVisible() ) {
            String[] arr = validateBins(BINNWID_32,BINNWID32,BINNWID32_L,binnwidError17);
            BINNWID32 = arr[0];
            BINNWID32_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError17 = true;
            } else {
                binnwidError17 = false;
            }
        }
        if(!(BINNWID_33.getText().isEmpty()) && BINNWID_33.isVisible()) {
            String[] arr = validateBins(BINNWID_33,BINNWID33,BINNWID33_L,binnwidError18);
            BINNWID33 = arr[0];
            BINNWID33_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError18 = true;
            } else {
                binnwidError18 = false;
            }
        }
        if(!(BINNWID_34.getText().isEmpty()) && BINNWID_34.isVisible()) {
            String[] arr = validateBins(BINNWID_34,BINNWID34,BINNWID34_L,binnwidError19);
            BINNWID34 = arr[0];
            BINNWID34_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError19 = true;
            } else {
                binnwidError19 = false;
            }
        }
        if(!(BINNWID_35.getText().isEmpty()) && BINNWID_35.isVisible()) {
            String[] arr = validateBins(BINNWID_35,BINNWID35,BINNWID35_L,binnwidError20);
            BINNWID35 = arr[0];
            BINNWID35_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError20 = true;
            } else {
                binnwidError20 = false;
            }
        }
        if(!(BINNWID_36.getText().isEmpty()) && BINNWID_36.isVisible()) {
            String[] arr = validateBins(BINNWID_36,BINNWID36,BINNWID36_L,binnwidError21);
            BINNWID36 = arr[0];
            BINNWID36_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError21 = true;
            } else {
                binnwidError21 = false;
            }
        }
    }
    private void setFieldsBin4() {
        //Validate and set Bin Number 4
        if (!(BIN40.getText().isEmpty()) && validateNumber(BIN40.getText())) {
            BIN4 =  Long.parseLong(BIN40.getText());
            BIN40.setStyle("");
            binError4 = false;
            //System.out.println(BIN4);
        } else if(!(validateNumber(BIN40.getText()))) {
            //System.out.println("Error Invalid Bin4");
            BIN40.setStyle("-fx-text-inner-color: red");
            binError4 = true;
        }

        //Validate and set Bin Len 4
        if(!(BINLEN_4.getText().isEmpty()) && validateNumber(BINLEN_4.getText())) {
            BINLEN4 = Integer.parseInt(BINLEN_4.getText());
            BINLEN_4.setStyle("");
            lengthError4 = false;
            //System.out.println(BINLEN4);
        } else if(!(validateNumber(BINLEN_4.getText()))) {
            //System.out.println("Error Invalid Bin4 Length");
            BINLEN_4.setStyle("-fx-text-inner-color: red");
            lengthError4 = true;
        }

        //Validate and set BINNWID40 & Letter
        if(!(BINNWID_40.getText().isEmpty())) {
            String[] arr = validateBins(BINNWID_40,BINNWID40,BINNWID4_L,binnwidError22);
            BINNWID40 = arr[0];
            BINNWID4_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError22 = true;
            } else {
                binnwidError22 = false;
            }
        }

        //Validate and set BINNWID41 & Letter
        if(!(BINNWID_41.getText().isEmpty()) && BINNWID_41.isVisible()) {
            String[] arr = validateBins(BINNWID_41,BINNWID41,BINNWID41_L,binnwidError23);
            BINNWID41 = arr[0];
            BINNWID41_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError23 = true;
            } else {
                binnwidError23 = false;
            }
        }

        //Validate and set BINNWID42 & Letter
        if(!(BINNWID_42.getText().isEmpty()) && BINNWID_42.isVisible() ) {
            String[] arr = validateBins(BINNWID_42,BINNWID42,BINNWID42_L,binnwidError24);
            BINNWID42 = arr[0];
            BINNWID42_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError24 = true;
            } else {
                binnwidError24 = false;
            }
        }
        if(!(BINNWID_43.getText().isEmpty()) && BINNWID_43.isVisible()) {
            String[] arr = validateBins(BINNWID_43,BINNWID43,BINNWID43_L,binnwidError25);
            BINNWID43 = arr[0];
            BINNWID43_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError25 = true;
            } else {
                binnwidError25 = false;
            }
        }
        if(!(BINNWID_44.getText().isEmpty()) && BINNWID_44.isVisible()) {
            String[] arr = validateBins(BINNWID_44,BINNWID44,BINNWID44_L,binnwidError26);
            BINNWID44 = arr[0];
            BINNWID44_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError26 = true;
            } else {
                binnwidError26 = false;
            }
        }
        if(!(BINNWID_45.getText().isEmpty()) && BINNWID_45.isVisible()) {
            String[] arr = validateBins(BINNWID_45,BINNWID45,BINNWID45_L,binnwidError27);
            BINNWID45 = arr[0];
            BINNWID45_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError27 = true;
            } else {
                binnwidError27 = false;
            }
        }
        if(!(BINNWID_46.getText().isEmpty()) && BINNWID_46.isVisible()) {
            String[] arr = validateBins(BINNWID_46,BINNWID46,BINNWID46_L,binnwidError28);
            BINNWID46 = arr[0];
            BINNWID46_L = arr[1];
            if(arr[2].equals("true")) {
                binnwidError28 = true;
            } else {
                binnwidError28 = false;
            }
        }
    }
    private boolean isBucketNWID(TextField input) {
        try {
            int x  = Integer.parseInt(input.getText());
            return x >= 0 && x <= 74;

        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isBucketBound(TextField input) {
        try {
            int x = Integer.parseInt(input.getText());
            return x >= 0 && x <= 1000000000;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean validBounds(TextField min, TextField max) {
        int x = Integer.parseInt(min.getText());
        int y = Integer.parseInt(max.getText());

        return x <= y && isBucketBound(min) && isBucketBound(max);
    }

    private void setFieldsBuckets1(){

        if(!(BUCKET_MIN_1.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MIN_1)) {
                BUCKETMIN1 = Integer.parseInt(BUCKET_MIN_1.getText());
                BUCKET_MIN_1.setStyle("");
                mandatory6 = false;

                //System.out.println(BUCKETMIN1);
            }else{
                //System.out.println("Enter a Valid Min for Bucket 1");
                mandatory6 = false;
                BUCKET_MIN_1.setStyle("-fx-text-inner-color: red");
            }
        } else {
            //System.out.println("Missing Bucket 1 Min");
            BUCKET_MIN_1.setStyle("-fx-control-inner-background: #ff000099");
            mandatory6 = true;
        }

        if(!(BUCKET_MAX_1.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MAX_1)) {
                BUCKETMAX1 = Integer.parseInt(BUCKET_MAX_1.getText());
                BUCKET_MAX_1.setStyle("");
                mandatory7 = false;
                //System.out.println(BUCKETMAX1);
            }else{
                //System.out.println("Enter a Valid Max for Bucket 1");
                BUCKET_MAX_1.setStyle("-fx-text-inner-color: red");
                mandatory7 = false;
            }

        } else {
            //System.out.println("Missing Bucket 1 Max");
            BUCKET_MAX_1.setStyle("-fx-control-inner-background: #ff000099");
            mandatory7 = true;
        }

        if(!(BUCKET_NWID_1.getText().isEmpty())) {
            if (isBucketNWID(BUCKET_NWID_1)) {
                BUCKETNWID1 = Integer.parseInt(BUCKET_NWID_1.getText());
                BUCKET_NWID_1.setStyle("");
                //System.out.println(BUCKETNWID1);
            } else{
                //System.out.println("Enter a Valid NWID1 for Bucket 1");
                BUCKET_NWID_1.setStyle("-fx-text-inner-color: red");
            }
            mandatory8 = false;
        } else {
            //System.out.println("Missing Bucket 1 NWID1");
            BUCKET_NWID_1.setStyle("-fx-control-inner-background: #ff000099");
            mandatory8 = true;
        }


        if(!(BUCKET_NWID_11.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_11)) {
                BUCKETNWID11 = Integer.parseInt(BUCKET_NWID_11.getText());
                BUCKET_NWID_11.setStyle("");
                //System.out.println(BUCKETNWID11);
            }else{
                //System.out.println("Enter a Valid NWID2 for Bucket 1");
                BUCKET_NWID_11.setStyle("-fx-text-inner-color: red");

            }
        }

        if(!(BUCKET_NWID_111.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_111)) {
                BUCKETNWID111 = Integer.parseInt(BUCKET_NWID_111.getText());
                BUCKET_NWID_111.setStyle("");
                //System.out.println(BUCKETNWID111);
            }else{
                //System.out.println("Enter a Valid NWID3 for Bucket 1");
                BUCKET_NWID_111.setStyle("-fx-text-inner-color: red");
            }
        }

        if(!(BUCKET_NWID_1111.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_1111)) {
                BUCKETNWID1111 = Integer.parseInt(BUCKET_NWID_1111.getText());
                BUCKET_NWID_1111.setStyle("");
                //System.out.println(BUCKETNWID1111);
            }else{
                //System.out.println("Enter a Valid NWID4 for Bucket 1");
                BUCKET_NWID_1111.setStyle("-fx-text-inner-color: red");
            }
        }
    }

    private void setFieldsBuckets2(){

        if(!(BUCKET_MIN_2.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MIN_2)) {
                BUCKETMIN2 = Integer.parseInt(BUCKET_MIN_2.getText());
                //System.out.println(BUCKETMIN2);
            }else{
                //System.out.println("Enter a Valid Min for Bucket 2");
            }
        }

        if(!(BUCKET_MAX_2.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MAX_2)) {
                BUCKETMAX2 = Integer.parseInt(BUCKET_MAX_2.getText());
                //System.out.println(BUCKETMAX2);
            }else{
                //System.out.println("Enter a Valid Max for Bucket 2");
            }
        }

        if(!(BUCKET_NWID_2.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_2)) {
                BUCKETNWID2 = Integer.parseInt(BUCKET_NWID_2.getText());
                //System.out.println(BUCKETNWID2);
            }else{
                // System.out.println("Enter a Valid NWID1 for Bucket 2");
            }
        }


        if(!(BUCKET_NWID_22.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_22)) {
                BUCKETNWID22 = Integer.parseInt(BUCKET_NWID_22.getText());
                //System.out.println(BUCKETNWID22);
            }else{
                //System.out.println("Enter a Valid NWID2 for Bucket 2");
            }
        }

        if(!(BUCKET_NWID_222.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_222)) {
                BUCKETNWID222 = Integer.parseInt(BUCKET_NWID_222.getText());
                //System.out.println(BUCKETNWID222);
            }else{
                //System.out.println("Enter a Valid NWID3 for Bucket 2");
            }
        }

        if(!(BUCKET_NWID_2222.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_2222)) {
                BUCKETNWID2222 = Integer.parseInt(BUCKET_NWID_2222.getText());
                System.out.println(BUCKETNWID2222);
            }else{
                System.out.println("Enter a Valid NWID4 for Bucket 2");
            }
        }

    }

    private void setFieldsBuckets3(){

        if(!(BUCKET_MIN_3.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MIN_3)) {
                BUCKETMIN3 = Integer.parseInt(BUCKET_MIN_3.getText());
                //System.out.println(BUCKETMIN3);
            }else{
                //System.out.println("Enter a Valid Min for Bucket 3");
            }
        }

        if(!(BUCKET_MAX_3.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MAX_3)) {
                BUCKETMAX3 = Integer.parseInt(BUCKET_MAX_3.getText());

                //System.out.println(BUCKETMAX3);
            }else{
                //System.out.println("Enter a Valid Max for Bucket 3");
            }
        }

        if(!(BUCKET_NWID_3.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_3)) {
                BUCKETNWID3 = Integer.parseInt(BUCKET_NWID_3.getText());
                //System.out.println(BUCKETNWID3);
            }else{
                //System.out.println("Enter a Valid NWID1 for Bucket 3");
            }
        }


        if(!(BUCKET_NWID_33.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_33)) {
                BUCKETNWID33 = Integer.parseInt(BUCKET_NWID_33.getText());
                //System.out.println(BUCKETNWID33);
            }else{
                //System.out.println("Enter a Valid NWID2 for Bucket 3");
            }
        }

        if(!(BUCKET_NWID_333.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_333)) {
                BUCKETNWID333 = Integer.parseInt(BUCKET_NWID_333.getText());
                //System.out.println(BUCKETNWID333);
            }else{
                //System.out.println("Enter a Valid NWID3 for Bucket 3");
            }
        }

        if(!(BUCKET_NWID_3333.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_3333)) {
                BUCKETNWID3333 = Integer.parseInt(BUCKET_NWID_3333.getText());
                //System.out.println(BUCKETNWID3333);
            }else{
                //System.out.println("Enter a Valid NWID4 for Bucket 3");
            }
        }

    }
    private void setFieldsBuckets4(){

        if(!(BUCKET_MIN_4.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MIN_4)) {
                BUCKETMIN4 = Integer.parseInt(BUCKET_MIN_4.getText());
                //System.out.println(BUCKETMIN4);
            }else{
                System.out.println("Enter a Valid Min for Bucket 4");
            }
        }

        if(!(BUCKET_MAX_4.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MAX_4)) {
                BUCKETMAX4 = Integer.parseInt(BUCKET_MAX_4.getText());
                //System.out.println(BUCKETMAX4);
            }else{
                //System.out.println("Enter a Valid Max for Bucket 4");
            }
        }

        if(!(BUCKET_NWID_4.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_4)) {
                BUCKETNWID4 = Integer.parseInt(BUCKET_NWID_4.getText());
                // System.out.println(BUCKETNWID4);
            }else{
                //System.out.println("Enter a Valid NWID1 for Bucket 4");
            }
        }


        if(!(BUCKET_NWID_44.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_44)) {
                BUCKETNWID44 = Integer.parseInt(BUCKET_NWID_44.getText());
                //System.out.println(BUCKETNWID44);
            }else{
                //System.out.println("Enter a Valid NWID2 for Bucket 4");
            }
        }

        if(!(BUCKET_NWID_444.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_444)) {
                BUCKETNWID444 = Integer.parseInt(BUCKET_NWID_444.getText());
                //System.out.println(BUCKETNWID444);
            }else{
                //System.out.println("Enter a Valid NWID3 for Bucket 4");
            }
        }

        if(!(BUCKET_NWID_4444.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_4444)) {
                BUCKETNWID4444 = Integer.parseInt(BUCKET_NWID_4444.getText());
                //System.out.println(BUCKETNWID4444);
            }else{
                //System.out.println("Enter a Valid NWID4 for Bucket 4");
            }
        }

    }

    private void setFieldsBuckets5(){

        if(!(BUCKET_MIN_5.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MIN_5)) {
                BUCKETMIN5 = Integer.parseInt(BUCKET_MIN_5.getText());
                //System.out.println(BUCKETMIN5);
            }else{
                // System.out.println("Enter a Valid Min for Bucket 5");
            }
        }

        if(!(BUCKET_MAX_5.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MAX_5)) {
                BUCKETMAX5 = Integer.parseInt(BUCKET_MAX_5.getText());
                //System.out.println(BUCKETMAX5);
            }else{
                // System.out.println("Enter a Valid Max for Bucket 5");
            }
        }

        if(!(BUCKET_NWID_5.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_5)) {
                BUCKETNWID5 = Integer.parseInt(BUCKET_NWID_5.getText());
                //System.out.println(BUCKETNWID5);
            }else{
                //System.out.println("Enter a Valid NWID1 for Bucket 5");
            }
        }


        if(!(BUCKET_NWID_55.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_55)) {
                BUCKETNWID55 = Integer.parseInt(BUCKET_NWID_55.getText());
                //System.out.println(BUCKETNWID55);
            }else{
                //System.out.println("Enter a Valid NWID2 for Bucket 5");
            }
        }

        if(!(BUCKET_NWID_555.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_555)) {
                BUCKETNWID555 = Integer.parseInt(BUCKET_NWID_555.getText());
                //System.out.println(BUCKETNWID555);
            }else{
                // System.out.println("Enter a Valid NWID3 for Bucket 5");
            }
        }

        if(!(BUCKET_NWID_5555.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_5555)) {
                BUCKETNWID5555 = Integer.parseInt(BUCKET_NWID_5555.getText());
                //System.out.println(BUCKETNWID5555);
            }else{
                //System.out.println("Enter a Valid NWID4 for Bucket 5");
            }
        }

    }

    private void setFieldsBuckets6(){

        if(!(BUCKET_MIN_6.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MIN_6)) {
                BUCKETMIN6 = Integer.parseInt(BUCKET_MIN_6.getText());
                //System.out.println(BUCKETMIN6);
            }else{
                //System.out.println("Enter a Valid Min for Bucket 6");
            }
        }

        if(!(BUCKET_MAX_6.getText().isEmpty())) {
            if(isBucketBound(BUCKET_MAX_6)) {
                BUCKETMAX6 = Integer.parseInt(BUCKET_MAX_6.getText());

                //System.out.println(BUCKETMAX6);
            }else{
                //System.out.println("Enter a Valid Max for Bucket 6");
            }
        }

        if(!(BUCKET_NWID_6.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_6)) {
                BUCKETNWID6 = Integer.parseInt(BUCKET_NWID_6.getText());
                //System.out.println(BUCKETNWID6);
            }else{
                // System.out.println("Enter a Valid NWID1 for Bucket 6");
            }
        }


        if(!(BUCKET_NWID_66.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_66)) {
                BUCKETNWID66 = Integer.parseInt(BUCKET_NWID_66.getText());
                //System.out.println(BUCKETNWID66);
            }else{
                //System.out.println("Enter a Valid NWID2 for Bucket 6");
            }
        }

        if(!(BUCKET_NWID_666.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_666)) {
                BUCKETNWID666 = Integer.parseInt(BUCKET_NWID_666.getText());
                //System.out.println(BUCKETNWID666);
            }else{
                //System.out.println("Enter a Valid NWID3 for Bucket 6");
            }
        }

        if(!(BUCKET_NWID_6666.getText().isEmpty())) {
            if(isBucketNWID(BUCKET_NWID_6666)) {
                BUCKETNWID6666 = Integer.parseInt(BUCKET_NWID_6666.getText());
                //System.out.println(BUCKETNWID6666);
            }else{
                //System.out.println("Enter a Valid NWID4 for Bucket 6");
            }
        }

    }

    private void checkBuckets() {
        int j = 0;
        int i = 0;
        int BUCKETMIN1, BUCKETMAX1;
        int BUCKETMIN2 = 0, BUCKETMAX2 = 0;
        int BUCKETMIN3 = 0, BUCKETMAX3 = 0;
        int BUCKETMIN4 = 0, BUCKETMAX4 = 0;
        int BUCKETMIN5 = 0, BUCKETMAX5 = 0;
        int BUCKETMIN6 = 0, BUCKETMAX6 = 0;
        boolean InvalidMinAndMax = false;

        if(!(BUCKET_MIN_1.getText().isEmpty() && BUCKET_MAX_1.getText().isEmpty())) {
            BUCKETMIN1 = Integer.parseInt(BUCKET_MIN_1.getText());
            BUCKETMAX1 = Integer.parseInt(BUCKET_MAX_1.getText());
            if (!validBounds(BUCKET_MIN_1, BUCKET_MAX_1)) {
                InvalidMinAndMax = true;
                BUCKET_MIN_1.setStyle("-fx-text-inner-color: red");
                BUCKET_MAX_1.setStyle("-fx-text-inner-color: red");
                j++;
            }
        } else {
            BUCKETMIN1 = 0;
            BUCKETMAX1 = 0;
        }
        if (!BUCKET_MIN_2.getText().isEmpty() && !BUCKET_MAX_2.getText().isEmpty()) {
            if (BUCKET_NWID_2.getText().isEmpty()) {
                BUCKET_NWID_2.setStyle("-fx-control-inner-background: #ff000099");
            }
            if (!validBounds(BUCKET_MIN_2, BUCKET_MAX_2)) {
                InvalidMinAndMax = true;
                BUCKET_MIN_2.setStyle("-fx-text-inner-color: red");
                BUCKET_MAX_2.setStyle("-fx-text-inner-color: red");
                j++;
            }
        }
        if (!BUCKET_MIN_3.getText().isEmpty() && !BUCKET_MAX_3.getText().isEmpty()) {
            if (BUCKET_NWID_3.getText().isEmpty()) {
                BUCKET_NWID_3.setStyle("-fx-control-inner-background: #ff000099");
            }
            if (!validBounds(BUCKET_MIN_3, BUCKET_MAX_3)) {
                InvalidMinAndMax = true;
                BUCKET_MIN_3.setStyle("-fx-text-inner-color: red");
                BUCKET_MAX_3.setStyle("-fx-text-inner-color: red");
                j++;
            }
        }
        if (!BUCKET_MIN_4.getText().isEmpty() && !BUCKET_MAX_4.getText().isEmpty()) {
            if (BUCKET_NWID_4.getText().isEmpty()) {
                BUCKET_NWID_4.setStyle("-fx-control-inner-background: #ff000099");
            }
            if (!validBounds(BUCKET_MIN_4, BUCKET_MAX_4)) {
                InvalidMinAndMax = true;
                BUCKET_MIN_4.setStyle("-fx-text-inner-color: red");
                BUCKET_MAX_4.setStyle("-fx-text-inner-color: red");
                j++;
            }
        }
        if (!BUCKET_MIN_5.getText().isEmpty() && !BUCKET_MAX_5.getText().isEmpty()) {
            if (BUCKET_NWID_5.getText().isEmpty()) {
                BUCKET_NWID_5.setStyle("-fx-control-inner-background: #ff000099");
            }
            if (!validBounds(BUCKET_MIN_5, BUCKET_MAX_5)) {
                InvalidMinAndMax = true;
                BUCKET_MIN_5.setStyle("-fx-text-inner-color: red");
                BUCKET_MAX_5.setStyle("-fx-text-inner-color: red");
                j++;
            }
        }
        if (!BUCKET_MIN_6.getText().isEmpty() && !BUCKET_MAX_6.getText().isEmpty()) {
            if (BUCKET_NWID_6.getText().isEmpty()) {
                BUCKET_NWID_6.setStyle("-fx-control-inner-background: #ff000099");
            }
            if (!validBounds(BUCKET_MIN_6, BUCKET_MAX_6)) {
                InvalidMinAndMax = true;
                BUCKET_MIN_6.setStyle("-fx-text-inner-color: red");
                BUCKET_MAX_6.setStyle("-fx-text-inner-color: red");
                j++;
            }
        }

        if (InvalidMinAndMax) {
            BucketBoundLabel.setVisible(true);
        } else {
            BucketBoundLabel.setVisible(false);
        }


        if (bucket_Counter >= 2) {
            BUCKETMIN2 = Integer.parseInt(BUCKET_MIN_2.getText());
            BUCKETMAX2 = Integer.parseInt(BUCKET_MAX_2.getText());
        }
        if (bucket_Counter >= 3) {
            BUCKETMIN3 = Integer.parseInt(BUCKET_MIN_3.getText());
            BUCKETMAX3 = Integer.parseInt(BUCKET_MAX_3.getText());
        }
        if (bucket_Counter >= 4) {
            BUCKETMIN4 = Integer.parseInt(BUCKET_MIN_4.getText());
            BUCKETMAX4 = Integer.parseInt(BUCKET_MAX_4.getText());
        }
        if (bucket_Counter >= 5) {
            BUCKETMIN5 = Integer.parseInt(BUCKET_MIN_5.getText());
            BUCKETMAX5 = Integer.parseInt(BUCKET_MAX_5.getText());
        }
        if (bucket_Counter == 6) {
            BUCKETMIN6 = Integer.parseInt(BUCKET_MIN_6.getText());
            BUCKETMAX6 = Integer.parseInt(BUCKET_MAX_6.getText());
        }

        if (bucket_Counter >= 2
                && !checkBucketsHelper(BUCKETMIN1, BUCKETMAX1, BUCKETMIN2, BUCKETMAX2)) {
            BUCKET_MIN_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MIN_2.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_2.setStyle("-fx-text-inner-color: orange");
            i++;
        }
        if (bucket_Counter >= 3
                && !checkBucketsHelper(BUCKETMIN1, BUCKETMAX1, BUCKETMIN3, BUCKETMAX3)) {
            BUCKET_MIN_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MIN_3.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_3.setStyle("-fx-text-inner-color: orange");
            i++;
        }
        if (bucket_Counter >= 4
                && !checkBucketsHelper(BUCKETMIN1, BUCKETMAX1, BUCKETMIN4, BUCKETMAX4)) {
            BUCKET_MIN_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MIN_4.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_4.setStyle("-fx-text-inner-color: orange");
            i++;
        }
        if (bucket_Counter >= 5
                && !checkBucketsHelper(BUCKETMIN1, BUCKETMAX1, BUCKETMIN5, BUCKETMAX5)) {
            BUCKET_MIN_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MIN_5.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_5.setStyle("-fx-text-inner-color: orange");
            i++;
        }
        if (bucket_Counter == 6
                && !checkBucketsHelper(BUCKETMIN1, BUCKETMAX1, BUCKETMIN6, BUCKETMAX6)) {
            BUCKET_MIN_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_1.setStyle("-fx-text-inner-color: orange");
            BUCKET_MIN_6.setStyle("-fx-text-inner-color: orange");
            BUCKET_MAX_6.setStyle("-fx-text-inner-color: orange");
            i++;
        }
        if (bucket_Counter >= 2) {
            if (bucket_Counter >= 3
                    && !checkBucketsHelper(BUCKETMIN2, BUCKETMAX2, BUCKETMIN3, BUCKETMAX3)) {
                BUCKET_MIN_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_3.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_3.setStyle("-fx-text-inner-color: orange");
                i++;
            }
            if (bucket_Counter >= 4
                    && !checkBucketsHelper(BUCKETMIN2, BUCKETMAX2, BUCKETMIN4, BUCKETMAX4)) {
                BUCKET_MIN_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_4.setStyle("-fx-text-inner-color: orange");
                i++;
            }
            if (bucket_Counter >= 5
                    && !checkBucketsHelper(BUCKETMIN2, BUCKETMAX2, BUCKETMIN5, BUCKETMAX5)) {
                BUCKET_MIN_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_5.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_5.setStyle("-fx-text-inner-color: orange");
                i++;
            }
            if (bucket_Counter == 6
                    && !checkBucketsHelper(BUCKETMIN2, BUCKETMAX2, BUCKETMIN6, BUCKETMAX6)) {
                BUCKET_MIN_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_2.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_6.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_6.setStyle("-fx-text-inner-color: orange");
                i++;
            }
        }
        if (bucket_Counter >= 3) {
            if (bucket_Counter >= 4
                    && !checkBucketsHelper(BUCKETMIN3, BUCKETMAX3, BUCKETMIN4, BUCKETMAX4)) {
                BUCKET_MIN_3.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_3.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_4.setStyle("-fx-text-inner-color: orange");
                i++;
            }
            if (bucket_Counter >= 5
                    && !checkBucketsHelper(BUCKETMIN3, BUCKETMAX3, BUCKETMIN5, BUCKETMAX5)) {
                BUCKET_MIN_3.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_3.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_5.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_5.setStyle("-fx-text-inner-color: orange");
                i++;
            }
            if (bucket_Counter == 6
                    && !checkBucketsHelper(BUCKETMIN3, BUCKETMAX3, BUCKETMIN6, BUCKETMAX6)) {
                BUCKET_MIN_3.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_3.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_6.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_6.setStyle("-fx-text-inner-color: orange");
                i++;
            }
        }
        if (bucket_Counter >= 4) {
            if (bucket_Counter >= 5
                    && !checkBucketsHelper(BUCKETMIN4, BUCKETMAX4, BUCKETMIN5, BUCKETMAX5)) {
                BUCKET_MIN_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_5.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_5.setStyle("-fx-text-inner-color: orange");
                i++;
            }
            if (bucket_Counter == 6
                    && !checkBucketsHelper(BUCKETMIN4, BUCKETMAX4, BUCKETMIN6, BUCKETMAX6)) {
                BUCKET_MIN_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_6.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_6.setStyle("-fx-text-inner-color: orange");
                i++;
            }
        }
        if (bucket_Counter >= 5) {
            if (bucket_Counter == 6
                    && !checkBucketsHelper(BUCKETMIN4, BUCKETMAX4, BUCKETMIN6, BUCKETMAX6)) {
                BUCKET_MIN_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_4.setStyle("-fx-text-inner-color: orange");
                BUCKET_MIN_6.setStyle("-fx-text-inner-color: orange");
                BUCKET_MAX_6.setStyle("-fx-text-inner-color: orange");
                i++;
            }
        }

        if (i == 0) {
            whiteoutBuckets();

            if(BUCKET_MIN_1.getText().isEmpty() || BUCKET_MAX_1.getText().isEmpty()){
                BUCKET_MIN_1.setStyle("-fx-control-inner-background: #ff000099");
                BUCKET_MAX_1.setStyle("-fx-control-inner-background: #ff000099");
            }
            bucketError = false;
        } else {
            bucketError = true;
        }

        if (j != 0) {
            BucketBoundLabel.setVisible(true);
        } else {
            BucketBoundLabel.setVisible(false);
        }

        if(bucketError) {
            BUCKET_ERROR.setVisible(true);
        } else {
            BUCKET_ERROR.setVisible(false);

        }

    }

    private boolean checkBucketNWIDs() {
        TextField[] NWIDS = {BUCKET_NWID_1, BUCKET_NWID_11, BUCKET_NWID_111, BUCKET_NWID_1111,
                BUCKET_NWID_2, BUCKET_NWID_22, BUCKET_NWID_222, BUCKET_NWID_2222,
                BUCKET_NWID_3, BUCKET_NWID_33, BUCKET_NWID_333, BUCKET_NWID_3333,
                BUCKET_NWID_4, BUCKET_NWID_44, BUCKET_NWID_444, BUCKET_NWID_4444,
                BUCKET_NWID_5, BUCKET_NWID_55, BUCKET_NWID_555, BUCKET_NWID_5555,
                BUCKET_NWID_6, BUCKET_NWID_66, BUCKET_NWID_666, BUCKET_NWID_6666};

        int k = 0;
        int j = 0;
        for (int i = 0; i < NWIDS.length; i++) {
            if (!NWIDS[i].getText().isEmpty() && !isBucketNWID(NWIDS[i])) {
                NWIDS[i].setStyle("-fx-text-inner-color: red");
                k++;
            } else if (NWIDS[i].getText().isEmpty() && (i == 0 || i == 4 || i == 8 || i == 12 || i == 16 || i == 20) && ((i / 4) + 1 <= bucket_Counter)) {
                NWIDS[i].setStyle("-fx-control-inner-background: #ff000099");
                j++;
            }
        }

        if (k > 0) {
            BucketNWIDBoundLabel.setVisible(true);
            return true;
        } else if (j > 0){
            return true;
        } else {
            BucketNWIDBoundLabel.setVisible(false);
            return false;
        }
    }

    private ArrayList<Bucket> bucketLogic() {
        TextField[] BUCKET_1 = {BUCKET_MIN_1, BUCKET_MAX_1, BUCKET_NWID_1, BUCKET_NWID_11, BUCKET_NWID_111, BUCKET_NWID_1111};
        TextField[] BUCKET_2 = {BUCKET_MIN_2, BUCKET_MAX_2, BUCKET_NWID_2, BUCKET_NWID_22, BUCKET_NWID_222, BUCKET_NWID_2222};
        TextField[] BUCKET_3 = {BUCKET_MIN_3, BUCKET_MAX_3, BUCKET_NWID_3, BUCKET_NWID_33, BUCKET_NWID_333, BUCKET_NWID_3333};
        TextField[] BUCKET_4 = {BUCKET_MIN_4, BUCKET_MAX_4, BUCKET_NWID_4, BUCKET_NWID_44, BUCKET_NWID_444, BUCKET_NWID_4444};
        TextField[] BUCKET_5 = {BUCKET_MIN_5, BUCKET_MAX_5, BUCKET_NWID_5, BUCKET_NWID_55, BUCKET_NWID_555, BUCKET_NWID_5555};
        TextField[] BUCKET_6 = {BUCKET_MIN_6, BUCKET_MAX_6, BUCKET_NWID_6, BUCKET_NWID_66, BUCKET_NWID_666, BUCKET_NWID_6666};
        TextField[][] BUCKETS = {BUCKET_1, BUCKET_2, BUCKET_3, BUCKET_4, BUCKET_5, BUCKET_6};
        Bucket b1 = null;
        Bucket b2 = null;
        Bucket b3 = null;
        Bucket b4 = null;
        Bucket b5 = null;
        Bucket b6 = null;

        if (!(BUCKET_1[0].getText().isEmpty() && BUCKET_1[1].getText().isEmpty())) {
            b1 = new Bucket(Integer.parseInt(BUCKET_MIN_1.getText()),
                    Integer.parseInt(BUCKET_MAX_1.getText()));
            ArrayList<Integer> NWIDS1 = new ArrayList<>();
            for (int i = 2; i < BUCKET_1.length; i++) {
                try {
                    NWIDS1.add(Integer.parseInt(BUCKET_1[i].getText()));
                } catch (NumberFormatException e) {
                    NWIDS1.add(null);
                }
            }
            b1.setNWIDS(NWIDS1);
            System.out.println(b1.getNWIDS().get(0));
        }
        if (!(BUCKET_2[0].getText().isEmpty() && BUCKET_2[2].getText().isEmpty())) {
            b2 = new Bucket(Integer.parseInt(BUCKET_MIN_2.getText()),
                    Integer.parseInt(BUCKET_MAX_2.getText()));
            ArrayList<Integer> NWIDS2 = new ArrayList<>();
            for (int i = 2; i < BUCKET_2.length; i++) {
                try {
                    NWIDS2.add(Integer.parseInt(BUCKET_2[i].getText()));
                } catch (NumberFormatException e) {
                    NWIDS2.add(null);
                }
            }
            b2.setNWIDS(NWIDS2);
        }
        if (!(BUCKET_3[0].getText().isEmpty() && BUCKET_3[3].getText().isEmpty())) {
            b3 = new Bucket(Integer.parseInt(BUCKET_MIN_3.getText()),
                    Integer.parseInt(BUCKET_MAX_3.getText()));
            ArrayList<Integer> NWIDS3 = new ArrayList<>();
            for (int i = 2; i < BUCKET_3.length; i++) {
                try {
                    NWIDS3.add(Integer.parseInt(BUCKET_3[i].getText()));
                } catch (NumberFormatException e) {
                    NWIDS3.add(null);
                }
            }
            b3.setNWIDS(NWIDS3);
        }
        if (!(BUCKET_4[0].getText().isEmpty() && BUCKET_4[4].getText().isEmpty())) {
            b4 = new Bucket(Integer.parseInt(BUCKET_MIN_4.getText()),
                    Integer.parseInt(BUCKET_MAX_4.getText()));
            ArrayList<Integer> NWIDS4 = new ArrayList<>();
            for (int i = 2; i < BUCKET_4.length; i++) {
                try {
                    NWIDS4.add(Integer.parseInt(BUCKET_4[i].getText()));
                } catch (NumberFormatException e) {
                    NWIDS4.add(null);
                }
            }
            b4.setNWIDS(NWIDS4);
        }
        if (!(BUCKET_5[0].getText().isEmpty() && BUCKET_5[5].getText().isEmpty())) {
            b5 = new Bucket(Integer.parseInt(BUCKET_MIN_5.getText()),
                    Integer.parseInt(BUCKET_MAX_5.getText()));
            ArrayList<Integer> NWIDS5 = new ArrayList<>();
            for (int i = 2; i < BUCKET_5.length; i++) {
                try {
                    NWIDS5.add(Integer.parseInt(BUCKET_5[i].getText()));
                } catch (NumberFormatException e) {
                    NWIDS5.add(null);
                }
            }
            b5.setNWIDS(NWIDS5);
        }
        if (!(BUCKET_6[0].getText().isEmpty() && BUCKET_6[1].getText().isEmpty())) {
            b6 = new Bucket(Integer.parseInt(BUCKET_MIN_6.getText()),
                    Integer.parseInt(BUCKET_MAX_6.getText()));
            ArrayList<Integer> NWIDS6 = new ArrayList<>();
            for (int i = 2; i < BUCKET_6.length; i++) {
                try {
                    NWIDS6.add(Integer.parseInt(BUCKET_6[i].getText()));
                } catch (NumberFormatException e) {
                    NWIDS6.add(null);
                }
            }
            b6.setNWIDS(NWIDS6);
        }
        ArrayList<Bucket> finalBuckets = new ArrayList<>();
        if(b1 != null) {
            finalBuckets.add(b1);
        }
        if(b2 != null) {
            finalBuckets.add(b2);
        }
        if(b3 != null) {
            finalBuckets.add(b3);
        }
        if(b4 != null) {
            finalBuckets.add(b4);
        }
        if(b5 != null) {
            finalBuckets.add(b5);
        }
        if(b6 != null) {
            finalBuckets.add(b6);
        }
        boolean split;
        int splitCount = bucket_Counter - 1;
        for (int i = bucket_Counter - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                split = checkOverlap(finalBuckets.get(i), finalBuckets.get(j), finalBuckets, j);
                if (split) {
                    splitCount++;
                    i = splitCount;
                    j = splitCount - 1;
                    break;
                }
            }
        }
        for (Bucket b : finalBuckets) {
            if (b != null) {
                System.out.println("Min: " + b.getMin() + " Max: " + b.getMax() + "nwid :" + b.getNWIDS());
            }
        }
        return finalBuckets;
    }
    public boolean checkOverlap(Bucket newest, Bucket older, ArrayList<Bucket> arr, int position) {
        if (older.getMin() >= newest.getMin() && older.getMax() <= newest.getMax()) {
            older.setNWIDS(null);
            older.setMax(-1);
            older.setMin(-1);
            return false;
        } else if (newest.getMin() > older.getMin() && newest.getMax() < older.getMax()) {
//            Bucket newBucket = new Bucket(newest.getMax() + 1, older.getMax());
//            older.setMax(newest.getMin() - 1);
//            arr.add(newBucket);
//            newBucket.setNWIDS(older.getNWIDS());
            if (!older.getSplit()) {
                int minSplit = newest.getMin();
                int maxSplit = newest.getMax();
                for (int i = position + 1; i < arr.size(); i++) {
                    if (older.getMin() < arr.get(i).getMin() && older.getMax() > arr.get(i).getMax()) {
                        if (minSplit > arr.get(i).getMin()) {
                            minSplit = arr.get(i).getMin();
                        }
                        if (maxSplit < arr.get(i).getMax()) {
                            maxSplit = arr.get(i).getMax();
                        }
                    }
                }
                Bucket newBucket = new Bucket(maxSplit + 1, older.getMax());
                newBucket.setNWIDS(older.getNWIDS());
                arr.add(position, newBucket);
                older.setMax(minSplit - 1);
                older.setSplit(true);
                newBucket.setSplit(true);
                return true;
            }
        } else if (older.getMin() > newest.getMin() &&
                older.getMin() < newest.getMax() &&
                older.getMax() > newest.getMax()) {
            older.setMin(newest.getMax() + 1);
            return false;
        } else if (older.getMax() > newest.getMin() &&
                older.getMax() < newest.getMax() &&
                older.getMin() < newest.getMin()) {
            older.setMax(newest.getMin() - 1);
            return false;
        }
        return false;
    }


    private boolean checkBucketsHelper(int min, int max, int left, int right) {
        if (left < min && right < min) {
            return true;
        } else return left > max && right > max;
    }

    private void whiteoutBuckets() {
        BUCKET_MIN_1.setStyle("");
        BUCKET_MAX_1.setStyle("");
        BUCKET_MIN_2.setStyle("");
        BUCKET_MAX_2.setStyle("");
        BUCKET_MIN_3.setStyle("");
        BUCKET_MAX_3.setStyle("");
        BUCKET_MIN_4.setStyle("");
        BUCKET_MAX_4.setStyle("");
        BUCKET_MIN_5.setStyle("");
        BUCKET_MAX_5.setStyle("");
        BUCKET_MIN_6.setStyle("");
        BUCKET_MAX_6.setStyle("");
    }

    private void whiteoutBucketNWIDS() {
        BUCKET_NWID_1.setStyle("");
        BUCKET_NWID_11.setStyle("");
        BUCKET_NWID_111.setStyle("");
        BUCKET_NWID_1111.setStyle("");
        BUCKET_NWID_2.setStyle("");
        BUCKET_NWID_22.setStyle("");
        BUCKET_NWID_222.setStyle("");
        BUCKET_NWID_2222.setStyle("");
        BUCKET_NWID_3.setStyle("");
        BUCKET_NWID_33.setStyle("");
        BUCKET_NWID_333.setStyle("");
        BUCKET_NWID_3333.setStyle("");
        BUCKET_NWID_4.setStyle("");
        BUCKET_NWID_44.setStyle("");
        BUCKET_NWID_444.setStyle("");
        BUCKET_NWID_4444.setStyle("");
        BUCKET_NWID_5.setStyle("");
        BUCKET_NWID_55.setStyle("");
        BUCKET_NWID_555.setStyle("");
        BUCKET_NWID_5555.setStyle("");
        BUCKET_NWID_6.setStyle("");
        BUCKET_NWID_66.setStyle("");
        BUCKET_NWID_666.setStyle("");
        BUCKET_NWID_6666.setStyle("");
    }

    private void addMIDNWID() {
        if(midnwid_Counter <= 6) {
            if (midnwid_Counter == 1)
                MIDNWID_1.setVisible(true);
            if (midnwid_Counter == 2)
                MIDNWID_2.setVisible(true);
            if (midnwid_Counter == 3)
                MIDNWID_3.setVisible(true);
            if (midnwid_Counter == 4)
                MIDNWID_4.setVisible(true);
            if (midnwid_Counter == 5)
                MIDNWID_5.setVisible(true);
            if (midnwid_Counter == 6)
                MIDNWID_6.setVisible(true);

            midnwid_Counter++;
        }

    }

    private void removeMIDNWID() {
        int i = 1;
        if(midnwid_Counter >= 1) {

            if (midnwid_Counter - 1 == 1) {
                MIDNWID_1.clear();
                MIDNWID_1.setVisible(false);
                i = 0;
            }
            if (midnwid_Counter - 1 == 2) {
                MIDNWID_2.clear();
                MIDNWID_2.setVisible(false);
                i = 0;
            }
            if (midnwid_Counter - 1 == 3) {
                MIDNWID_3.clear();
                MIDNWID_3.setVisible(false);
                i = 0;
            }
            if (midnwid_Counter - 1 == 4) {
                MIDNWID_4.clear();
                MIDNWID_4.setVisible(false);
                i = 0;
            }
            if (midnwid_Counter - 1 == 5) {
                MIDNWID_5.clear();
                MIDNWID_5.setVisible(false);
                i = 0;
            }
            if (midnwid_Counter - 1 == 6) {
                MIDNWID_6.clear();
                MIDNWID_6.setVisible(false);
                i = 0;
            }

            if (i == 0) {
                midnwid_Counter--;
            }
        }

    }

    private void addBINNWID1() {
        if(binnwid_Counter10 <= 6) {
            if (binnwid_Counter10 == 1)
                BINNWID_11.setVisible(true);
            if (binnwid_Counter10 == 2)
                BINNWID_12.setVisible(true);
            if (binnwid_Counter10 == 3)
                BINNWID_13.setVisible(true);
            if (binnwid_Counter10 == 4)
                BINNWID_14.setVisible(true);
            if (binnwid_Counter10 == 5)
                BINNWID_15.setVisible(true);
            if (binnwid_Counter10 == 6)
                BINNWID_16.setVisible(true);

            binnwid_Counter10++;
        }

    }

    private void removeBINNWID1() {
        int i = 1;

        if(binnwid_Counter10 - 1 == 1) {
            BINNWID_11.clear();
            BINNWID_11.setVisible(false);
            i = 0;
        }
        if(binnwid_Counter10 - 1 == 2) {
            BINNWID_12.clear();
            BINNWID_12.setVisible(false);
            i = 0;
        }
        if(binnwid_Counter10 - 1 == 3) {
            BINNWID_13.clear();
            BINNWID_13.setVisible(false);
            i = 0;
        }
        if(binnwid_Counter10 - 1 == 4) {
            BINNWID_14.clear();
            BINNWID_14.setVisible(false);
            i = 0;
        }
        if(binnwid_Counter10 - 1 == 5) {
            BINNWID_15.clear();
            BINNWID_15.setVisible(false);
            i = 0;
        }
        if(binnwid_Counter10 - 1 == 6) {
            BINNWID_16.clear();
            BINNWID_16.setVisible(false);
            i = 0;
        }

        if (i == 0) {
            binnwid_Counter10--;
        }

    }

    private void addColBin() {
        if(bin_Counter <= 3) {
            if(bin_Counter == 1) {
                BIN20.setVisible(true);
                BINNWID_20.setVisible(true);
                BINPANE11.setVisible(true);
                BINNWID_ADD_2.setVisible(true);
                BINNWID_REMOVE_2.setVisible(true);
                BINLEN_2.setVisible(true);

            }
            if(bin_Counter == 2) {
                BIN30.setVisible(true);
                BINNWID_30.setVisible(true);
                BINPANE111.setVisible(true);
                BINNWID_ADD_3.setVisible(true);
                BINNWID_REMOVE_3.setVisible(true);
                BINLEN_3.setVisible(true);

            }
            if(bin_Counter == 3) {
                BIN40.setVisible(true);
                BINNWID_40.setVisible(true);
                BINPANE1111.setVisible(true);
                BINNWID_ADD_4.setVisible(true);
                BINNWID_REMOVE_4.setVisible(true);
                BINLEN_4.setVisible(true);
            }
            bin_Counter++;
        }


    }

    private void removeColBin() {
        int i = 1;

        if(bin_Counter - 1 == 1) {
            BIN20.setVisible(false);
            BINPANE11.setVisible(false);
            BINNWID_ADD_2.setVisible(false);
            BINNWID_REMOVE_2.setVisible(false);
            BINLEN_2.setVisible(false);
            BIN20.clear();
            BINLEN_2.clear();
            BINNWID_20.clear();
            BINNWID_21.clear();
            BINNWID_22.clear();
            BINNWID_23.clear();
            BINNWID_24.clear();
            BINNWID_25.clear();
            BINNWID_26.clear();


            i = 0;
        }
        if(bin_Counter - 1 == 2) {
            BIN30.setVisible(false);
            BINPANE111.setVisible(false);
            BINNWID_ADD_3.setVisible(false);
            BINNWID_REMOVE_3.setVisible(false);
            BINLEN_3.setVisible(false);
            BIN30.clear();
            BINLEN_3.clear();
            BINNWID_30.clear();
            BINNWID_31.clear();
            BINNWID_32.clear();
            BINNWID_33.clear();
            BINNWID_34.clear();
            BINNWID_35.clear();
            BINNWID_36.clear();
            i=0;
        }
        if(bin_Counter - 1  == 3) {
            BIN40.setVisible(false);

            BINPANE1111.setVisible(false);
            BINNWID_ADD_4.setVisible(false);
            BINNWID_REMOVE_4.setVisible(false);
            BINLEN_4.setVisible(false);
            BIN40.clear();
            BINLEN_4.clear();
            BINNWID_40.clear();
            BINNWID_41.clear();
            BINNWID_42.clear();
            BINNWID_43.clear();
            BINNWID_44.clear();
            BINNWID_45.clear();
            BINNWID_46.clear();

            i = 0;
        }

        if (i == 0) {
            bin_Counter--;
        }

    }

    private void addBINNWID2() {
        if(binnwid_Counter20 <= 6 && BINNWID_20.isVisible()) {
            if (binnwid_Counter20 == 1)
                BINNWID_21.setVisible(true);
            if (binnwid_Counter20 == 2)
                BINNWID_22.setVisible(true);
            if (binnwid_Counter20 == 3)
                BINNWID_23.setVisible(true);
            if (binnwid_Counter20 == 4)
                BINNWID_24.setVisible(true);
            if (binnwid_Counter20 == 5)
                BINNWID_25.setVisible(true);
            if (binnwid_Counter20 == 6)
                BINNWID_26.setVisible(true);

            binnwid_Counter20++;
        }

    }

    private void removeBINNWID2() {
        if(BINNWID_21.isVisible()) {
            if (binnwid_Counter20 - 1 == 1) {
                BINNWID_21.clear();
                BINNWID_21.setVisible(false);
            }
            if (binnwid_Counter20 - 1 == 2) {
                BINNWID_22.setVisible(false);
                BINNWID_22.clear();
            }
            if (binnwid_Counter20 - 1 == 3) {
                BINNWID_23.clear();
                BINNWID_23.setVisible(false);
            }
            if (binnwid_Counter20 - 1 == 4) {
                BINNWID_24.clear();
                BINNWID_24.setVisible(false);
            }
            if (binnwid_Counter20 - 1 == 5) {
                BINNWID_25.clear();
                BINNWID_25.setVisible(false);
            }
            if (binnwid_Counter20 - 1 == 6) {
                BINNWID_26.clear();
                BINNWID_26.setVisible(false);
            }

            binnwid_Counter20--;
        }
    }

    private void addBINNWID3() {
        if(binnwid_Counter30 <= 6 && BINNWID_30.isVisible()) {
            if (binnwid_Counter30 == 1)
                BINNWID_31.setVisible(true);
            if (binnwid_Counter30 == 2)
                BINNWID_32.setVisible(true);
            if (binnwid_Counter30 == 3)
                BINNWID_33.setVisible(true);
            if (binnwid_Counter30 == 4)
                BINNWID_34.setVisible(true);
            if (binnwid_Counter30 == 5)
                BINNWID_35.setVisible(true);
            if (binnwid_Counter30 == 6)
                BINNWID_36.setVisible(true);

            binnwid_Counter30++;
        }

    }

    private void removeBINNWID3() {
        if(BINNWID_31.isVisible()) {
            if (binnwid_Counter30 - 1 == 1) {
                BINNWID_31.clear();
                BINNWID_31.setVisible(false);
            }
            if (binnwid_Counter30 - 1 == 2) {
                BINNWID_32.clear();
                BINNWID_32.setVisible(false);
            }
            if (binnwid_Counter30 - 1 == 3) {
                BINNWID_33.clear();
                BINNWID_33.setVisible(false);
            }
            if (binnwid_Counter30 - 1 == 4) {
                BINNWID_34.clear();
                BINNWID_34.setVisible(false);
            }
            if (binnwid_Counter30 - 1 == 5) {
                BINNWID_35.clear();
                BINNWID_35.setVisible(false);
            }
            if (binnwid_Counter30 - 1 == 6) {
                BINNWID_36.clear();
                BINNWID_36.setVisible(false);
            }

            binnwid_Counter30--;
        }
    }

    private void addBINNWID4() {
        if(binnwid_Counter40 <= 6 && BINNWID_40.isVisible()) {
            if (binnwid_Counter40 == 1)
                BINNWID_41.setVisible(true);
            if (binnwid_Counter40 == 2)
                BINNWID_42.setVisible(true);
            if (binnwid_Counter40 == 3)
                BINNWID_43.setVisible(true);
            if (binnwid_Counter40 == 4)
                BINNWID_44.setVisible(true);
            if (binnwid_Counter40 == 5)
                BINNWID_45.setVisible(true);
            if (binnwid_Counter40 == 6)
                BINNWID_46.setVisible(true);

            binnwid_Counter40++;
        }

    }

    private void removeBINNWID4() {
        if(BINNWID_41.isVisible()) {
            if (binnwid_Counter40 - 1 == 1) {
                BINNWID_41.clear();
                BINNWID_41.setVisible(false);
            }
            if (binnwid_Counter40 - 1 == 2) {
                BINNWID_42.clear();
                BINNWID_42.setVisible(false);
            }
            if (binnwid_Counter40 - 1 == 3) {
                BINNWID_43.clear();
                BINNWID_43.setVisible(false);
            }
            if (binnwid_Counter40 - 1 == 4) {
                BINNWID_44.clear();
                BINNWID_44.setVisible(false);
            }
            if (binnwid_Counter40 - 1 == 5) {
                BINNWID_45.clear();
                BINNWID_45.setVisible(false);
            }
            if (binnwid_Counter40 - 1 == 6) {
                BINNWID_46.clear();
                BINNWID_46.setVisible(false);
            }

            binnwid_Counter40--;
        }
    }

    private void clearFields() {
        TextField[] row1 = {MID,MIDNWID_0,MIDNWID_1,MIDNWID_2,MIDNWID_3,MIDNWID_4,MIDNWID_5,MIDNWID_6,
                BIN10,BINLEN_1,BINNWID_10,BINNWID_11,BINNWID_12,BINNWID_13,BINNWID_14,BINNWID_15,BINNWID_16,
                BIN20,BINLEN_2,BINNWID_20,BINNWID_21,BINNWID_22,BINNWID_23,BINNWID_24,BINNWID_25,BINNWID_26,
                BIN30,BINLEN_3,BINNWID_30,BINNWID_31,BINNWID_32,BINNWID_33,BINNWID_34,BINNWID_35,BINNWID_36,
                BIN40,BINLEN_4,BINNWID_40,BINNWID_41,BINNWID_42,BINNWID_43,BINNWID_44,BINNWID_45,BINNWID_46,
                BUCKET_MIN_1,BUCKET_MAX_1,BUCKET_NWID_1,BUCKET_NWID_11,BUCKET_NWID_111,BUCKET_NWID_1111,
                BUCKET_MIN_2,BUCKET_MAX_2,BUCKET_NWID_2,BUCKET_NWID_22,BUCKET_NWID_222,BUCKET_NWID_2222,
                BUCKET_MIN_3,BUCKET_MAX_3,BUCKET_NWID_3,BUCKET_NWID_33,BUCKET_NWID_333,BUCKET_NWID_3333,
                BUCKET_MIN_4,BUCKET_MAX_4,BUCKET_NWID_4,BUCKET_NWID_44,BUCKET_NWID_444,BUCKET_NWID_4444,
                BUCKET_MIN_5,BUCKET_MAX_5,BUCKET_NWID_5,BUCKET_NWID_55,BUCKET_NWID_555,BUCKET_NWID_5555,
                BUCKET_MIN_6,BUCKET_MAX_6,BUCKET_NWID_6,BUCKET_NWID_66,BUCKET_NWID_666,BUCKET_NWID_6666, HOST, PORT};
        for(int i = 0; i < clearAll.length; i++) {
            clearAll[i] = false;
        }
        for(int i = 0; i < row1.length; i++) {
            row1[i].setStyle("");
            row1[i].clear();
        }
        BUCKET_ERROR.setVisible(false);
        BINNWID_ERROR.setVisible(false);
        BINLENGTH_ERROR.setVisible(false);
        BIN_ERROR.setVisible(false);
        MID_ERROR.setVisible(false);
        BucketNWIDBoundLabel.setVisible(false);
        BucketBoundLabel.setVisible(false);

    }
    String userName = System.getProperty("user.name");
    public void saveData(){
        TextField[] row1 = {MID,MIDNWID_0,MIDNWID_1,MIDNWID_2,MIDNWID_3,MIDNWID_4,MIDNWID_5,MIDNWID_6,
                BIN10,BINLEN_1,BINNWID_10,BINNWID_11,BINNWID_12,BINNWID_13,BINNWID_14,BINNWID_15,BINNWID_16,
                BIN20,BINLEN_2,BINNWID_20,BINNWID_21,BINNWID_22,BINNWID_23,BINNWID_24,BINNWID_25,BINNWID_26,
                BIN30,BINLEN_3,BINNWID_30,BINNWID_31,BINNWID_32,BINNWID_33,BINNWID_34,BINNWID_35,BINNWID_36,
                BIN40,BINLEN_4,BINNWID_40,BINNWID_41,BINNWID_42,BINNWID_43,BINNWID_44,BINNWID_45,BINNWID_46,
                BUCKET_MIN_1,BUCKET_MAX_1,BUCKET_NWID_1,BUCKET_NWID_11,BUCKET_NWID_111,BUCKET_NWID_1111,
                BUCKET_MIN_2,BUCKET_MAX_2,BUCKET_NWID_2,BUCKET_NWID_22,BUCKET_NWID_222,BUCKET_NWID_2222,
                BUCKET_MIN_3,BUCKET_MAX_3,BUCKET_NWID_3,BUCKET_NWID_33,BUCKET_NWID_333,BUCKET_NWID_3333,
                BUCKET_MIN_4,BUCKET_MAX_4,BUCKET_NWID_4,BUCKET_NWID_44,BUCKET_NWID_444,BUCKET_NWID_4444,
                BUCKET_MIN_5,BUCKET_MAX_5,BUCKET_NWID_5,BUCKET_NWID_55,BUCKET_NWID_555,BUCKET_NWID_5555,
                BUCKET_MIN_6,BUCKET_MAX_6,BUCKET_NWID_6,BUCKET_NWID_66,BUCKET_NWID_666,BUCKET_NWID_6666, HOST, PORT};
        try {
            File file = new File("C:/Users/" + userName + "/Documents/drd-gui-data.txt");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i < row1.length; i++) {
                if(row1[i].getText().equals("")){
                    pw.println("null");
                } else {
                    pw.println(row1[i].getText());
                }
            }
            pw.println(bin_Counter);
            pw.println(midnwid_Counter);
            pw.println(binnwid_Counter10);
            pw.println(binnwid_Counter20);
            pw.println(binnwid_Counter30);
            pw.println(binnwid_Counter40);
            pw.println(bucket_Counter);


            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readData() {
        TextField[] row1 = {MID,MIDNWID_0,MIDNWID_1,MIDNWID_2,MIDNWID_3,MIDNWID_4,MIDNWID_5,MIDNWID_6,
                BIN10,BINLEN_1,BINNWID_10,BINNWID_11,BINNWID_12,BINNWID_13,BINNWID_14,BINNWID_15,BINNWID_16,
                BIN20,BINLEN_2,BINNWID_20,BINNWID_21,BINNWID_22,BINNWID_23,BINNWID_24,BINNWID_25,BINNWID_26,
                BIN30,BINLEN_3,BINNWID_30,BINNWID_31,BINNWID_32,BINNWID_33,BINNWID_34,BINNWID_35,BINNWID_36,
                BIN40,BINLEN_4,BINNWID_40,BINNWID_41,BINNWID_42,BINNWID_43,BINNWID_44,BINNWID_45,BINNWID_46,
                BUCKET_MIN_1,BUCKET_MAX_1,BUCKET_NWID_1,BUCKET_NWID_11,BUCKET_NWID_111,BUCKET_NWID_1111,
                BUCKET_MIN_2,BUCKET_MAX_2,BUCKET_NWID_2,BUCKET_NWID_22,BUCKET_NWID_222,BUCKET_NWID_2222,
                BUCKET_MIN_3,BUCKET_MAX_3,BUCKET_NWID_3,BUCKET_NWID_33,BUCKET_NWID_333,BUCKET_NWID_3333,
                BUCKET_MIN_4,BUCKET_MAX_4,BUCKET_NWID_4,BUCKET_NWID_44,BUCKET_NWID_444,BUCKET_NWID_4444,
                BUCKET_MIN_5,BUCKET_MAX_5,BUCKET_NWID_5,BUCKET_NWID_55,BUCKET_NWID_555,BUCKET_NWID_5555,
                BUCKET_MIN_6,BUCKET_MAX_6,BUCKET_NWID_6,BUCKET_NWID_66,BUCKET_NWID_666,BUCKET_NWID_6666, HOST, PORT};
        int[] num = {bin_Counter, midnwid_Counter,binnwid_Counter10,binnwid_Counter20,binnwid_Counter30,binnwid_Counter40,
                bucket_Counter};
        //String[] arr = {host, port};

        try {
            File file = new File("C:/Users/" + userName + "/Documents/drd-gui-data.txt");
            Scanner scan = new Scanner(file);
            int i =0;
            int j = 1;
            int k = 0;
            while(scan.hasNext()) {
                String line = scan.nextLine();
                if(!(line.equals("null"))) {
                    if(j > 82 ) {
                        num[k] = Integer.parseInt(line);
                        k++;
                    }else {
                        row1[i].appendText(line);
                        row1[i].setVisible(true);
                        if(row1[i] == BIN20 && row1[i].isVisible() ){
                            BINNWID_ADD_2.setVisible(true);
                            BINNWID_REMOVE_2.setVisible(true);
                        }else if(row1[i] == BIN30 && row1[i].isVisible()){
                            BINNWID_ADD_3.setVisible(true);
                            BINNWID_REMOVE_3.setVisible(true);
                        }else if(row1[i] == BIN40 && row1[i].isVisible()){
                            BINNWID_ADD_4.setVisible(true);
                            BINNWID_REMOVE_4.setVisible(true);
                        }
                    }
                }
                i++;
                j++;
            }
            scan.close();

            bin_Counter = num[0];
            midnwid_Counter = num[1];
            binnwid_Counter10 = num[2];
            binnwid_Counter20 = num[3];
            binnwid_Counter30 = num[4];
            binnwid_Counter40 = num[5];
            bucket_Counter = num[6];
            port = Integer.parseInt(PORT.getText());
            host = HOST.getText();
            if(!(BUCKET_MIN_2.getText().isEmpty())){
                BUCKET2.setVisible(true);
            }
            if(!(BUCKET_MIN_3.getText().isEmpty())){
                BUCKET3.setVisible(true);
            }
            if(!(BUCKET_MIN_4.getText().isEmpty())){
                BUCKET4.setVisible(true);
            }
            if(!(BUCKET_MIN_5.getText().isEmpty())){
                BUCKET5.setVisible(true);
            }
            if(!(BUCKET_MIN_6.getText().isEmpty())){
                BUCKET6.setVisible(true);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }




}