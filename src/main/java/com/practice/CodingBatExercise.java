package com.practice;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 02/11/13
 * Time: 13:00
 * To change this template use File | Settings | File Templates.
 */
public class CodingBatExercise {

  public static void main(String[] args) throws ParseException {
    //System.out.println(loneTeen(13, 99));
    //System.out.println(delDel("adelbc"));
    //System.out.println(startOz("oz"));
    //System.out.println(close10(8,13));
    //System.out.println(endUp("Hello"));
    //System.out.println(everyNth("Chocolate", 3));
    // System.out.println(stringTimes("Oh Boy!", 2));
    // System.out.println(countXX("xxx"));
    //  System.out.println(doubleX("xaxxx"));
     // System.out.println(stringBits("Heelloo"));
      //System.out.println(arrayFront9(new int[] {1, 2, 3, 4, 9}));
      //System.out.println(array123(new int[] {1, 2}));
      //System.out.println(stringMatch("abc", "axc"));
      //System.out.println(removeX("xxHxix"));

      //System.out.println(altChars("kitten"));
      //System.out.println(isPrimeNumber(25));
      //System.out.println(getEnvVar());
//      System.out.println(makeOutWord("<<>>", "Yay"));
      //System.out.println(stairCase(6));
      //System.out.println(convertDateFormat("07:05:45PM"));
      //System.out.println(calculateTotalBill());

      //System.out.println(array667(new int[]{6,7,2,6}));
      //System.out.println(noTriples(new int[] {1, 1, 1}));
      //IntegerCacheExample();
      //Book[] books =  {new Book(3, "To Kill A Mockingbird", "English", 3), new Book(4, "Jay's Book", "Hindi", 700)};

      //System.out.println(books[0]);
      //bigDecimalTest();
      //using an ArrayList is better

      //System.out.println(numberOfOccurencesOfCharPart2("JayGehlotEngineerInTest"));
      //System.out.println(numberOfOccurencesOfCharPart3("JayGehlotEngineerInTest"));
      //System.out.println(numberOfOccurencesOfCharPart4("JayGehlotEngineerInTest"));

      //recursiveMethod("Care and composition#Composition#88% polyamide, 12% elastane ;;;(exclusive of trimmings);;;" +
             // "Care instructions#Machine washable, tumble dry");

      //System.out.println(convertBinaryArrayToInt(Arrays.asList(1, 1, 1, 1)));
      //System.out.println(wordOccurencesInArrays(new String[] { "jay", "gehlot", "gehlot"}));
      System.out.println(lengthOfEachWordInArray(new String[] { "jay", "gehlot", "gehlot"}));

//      System.out.println(codingBatmapAB4(new HashMap<String, String>() {{
//          put("a","aaa");
//          put("b","bb");
//          put("c","cake");
//      }}));
  }

    private static Map<String, Integer> wordOccurencesInArrays(String[] strings) {
        return Arrays.stream(strings).collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
    }

    private static Map<String, Integer> lengthOfEachWordInArray(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        new HashSet<>(Arrays.asList(strings)).forEach(s -> result.put(s, s.length()));
                        //loop through HashSet which only holds unique items, and stick the items and each one length in a hashmap
        return result;

    }

