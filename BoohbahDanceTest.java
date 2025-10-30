public class BoohbahDanceTest{
    public static void main(String[] args) {
        Boohbah zingZingZingBah = new Boohbah("Zing Zing Zingbah", "Spin and Sparkle");
        Boohbah humbah = new Boohbah("Humbah", "Wiggle Wiggle");
        Boohbah jumbah = new Boohbah("Jumbah", "Twirl of Joy");
        Boohbah[] boohbah = {zingZingZingBah, humbah, jumbah};
        DanceRoutine preDance = new DanceRoutine(boohbah);
        System.out.println(preDance.buildRoutine());
        System.out.println(preDance.modifyRoutine());
        System.out.println(preDance.remixRoutine());
    }

}
