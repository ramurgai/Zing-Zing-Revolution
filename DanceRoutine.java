public class DanceRoutine{
    private Boohbah[] boohbah;
    public DanceRoutine(Boohbah[] boohbah){
        this.boohbah = boohbah;
    }
    public String buildRoutine(){
      StringBuilder routine = new StringBuilder();
      for (Boohbah boohbah: boohbah){
          routine.append(boohbah.performMove());
          routine.append("\n");
      }
      return routine.toString();
    }
    public String modifyRoutine(){
        StringBuilder routine = new StringBuilder();
        for (Boohbah boohbah: boohbah){
            routine.append(boohbah.performMove());
            routine.append("\n");
        }
        String stringRoutine = routine.toString();
        stringRoutine = stringRoutine.replace("performs","hits the");
        return stringRoutine;
    }
    public String remixRoutine(){
        StringBuilder remixed = new StringBuilder(buildRoutine());
        remixed.insert(0,"---REMIX---\n");
        remixed.delete(remixed.length()-1, remixed.length()-1);
        remixed.append("(Backwards Boohbah Shuffle!)");
        remixed.reverse();
        return remixed.toString();
    }
}
