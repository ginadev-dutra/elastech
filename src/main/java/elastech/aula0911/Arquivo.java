package elastech.aula0911;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

    public void criarArquivo() throws IOException {


        StringBuffer sb = new StringBuffer();
        sb.append("About a Girls - Nirvana");
        sb.append(System.getProperty("line.separator"));
        sb.append("B.Y.O.B - System of a Down");
        sb.append(System.getProperty("line.separator"));
        sb.append("Du Hast - Ramstein");
        sb.append(System.getProperty("line.separator"));

        Path p = Paths.get("musicas.txt");
        Files.write(p, sb.toString().getBytes());


    }

    public void lerArquivo() throws IOException {
        String musicas = Files.readString(Paths.get("musicas.txt"), StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws IOException {
        Arquivo arquivo = new Arquivo();

        try{
           arquivo.criarArquivo();
           arquivo.lerArquivo();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
