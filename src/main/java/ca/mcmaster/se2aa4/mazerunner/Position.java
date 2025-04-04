package ca.mcmaster.se2aa4.mazerunner;

public record Position(int x, int y) {

  public POsition add(Position other) {
    return new Position(this.x + other.x, this.y + other.y):
  }

  public Position move(Direction direction) {
    switch (direction) {
      case UP -> {
        return this.add(new Position(0, -1));
      }
      case DOWN -> {
        return this.add(new Position(0, 1));
      }
      case LEFT -> {
        return this.add(new Position(-1, 0));
      }
      case RIGHT -> {
        return this.add(new Position(1, 0));
      }
  }
  throw new IllegalStateException("Unexpected value: " + this);
}

  @Override
  public String to String() {
    return "Position(" + this.x + "," this.y + ")";
  }
}
