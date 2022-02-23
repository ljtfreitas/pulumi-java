// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.ThemeTileLayoutStyle;
import io.pulumi.awsnative.quicksight.outputs.ThemeTileStyle;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ThemeSheetStyle {
    private final @Nullable ThemeTileStyle tile;
    private final @Nullable ThemeTileLayoutStyle tileLayout;

    @OutputCustomType.Constructor({"tile","tileLayout"})
    private ThemeSheetStyle(
        @Nullable ThemeTileStyle tile,
        @Nullable ThemeTileLayoutStyle tileLayout) {
        this.tile = tile;
        this.tileLayout = tileLayout;
    }

    public Optional<ThemeTileStyle> getTile() {
        return Optional.ofNullable(this.tile);
    }
    public Optional<ThemeTileLayoutStyle> getTileLayout() {
        return Optional.ofNullable(this.tileLayout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeSheetStyle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ThemeTileStyle tile;
        private @Nullable ThemeTileLayoutStyle tileLayout;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeSheetStyle defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tile = defaults.tile;
    	      this.tileLayout = defaults.tileLayout;
        }

        public Builder setTile(@Nullable ThemeTileStyle tile) {
            this.tile = tile;
            return this;
        }

        public Builder setTileLayout(@Nullable ThemeTileLayoutStyle tileLayout) {
            this.tileLayout = tileLayout;
            return this;
        }
        public ThemeSheetStyle build() {
            return new ThemeSheetStyle(tile, tileLayout);
        }
    }
}
