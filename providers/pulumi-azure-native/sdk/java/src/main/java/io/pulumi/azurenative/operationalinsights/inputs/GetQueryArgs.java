// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetQueryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetQueryArgs Empty = new GetQueryArgs();

    /**
     * The id of a specific query defined in the Log Analytics QueryPack
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The name of the Log Analytics QueryPack resource.
     * 
     */
    @Import(name="queryPackName", required=true)
      private final String queryPackName;

    public String getQueryPackName() {
        return this.queryPackName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetQueryArgs(
        String id,
        String queryPackName,
        String resourceGroupName) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.queryPackName = Objects.requireNonNull(queryPackName, "expected parameter 'queryPackName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetQueryArgs() {
        this.id = null;
        this.queryPackName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String queryPackName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.queryPackName = defaults.queryPackName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder queryPackName(String queryPackName) {
            this.queryPackName = Objects.requireNonNull(queryPackName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetQueryArgs build() {
            return new GetQueryArgs(id, queryPackName, resourceGroupName);
        }
    }
}
