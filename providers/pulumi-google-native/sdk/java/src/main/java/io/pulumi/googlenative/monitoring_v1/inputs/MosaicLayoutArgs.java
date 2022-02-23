// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.TileArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A mosaic layout divides the available space into a grid of blocks, and overlays the grid with tiles. Unlike GridLayout, tiles may span multiple grid blocks and can be placed at arbitrary locations in the grid.
 * 
 */
public final class MosaicLayoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final MosaicLayoutArgs Empty = new MosaicLayoutArgs();

    /**
     * The number of columns in the mosaic grid. The number of columns must be between 1 and 12, inclusive.
     * 
     */
    @InputImport(name="columns")
      private final @Nullable Input<Integer> columns;

    public Input<Integer> getColumns() {
        return this.columns == null ? Input.empty() : this.columns;
    }

    /**
     * The tiles to display.
     * 
     */
    @InputImport(name="tiles")
      private final @Nullable Input<List<TileArgs>> tiles;

    public Input<List<TileArgs>> getTiles() {
        return this.tiles == null ? Input.empty() : this.tiles;
    }

    public MosaicLayoutArgs(
        @Nullable Input<Integer> columns,
        @Nullable Input<List<TileArgs>> tiles) {
        this.columns = columns;
        this.tiles = tiles;
    }

    private MosaicLayoutArgs() {
        this.columns = Input.empty();
        this.tiles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MosaicLayoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> columns;
        private @Nullable Input<List<TileArgs>> tiles;

        public Builder() {
    	      // Empty
        }

        public Builder(MosaicLayoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.tiles = defaults.tiles;
        }

        public Builder setColumns(@Nullable Input<Integer> columns) {
            this.columns = columns;
            return this;
        }

        public Builder setColumns(@Nullable Integer columns) {
            this.columns = Input.ofNullable(columns);
            return this;
        }

        public Builder setTiles(@Nullable Input<List<TileArgs>> tiles) {
            this.tiles = tiles;
            return this;
        }

        public Builder setTiles(@Nullable List<TileArgs> tiles) {
            this.tiles = Input.ofNullable(tiles);
            return this;
        }
        public MosaicLayoutArgs build() {
            return new MosaicLayoutArgs(columns, tiles);
        }
    }
}
