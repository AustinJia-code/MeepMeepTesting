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
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -70, 90))
                                .splineTo(new Vector2d(-24, -25.5), Math.toRadians(90))
                                .turn(Math.toRadians(100))
                                .turn(Math.toRadians(80))
                                .splineTo(new Vector2d(-60, -65), Math.toRadians(-180))
                                .lineTo(new Vector2d(-52, -55))
                                .turn(Math.toRadians(90))
                                .lineTo(new Vector2d(-50,-68)) //assuming where duck is
                                .setReversed(true)
                                .splineTo(new Vector2d(-24,-24),Math.toRadians(0))
                                .lineTo(new Vector2d(-61,-35))


                                .build()
                );
        RoadRunnerBotEntity redRight = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -70, 90))
                                .splineTo(new Vector2d(-4, -31), Math.toRadians(90))

                                .turn(Math.toRadians(-135))
                                .splineTo(new Vector2d(55,-63),Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-4,-31),Math.toRadians(-225))
                                .setReversed(false)
                                .splineTo(new Vector2d(55,-63),Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-4,-31),Math.toRadians(-225))




                                .build()
                );



        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(redLeft)
                .start();
    }
}//test pushing r