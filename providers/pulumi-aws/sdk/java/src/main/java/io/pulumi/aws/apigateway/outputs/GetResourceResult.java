// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set to the ID of the parent Resource.
     * 
     */
    private final String parentId;
    private final String path;
    /**
     * Set to the path relative to the parent Resource.
     * 
     */
    private final String pathPart;
    private final String restApiId;

    @CustomType.Constructor
    private GetResourceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parentId") String parentId,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("pathPart") String pathPart,
        @CustomType.Parameter("restApiId") String restApiId) {
        this.id = id;
        this.parentId = parentId;
        this.path = path;
        this.pathPart = pathPart;
        this.restApiId = restApiId;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set to the ID of the parent Resource.
     * 
    */
    public String getParentId() {
        return this.parentId;
    }
    public String getPath() {
        return this.path;
    }
    /**
     * Set to the path relative to the parent Resource.
     * 
    */
    public String getPathPart() {
        return this.pathPart;
    }
    public String getRestApiId() {
        return this.restApiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String parentId;
        private String path;
        private String pathPart;
        private String restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parentId = defaults.parentId;
    	      this.path = defaults.path;
    	      this.pathPart = defaults.pathPart;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder pathPart(String pathPart) {
            this.pathPart = Objects.requireNonNull(pathPart);
            return this;
        }

        public Builder restApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public GetResourceResult build() {
            return new GetResourceResult(id, parentId, path, pathPart, restApiId);
        }
    }
}
