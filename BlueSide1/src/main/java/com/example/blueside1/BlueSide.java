package com.example.blueside1;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class BlueSide {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity blueRightSmallBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 11.2)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, 63, Math.toRadians(-90)))
                                .splineTo(new Vector2d(-28,24), Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-60, 60),Math.toRadians(-215))//go to ducc
                                .setReversed(false)
                                .turn(Math.toRadians(-55))
                                .strafeLeft(20)
                                .turn(Math.toRadians(17))
                                // .setAccelConstraint((a,e,c,d)->7)
                                .lineTo(new Vector2d(-60,62))
                                .turn(Math.toRadians(17))
                                .splineTo(new Vector2d(-33, 24), Math.toRadians(0))
                                .setReversed(true)
                                .splineTo(new Vector2d(-65,37),Math.toRadians(180))


                                .build()
                );












        RoadRunnerBotEntity blueLeft1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(11, 63, Math.toRadians(-90)))
                                .lineTo(new Vector2d(-4, 46))
                                .turn(Math.toRadians(155))

                                .build()
                );
        RoadRunnerBotEntity blueLeft2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-4, 46, Math.toRadians(-205)))
                                .splineTo(new Vector2d(9,53), Math.toRadians(0))
                                .forward(45)

                                .build()
                );
        RoadRunnerBotEntity blueLeft3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(54, 53, Math.toRadians(0)))
                                .setReversed(true)
                                .back(50)
                                .splineTo(new Vector2d(-3, 38), Math.toRadians(-110))


                                .build()
                );
        RoadRunnerBotEntity blueLeft4 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-12, 32, Math.toRadians(70)))


                                .splineTo(new Vector2d(8, 51), Math.toRadians(0))
                                //.setAccelConstraint((a,e,c,d)->60)
                                .forward(50)


                                .build()
                );


        RoadRunnerBotEntity blueLeft5 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(60, 52, Math.toRadians(0)))
                                .setReversed(true)
                                .back(53)


                                .splineTo(new Vector2d(10, 37), Math.toRadians(-110))



                                .build()
                );
        RoadRunnerBotEntity blueLeft6 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(10, 37, Math.toRadians(70)))
                                .splineTo(new Vector2d(9, 53), Math.toRadians(0))
                                .forward(50)



                                .build()
                );
        RoadRunnerBotEntity blueLeft7 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(59, 53, Math.toRadians(0)))
                                .back(47)
                                .splineTo(new Vector2d(14, 38.5), Math.toRadians(-110))



                                .build()
                );


        RoadRunnerBotEntity blueRight1 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, 63, Math.toRadians(-90)))
                                .setAccelConstraint((a,e,c,d)->25)
                                .lineTo(new Vector2d(-24, 41))
                                .turn(Math.toRadians(195))


                                .build()
                );
        RoadRunnerBotEntity blueRight2 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-24, 41, Math.toRadians(105)))

                                .splineTo(new Vector2d(-63, 58.5), Math.toRadians(90))


                                .build()
                );
        RoadRunnerBotEntity blueRight3 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-63, 61, Math.toRadians(90)))
                                .strafeRight(20)
                        .turn(Math.toRadians(15))
                        .setAccelConstraint((a,e,c,d)->5)
                        .lineTo(new Vector2d(-60,62))


                                .build()
                );
        RoadRunnerBotEntity blueRight4 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-60, 62, Math.toRadians(165))) //just use traj3.end()
                                .setReversed(true)
                                .setAccelConstraint((a,e,c,d)->30)
                                .splineTo(new Vector2d(-33, 23), Math.toRadians(0))



                                .build()
                );
        RoadRunnerBotEntity blueRight5 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-33, 23, Math.toRadians(0)))
                                .lineTo(new Vector2d(-63, 37))

                                .build()
                );
        RoadRunnerBotEntity blueRight6 = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(50, 30, Math.toRadians(180), Math.toRadians(180), 18.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-29, 24, Math.toRadians(180)))

                                .lineTo(new Vector2d(-74,35))

                                .build()
                );


        meepMeep.setBackground(MeepMeep.Background.FIELD_FREIGHTFRENZY_ADI_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(blueRightSmallBot)
               //.addEntity(blueLeft1)
              //  .addEntity(blueLeft2)
               // .addEntity(blueLeft3)
               // .addEntity(blueLeft4)
              //  .addEntity(blueLeft5)
               // .addEntity(blueLeft6)
               // .addEntity(blueLeft7)



                //.addEntity(blueRight1)
                //.addEntity(blueRight2)
                //.addEntity(blueRight3)
                //.addEntity(blueRight4)
                //.addEntity(blueRight5)



                .start();
    }
}