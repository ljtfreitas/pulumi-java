// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListConfigurationStoreKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListConfigurationStoreKeysArgs Empty = new ListConfigurationStoreKeysArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @InputImport(name="configStoreName", required=true)
        private final String configStoreName;

    public String getConfigStoreName() {
        return this.configStoreName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A skip token is used to continue retrieving items after an operation returns a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies a starting point to use for subsequent calls.
     * 
     */
    @InputImport(name="skipToken")
        private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListConfigurationStoreKeysArgs(
        String configStoreName,
        String resourceGroupName,
        @Nullable String skipToken) {
        this.configStoreName = Objects.requireNonNull(configStoreName, "expected parameter 'configStoreName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipToken = skipToken;
    }

    private ListConfigurationStoreKeysArgs() {
        this.configStoreName = null;
        this.resourceGroupName = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConfigurationStoreKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configStoreName;
        private String resourceGroupName;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConfigurationStoreKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configStoreName = defaults.configStoreName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder setConfigStoreName(String configStoreName) {
            this.configStoreName = Objects.requireNonNull(configStoreName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSkipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }
        public ListConfigurationStoreKeysArgs build() {
            return new ListConfigurationStoreKeysArgs(configStoreName, resourceGroupName, skipToken);
        }
    }
}
