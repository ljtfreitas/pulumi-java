// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.StorageLensPrefixLevelStorageMetrics;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class StorageLensPrefixLevel {
    private final StorageLensPrefixLevelStorageMetrics storageMetrics;

    @CustomType.Constructor
    private StorageLensPrefixLevel(@CustomType.Parameter("storageMetrics") StorageLensPrefixLevelStorageMetrics storageMetrics) {
        this.storageMetrics = storageMetrics;
    }

    public StorageLensPrefixLevelStorageMetrics getStorageMetrics() {
        return this.storageMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensPrefixLevel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageLensPrefixLevelStorageMetrics storageMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensPrefixLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageMetrics = defaults.storageMetrics;
        }

        public Builder storageMetrics(StorageLensPrefixLevelStorageMetrics storageMetrics) {
            this.storageMetrics = Objects.requireNonNull(storageMetrics);
            return this;
        }
        public StorageLensPrefixLevel build() {
            return new StorageLensPrefixLevel(storageMetrics);
        }
    }
}
