package Question1;

class Roomba implements iRobot{
    int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    int[][] room;
    int x = 0;
    int y = 0;
    Direction direction = Direction.DOWN;

    public Roomba(int[][] room) {
        this.room = room;
    }

    @Override
    public boolean move() {
        int dirction = -1;
        if(direction == Direction.UP) dirction  = 0;
        else if(direction == Direction.DOWN) dirction = 1;
        else if(direction == Direction.LEFT) dirction = 2;
        else if(direction == Direction.RIGHT) dirction = 3;

        int newx = x + dir[dirction][0];
        int newy = y + dir[dirction][1];

        if(newx >= 0 && newx < room.length && newy >= 0 && newy < room[0].length && room[newx][newy] != -1) {
            x = newx;
            y = newy;
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
        room[x][y] = 1;
    }
}