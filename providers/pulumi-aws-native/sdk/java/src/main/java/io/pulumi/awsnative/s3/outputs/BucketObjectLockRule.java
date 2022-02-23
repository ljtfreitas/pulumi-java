// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketDefaultRetention;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketObjectLockRule {
    private final @Nullable BucketDefaultRetention defaultRetention;

    @OutputCustomType.Constructor({"defaultRetention"})
    private BucketObjectLockRule(@Nullable BucketDefaultRetention defaultRetention) {
        this.defaultRetention = defaultRetention;
    }

    public Optional<BucketDefaultRetention> getDefaultRetention() {
        return Optional.ofNullable(this.defaultRetention);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketDefaultRetention defaultRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRetention = defaults.defaultRetention;
        }

        public Builder setDefaultRetention(@Nullable BucketDefaultRetention defaultRetention) {
            this.defaultRetention = defaultRetention;
            return this;
        }
        public BucketObjectLockRule build() {
            return new BucketObjectLockRule(defaultRetention);
        }
    }
}
