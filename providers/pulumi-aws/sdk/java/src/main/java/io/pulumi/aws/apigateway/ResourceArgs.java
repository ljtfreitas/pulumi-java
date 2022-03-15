// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    /**
     * The ID of the parent API resource
     * 
     */
    @Import(name="parentId", required=true)
      private final Output<String> parentId;

    public Output<String> getParentId() {
        return this.parentId;
    }

    /**
     * The last path segment of this API resource.
     * 
     */
    @Import(name="pathPart", required=true)
      private final Output<String> pathPart;

    public Output<String> getPathPart() {
        return this.pathPart;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @Import(name="restApi", required=true)
      private final Output<String> restApi;

    public Output<String> getRestApi() {
        return this.restApi;
    }

    public ResourceArgs(
        Output<String> parentId,
        Output<String> pathPart,
        Output<String> restApi) {
        this.parentId = Objects.requireNonNull(parentId, "expected parameter 'parentId' to be non-null");
        this.pathPart = Objects.requireNonNull(pathPart, "expected parameter 'pathPart' to be non-null");
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
    }

    private ResourceArgs() {
        this.parentId = Output.empty();
        this.pathPart = Output.empty();
        this.restApi = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parentId;
        private Output<String> pathPart;
        private Output<String> restApi;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parentId = defaults.parentId;
    	      this.pathPart = defaults.pathPart;
    	      this.restApi = defaults.restApi;
        }

        public Builder parentId(Output<String> parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = Output.of(Objects.requireNonNull(parentId));
            return this;
        }

        public Builder pathPart(Output<String> pathPart) {
            this.pathPart = Objects.requireNonNull(pathPart);
            return this;
        }

        public Builder pathPart(String pathPart) {
            this.pathPart = Output.of(Objects.requireNonNull(pathPart));
            return this;
        }

        public Builder restApi(Output<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }
        public ResourceArgs build() {
            return new ResourceArgs(parentId, pathPart, restApi);
        }
    }
}
