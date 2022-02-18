// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureBlobStorageWriteSettingsResponse {
    /**
     * Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object blockSizeInMB;
    /**
     * The type of copy behavior for copy sink.
     * 
     */
    private final @Nullable Object copyBehavior;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The write setting type.
     * Expected value is 'AzureBlobStorageWriteSettings'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"blockSizeInMB","copyBehavior","disableMetricsCollection","maxConcurrentConnections","type"})
    private AzureBlobStorageWriteSettingsResponse(
        @Nullable Object blockSizeInMB,
        @Nullable Object copyBehavior,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        String type) {
        this.blockSizeInMB = blockSizeInMB;
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Indicates the block size(MB) when writing data to blob. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getBlockSizeInMB() {
        return Optional.ofNullable(this.blockSizeInMB);
    }
    /**
     * The type of copy behavior for copy sink.
     * 
     */
    public Optional<Object> getCopyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The write setting type.
     * Expected value is 'AzureBlobStorageWriteSettings'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object blockSizeInMB;
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeInMB = defaults.blockSizeInMB;
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.type = defaults.type;
        }

        public Builder setBlockSizeInMB(@Nullable Object blockSizeInMB) {
            this.blockSizeInMB = blockSizeInMB;
            return this;
        }

        public Builder setCopyBehavior(@Nullable Object copyBehavior) {
            this.copyBehavior = copyBehavior;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureBlobStorageWriteSettingsResponse build() {
            return new AzureBlobStorageWriteSettingsResponse(blockSizeInMB, copyBehavior, disableMetricsCollection, maxConcurrentConnections, type);
        }
    }
}
