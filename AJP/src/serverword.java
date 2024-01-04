import java.io.*;

import java.net.*;

class serverword {

    public static void main(String arg[]) throws Exception {

        String clientSentence;

        String capitalizedSentence;

        ServerSocket welcomeSocket = new ServerSocket(6666);

        while(true) {

            Socket connectionSocket = welcomeSocket.accept();

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

            DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream());

            System.out.println("Server waiting for data… ");

            clientSentence = inFromClient.readLine();

            System.out.println("Recived from client : "  + clientSentence);

            capitalizedSentence = clientSentence.toUpperCase() + "n";

            outToClient.writeBytes(capitalizedSentence);

        }

    }

}

