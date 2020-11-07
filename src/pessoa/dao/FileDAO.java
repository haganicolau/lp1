package pessoa.dao;

import pessoa.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class FileDAO {
    protected String fileName;
    private String directory;

    public FileDAO(String fileName) {
        this.fileName = fileName;
        this.directory = System.getProperty("user.dir");
    }

    public String getAbsolutyFileDirectory() {
        return this.directory + "/src/arquivos/" + this.fileName;
    }

    public List<String> openFileToRead() {
        try {
            /*
            * Caminho absoluto do arquivo
            */
            String inputFileName = this.getAbsolutyFileDirectory();

            /*
            * Arquivo será aberto para operações de entrada através
            * do objeto fileDAO
            */
            FileReader file = new FileReader(inputFileName);

            /*
            * Fluxo de entrada de dados baseado em caracteres através
            * da classe BufferedReader. Abertura e leitura dos dados
            * de um arquivo de texto.
            * */
            BufferedReader buffer = new BufferedReader(file);

            /*
            * Processo de repetição para ler todas as linhas
            * */
            List<String> linhas = new ArrayList<String>();
            String linha = buffer.readLine(); //leitura de uma linha arquivo texto
            while(linha != null) {
                linhas.add(linha);
                linha = buffer.readLine(); //leitura de outra linha arquivo texto
            }
            buffer.close();
            return linhas;

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return new ArrayList<String>();
        }
    }

    public abstract List<Pessoa> read();
    public abstract Pessoa convertLineToEntity(String linha);

    public void write(Pessoa pessoa) {
        try {

            /*
             * Caminho absoluto do arquivo
             */
            String inputFileName = this.getAbsolutyFileDirectory();

            /*
             * Arquivo que será aberto para operações de saída através do arquivo file
             * baseado em caracteres
             */
            FileWriter file = new FileWriter(inputFileName, true);

            /*
            * inicia-se o fluxo de dados
            * */
            BufferedWriter buffer = new BufferedWriter(file);

            /*
            * quebra de linha
            * */
            buffer.newLine();

            /*Insere, escreve o novo objeto, convertido para string*/
            buffer.write(pessoa.toString());

            /*encerra fluxo de dados do arquivo*/
            buffer.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
