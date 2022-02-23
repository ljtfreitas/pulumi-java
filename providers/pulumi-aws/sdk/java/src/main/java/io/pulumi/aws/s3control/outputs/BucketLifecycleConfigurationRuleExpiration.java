// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketLifecycleConfigurationRuleExpiration {
    /**
     * Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
     * 
     */
    private final @Nullable String date;
    /**
     * Number of days before the object is to be deleted.
     * 
     */
    private final @Nullable Integer days;
    /**
     * Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
     * 
     */
    private final @Nullable Boolean expiredObjectDeleteMarker;

    @OutputCustomType.Constructor({"date","days","expiredObjectDeleteMarker"})
    private BucketLifecycleConfigurationRuleExpiration(
        @Nullable String date,
        @Nullable Integer days,
        @Nullable Boolean expiredObjectDeleteMarker) {
        this.date = date;
        this.days = days;
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
    }

    /**
     * Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g., `2020-09-30`.
     * 
     */
    public Optional<String> getDate() {
        return Optional.ofNullable(this.date);
    }
    /**
     * Number of days before the object is to be deleted.
     * 
     */
    public Optional<Integer> getDays() {
        return Optional.ofNullable(this.days);
    }
    /**
     * Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
     * 
     */
    public Optional<Boolean> getExpiredObjectDeleteMarker() {
        return Optional.ofNullable(this.expiredObjectDeleteMarker);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfigurationRuleExpiration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String date;
        private @Nullable Integer days;
        private @Nullable Boolean expiredObjectDeleteMarker;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfigurationRuleExpiration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.date = defaults.date;
    	      this.days = defaults.days;
    	      this.expiredObjectDeleteMarker = defaults.expiredObjectDeleteMarker;
        }

        public Builder setDate(@Nullable String date) {
            this.date = date;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = days;
            return this;
        }

        public Builder setExpiredObjectDeleteMarker(@Nullable Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public BucketLifecycleConfigurationRuleExpiration build() {
            return new BucketLifecycleConfigurationRuleExpiration(date, days, expiredObjectDeleteMarker);
        }
    }
}
