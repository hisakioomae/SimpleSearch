import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {

        FileChooser fileChooser = new FileChooser();//「ファイルを開く」ダイアログを表示する
        File file = fileChooser.showOpenDialog(primaryStage);//選択されたファイルパスを取得する
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String text = br.readLine();

        String key = "look";
        SimpleSearch(text, key);
    }

    private static void SimpleSearch(String text, String pattern) {
        int textLen = text.length();
        int patnLen = pattern.length();
        for (int i = 0; i < textLen - patnLen + 1; i++) {
            int k = 0;
            for (int j = 0; j < patnLen; j++) {
                k++;
                if (text.charAt(i+j) != pattern.charAt(j)) {
                    break;
                }
                if (k == pattern.length()) // 文字列の長さだけ一致すれば
                    System.out.println(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
