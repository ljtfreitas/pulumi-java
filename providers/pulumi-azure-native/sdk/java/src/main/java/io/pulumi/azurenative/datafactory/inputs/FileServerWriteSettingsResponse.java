// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * File server write settings.
 * 
 */
public final class FileServerWriteSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileServerWriteSettingsResponse Empty = new FileServerWriteSettingsResponse();

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @InputImport(name="copyBehavior")
        private final @Nullable Object copyBehavior;

    public Optional<Object> getCopyBehavior() {
        return this.copyBehavior == null ? Optional.empty() : Optional.ofNullable(this.copyBehavior);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
        private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
        private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The write setting type.
     * Expected value is 'FileServerWriteSettings'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public FileServerWriteSettingsResponse(
        @Nullable Object copyBehavior,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        String type) {
        this.copyBehavior = copyBehavior;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FileServerWriteSettingsResponse() {
        this.copyBehavior = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServerWriteSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object copyBehavior;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServerWriteSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyBehavior = defaults.copyBehavior;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.type = defaults.type;
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
        public FileServerWriteSettingsResponse build() {
            return new FileServerWriteSettingsResponse(copyBehavior, disableMetricsCollection, maxConcurrentConnections, type);
        }
    }
}
