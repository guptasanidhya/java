import java.util.Locale;

public class string_04 {
    public static void main(String[] args) {
        String a = "aN";
        String b = "naaa";
        int count = 0;
        // Complete the function
        char m[] = a.toLowerCase().toCharArray();
        char n[] = b.toLowerCase().toCharArray();
        if (m.length == n.length) {
            for (int i = 0; i < m.length; i++) {

                for (int j = 0; j < m.length; j++) {
                    if (m[i] == m[j]) {
                        count++;
                    }

                }
//            System.out.println(m[i]+" "+count);
                for (int k = 0; k < n.length; k++) {
                    if (m[i] == n[k]) {
                        count--;

                    }
                }
                if (count != 0) {
                    System.out.println("Not Anagram");
                    break;
                }
//            System.out.println(m[i]+" "+count);


            }
            if (count == 0) {
                System.out.println("Anagram");
            }


        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}

/*static boolean isAnagram(String a, String b) {

// test for invalid input
if( a == null || b == null || a.equals("") || b.equals("") )
    throw new IllegalArgumentException();

// initial quick test for non-anagrams
if ( a.length() != b.length() )
    return false;

a = a.toLowerCase();
b = b.toLowerCase();

// populate a map with letters and frequencies of String b
Map<Character, Integer> map = new HashMap<>();

for (int k = 0; k < b.length(); k++){
     char letter = b.charAt(k);

    if( ! map.containsKey(letter)){
        map.put( letter, 1 );
    } else {
        Integer frequency = map.get( letter );
        map.put( letter, ++frequency );
    }
}

// test each letter in String a against data in the map
// return if letter is absent in the map or its  frequency is 0
// otherwise decrease the frequency by 1

for (int k = 0; k < a.length(); k++){
    char letter = a.charAt(k);

    if( ! map.containsKey( letter ) )
        return false;

    Integer frequency = map.get( letter );

     if( frequency == 0 )
        return false;
    else
        map.put( letter, --frequency);
}
// if the code got that far it is an anagram
return true;*/