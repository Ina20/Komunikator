import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    static String wiadomoscOdebrana = null, wiadomoscWysylana = null;
    static PrintWriter pr;
    static boolean connected = false;

    public static void main(String[] args) {

        //tworzenie serwera

            //Zadanie 1



/*  Odkomentować przy Zadaniu 2
        DialogueWindow window = new DialogueWindow();
        window.createWindow();
*/
        InputStreamReader in = null;
        BufferedReader bf = null;

        //przycisk wyslij
/*
        window.sendButton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wiadomoscWysylana = window.textInput.getText();
                window.displayArea.append( "Serwer: " + wiadomoscWysylana + "\n");
                window.textInput.setText( null );

                //Zadanie 2


            }
        });
*/

       //odbieranie wiadomosci
/*
        while (connected) {
            try {

                //Zadanie 3


                //wyswietlanie wiadomosci w oknie
                window.displayArea.append( "Client: " + wiadomoscOdebrana + "\n");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
*/
    }
}

