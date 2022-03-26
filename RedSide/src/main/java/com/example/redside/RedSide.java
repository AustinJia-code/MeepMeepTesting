package com.example.redside;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class RedSide {
    public static void main(String[] args) {
        Vector2d hub = new Vector2d(-23,-35);

        MeepMeep meepMeep = new MeepMeep(500);
        RoadRunnerBotEntity redLeft = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 11.2)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, -63, Math.toRadians(90)))
                                .splineTo(new Vector2d(-32,-24), Math.toRadians(0))
                                //.turn(Math.toRadians(-45))
                                .setReversed(true)
                                .splineTo(new Vector2d(-60, -60),Math.toRadians(215))//go to ducc
                                .setReversed(false)
                                //.turn(Math.toRadians(-10))//get better angle to ducc
                                .turn(Math.toRadians(55))
                                //.turn(Math.toRadians(-10))//get better angle to ducc
                                // .turn(Math.toRadians(0))
                                // .lineTo(new Vector2d(-40, -62))//strafe ducc
                                .strafeRight(20)
                                .turn(Math.toRadians(-17))
                                // .setAccelConstraint((a,e,c,d)->7)
                                .lineTo(new Vector2d(-60,-62))
                                .turn(Math.toRadians(17))
                                .splineTo(new Vector2d(-33, -24), Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-65,-37),Math.toRadians(180))


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
                        drive.trajectorySequenceBuilder(new Pose2d(5,-42, Math.toRadians(130)))
                                .setReversed(true)
                                .splineTo(new Vector2d(9,-67), Math.toRadians(0))
                                .setReversed(false)
                                .back(40)
                                .forward(45)
                                .splineTo(new Vector2d(5,-42), Math.toRadians(130))


                                .build()
                );













        RoadRunnerBotEntity redRight1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 47, Math.toRadians(180), Math.toRadians(180), 12)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -63, Math.toRadians(90)))
                            .splineTo(new Vector2d(7,-24), Math.toRadians(90))
                                .turn(Math.toRadians(90))
                                .lineTo(new Vector2d(9, -65))
                                .back(40)
                                .forward(30)
                                //.turn(Math.toRadians(-65))
                               // .forward(25)
                                .splineTo(new Vector2d(5,-42), Math.toRadians(130))


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










        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
.addEntity(test)
  //              .addEntity(redRightCycle2)
   // .addEntity(redRightSafeTSE2)


                .start();
    }
}