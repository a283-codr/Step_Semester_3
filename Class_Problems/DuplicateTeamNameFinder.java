public class DuplicateTeamNameFinder {

    public static String findDuplicateTeam(String[] teamNames) {

        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {

                if (teamNames[i].equals(teamNames[j])) {
                    return teamNames[i];
                }
            }
        }

        return "No Duplicates Found";
    }

    public static void main(String[] args) {

        String[] teamNames = {
            "CodeCrafters",
            "ByteForce",
            "TechTitans",
            "ByteForce"
        };

        String result = findDuplicateTeam(teamNames);

        if (result.equals("No Duplicates Found")) {
            System.out.println(result);
        } else {
            System.out.println("Duplicate Found: " + result);
        }
    }
}