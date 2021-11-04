package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        File arquivo = new File("/home/paulo/IdeaProjects/text");
        Scanner sc = null;
        try{
            sc = new Scanner(arquivo);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
            System.out.println("Bloco Finally foi executado!");
        }
    }
}
