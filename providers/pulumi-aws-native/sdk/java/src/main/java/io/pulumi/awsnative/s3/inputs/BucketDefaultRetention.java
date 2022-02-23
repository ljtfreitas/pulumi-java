// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketDefaultRetentionMode;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The default retention period that you want to apply to new objects placed in the specified bucket.
 * 
 */
public final class BucketDefaultRetention extends io.pulumi.resources.InvokeArgs {

    public static final BucketDefaultRetention Empty = new BucketDefaultRetention();

    @InputImport(name="days")
        private final @Nullable Integer days;

    public Optional<Integer> getDays() {
        return this.days == null ? Optional.empty() : Optional.ofNullable(this.days);
    }

    @InputImport(name="mode")
        private final @Nullable BucketDefaultRetentionMode mode;

    public Optional<BucketDefaultRetentionMode> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    @InputImport(name="years")
        private final @Nullable Integer years;

    public Optional<Integer> getYears() {
        return this.years == null ? Optional.empty() : Optional.ofNullable(this.years);
    }

    public BucketDefaultRetention(
        @Nullable Integer days,
        @Nullable BucketDefaultRetentionMode mode,
        @Nullable Integer years) {
        this.days = days;
        this.mode = mode;
        this.years = years;
    }

    private BucketDefaultRetention() {
        this.days = null;
        this.mode = null;
        this.years = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketDefaultRetention defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private @Nullable BucketDefaultRetentionMode mode;
        private @Nullable Integer years;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketDefaultRetention defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.mode = defaults.mode;
    	      this.years = defaults.years;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = days;
            return this;
        }

        public Builder setMode(@Nullable BucketDefaultRetentionMode mode) {
            this.mode = mode;
            return this;
        }

        public Builder setYears(@Nullable Integer years) {
            this.years = years;
            return this;
        }
        public BucketDefaultRetention build() {
            return new BucketDefaultRetention(days, mode, years);
        }
    }
}
