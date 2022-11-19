package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity traj10 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(45, 35, 5,4, 13)
                .setDimensions(13.44, 14.8)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(35, -62.5, Math.toRadians(-90)))
                                //score preload
                                .setReversed(true)
                                .back(34)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(51.5,-12), Math.toRadians(0))
                                .forward(8.5)

                                //go to pole
                                .setReversed(true)
                                .back(8.5)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(51.5,-12), Math.toRadians(0))
                                .forward(8.5)

                                //go to pole
                                .setReversed(true)
                                .back(8.5)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(51.5,-12), Math.toRadians(0))
                                .forward(8.5)

                                //go to pole
                                .setReversed(true)
                                .back(8.5)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(51.5,-12), Math.toRadians(0))
                                .forward(8.5)

                                //go to pole
                                .setReversed(true)
                                .back(8.5)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(51.5,-12), Math.toRadians(0))
                                .forward(8.5)

                                //go to pole
                                .setReversed(true)
                                .back(8.5)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                //park
                                .lineToLinearHeading(new Pose2d(36,-12, Math.toRadians(-90)))

                                //build
                                .build());

    meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
               // .addEntity(redRightSafeTSE2)
           .addEntity(traj10)
            .start();
    }
}