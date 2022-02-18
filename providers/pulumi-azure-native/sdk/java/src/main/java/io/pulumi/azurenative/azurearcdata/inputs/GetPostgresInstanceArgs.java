// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPostgresInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPostgresInstanceArgs Empty = new GetPostgresInstanceArgs();

    /**
     * Name of Postgres Instance
     * 
     */
    @InputImport(name="postgresInstanceName", required=true)
    private final String postgresInstanceName;

    public String getPostgresInstanceName() {
        return this.postgresInstanceName;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPostgresInstanceArgs(
        String postgresInstanceName,
        String resourceGroupName) {
        this.postgresInstanceName = Objects.requireNonNull(postgresInstanceName, "expected parameter 'postgresInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPostgresInstanceArgs() {
        this.postgresInstanceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPostgresInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String postgresInstanceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPostgresInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postgresInstanceName = defaults.postgresInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPostgresInstanceName(String postgresInstanceName) {
            this.postgresInstanceName = Objects.requireNonNull(postgresInstanceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetPostgresInstanceArgs build() {
            return new GetPostgresInstanceArgs(postgresInstanceName, resourceGroupName);
        }
    }
}
