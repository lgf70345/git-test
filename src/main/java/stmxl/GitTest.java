package stmxl;

import sun.tracing.PrintStreamProviderFactory;

import javax.swing.text.html.ListView;
import java.net.ServerSocket;

/**
 * @Description:
 * @Author: lgf
 * @Date: 2022/08/12 13:51
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("Hello git");
        System.out.println("Hello git2");
        System.out.println("args = " + args);
        for (int i = 0; i < 2; i++) {
            System.out.println("i = " + i);
        }
        
        for (String arg : args) {

        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("arg = " + arg);
        }

        if (args == null) {
            
        }
        if (args != null) {
            
        }

    }
}
