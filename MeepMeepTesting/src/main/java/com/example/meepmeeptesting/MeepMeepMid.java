package com.example.meepmeeptesting;

import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepMid {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity traj = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(45, 35, 5,4, 13)
                .setDimensions(13.44, 14.8)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(35.5, -62.5, Math.toRadians(-90)))

                                //score preload
                                .back(39)
                                .splineTo(new Vector2d(6.5,-18.75), Math.toRadians(215))

                                //go to storage + 1
                                .setReversed(false)
                                .splineTo(new Vector2d(35,-12), Math.toRadians(0))
                                .forward(26)

                                //go to pole + 1
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(30,-18), Math.toRadians(225))

                                //go to storage + 2
                                .setReversed(false)
                                .splineTo(new Vector2d(50,-12), Math.toRadians(0))
                                .forward(11)

                                //go to pole + 2
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(30,-18), Math.toRadians(225))

                                //go to storage + 3
                                .setReversed(false)
                                .splineTo(new Vector2d(50,-12), Math.toRadians(0))
                                .forward(11)

                                //go to pole + 3
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(30,-18), Math.toRadians(225))

                                //go to storage + 4
                                .setReversed(false)
                                .splineTo(new Vector2d(50,-12), Math.toRadians(0))
                                .forward(11)

                                //go to pole + 4
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(30,-18), Math.toRadians(225))

                                //go to storage + 5
                                .setReversed(false)
                                .splineTo(new Vector2d(50,-12), Math.toRadians(0))
                                .forward(11)

                                //go to pole + 5
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(30,-18), Math.toRadians(225))

                                //park
                                .setReversed(false)
                                .lineToLinearHeading(new Pose2d(36, -12, Math.toRadians(-90)))

                                //build
                                .build());

        RoadRunnerBotEntity trajMirror = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(45, 35, 5,4, 13)
                .setDimensions(13.44, 14.8)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35.5, -62.5, Math.toRadians(-90)))

                                //score preload
                                .back(45)
                                .turn(Math.toRadians(-60))
                                .setReversed(true)
                                .splineTo(new Vector2d(-6.5,-18.75), Math.toRadians(-35))

                                //go to storage + 1
                                .setReversed(false)
                                .splineTo(new Vector2d(-35,-12), Math.toRadians(180))
                                .forward(26)

                                //go to pole + 1
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(-30,-18), Math.toRadians(-45))

                                //go to storage + 2
                                .setReversed(false)
                                .splineTo(new Vector2d(-50,-12), Math.toRadians(180))
                                .forward(11)

                                //go to pole + 2
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(-30,-18), Math.toRadians(-45))

                                //go to storage + 3
                                .setReversed(false)
                                .splineTo(new Vector2d(-50,-12), Math.toRadians(180))
                                .forward(11)

                                //go to pole + 3
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(-30,-18), Math.toRadians(-45))

                                //go to storage + 4
                                .setReversed(false)
                                .splineTo(new Vector2d(-50,-12), Math.toRadians(180))
                                .forward(11)

                                //go to pole + 4
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(-30,-18), Math.toRadians(-45))

                                //go to storage + 5
                                .setReversed(false)
                                .splineTo(new Vector2d(-50,-12), Math.toRadians(180))
                                .forward(11)

                                //go to pole + 5
                                .setReversed(true)
                                .back(11)
                                .splineTo(new Vector2d(-30,-18), Math.toRadians(-45))

                                //park
                                .setReversed(false)
                                .lineToLinearHeading(new Pose2d(-36, -12, Math.toRadians(-90)))

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

/*
        RoadRunnerBotEntity traj = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(45, 35, 5,4, 13)
                .setDimensions(13.44, 14.8)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(35, -62.5, Math.toRadians(-90)))

                                //score preload
                                .back(34)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                //go to storage
                                .setReversed(false)
                                .splineTo(new Vector2d(56,-12), Math.toRadians(0))
                                .lineToLinearHeading(new Pose2d(58, -12, Math.toRadians(0)))

                                //go to pole
                                .setReversed(true)
                                //.back(8.5)
                                .splineTo(new Vector2d(31,-7), Math.toRadians(135))

                                .waitSeconds(1)
                                .setReversed(false)
                                .splineTo(new Vector2d(35, -20), Math.toRadians(-90))
                                //.forward(20)
                                .splineTo(new Vector2d(11, -35), Math.toRadians(-90))

                                //build
                                .build());

         */