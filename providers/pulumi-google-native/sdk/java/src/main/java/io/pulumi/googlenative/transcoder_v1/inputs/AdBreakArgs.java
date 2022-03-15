// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Ad break.
 * 
 */
public final class AdBreakArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdBreakArgs Empty = new AdBreakArgs();

    /**
     * Start time in seconds for the ad break, relative to the output file timeline. The default is `0s`.
     * 
     */
    @Import(name="startTimeOffset")
      private final @Nullable Output<String> startTimeOffset;

    public Output<String> getStartTimeOffset() {
        return this.startTimeOffset == null ? Output.empty() : this.startTimeOffset;
    }

    public AdBreakArgs(@Nullable Output<String> startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }

    private AdBreakArgs() {
        this.startTimeOffset = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdBreakArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(AdBreakArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            this.startTimeOffset = startTimeOffset;
            return this;
        }

        public Builder startTimeOffset(@Nullable String startTimeOffset) {
            this.startTimeOffset = Output.ofNullable(startTimeOffset);
            return this;
        }
        public AdBreakArgs build() {
            return new AdBreakArgs(startTimeOffset);
        }
    }
}
