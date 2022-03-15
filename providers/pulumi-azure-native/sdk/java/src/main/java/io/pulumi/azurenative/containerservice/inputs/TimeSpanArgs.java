// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The time span with start and end properties.
 * 
 */
public final class TimeSpanArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeSpanArgs Empty = new TimeSpanArgs();

    /**
     * The end of a time span
     * 
     */
    @Import(name="end")
      private final @Nullable Output<String> end;

    public Output<String> getEnd() {
        return this.end == null ? Output.empty() : this.end;
    }

    /**
     * The start of a time span
     * 
     */
    @Import(name="start")
      private final @Nullable Output<String> start;

    public Output<String> getStart() {
        return this.start == null ? Output.empty() : this.start;
    }

    public TimeSpanArgs(
        @Nullable Output<String> end,
        @Nullable Output<String> start) {
        this.end = end;
        this.start = start;
    }

    private TimeSpanArgs() {
        this.end = Output.empty();
        this.start = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSpanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> end;
        private @Nullable Output<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSpanArgs defaults) {
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
        public TimeSpanArgs build() {
            return new TimeSpanArgs(end, start);
        }
    }
}
