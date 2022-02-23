// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BucketIntelligentTieringConfigurationTieringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationTieringGetArgs Empty = new BucketIntelligentTieringConfigurationTieringGetArgs();

    /**
     * S3 Intelligent-Tiering access tier. Valid values: `ARCHIVE_CONFIGURATION`, `DEEP_ARCHIVE_CONFIGURATION`.
     * 
     */
    @InputImport(name="accessTier", required=true)
    private final Input<String> accessTier;

    public Input<String> getAccessTier() {
        return this.accessTier;
    }

    /**
     * The number of consecutive days of no access after which an object will be eligible to be transitioned to the corresponding tier.
     * 
     */
    @InputImport(name="days", required=true)
    private final Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days;
    }

    public BucketIntelligentTieringConfigurationTieringGetArgs(
        Input<String> accessTier,
        Input<Integer> days) {
        this.accessTier = Objects.requireNonNull(accessTier, "expected parameter 'accessTier' to be non-null");
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
    }

    private BucketIntelligentTieringConfigurationTieringGetArgs() {
        this.accessTier = Input.empty();
        this.days = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIntelligentTieringConfigurationTieringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accessTier;
        private Input<Integer> days;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIntelligentTieringConfigurationTieringGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.days = defaults.days;
        }

        public Builder setAccessTier(Input<String> accessTier) {
            this.accessTier = Objects.requireNonNull(accessTier);
            return this;
        }

        public Builder setAccessTier(String accessTier) {
            this.accessTier = Input.of(Objects.requireNonNull(accessTier));
            return this;
        }

        public Builder setDays(Input<Integer> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setDays(Integer days) {
            this.days = Input.of(Objects.requireNonNull(days));
            return this;
        }
        public BucketIntelligentTieringConfigurationTieringGetArgs build() {
            return new BucketIntelligentTieringConfigurationTieringGetArgs(accessTier, days);
        }
    }
}
