// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListManagerPublicEncryptionKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListManagerPublicEncryptionKeyArgs Empty = new ListManagerPublicEncryptionKeyArgs();

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
      private final String managerName;

    public String getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListManagerPublicEncryptionKeyArgs(
        String managerName,
        String resourceGroupName) {
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListManagerPublicEncryptionKeyArgs() {
        this.managerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListManagerPublicEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListManagerPublicEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder managerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListManagerPublicEncryptionKeyArgs build() {
            return new ListManagerPublicEncryptionKeyArgs(managerName, resourceGroupName);
        }
    }
}
