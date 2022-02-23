// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSecretValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretValueArgs Empty = new GetSecretValueArgs();

    /**
     * Azure resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the secret resource.
     * 
     */
    @InputImport(name="secretResourceName", required=true)
        private final String secretResourceName;

    public String getSecretResourceName() {
        return this.secretResourceName;
    }

    /**
     * The name of the secret resource value which is typically the version identifier for the value.
     * 
     */
    @InputImport(name="secretValueResourceName", required=true)
        private final String secretValueResourceName;

    public String getSecretValueResourceName() {
        return this.secretValueResourceName;
    }

    public GetSecretValueArgs(
        String resourceGroupName,
        String secretResourceName,
        String secretValueResourceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secretResourceName = Objects.requireNonNull(secretResourceName, "expected parameter 'secretResourceName' to be non-null");
        this.secretValueResourceName = Objects.requireNonNull(secretValueResourceName, "expected parameter 'secretValueResourceName' to be non-null");
    }

    private GetSecretValueArgs() {
        this.resourceGroupName = null;
        this.secretResourceName = null;
        this.secretValueResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String secretResourceName;
        private String secretValueResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretResourceName = defaults.secretResourceName;
    	      this.secretValueResourceName = defaults.secretValueResourceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSecretResourceName(String secretResourceName) {
            this.secretResourceName = Objects.requireNonNull(secretResourceName);
            return this;
        }

        public Builder setSecretValueResourceName(String secretValueResourceName) {
            this.secretValueResourceName = Objects.requireNonNull(secretValueResourceName);
            return this;
        }
        public GetSecretValueArgs build() {
            return new GetSecretValueArgs(resourceGroupName, secretResourceName, secretValueResourceName);
        }
    }
}
