// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceArgs Empty = new GetResourceArgs();

    /**
     * A unique primary identifier for a Resource
     * 
     */
    @InputImport(name="resourceId", required=true)
        private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the RestApi resource in which you want to create this resource..
     * 
     */
    @InputImport(name="restApiId", required=true)
        private final String restApiId;

    public String getRestApiId() {
        return this.restApiId;
    }

    public GetResourceArgs(
        String resourceId,
        String restApiId) {
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private GetResourceArgs() {
        this.resourceId = null;
        this.restApiId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceId;
        private String restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public GetResourceArgs build() {
            return new GetResourceArgs(resourceId, restApiId);
        }
    }
}
