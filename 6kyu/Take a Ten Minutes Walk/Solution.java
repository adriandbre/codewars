public class TenMinWalk {

  public static boolean isValid(char[] walk) {
    if (walk.length != 10) return false; 
    int horizontal = 0, vertical = 0;
    
    for (int i = 0; i < walk.length; i++) {
      if (walk[i] == 'n') {
        vertical = vertical + 1;
      } else if (walk[i] == 's') {
        vertical = vertical - 1;
      } else if (walk[i] == 'w') {
        horizontal = horizontal + 1;
      } else if (walk[i] == 'e') {
        horizontal = horizontal - 1;
      }
    }
    
    return horizontal == 0 && vertical == 0;
  }
  
}