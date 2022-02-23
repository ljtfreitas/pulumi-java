// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSshPublicKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSshPublicKeyArgs Empty = new GetSshPublicKeyArgs();

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SSH public key.
     * 
     */
    @InputImport(name="sshPublicKeyName", required=true)
        private final String sshPublicKeyName;

    public String getSshPublicKeyName() {
        return this.sshPublicKeyName;
    }

    public GetSshPublicKeyArgs(
        String resourceGroupName,
        String sshPublicKeyName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sshPublicKeyName = Objects.requireNonNull(sshPublicKeyName, "expected parameter 'sshPublicKeyName' to be non-null");
    }

    private GetSshPublicKeyArgs() {
        this.resourceGroupName = null;
        this.sshPublicKeyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String sshPublicKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sshPublicKeyName = defaults.sshPublicKeyName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSshPublicKeyName(String sshPublicKeyName) {
            this.sshPublicKeyName = Objects.requireNonNull(sshPublicKeyName);
            return this;
        }
        public GetSshPublicKeyArgs build() {
            return new GetSshPublicKeyArgs(resourceGroupName, sshPublicKeyName);
        }
    }
}
