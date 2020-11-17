import java.util.Arrays;

class skillTree {
    public static void main(String[] args) {
        int answer = 0;
        String skill = "CBD";
        String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

        int[] skill_index = new int[skill.length()];
        int[] sorted_skill_index = new int[skill.length()];
        for (String skill_tree : skill_trees) {
            for (int i = 0; i < skill.length(); i++) {
                int idx = skill_tree.indexOf(skill.substring(i, i + 1));
                if (idx == -1)
                    idx = skill_tree.length() + 1;
                skill_index[i] = idx;
            }
            sorted_skill_index = skill_index.clone();
            Arrays.sort(sorted_skill_index);
            if (Arrays.equals(skill_index, sorted_skill_index))
                answer += 1;
        }
        System.out.println(answer);
    }
}