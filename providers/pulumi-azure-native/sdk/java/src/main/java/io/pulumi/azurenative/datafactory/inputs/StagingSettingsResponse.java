// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Staging settings.
 * 
 */
public final class StagingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final StagingSettingsResponse Empty = new StagingSettingsResponse();

    /**
     * Specifies whether to use compression when copying data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableCompression")
        private final @Nullable Object enableCompression;

    public Optional<Object> getEnableCompression() {
        return this.enableCompression == null ? Optional.empty() : Optional.ofNullable(this.enableCompression);
    }

    /**
     * Staging linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
        private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * The path to storage for storing the interim data. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="path")
        private final @Nullable Object path;

    public Optional<Object> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    public StagingSettingsResponse(
        @Nullable Object enableCompression,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object path) {
        this.enableCompression = enableCompression;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.path = path;
    }

    private StagingSettingsResponse() {
        this.enableCompression = null;
        this.linkedServiceName = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StagingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object enableCompression;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object path;

        public Builder() {
    	      // Empty
        }

        public Builder(StagingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCompression = defaults.enableCompression;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder setEnableCompression(@Nullable Object enableCompression) {
            this.enableCompression = enableCompression;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setPath(@Nullable Object path) {
            this.path = path;
            return this;
        }
        public StagingSettingsResponse build() {
            return new StagingSettingsResponse(enableCompression, linkedServiceName, path);
        }
    }
}
