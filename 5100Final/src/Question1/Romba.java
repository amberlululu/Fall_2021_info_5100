package Question1;

class Roomba implements iRobot{
    int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    int[][] room;
    int a = 0;
    int b = 0;
    Direction direction;
    

    public Roomba(int[][] room) {
        this.room = room;
        Direction direction = Direction.DOWN;
    }

    @Override
    public boolean move() {
        int dirct = -1;
        if(direction == Direction.UP) dirct  = 0;
        else if(direction == Direction.DOWN) dirct = 1;
        else if(direction == Direction.LEFT) dirct = 2;
        else if(direction == Direction.RIGHT) dirct = 3;

        int newX = a + dir[dirct][0];
        int newY = b + dir[dirct][1];

        if(newX >= 0 && newX < room.length && newY >= 0 && newY < room[0].length && room[newX][newY] != -1) {
            a = newX;
            b = newY;
            return true;
        }
        return false;
    }

    @Override
    public void turnLeft() {
        if(direction == Direction.DOWN) {
            direction = Direction.RIGHT;
        }
        else if(direction == Direction.RIGHT) {
            direction = Direction.UP;
        }
        else if(direction == Direction.UP) {
            direction = Direction.LEFT;
        }
        else if(direction == Direction.LEFT) {
            direction = Direction.DOWN;
        }
    }

    @Override
    public void turnRight() {
        if(direction == Direction.DOWN) {
            direction = Direction.LEFT;
        }
        else if(direction == Direction.LEFT) {
            direction = Direction.UP;
        }
        else if(direction == Direction.UP) {
            direction = Direction.RIGHT;
        }
        else if(direction == Direction.RIGHT) {
            direction = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        room[a][b] = 1;
    }
}
