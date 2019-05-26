public class JAVA12_swtich {

    public static void main(String[] args) {

        var ahea = "play";
        var result = switch(ahea) {
            case "study", "play" -> "eat";
            case "eat" -> "eat";
        };




    }


    public String ahea2(String ahea) {
        String result;
        if (ahea.equals("study") || ahea.equals("play")) {
            result = "study or play";
        } else if (ahea.equals("eat")) {
            result = "eat";
        } else {
            result = "unknown";
        }
        return result;
    }



    public String ahea(String ahea) {
        String result;
        switch (ahea) {
            case "play":
                result = "play";
                break;
            case "eat":
                result = "eat";
                break;
            default:
                result = "unknown";
                break;
        }
        return result;
    }


}
