public class Bot extends Player {
  private String[] names = {"Bob", "Rob", "Alice", "Aaron", "Sam", "Eddie", "Rachel", "Mike", "Charlie", "Ellie", "Colin", "Kevin", "Victor", "Robin", "Jean", "Katheryne", "Dan", "Mark", "Richard", "Dana", "Elena", "Aventurine"};
  private boolean opMode = false;
  public Bot() {
    super("");
    randomName();
    if (super.getName().equals("Aventurine")) {
      opMode = true;
    }
  }
  public void randomName () {
    super.setName(names[(int) (Math.random() * names.length)]);
  }
  public void action() {
    
  }
}