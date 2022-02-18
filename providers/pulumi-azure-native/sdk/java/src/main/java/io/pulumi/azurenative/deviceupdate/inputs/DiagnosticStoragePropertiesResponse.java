// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer-initiated diagnostic log collection storage properties
 * 
 */
public final class DiagnosticStoragePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiagnosticStoragePropertiesResponse Empty = new DiagnosticStoragePropertiesResponse();

    /**
     * Authentication Type
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final String authenticationType;

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * ConnectionString of the diagnostic storage account
     * 
     */
    @InputImport(name="connectionString")
    private final @Nullable String connectionString;

    public Optional<String> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * ResourceId of the diagnostic storage account
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    public DiagnosticStoragePropertiesResponse(
        String authenticationType,
        @Nullable String connectionString,
        String resourceId) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.connectionString = connectionString;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private DiagnosticStoragePropertiesResponse() {
        this.authenticationType = null;
        this.connectionString = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticStoragePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authenticationType;
        private @Nullable String connectionString;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticStoragePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public DiagnosticStoragePropertiesResponse build() {
            return new DiagnosticStoragePropertiesResponse(authenticationType, connectionString, resourceId);
        }
    }
}
