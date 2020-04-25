package player;

import state.Board;
import state.Position;
import state.Team;

public class HorizontalSymmetryPlayer extends AbstractSymmetricPlayer{
    public HorizontalSymmetryPlayer(Team team) {
        super(team);
    }

    @Override
    protected Position mirror(Position original) {
        Position mirror = new Position(Math.abs(Board.BOARD_WIDTH - original.getX() - 1), original.getY());
        return mirror;
    }
}
