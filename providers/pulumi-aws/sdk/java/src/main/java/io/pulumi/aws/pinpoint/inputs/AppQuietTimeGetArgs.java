// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppQuietTimeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppQuietTimeGetArgs Empty = new AppQuietTimeGetArgs();

    /**
     * The default end time for quiet time in ISO 8601 format. Required if `start` is set
     * 
     */
    @Import(name="end")
      private final @Nullable Output<String> end;

    public Output<String> getEnd() {
        return this.end == null ? Output.empty() : this.end;
    }

    /**
     * The default start time for quiet time in ISO 8601 format. Required if `end` is set
     * 
     */
    @Import(name="start")
      private final @Nullable Output<String> start;

    public Output<String> getStart() {
        return this.start == null ? Output.empty() : this.start;
    }

    public AppQuietTimeGetArgs(
        @Nullable Output<String> end,
        @Nullable Output<String> start) {
        this.end = end;
        this.start = start;
    }

    private AppQuietTimeGetArgs() {
        this.end = Output.empty();
        this.start = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppQuietTimeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> end;
        private @Nullable Output<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(AppQuietTimeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(@Nullable Output<String> end) {
            this.end = end;
            return this;
        }

        public Builder end(@Nullable String end) {
            this.end = Output.ofNullable(end);
            return this;
        }

        public Builder start(@Nullable Output<String> start) {
            this.start = start;
            return this;
        }

        public Builder start(@Nullable String start) {
            this.start = Output.ofNullable(start);
            return this;
        }
        public AppQuietTimeGetArgs build() {
            return new AppQuietTimeGetArgs(end, start);
        }
    }
}
