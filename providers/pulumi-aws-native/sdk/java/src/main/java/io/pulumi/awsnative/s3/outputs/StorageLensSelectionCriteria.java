// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageLensSelectionCriteria {
    /**
     * Delimiter to divide S3 key into hierarchy of prefixes.
     * 
     */
    private final @Nullable String delimiter;
    /**
     * Max depth of prefixes of S3 key that Amazon S3 Storage Lens will analyze.
     * 
     */
    private final @Nullable Integer maxDepth;
    /**
     * The minimum storage bytes threshold for the prefixes to be included in the analysis.
     * 
     */
    private final @Nullable Double minStorageBytesPercentage;

    @OutputCustomType.Constructor
    private StorageLensSelectionCriteria(
        @OutputCustomType.Parameter("delimiter") @Nullable String delimiter,
        @OutputCustomType.Parameter("maxDepth") @Nullable Integer maxDepth,
        @OutputCustomType.Parameter("minStorageBytesPercentage") @Nullable Double minStorageBytesPercentage) {
        this.delimiter = delimiter;
        this.maxDepth = maxDepth;
        this.minStorageBytesPercentage = minStorageBytesPercentage;
    }

    /**
     * Delimiter to divide S3 key into hierarchy of prefixes.
     * 
    */
    public Optional<String> getDelimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    /**
     * Max depth of prefixes of S3 key that Amazon S3 Storage Lens will analyze.
     * 
    */
    public Optional<Integer> getMaxDepth() {
        return Optional.ofNullable(this.maxDepth);
    }
    /**
     * The minimum storage bytes threshold for the prefixes to be included in the analysis.
     * 
    */
    public Optional<Double> getMinStorageBytesPercentage() {
        return Optional.ofNullable(this.minStorageBytesPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensSelectionCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String delimiter;
        private @Nullable Integer maxDepth;
        private @Nullable Double minStorageBytesPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensSelectionCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.maxDepth = defaults.maxDepth;
    	      this.minStorageBytesPercentage = defaults.minStorageBytesPercentage;
        }

        public Builder setDelimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        public Builder setMaxDepth(@Nullable Integer maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }

        public Builder setMinStorageBytesPercentage(@Nullable Double minStorageBytesPercentage) {
            this.minStorageBytesPercentage = minStorageBytesPercentage;
            return this;
        }
        public StorageLensSelectionCriteria build() {
            return new StorageLensSelectionCriteria(delimiter, maxDepth, minStorageBytesPercentage);
        }
    }
}
