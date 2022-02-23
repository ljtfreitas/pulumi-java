// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataManagerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataManagerArgs Empty = new GetDataManagerArgs();

    /**
     * The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @InputImport(name="dataManagerName", required=true)
        private final String dataManagerName;

    public String getDataManagerName() {
        return this.dataManagerName;
    }

    /**
     * The Resource Group Name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDataManagerArgs(
        String dataManagerName,
        String resourceGroupName) {
        this.dataManagerName = Objects.requireNonNull(dataManagerName, "expected parameter 'dataManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDataManagerArgs() {
        this.dataManagerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataManagerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataManagerName = defaults.dataManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDataManagerName(String dataManagerName) {
            this.dataManagerName = Objects.requireNonNull(dataManagerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDataManagerArgs build() {
            return new GetDataManagerArgs(dataManagerName, resourceGroupName);
        }
    }
}
