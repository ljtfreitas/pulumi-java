// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMethodArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMethodArgs Empty = new GetMethodArgs();

    /**
     * The backend system that the method calls when it receives a request.
     * 
     */
    @InputImport(name="httpMethod", required=true)
        private final String httpMethod;

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * The ID of an API Gateway resource.
     * 
     */
    @InputImport(name="resourceId", required=true)
        private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the RestApi resource in which API Gateway creates the method.
     * 
     */
    @InputImport(name="restApiId", required=true)
        private final String restApiId;

    public String getRestApiId() {
        return this.restApiId;
    }

    public GetMethodArgs(
        String httpMethod,
        String resourceId,
        String restApiId) {
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private GetMethodArgs() {
        this.httpMethod = null;
        this.resourceId = null;
        this.restApiId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpMethod;
        private String resourceId;
        private String restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpMethod = defaults.httpMethod;
    	      this.resourceId = defaults.resourceId;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public GetMethodArgs build() {
            return new GetMethodArgs(httpMethod, resourceId, restApiId);
        }
    }
}