    private static Map<String, String> codingBatmapAB4(Map<String, String> map) {

        final String keyA = map.get("a");
        final String keyB = map.get("b");

        if ((keyA != null) && (keyB != null)) {
            if (keyA.length() > keyB.length()) {
                map.put("c", keyA);
            } else if (keyB.length() > keyA.length()) {
                map.put("c", keyB);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {
      StringBuilder internalBinary = new StringBuilder();
      binary.forEach(entry -> internalBinary.append(entry));

        return Integer.parseInt(internalBinary.toString(), 2);
    }

    private static Map<String, String> codingBatMap1ExerciseAB3(Map<String, String> map) {

        Map<String, String> returnMap = new HashMap<>();

        map.forEach((key, value) -> {
            if (key.equals("a") && !map.containsKey("b")) {
                returnMap.put("b", map.get("a"));
            }

            if (key.equals("b") && !map.containsKey("a")) {
                returnMap.put("a", map.get("b"));
            }

        });

        return Stream.concat(map.entrySet().stream(), returnMap.entrySet().stream())
                .collect(toMap( Map.Entry::getKey, Map.Entry::getValue ));
    }


    public static void recursiveMethod(String text) {
        List<String> res = new ArrayList<>();
        Pattern p = Pattern.compile("[#|;]+");
        String s = text.replace("<multisep/>", "");
        Matcher m = p.matcher(s);
        int pos = 0;

        while (m.find()) {
            if (pos != m.start()) {
                res.add(s.substring(pos, m.start()));
            }
            res.add(m.group());
            pos = m.end();
        }
        if (pos != s.length()) {
            res.add(s.substring(pos));
        }
        for (String t : res) {
            System.out.println("'"+t+"'");
        }
    }

    public static int calculateTotalBill() {
        double mealCost = 12.00;
        int tipPercent = 20;
        int taxPercent = 8;

        double tipAmount = (tipPercent / 100.00) * mealCost;
        double taxAmount =  (taxPercent / 100.00) * mealCost;

        return (int) Math.round(mealCost + tipAmount + taxAmount);

    }

    public static String convertDateFormat(String inputDate) throws ParseException {


        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");

        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        return date24Format.format(date12Format.parse(inputDate));
    }



    public static String makeOutWord(String out, String word) {
        int breakPoint = out.length() / 2;
        return out.substring(0, breakPoint) + word + out.substring(breakPoint, out.length());
    }

    private static String stairCase(int totalNumberOfLevels) {
        final StringBuilder sb = new StringBuilder();
        String finalStaircase = null;
        for (int i=1; i <= totalNumberOfLevels; i++) {
            prependSpacesForLevel(sb, totalNumberOfLevels - i);
            finalStaircase = numberOfStepsForLevel(sb, i).toString();
        }
        return finalStaircase;
    }

    private static StringBuilder numberOfStepsForLevel(final StringBuilder sb, int currentLevel) {
        for (int i=1; i <= currentLevel; i++) {
            sb.append("#");
        }
        sb.append("\n");
        return sb;
    }

    private static StringBuilder prependSpacesForLevel(final StringBuilder sb, int numOfSpacesToPrepend) {
        for (int i=0; i < numOfSpacesToPrepend; i++) {
            sb.append(" ");
        }
        return sb;
    }

    static class Book {
        private int number;
        private String name;
        private String language;
        private int price;

        @Override
        public String toString() {
            return "Book{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    ", language='" + language + '\'' +
                    ", price=" + price +
                    '}';
        }

       private Book(int number, String name, String language, int price) {
            this.name = name;
            this.number = number;
            this.language = language;
            this.price = price;
        }
    }

    private static String getEnvVar() {
        return System.getenv("API_ENDPOINT");
    }

    private static int array667(int[] nums) {
        int result = 0;
        for (int i=0; i < nums.length-1; i++) {
            if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) {
                result++;
            }
        }
        return result;
    }

    private static boolean noTriples(int[] nums) {

        for (int i=0; i < nums.length-2; i++) {
            int first = nums[i];
            if (nums[i+1]==first && nums[i+2]==first)
                return false;
        }

        return true;
    }



    public static void bigDecimalTest() {
        BigDecimal value1 = new BigDecimal(10);
        BigDecimal value2 = new BigDecimal(20);

        System.out.println(value1.compareTo(value2));
    }

    private static String numberOfOccurencesOfChar(String str) {

        StringBuilder output = new StringBuilder();
        Map<Character, Integer> characterStore = new HashMap<>();
        Set<Character> processedChars = new HashSet<>();

        char testChar, currentChar;

        for (int i=0; i <= str.length() - 1; i++) {
            testChar = str.charAt(i);

            for (int j = 0; j <= str.length() - 1; j++) {
                currentChar = str.charAt(j);

                if (testChar == currentChar && !processedChars.contains(currentChar)) {
                    if (characterStore.get(currentChar) == null) {
                        characterStore.put(currentChar, 1);
                    } else if (characterStore.get(currentChar) != null) {
                        characterStore.put(currentChar, characterStore.get(currentChar) + 1);
                    }
                }
            }
            processedChars.add(testChar);
        }

        for (Map.Entry e: characterStore.entrySet()){
            output.append(e.getKey()).append("=").append(e.getValue()).append("; ");
        }
        return output.toString();
    }


    private static void IntegerCacheExample() {
        Integer x = 1;
        Integer y = 1;

        System.out.println("x==y " + (x == y));
        System.out.println("x.equals(y) " + (x.equals(y)));


        Integer x1 = 1000;
        Integer y1 = 1000;

        System.out.println("x1==y1 " + (x1 == y1));
        System.out.println("x1.equals(y1) " + (x1.equals(y1)));

    }


    private static String numberOfOccurencesOfCharPart2(String str) {

        Map<Character, Integer> characterStore = new HashMap<>();

        char testChar;

        for (int i=0; i <= str.length() - 1; i++) {
            testChar = str.charAt(i);
            Integer value;
            if (characterStore.containsKey(testChar)) {
                value = characterStore.get(testChar);
                value++;
            } else {
                value = new Integer(1);
            }
            characterStore.put(testChar, value);
        }

        StringBuilder output = new StringBuilder();
        for (Map.Entry e: characterStore.entrySet()){
            output.append(e.getKey()).append("=").append(e.getValue()).append("; ");
        }
        return output.toString();
    }

    private static String numberOfOccurencesOfCharPart3(String str) {
        Map<Character, Integer> characterStore = new HashMap<>();

        for (int i=0; i < str.length(); i++) {
            char testChar = str.charAt(i);
            if (characterStore.containsKey(testChar)) {
                characterStore.put(testChar, characterStore.get(testChar)+1);
            } else {
                characterStore.put(testChar, 1);
            }
        }

        StringBuilder output = new StringBuilder();
        for (Map.Entry e: characterStore.entrySet()){
            output.append(e.getKey()).append("=").append(e.getValue()).append("; ");
        }
        return output.toString();
    }

    private static String numberOfOccurencesOfCharPart4(String str) {
        int[] characterStore = new int[256];

        for (int i=0; i < str.length(); i++) {
            char testChar = str.charAt(i);
            characterStore[(int)testChar] = characterStore[(int)testChar] + 1;
        }

        StringBuilder output = new StringBuilder();
        for (int i=0; i < characterStore.length; i++){
            if (characterStore[i] > 0) {
                output.append((char)i).append("=").append(characterStore[i]).append("; ");
            }
        }
        return output.toString();
    }

    /**
     * Tests if a number is a prime number or not
     * Returns true if it is and false if not
     * @param number
     * @return
     */
    private static boolean isPrimeNumber(int number) {
        boolean result = true;

        if(number == 1) {
            result = false;
        }

        if (number !=1 ) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    private static String altChars(String string){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < string.length() ; i+=4){
            if (i <= string.length()) {
                sb.append(string.charAt(i));
            }
            if ( i + 1 < string.length()) {
                sb.append(string.charAt(i + 1));
            }
        }
        return sb.toString();
    }

    private static String removeX(String str) {
        if (str.equals("x")){
            return "x";
        } else if (str.equals("")){
            return "";
        }
        else if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x'){
            String newString = str.replaceAll("x", "");
            return "x" + newString + "x";
        } else {
            return str.replaceAll("x", "");
        }
    }

    private static int stringMatch(String a, String b){
        int counter = 0;
        int shorterStringLength = Math.min(a.length(), b.length());

        for (int i=0; i < shorterStringLength - 1; i++) {
            String stringASub = a.substring(i, i+2);
            String stringBSub = b.substring(i, i+2);

            if (stringASub.equals(stringBSub)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean array123(int[] nums) {
        boolean result = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums.length >= i+2 && nums.length > 2) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }




    private static boolean arrayFront9(int[] nums) {
        boolean result = false;

        for (int i=0; i < nums.length; i++) {
            if (nums[i] == 9 && i <4) {
                result = true;
                break;
            } else result = false;
        }
        return result;
    }




    public static int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    private static boolean doubleX(String str) {
        boolean result = false;
        int counter = 0;
        for (int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == 'x'){
              counter++;
                if( str.charAt(i+1) == 'x' && counter == 1 ){
                   result = true;
                    break;
                }
            }
        }
        return result;
    }


    static boolean doubleXNew(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }

    static String stringBits(String str) {
        String result="";

        for(int charPointer = 0; charPointer <= str.length()-1; charPointer+=2){
            result += str.charAt(charPointer);
        }
        return result;
    }

    private static int countXX(String str) {
        int counter=0;
        for (int i=0; i < str.length(); i++){
            if (i+1 < str.length()){
                boolean numberOfX = str.charAt(i) == 'x' && str.charAt(i+1) == 'x';
                    if (numberOfX ){
                      counter ++;
                    }
            }
        }
        return counter;
    }

    private static String stringTimes(String s, int i) {
        String result = "";
        for(int n=1; n <=i; n++){
            result = result + s;
        }
        return result;
    }

    public static String everyNth(String str, int n){
    String tmp="";
    for (int i=0; i<str.length();) {
      tmp = tmp + str.charAt(i);
      i = i + n;
    }
    return  tmp;
  }

  public static String endUp(String str){
    if (str.length() > 3){
      String lastThreeChars = str.substring(str.length() - 3, str.length());
      String firstThreeChars = str.substring(0, str.length() - 3);
      return firstThreeChars + lastThreeChars.toUpperCase();
    } else return str.toUpperCase();
  }

  public static int close10(int a, int b){
    int checkA = Math.abs(a - 10);
    int checkB = Math.abs(b - 10);

    if (checkA == checkB) {
      return 0;
    } return checkA > checkB ? b : a;
  }

  public static boolean loneTeen(int a, int b){
    boolean aTeen = a>=13 && a <=19;
    boolean bTeen = b>=13 && b <=19;

    if (aTeen && !bTeen) {
      return true;
    } else if (!aTeen && bTeen) {
      return true;
    } else return false;
  }

  public static String delDel(String str){
    boolean doesDelExist = false;
    if (str.length() >= 4) {
      doesDelExist = "del".equals(str.substring(1, 4));
    }

    if (doesDelExist) {
      return str.replaceAll("del", "");
    } else return str;
  }

  public static String startOz(String str){


    if (str.length() >= 2 && str.charAt(0) == 'o' && str.charAt(1) == 'z' ){
      return "oz";
    } else if (str.length() >= 2 && str.charAt(1) == 'z') {
      return "z";
    } else if (str.length() >= 1 && str.charAt(0) == 'o') {
      return "o";
    } else return "";

  }

}
