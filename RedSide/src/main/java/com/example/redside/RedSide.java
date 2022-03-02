package com.example.redside;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class RedSide {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(500);
        RoadRunnerBotEntity redLeft = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -70, Math.toRadians(90)))
                                .splineTo(new Vector2d(-24, -25.5), Math.toRadians(90))
                                .turn(Math.toRadians(90))
                                .turn(Math.toRadians(80))
                                .splineTo(new Vector2d(-60, -65), Math.toRadians(-180))
                                .setReversed(true)
                                .splineTo(new Vector2d(-52, -55),Math.toRadians(-270))
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
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -63, Math.toRadians(90)))
                                .splineTo(new Vector2d(-31, -25.5), Math.toRadians(90))
                                .turn(Math.toRadians(90))


                                .build()
                );

        RoadRunnerBotEntity redLeft2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-31, -25.5, Math.toRadians(-180)))
                                .splineTo(new Vector2d(-60, -61), Math.toRadians(-180))



                                .build()
                );
        RoadRunnerBotEntity redLeft3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-60, -61, Math.toRadians(-180)))
                                .setReversed(true)
                                .splineTo(new Vector2d(-52, -55),Math.toRadians(-270))




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
                                .splineTo(new Vector2d(-29,-24),Math.toRadians(0))

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
        RoadRunnerBotEntity test = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d())
                              /*  .back(3)
                                .strafeLeft(21)
                                .back(16)
                                .forward(14)
                                .strafeRight(48.5)
                                .back(17)
                                .strafeRight(2)*/
                                .strafeRight(15)


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
        RoadRunnerBotEntity redRightTest1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -63, Math.toRadians(90)))
                                //   .setReversed(true)
                                //   .splineTo(new Vector2d(-3, -37), Math.toRadians(120))
                                //.turn(Math.toRadians(-160))
                                //  .turn(Math.toRadians(-120))
                                .splineTo(new Vector2d(-3, -37), Math.toRadians(120))
                                .turn(Math.toRadians(180))
                                 .splineTo(new Vector2d(6, -51), Math.toRadians(0))



                                .build()
                );
        RoadRunnerBotEntity redRightTest2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -63, Math.toRadians(90)))
                                //   .setReversed(true)
                                //   .splineTo(new Vector2d(-3, -37), Math.toRadians(120))
                                //.turn(Math.toRadians(-160))
                                //  .turn(Math.toRadians(-120))
                                .splineTo(new Vector2d(10, -20), Math.toRadians(90))
                                .turn(Math.toRadians(90))
                                // .splineTo(new Vector2d(6, -51), Math.toRadians(0))
                                .lineTo(new Vector2d(0,-53.6))



                                .build()
                );
        RoadRunnerBotEntity redRight1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -63, Math.toRadians(90)))
                             //   .setReversed(true)
                             //   .splineTo(new Vector2d(-3, -37), Math.toRadians(120))
                                //.turn(Math.toRadians(-160))
                              //  .turn(Math.toRadians(-120))
                              //  .splineTo(new Vector2d(-3, -37), Math.toRadians(120))

                                .turn(Math.toRadians(180))
                               // .splineTo(new Vector2d(6, -51), Math.toRadians(0))



                                .build()
                );
        RoadRunnerBotEntity redRight2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-3, -37, Math.toRadians(0)))

                                .lineTo(new Vector2d(0,-53.6))


                                //.splineTo(new Vector2d(2, -60), Math.toRadians(0))
                                //.strafeRight(30)
                                //.forward(58)
                                .lineTo(new Vector2d(58, -53.6))


                                .build()
                );
        RoadRunnerBotEntity redRight3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 60, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(58, -50, Math.toRadians(0)))
                                .setReversed(true)
                                .back(50)
                              // .splineTo(new Vector2d(-3, -33), Math.toRadians(120))
                                .splineTo(new Vector2d(-10, -37), Math.toRadians(90))


                                .build()
                );
        RoadRunnerBotEntity redRight4 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-10, -37, Math.toRadians(270)))
                              //  .setReversed(true)

                                .splineTo(new Vector2d(6, -51), Math.toRadians(0))
                                .forward(50)


                                .build()
                );
        RoadRunnerBotEntity redRight5 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(56, -51, Math.toRadians(0)))
                                .setReversed(true)
                                .back(50)

                                .splineTo(new Vector2d(-10, -37), Math.toRadians(90))



                                .build()
                );

        RoadRunnerBotEntity redRightCycle1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -63, Math.toRadians(0)))
                                .splineTo(new Vector2d(10, -25), Math.toRadians(90))
                                .turn(Math.toRadians(-90))
                                .turn(Math.toRadians(-25))
                                .lineTo(new Vector2d(9.5,-30))
                                .forward(50)


                                .build()
                );
        RoadRunnerBotEntity redRightCycle2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(54.1,-49.6, Math.toRadians(-25)))
                               .back(48)


                                .build()
                );
        RoadRunnerBotEntity redRightCycle3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11,-29, Math.toRadians(-25)))
                                .back(48)


                                .build()
                );








        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
//.addEntity(redRightCycle1)
  //              .addEntity(redRightCycle2)
   // .addEntity(redRightSafeTSE2)

                .start();
    }
}