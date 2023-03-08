package com.example.meepmeeptesting;

import static java.lang.Math.toRadians;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepHigh {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity traj = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(80, 80, 5,4, 13)
                .setDimensions(13.44, 14.8)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(36, -62.5, Math.toRadians(-90)))

                                //score preload
                                .setReversed(true)
                                .back(34)
                                .splineTo(new Vector2d(28,-7), Math.toRadians(120))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(56,-12), Math.toRadians(0))
                                .forward(2)

                                //go to pole
                                .setReversed(true)
                                .splineTo(new Vector2d(35,-7), Math.toRadians(150))
                                .back(4)

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(56,-12), Math.toRadians(0))
                                .forward(2)

                                //go to pole
                                .setReversed(true)
                                .splineTo(new Vector2d(35,-7), Math.toRadians(150))
                                .back(4)

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(56,-12), Math.toRadians(0))
                                .forward(2)

                                //go to pole
                                .setReversed(true)
                                .splineTo(new Vector2d(35,-7), Math.toRadians(150))
                                .back(4)

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(56,-12), Math.toRadians(0))
                                .forward(2)

                                //go to pole
                                .setReversed(true)
                                .splineTo(new Vector2d(35,-7), Math.toRadians(150))
                                .back(4)

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(56,-12), Math.toRadians(0))
                                .forward(2)

                                //go to pole
                                .setReversed(true)
                                .splineTo(new Vector2d(35,-7), Math.toRadians(150))
                                .back(4)

                                //Bark Mid
                                .waitSeconds(1)
                                .setReversed(false)
                                .lineToLinearHeading(new Pose2d(35, -12, Math.toRadians(0)))

                                //Bark Left
                                .back(24)

                                //build
                                .build());

        RoadRunnerBotEntity trajMirror = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(45, 30, 5,4, 13)
                .setDimensions(13.44, 14.8)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35, -62.5, Math.toRadians(-90)))

                                //score preload
                                .back(34)
                                .splineTo(new Vector2d(-31,-7), Math.toRadians(45))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(-56,-12), Math.toRadians(180))
                                .lineToLinearHeading(new Pose2d(-58, -12, Math.toRadians(180)))

                                //go to pole
                                .setReversed(true)
                                //.back(8.5)
                                .splineTo(new Vector2d(-31,-7), Math.toRadians(45))

                                .waitSeconds(1)
                                .setReversed(false)
                                .splineTo(new Vector2d(-35, -20), Math.toRadians(270))
                                .forward(15)

                                .splineToConstantHeading(new Vector2d(-11, -35), Math.toRadians(-90))
                                //build
                                .build());

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                // .addEntity(redRightSafeTSE2)
                .addEntity(traj)
                .addEntity(trajMirror)
                .start();
    }
}