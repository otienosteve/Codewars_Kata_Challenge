public class Solution {

  public int solution(int number) {
    number--;
 int store=0;
    int count=0;
    if (number<1){
      store=0;
    }
  else
  {  for (;count<=number; count++){
   if (count%3==0){
     store=store+count;
   }
    else if(count%5==0){
        store=store+count;
      }
  }
     }
     return store;
     }

  }