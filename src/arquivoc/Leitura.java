package arquivoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {

    private static final File file = new File("C:\\Users\\cem\\Desktop\\BD\\Estudos\\FATEC\\1Semestre\\Algoritimos\\Alg\\ExemplosC++\\Tabela_ASCII\\Tabela_ASCII\\main.cpp"); // instancia o local do arquivo para poder ser usado

    static void ArqC() throws IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String linha;

        while ((linha = reader.readLine()) != null) {
                
            //O if retorna true se tiver /*, */ ou // na linha e false se não tiver assim imprimindo a linha no else caso de falso
            if(linha.contains("/*")||linha.contains("*/")||linha.contains("//")){
                
            }else{
                System.out.println(linha);
            }
        }
    }
}
