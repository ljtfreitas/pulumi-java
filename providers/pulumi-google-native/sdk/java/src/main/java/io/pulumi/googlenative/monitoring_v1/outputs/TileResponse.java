// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.WidgetResponse;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class TileResponse {
    /**
     * The height of the tile, measured in grid blocks. Tiles must have a minimum height of 1.
     * 
     */
    private final Integer height;
    /**
     * The informational widget contained in the tile. For example an XyChart.
     * 
     */
    private final WidgetResponse widget;
    /**
     * The width of the tile, measured in grid blocks. Tiles must have a minimum width of 1.
     * 
     */
    private final Integer width;
    /**
     * The zero-indexed position of the tile in grid blocks relative to the left edge of the grid. Tiles must be contained within the specified number of columns. x_pos cannot be negative.
     * 
     */
    private final Integer xPos;
    /**
     * The zero-indexed position of the tile in grid blocks relative to the top edge of the grid. y_pos cannot be negative.
     * 
     */
    private final Integer yPos;

    @CustomType.Constructor
    private TileResponse(
        @CustomType.Parameter("height") Integer height,
        @CustomType.Parameter("widget") WidgetResponse widget,
        @CustomType.Parameter("width") Integer width,
        @CustomType.Parameter("xPos") Integer xPos,
        @CustomType.Parameter("yPos") Integer yPos) {
        this.height = height;
        this.widget = widget;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * The height of the tile, measured in grid blocks. Tiles must have a minimum height of 1.
     * 
    */
    public Integer getHeight() {
        return this.height;
    }
    /**
     * The informational widget contained in the tile. For example an XyChart.
     * 
    */
    public WidgetResponse getWidget() {
        return this.widget;
    }
    /**
     * The width of the tile, measured in grid blocks. Tiles must have a minimum width of 1.
     * 
    */
    public Integer getWidth() {
        return this.width;
    }
    /**
     * The zero-indexed position of the tile in grid blocks relative to the left edge of the grid. Tiles must be contained within the specified number of columns. x_pos cannot be negative.
     * 
    */
    public Integer getXPos() {
        return this.xPos;
    }
    /**
     * The zero-indexed position of the tile in grid blocks relative to the top edge of the grid. y_pos cannot be negative.
     * 
    */
    public Integer getYPos() {
        return this.yPos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer height;
        private WidgetResponse widget;
        private Integer width;
        private Integer xPos;
        private Integer yPos;

        public Builder() {
    	      // Empty
        }

        public Builder(TileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.widget = defaults.widget;
    	      this.width = defaults.width;
    	      this.xPos = defaults.xPos;
    	      this.yPos = defaults.yPos;
        }

        public Builder height(Integer height) {
            this.height = Objects.requireNonNull(height);
            return this;
        }

        public Builder widget(WidgetResponse widget) {
            this.widget = Objects.requireNonNull(widget);
            return this;
        }

        public Builder width(Integer width) {
            this.width = Objects.requireNonNull(width);
            return this;
        }

        public Builder xPos(Integer xPos) {
            this.xPos = Objects.requireNonNull(xPos);
            return this;
        }

        public Builder yPos(Integer yPos) {
            this.yPos = Objects.requireNonNull(yPos);
            return this;
        }
        public TileResponse build() {
            return new TileResponse(height, widget, width, xPos, yPos);
        }
    }
}
