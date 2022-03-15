// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    /**
     * The identity of the application.
     * 
     */
    @Import(name="applicationResourceName", required=true)
      private final String applicationResourceName;

    public String getApplicationResourceName() {
        return this.applicationResourceName;
    }

    /**
     * Azure resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetApplicationArgs(
        String applicationResourceName,
        String resourceGroupName) {
        this.applicationResourceName = Objects.requireNonNull(applicationResourceName, "expected parameter 'applicationResourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetApplicationArgs() {
        this.applicationResourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationResourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationResourceName = defaults.applicationResourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder applicationResourceName(String applicationResourceName) {
            this.applicationResourceName = Objects.requireNonNull(applicationResourceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetApplicationArgs build() {
            return new GetApplicationArgs(applicationResourceName, resourceGroupName);
        }
    }
}
