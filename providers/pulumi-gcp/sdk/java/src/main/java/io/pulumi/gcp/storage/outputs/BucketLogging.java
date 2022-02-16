// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketLogging {
    private final String logBucket;
    private final @Nullable String logObjectPrefix;

    @OutputCustomType.Constructor({"logBucket","logObjectPrefix"})
    private BucketLogging(
        String logBucket,
        @Nullable String logObjectPrefix) {
        this.logBucket = Objects.requireNonNull(logBucket);
        this.logObjectPrefix = logObjectPrefix;
    }

    public String getLogBucket() {
        return this.logBucket;
    }
    public Optional<String> getLogObjectPrefix() {
        return Optional.ofNullable(this.logObjectPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logBucket;
        private @Nullable String logObjectPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        public Builder setLogBucket(String logBucket) {
            this.logBucket = Objects.requireNonNull(logBucket);
            return this;
        }

        public Builder setLogObjectPrefix(@Nullable String logObjectPrefix) {
            this.logObjectPrefix = logObjectPrefix;
            return this;
        }

        public BucketLogging build() {
            return new BucketLogging(logBucket, logObjectPrefix);
        }
    }
}