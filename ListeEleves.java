import java.util.*;

public class ListeEleves {
  public static void main(String[]args){
    List<String>myList=new ArrayList<String>();
    myList.add("Justine");
    myList.add("Tantely");
    myList.add("Marthe");
    myList.add("Anabelle");
    myList.add("Tony");
    myList.add("Mohamed");
    myList.add("Gaëtan");
    myList.add("Nicolas");
    myList.add("Erwan");
    myList.add("Moka");
    myList.add("Alexis");
    myList.add("Lucas");
    Iterator<String>iterator=myList.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    List<String>theirList=new ArrayList<String>();
    theirList.add("Leuthsouline");
    theirList.add("Charles");
    theirList.add("Michaël");
    theirList.add("Michel");
    theirList.add("Quentin");
    theirList.add("Robin");
    theirList.add("Mathieu");
    theirList.add("Gautier");
    theirList.add("Corentin");
    theirList.add("Florentin");
    theirList.add("Fabien");
    theirList.add("Benoît");

    Map <String, List<String>> map = new HashMap<String, List<String>>();
    map.put("java ",myList);
    map.put("js ",theirList);
    //String key=iterator.next();
  //  String key="java";
  /*  map.put("Leuthsouline", "js");
    map.put("Michel", "js");*/
    for(Map.Entry<String,List<String>> entry : map.entrySet()){

    //  map.put("Charles", );

      String key=entry.getKey();
      List value=entry.getValue();

    //  String value="java";
      System.out.println(key);
      System.out.println(value);


    }
  }
}
