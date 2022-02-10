package com.example.blueside1;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class BlueSide {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);
        RoadRunnerBotEntity blueLeft = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, 70, Math.toRadians(-90)))
                                .splineTo(new Vector2d(-4, 36), Math.toRadians(-90))
                                .turn(Math.toRadians(-225))
                                .splineTo(new Vector2d(55,63),Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-4, 32), Math.toRadians(-135))
                                .setReversed(false)
                                .splineTo(new Vector2d(55,63),Math.toRadians(0))





                                .build()
                );












        RoadRunnerBotEntity blueRight = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35, 70, Math.toRadians(-90)))
                                .splineTo(new Vector2d(-23, 24), Math.toRadians(-90))
                                .turn(Math.toRadians(-120))
                                .turn(Math.toRadians(-60))
                                .splineTo(new Vector2d(-62.5,62),Math.toRadians(180))
                                .lineTo(new Vector2d(-54,57))




                                .build()
                );
        RoadRunnerBotEntity blueLeft1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, 63, Math.toRadians(-90)))
                                .splineTo(new Vector2d(10, 20), Math.toRadians(-90))
                                .turn(Math.toRadians(90))

                                .build()
                );
        RoadRunnerBotEntity blueLeft2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(10, 20, Math.toRadians(0)))
                                .lineTo(new Vector2d(0,53.6))

                                //.splineTo(new Vector2d(2, -60), Math.toRadians(0))
                                //.strafeRight(30)
                                .forward(58)


                                .build()
                );
        RoadRunnerBotEntity blueLeft3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(58, 50, Math.toRadians(0)))
                                .setReversed(true)
                                .back(60)
                                .splineTo(new Vector2d(-12, 32), Math.toRadians(-90))


                                .build()
                );
        RoadRunnerBotEntity blueLeft4 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-12, 32, Math.toRadians(-90)))


                                .splineTo(new Vector2d(1, 51), Math.toRadians(0))
                                .forward(60)


                                .build()
                );
        RoadRunnerBotEntity blueLeft5 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(61, 51, Math.toRadians(0)))
                                .setReversed(true)
                                .back(60)

                                .splineTo(new Vector2d(-12, 32), Math.toRadians(-90))



                                .build()
                );


        RoadRunnerBotEntity blueRight1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, 63, Math.toRadians(-90)))
                                .splineTo(new Vector2d(-35, 21), Math.toRadians(-90))
                                .turn(Math.toRadians(-90))


                                .build()
                );
        RoadRunnerBotEntity blueRight2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35, 21, Math.toRadians(-180)))

                                .splineTo(new Vector2d(-66, 61), Math.toRadians(-180))


                                .build()
                );
        RoadRunnerBotEntity blueRight3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-66, 61, Math.toRadians(180)))
                                .setReversed(true)
                                .splineTo(new Vector2d(-55, 40),Math.toRadians(270))


                                .build()
                );
        RoadRunnerBotEntity blueRight4 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-55, 40, Math.toRadians(90)))

                                .splineTo(new Vector2d(-59, 60),Math.toRadians(90))


                                .build()
                );
        RoadRunnerBotEntity blueRight5 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-59, 60, Math.toRadians(90)))
                                .setReversed(true)
                                .splineTo(new Vector2d(-29,24),Math.toRadians(0))

                                .build()
                );
        RoadRunnerBotEntity blueRight6 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-29, 24, Math.toRadians(180)))
                                .setReversed(true)
                                .lineTo(new Vector2d(-74,35))

                                .build()
                );


        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
              // .addEntity(blueLeft1)
              //  .addEntity(blueLeft2)
               // .addEntity(blueLeft3)
               // .addEntity(blueLeft4)
               // .addEntity(blueLeft5)
                .addEntity(blueRight1)
                .addEntity(blueRight2)
                .addEntity(blueRight3)
                .addEntity(blueRight4)
                .addEntity(blueRight5)
               .addEntity(blueRight6)


                .start();
    }
}