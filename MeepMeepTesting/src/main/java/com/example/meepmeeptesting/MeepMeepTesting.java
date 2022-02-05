package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);
        RoadRunnerBotEntity redLeft = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(0, 0, 90))
                                .splineTo(new Vector2d(6, 20), Math.toRadians(0))
                                .turn(Math.toRadians(-140))
                                .turn(Math.toRadians(-40))
                                .splineTo(new Vector2d(-25, 6), Math.toRadians(-180))
                                .lineTo(new Vector2d(-16, 12))
                                .turn(Math.toRadians(90))

                                .build()
                );
        RoadRunnerBotEntity redRight = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(0, 0, 90))
                                .splineTo(new Vector2d(-6, 20), Math.toRadians(0))
                                .turn(Math.toRadians(-45))
                                .splineTo(new Vector2d(45,4),Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-6,20),Math.toRadians(-225))
                                .setReversed(false)
                                .splineTo(new Vector2d(45,4),Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-6,20),Math.toRadians(-225))




                                .build()
                );



        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(redLeft)
                .start();
    }
}//test pushing r