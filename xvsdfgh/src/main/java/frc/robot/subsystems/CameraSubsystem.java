package frc.robot.subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.PhotonUtils;

import edu.wpi.first.net.PortForwarder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.util.Units;

public class CameraSubsystem extends SubsystemBase {
    private PhotonCamera m_camera;
    private DriveSubsystem m_DriveSubsystem;

    public CameraSubsystem(PhotonCamera camera, DriveSubsystem drivingSubsystem) {
        this.m_camera = camera;
        this.m_DriveSubsystem = drivingSubsystem;
    }

    @Override
    public void periodic() {
        var result = this.m_camera.getLatestResult();
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
            this.m_DriveSubsystem.setMotors(0, yaw / 100);
            return;
        }

        this.m_DriveSubsystem.setMotors(0, 0);

    }
    

}
