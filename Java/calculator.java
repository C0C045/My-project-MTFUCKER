public class calculator {
  int number;
  int answer;

  void add (){
    answer += number;
  }

  void resta (){
    answer -= number;
  }

  void multi (){
    answer *= number;
  }

  void divide (){
    answer /= number;
  }

  void mod (){
    answer %= number;
  }

  void setNumber (int num){
    this.number = num;
  }

  int getAnswer (){
    return answer;
  }

  public static void main (String[] args){
    calculator calPanadera = new calculator();
    calPanadera.setNumber(5);
    calPanadera.add();
    calPanadera.setNumber(5);
    calPanadera.add();
    System.out.println (calPanadera.getAnswer());
    calPanadera.setNumber(2);
    calPanadera.resta();
    System.out.println (calPanadera.getAnswer());
    calPanadera.setNumber(2);
    calPanadera.multi();
    System.out.println (calPanadera.getAnswer());
  }
  
}