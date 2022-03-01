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
                .setConstraints(70, 70, 5,4, 17)
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
                                .splineTo(new Vector2d(-4, -48), Math.toRadians(90))
                                .turn(Math.toRadians(-155))
                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(26)

                                .setReversed(true)
                                .back(26)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(28)

                                .setReversed(true)
                                .back(28)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(30)
                                .setReversed(true)
                                .back(30)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(32)
                                .setReversed(true)
                                .back(32)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(34)
                                .setReversed(true)
                                .back(34)
                                .splineTo(new Vector2d(-5,-43),Math.toRadians(110))
                                .setReversed(false)

                                .splineTo(new Vector2d(20,-58), Math.toRadians(0))
                                .forward(18)

                                .build());

    meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(redRightSafeTSE2)
                .start();
    }
}