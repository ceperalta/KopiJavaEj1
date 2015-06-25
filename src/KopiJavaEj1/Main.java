package KopiJavaEj1;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.lang.reflect.Array;

public class Main extends Application {

    private static String[] ArrStrArgumentos;

    @Override
    public void start(Stage primaryStage) throws Exception {

        for(int i=0;i<Main.ArrStrArgumentos.length;i++){

            String[] arrXYXYColor = Main.ArrStrArgumentos[i].split(",");

            StackPane root = new StackPane();
            Stage primaryStage2 = new Stage();
            Color c = Color.web(arrXYXYColor[4]);
            primaryStage2.setScene(new Scene(root, Integer.parseInt(arrXYXYColor[2]), Integer.parseInt(arrXYXYColor[3]), c));
            primaryStage2.setX(Integer.parseInt(arrXYXYColor[0]));
            primaryStage2.setY(Integer.parseInt(arrXYXYColor[1]));
            primaryStage2.show();
        }

    }·

    public static void main(String[] args) {
        Main.ArrStrArgumentos = args; //new String[] {"1,1,230,230,FFFFFF","100,200,123,123,00AAFF"};
        launch(args);
    }
}

/*
/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/bin/java -Didea.launcher.port=7546 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA 13.app/Contentn" -Dfile.encoding=UTF-8 -classpath "/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/lib/javafx-doclet.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/lib/tools.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/htmlconverter.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.7.0_60.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Users/Tommy/IdeaProjects/KopiJavaEj1/out/production/KopiJavaEj1:/Applications/IntelliJ IDEA 13.app/Contents/lib/idea_rt.jar" com.intellij.rt.execution.application.AppMain KopiJavaEj1.Main 1,1,230,230,FFFFFF 100,200,123,123,00AAFF
 */