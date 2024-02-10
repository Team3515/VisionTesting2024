package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import org.photonvision.*;

public class CameraIntakeCmd extends CommandBase {
    private final DriveSubsystem driveSubsystem;
    private PhotonCamera camera;

    public CameraIntakeCmd(DriveSubsystem driveSubsystem, PhotonCamera camera) {
        this.driveSubsystem = driveSubsystem;
        this.camera = camera;
        addRequirements(driveSubsystem);
    }

    @Override
    public void initialize() {
        System.out.println("CameraIntakeCmd started!");
    }

    @Override
    public void execute() {
        var result = this.camera.getLatestResult();
        boolean hasTargets = result.hasTargets();

        if (!hasTargets) {
            return;
        }

        double yaw = result.getBestTarget().getYaw();

        // double range = PhotonUtils.calculateDistanceToTargetMeters(
        //         1234567,
        //         0.0204,
        //         0,
        //         Units.degreesToRadians(result.getBestTarget().getPitch()));
        //double range = 5;

        if (Math.abs(yaw) > .1) {
            this.driveSubsystem.setMotors(0, yaw / 100);
            return;
        }
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("CameraIntakeCmd ended!");
    }

    @Override
    public boolean isFinished() {
        this.driveSubsystem.setMotors(0, 0);
        return false;
    }
}