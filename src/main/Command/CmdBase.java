package main.Command;


import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class CmdBase {


    @Parameter(
            names = "--name",
            description = "User name",
            required = true
    )
    private String name;

    public static void main(String[] args) {

        CmdBase jArgs = new CmdBase();
        JCommander helloCmd = JCommander.newBuilder()
                .addObject(jArgs)
                .build();
        helloCmd.parse(args);
        System.out.println("Hello " + jArgs.getName());

    }

    private String getName() {
        return name;
    }
}


