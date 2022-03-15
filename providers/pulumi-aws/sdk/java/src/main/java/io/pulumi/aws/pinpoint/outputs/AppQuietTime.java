// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppQuietTime {
    /**
     * The default end time for quiet time in ISO 8601 format. Required if `start` is set
     * 
     */
    private final @Nullable String end;
    /**
     * The default start time for quiet time in ISO 8601 format. Required if `end` is set
     * 
     */
    private final @Nullable String start;

    @CustomType.Constructor
    private AppQuietTime(
        @CustomType.Parameter("end") @Nullable String end,
        @CustomType.Parameter("start") @Nullable String start) {
        this.end = end;
        this.start = start;
    }

    /**
     * The default end time for quiet time in ISO 8601 format. Required if `start` is set
     * 
    */
    public Optional<String> getEnd() {
        return Optional.ofNullable(this.end);
    }
    /**
     * The default start time for quiet time in ISO 8601 format. Required if `end` is set
     * 
    */
    public Optional<String> getStart() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppQuietTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String end;
        private @Nullable String start;

        public Builder() {
    	      // Empty
        }

        public Builder(AppQuietTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(@Nullable String end) {
            this.end = end;
            return this;
        }

        public Builder start(@Nullable String start) {
            this.start = start;
            return this;
        }
        public AppQuietTime build() {
            return new AppQuietTime(end, start);
        }
    }
}
