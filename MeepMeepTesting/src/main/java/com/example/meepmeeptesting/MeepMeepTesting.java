package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);
        RoadRunnerBotEntity redLeft = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -70, Math.toRadians(90)))
                                .splineTo(new Vector2d(-24, -25.5), Math.toRadians(90))
                                .turn(Math.toRadians(90))
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
        RoadRunnerBotEntity redLeft1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -70, Math.toRadians(90)))
                                .splineTo(new Vector2d(-24, -25.5), Math.toRadians(90))
                               .turn(Math.toRadians(90))
                               /*  .turn(Math.toRadians(80))
                                 .splineTo(new Vector2d(-60, -65), Math.toRadians(-180))
                                 .lineTo(new Vector2d(-52, -55))
                                 .turn(Math.toRadians(90))
                                 .lineTo(new Vector2d(-50,-68)) //assuming where duck is
                                 .setReversed(true)
                                 .splineTo(new Vector2d(-24,-24),Math.toRadians(0))
                                 .lineTo(new Vector2d(-61,-35))
                            */

                                .build()
                );
        RoadRunnerBotEntity redLeft2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-24, -25.5, Math.toRadians(-180)))
                             .splineTo(new Vector2d(-60, -65), Math.toRadians(-180))



                                .build()
                );
        RoadRunnerBotEntity redLeft3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-60, -65, Math.toRadians(-180)))
                                .lineTo(new Vector2d(-52, -55))
                                .turn(Math.toRadians(90))



                                .build()
                );
        RoadRunnerBotEntity redLeft4 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-52, -55, Math.toRadians(-90)))
                                .lineTo(new Vector2d(-50, -68))

                                .build()
                );
        RoadRunnerBotEntity redLeft5 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-50, -68, Math.toRadians(-90)))
                                .setReversed(true)
                                .splineTo(new Vector2d(-24,-24),Math.toRadians(0))

                                .build()
                );
        RoadRunnerBotEntity redLeft6 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-24, -24, Math.toRadians(-180)))
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
        RoadRunnerBotEntity redRight1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -70, Math.toRadians(90)))
                                .splineTo(new Vector2d(-4, -31), Math.toRadians(90))
                                .turn(Math.toRadians(-135))

                                .build()
                );
        RoadRunnerBotEntity redRight2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-4, -31, Math.toRadians(-45)))
                                .splineTo(new Vector2d(55, -63), Math.toRadians(0))


                                .build()
                );
        RoadRunnerBotEntity redRight3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(55, -63, Math.toRadians(0)))
                                .setReversed(true)
                                .splineTo(new Vector2d(-4, -31), Math.toRadians(135))


                                .build()
                );



        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                //.addEntity(redLeft)
                .addEntity(redLeft1)
                .addEntity(redLeft2)
                .addEntity(redLeft3)
                .addEntity(redLeft4)
                .addEntity(redLeft5)
                .addEntity(redLeft6)
                //.addEntity(redRight)
                .addEntity(redRight1)
                .addEntity(redRight2)
                .addEntity(redRight3)
                .start();
    }
}//test pushing r