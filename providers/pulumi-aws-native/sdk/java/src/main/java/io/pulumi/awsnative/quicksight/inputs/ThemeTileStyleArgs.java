// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.ThemeBorderStyleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Display options related to tiles on a sheet.</p>
 * 
 */
public final class ThemeTileStyleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeTileStyleArgs Empty = new ThemeTileStyleArgs();

    @Import(name="border")
      private final @Nullable Output<ThemeBorderStyleArgs> border;

    public Output<ThemeBorderStyleArgs> getBorder() {
        return this.border == null ? Output.empty() : this.border;
    }

    public ThemeTileStyleArgs(@Nullable Output<ThemeBorderStyleArgs> border) {
        this.border = border;
    }

    private ThemeTileStyleArgs() {
        this.border = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeTileStyleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ThemeBorderStyleArgs> border;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeTileStyleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.border = defaults.border;
        }

        public Builder border(@Nullable Output<ThemeBorderStyleArgs> border) {
            this.border = border;
            return this;
        }

        public Builder border(@Nullable ThemeBorderStyleArgs border) {
            this.border = Output.ofNullable(border);
            return this;
        }
        public ThemeTileStyleArgs build() {
            return new ThemeTileStyleArgs(border);
        }
    }
}
