// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.enums.JobSampleMode;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobSample {
    private final @Nullable JobSampleMode mode;
    private final @Nullable Integer size;

    @CustomType.Constructor
    private JobSample(
        @CustomType.Parameter("mode") @Nullable JobSampleMode mode,
        @CustomType.Parameter("size") @Nullable Integer size) {
        this.mode = mode;
        this.size = size;
    }

    public Optional<JobSampleMode> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<Integer> getSize() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSample defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobSampleMode mode;
        private @Nullable Integer size;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSample defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.size = defaults.size;
        }

        public Builder mode(@Nullable JobSampleMode mode) {
            this.mode = mode;
            return this;
        }

        public Builder size(@Nullable Integer size) {
            this.size = size;
            return this;
        }
        public JobSample build() {
            return new JobSample(mode, size);
        }
    }
}
