// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationProtectedItemArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicationProtectedItemArgs Empty = new GetReplicationProtectedItemArgs();

    @InputImport(name="fabricName", required=true)
    private final String fabricName;

    public String getFabricName() {
        return this.fabricName;
    }

    @InputImport(name="protectionContainerName", required=true)
    private final String protectionContainerName;

    public String getProtectionContainerName() {
        return this.protectionContainerName;
    }

    @InputImport(name="replicatedProtectedItemName", required=true)
    private final String replicatedProtectedItemName;

    public String getReplicatedProtectedItemName() {
        return this.replicatedProtectedItemName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public GetReplicationProtectedItemArgs(
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        String resourceGroupName,
        String resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.protectionContainerName = Objects.requireNonNull(protectionContainerName, "expected parameter 'protectionContainerName' to be non-null");
        this.replicatedProtectedItemName = Objects.requireNonNull(replicatedProtectedItemName, "expected parameter 'replicatedProtectedItemName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetReplicationProtectedItemArgs() {
        this.fabricName = null;
        this.protectionContainerName = null;
        this.replicatedProtectedItemName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricName;
        private String protectionContainerName;
        private String replicatedProtectedItemName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.protectionContainerName = defaults.protectionContainerName;
    	      this.replicatedProtectedItemName = defaults.replicatedProtectedItemName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setFabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }

        public Builder setProtectionContainerName(String protectionContainerName) {
            this.protectionContainerName = Objects.requireNonNull(protectionContainerName);
            return this;
        }

        public Builder setReplicatedProtectedItemName(String replicatedProtectedItemName) {
            this.replicatedProtectedItemName = Objects.requireNonNull(replicatedProtectedItemName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public GetReplicationProtectedItemArgs build() {
            return new GetReplicationProtectedItemArgs(fabricName, protectionContainerName, replicatedProtectedItemName, resourceGroupName, resourceName);
        }
    }
}