// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.azurenative.deviceupdate.enums.AuthenticationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Customer-initiated diagnostic log collection storage properties
 * 
 */
public final class DiagnosticStoragePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiagnosticStoragePropertiesArgs Empty = new DiagnosticStoragePropertiesArgs();

    /**
     * Authentication Type
     * 
     */
    @InputImport(name="authenticationType", required=true)
        private final Input<Either<String,AuthenticationType>> authenticationType;

    public Input<Either<String,AuthenticationType>> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * ConnectionString of the diagnostic storage account
     * 
     */
    @InputImport(name="connectionString")
        private final @Nullable Input<String> connectionString;

    public Input<String> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    /**
     * ResourceId of the diagnostic storage account
     * 
     */
    @InputImport(name="resourceId", required=true)
        private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    public DiagnosticStoragePropertiesArgs(
        Input<Either<String,AuthenticationType>> authenticationType,
        @Nullable Input<String> connectionString,
        Input<String> resourceId) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.connectionString = connectionString;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private DiagnosticStoragePropertiesArgs() {
        this.authenticationType = Input.empty();
        this.connectionString = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticStoragePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AuthenticationType>> authenticationType;
        private @Nullable Input<String> connectionString;
        private Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticStoragePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setAuthenticationType(Input<Either<String,AuthenticationType>> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(Either<String,AuthenticationType> authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setConnectionString(@Nullable Input<String> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public DiagnosticStoragePropertiesArgs build() {
            return new DiagnosticStoragePropertiesArgs(authenticationType, connectionString, resourceId);
        }
    }
}
