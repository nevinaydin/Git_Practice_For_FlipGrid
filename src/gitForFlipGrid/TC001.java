package gitForFlipGrid;

import java.util.ArrayList;
import java.util.Arrays;

public class TC001 {
    public static void main(String[] args) {
        String[] gitCommands=new String[5];
        gitCommands[0]= "gitCommit";
        gitCommands[1]="gitFetch";
        gitCommands[2]="gitMerge";
        gitCommands[3]="gitPull";
        gitCommands[4]="gitCommitAndPush";
        System.out.println(Arrays.toString(gitCommands));
        System.out.println("gitCommands = " + Arrays.toString(gitCommands));
        ArrayList<String> gitCommandsList = new ArrayList<>(Arrays.asList(gitCommands));
        System.out.println(gitCommandsList);
        gitCommandsList.add("gitCheckout");
        gitCommandsList.add("gitPush");
        System.out.println("gitCommandsList = " + gitCommandsList);


    }
}
