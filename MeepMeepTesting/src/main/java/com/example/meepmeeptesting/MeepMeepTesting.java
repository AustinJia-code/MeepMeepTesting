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
        /*RoadRunnerBotEntity redLeft = new DefaultBotBuilder(meepMeep)
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
                );*/
        RoadRunnerBotEntity redRight = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -64, Math.toRadians(90)))
                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(7, -43, Math.toRadians(0)))
                        .lineTo(new Vector2d(38,-43))
                        .lineToSplineHeading(new Pose2d(50, -50, Math.toRadians(-45)))

                        .lineToSplineHeading(new Pose2d(38,-43,Math.toRadians(0)))
                        .lineTo(new Vector2d(7,-43))
                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))

                        .lineToSplineHeading(new Pose2d(7, -43, Math.toRadians(0)))
                        .lineTo(new Vector2d(38,-43))
                        .lineToSplineHeading(new Pose2d(50, -50, Math.toRadians(-30)))

                        .lineToSplineHeading(new Pose2d(38,-43,Math.toRadians(0)))
                        .lineTo(new Vector2d(7,-43))
                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))

                        .lineToSplineHeading(new Pose2d(7, -43, Math.toRadians(0)))
                        .lineTo(new Vector2d(38,-43))
                        .lineToSplineHeading(new Pose2d(50, -50, Math.toRadians(-30)))

                        .lineToSplineHeading(new Pose2d(38,-43,Math.toRadians(0)))
                        .lineTo(new Vector2d(7,-43))
                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))


                        .lineToSplineHeading(new Pose2d(7, -43, Math.toRadians(0)))
                        .lineTo(new Vector2d(38,-43))
                        .lineToSplineHeading(new Pose2d(50, -50, Math.toRadians(-30)))

                        .lineToSplineHeading(new Pose2d(38,-43,Math.toRadians(0)))
                        .lineTo(new Vector2d(7,-43))
                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))

                        .lineToSplineHeading(new Pose2d(7,-43,Math.toRadians(0)))
                        .forward(30)

                                .build());

        RoadRunnerBotEntity redRightSafe = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                    drive.trajectorySequenceBuilder(new Pose2d(11, -64, Math.toRadians(90)))
                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(7, -58, Math.toRadians(0)))

                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(7, -58, Math.toRadians(0)))

                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(7, -58, Math.toRadians(0)))

                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(7, -58, Math.toRadians(0)))

                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(7, -58, Math.toRadians(0)))

                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(7, -58, Math.toRadians(0)))

                        .forward(40)

                        .build());

        RoadRunnerBotEntity redRightSafeTSE = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 18.3)
                .followTrajectorySequence(drive ->
                    drive.trajectorySequenceBuilder(new Pose2d(11, -64, Math.toRadians(90)))
                        //.lineToSplineHeading(new Pose2d(7, -34, Math.toRadians(-30)))
                        .lineToSplineHeading(new Pose2d(-10,-40,Math.toRadians(-80)))

                        .lineToSplineHeading(new Pose2d(7, -58, Math.toRadians(0)))
                        .forward(40)
                        .back(40)
                        .lineToSplineHeading(new Pose2d(-10,-40,Math.toRadians(-80)))
                        .lineToSplineHeading(new Pose2d(7,-58,Math.toRadians(0)))
                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(-10,-40,Math.toRadians(-80)))
                        .lineToSplineHeading(new Pose2d(7,-58,Math.toRadians(0)))
                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(-10,-40,Math.toRadians(-80)))
                        .lineToSplineHeading(new Pose2d(7,-58,Math.toRadians(0)))
                        .forward(40)
                        .back(40)

                        .lineToSplineHeading(new Pose2d(-10,-40,Math.toRadians(-80)))
                        .lineToSplineHeading(new Pose2d(7,-58,Math.toRadians(0)))
                        .forward(40)

                        .build());

        RoadRunnerBotEntity redRightSafeTSE2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -64, Math.toRadians(90)))
                                //.splineToLinearHeading(new Pose2d(-5,-43,Math.toRadians(-70)),Math.toRadians(-70))
                                //.splineTo(new Vector2d(-4, -45), Math.toRadians(30))
                                .splineTo(new Vector2d(-4, -46), Math.toRadians(90))
                                .turn(Math.toRadians(-155))
                                //t1
                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(26)
//t2
                                .setReversed(true)
                                .back(26)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                //t3
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(28)
                                //t4

                                .setReversed(true)
                                .back(28)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                //t5
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(30)
                                //t6
                                .setReversed(true)
                                .back(30)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                //t7
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(32)
                                //t8
                                .setReversed(true)
                                .back(32)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                //t9
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(34)
                                //t10
                                .setReversed(true)
                                .back(34)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                //t11
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(18)
                                //t12

                                .build());
        RoadRunnerBotEntity traj1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, -64, Math.toRadians(90)))

                                .splineTo(new Vector2d(-4, -46), Math.toRadians(90))
                                .turn(Math.toRadians(-155))


                                .build());

        RoadRunnerBotEntity traj2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-4, -46, Math.toRadians(-65)))
                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(26)



                                .build());
        RoadRunnerBotEntity traj3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(46, -58, Math.toRadians(0)))
                                .setReversed(true)
                                .back(26)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))



                                .build());
        RoadRunnerBotEntity traj4 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-5, -43, Math.toRadians(-70)))
                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(28)


                                .build());
        RoadRunnerBotEntity traj5 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(48, -58, Math.toRadians(0)))
                                .setReversed(true)
                                .back(28)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))


                                .build());
        RoadRunnerBotEntity traj6 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-5, -43, Math.toRadians(-70)))
                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(30)


                                .build());
        RoadRunnerBotEntity traj7 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(50, -58, Math.toRadians(0)))
                                .setReversed(true)
                                .back(30)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))


                                .build());
        RoadRunnerBotEntity traj8 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-5, -43, Math.toRadians(-70)))

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(32)


                                .build());
        RoadRunnerBotEntity traj9 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(52, -58, Math.toRadians(0)))

                                .setReversed(true)
                                .back(32)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))


                                .build());
        RoadRunnerBotEntity traj10 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-5, -43, Math.toRadians(-70)))

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(34)


                                .build());

        RoadRunnerBotEntity traj11 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, 5,4, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(54, -58, Math.toRadians(0)))

                                .setReversed(true)
                                .back(34)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))

                                .build());







    meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
               // .addEntity(redRightSafeTSE2)
           .addEntity(traj10)
            .addEntity(traj11)
                .start();
    }
}