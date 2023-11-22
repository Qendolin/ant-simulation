package antsim.world;

import antsim.IVector;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface ChunkView {
    /**
     * Retrieves a cell in the chunk based on its position.
     */
    @NotNull
    Cell get(int x, int y);

    /**
     * @return the chunk's origin position
     */
    @Contract(pure = true)
    IVector origin();

    /**
     * @return the chunk's size
     */
    @Contract(pure = true)
    IVector size();
}
