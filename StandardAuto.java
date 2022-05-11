package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class StandardAuto extends SequentialCommandGroup {
    // put subsystem definitions here
    public StandardAuto(Drivetrain drivetrain){

        addCommands(
        new ParallelRaceGroup(
            new WaitCommand(2),
            new RunCommand(() -> {
                drivetrain.drive(1,0.5);
            })
        ),

        new ParallelRaceGroup(
            new WaitCommand(2),
            new RunCommand(() -> {
                drivetrain.drive(1,0.5);
            }),
            
        ),

        new ParallelRaceGroup(
            new WaitCommand(2),
            new RunCommand(() -> {
                drivetrain.drive(1,0.5);
            }),
            
        )

        );

        addRequirements(drivetrain);

    }

    /*  runs once the command has finished/been interrupted  */
    @Override
    public void end(boolean interrupted){
        
    }
}
