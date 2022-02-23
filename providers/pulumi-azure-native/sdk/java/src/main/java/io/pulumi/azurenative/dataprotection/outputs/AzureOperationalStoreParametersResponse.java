// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureOperationalStoreParametersResponse {
    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    private final String dataStoreType;
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AzureOperationalStoreParameters'.
     * 
     */
    private final String objectType;
    /**
     * Gets or sets the Snapshot Resource Group Uri.
     * 
     */
    private final @Nullable String resourceGroupId;

    @OutputCustomType.Constructor({"dataStoreType","objectType","resourceGroupId"})
    private AzureOperationalStoreParametersResponse(
        String dataStoreType,
        String objectType,
        @Nullable String resourceGroupId) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType);
        this.objectType = Objects.requireNonNull(objectType);
        this.resourceGroupId = resourceGroupId;
    }

    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    public String getDataStoreType() {
        return this.dataStoreType;
    }
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AzureOperationalStoreParameters'.
     * 
     */
    public String getObjectType() {
        return this.objectType;
    }
    /**
     * Gets or sets the Snapshot Resource Group Uri.
     * 
     */
    public Optional<String> getResourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureOperationalStoreParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataStoreType;
        private String objectType;
        private @Nullable String resourceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureOperationalStoreParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        public Builder setDataStoreType(String dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setResourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public AzureOperationalStoreParametersResponse build() {
            return new AzureOperationalStoreParametersResponse(dataStoreType, objectType, resourceGroupId);
        }
    }
}
