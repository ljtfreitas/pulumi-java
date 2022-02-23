// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetHttpTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetHttpTargetArgs Empty = new EventTargetHttpTargetArgs();

    /**
     * Enables you to specify HTTP headers to add to the request.
     * 
     */
    @InputImport(name="headerParameters")
    private final @Nullable Input<Map<String,String>> headerParameters;

    public Input<Map<String,String>> getHeaderParameters() {
        return this.headerParameters == null ? Input.empty() : this.headerParameters;
    }

    /**
     * The list of values that correspond sequentially to any path variables in your endpoint ARN (for example `arn:aws:execute-api:us-east-1:123456:myapi/*{@literal /}POST/pets/*`).
     * 
     */
    @InputImport(name="pathParameterValues")
    private final @Nullable Input<List<String>> pathParameterValues;

    public Input<List<String>> getPathParameterValues() {
        return this.pathParameterValues == null ? Input.empty() : this.pathParameterValues;
    }

    /**
     * Represents keys/values of query string parameters that are appended to the invoked endpoint.
     * 
     */
    @InputImport(name="queryStringParameters")
    private final @Nullable Input<Map<String,String>> queryStringParameters;

    public Input<Map<String,String>> getQueryStringParameters() {
        return this.queryStringParameters == null ? Input.empty() : this.queryStringParameters;
    }

    public EventTargetHttpTargetArgs(
        @Nullable Input<Map<String,String>> headerParameters,
        @Nullable Input<List<String>> pathParameterValues,
        @Nullable Input<Map<String,String>> queryStringParameters) {
        this.headerParameters = headerParameters;
        this.pathParameterValues = pathParameterValues;
        this.queryStringParameters = queryStringParameters;
    }

    private EventTargetHttpTargetArgs() {
        this.headerParameters = Input.empty();
        this.pathParameterValues = Input.empty();
        this.queryStringParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetHttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> headerParameters;
        private @Nullable Input<List<String>> pathParameterValues;
        private @Nullable Input<Map<String,String>> queryStringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetHttpTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerParameters = defaults.headerParameters;
    	      this.pathParameterValues = defaults.pathParameterValues;
    	      this.queryStringParameters = defaults.queryStringParameters;
        }

        public Builder setHeaderParameters(@Nullable Input<Map<String,String>> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        public Builder setHeaderParameters(@Nullable Map<String,String> headerParameters) {
            this.headerParameters = Input.ofNullable(headerParameters);
            return this;
        }

        public Builder setPathParameterValues(@Nullable Input<List<String>> pathParameterValues) {
            this.pathParameterValues = pathParameterValues;
            return this;
        }

        public Builder setPathParameterValues(@Nullable List<String> pathParameterValues) {
            this.pathParameterValues = Input.ofNullable(pathParameterValues);
            return this;
        }

        public Builder setQueryStringParameters(@Nullable Input<Map<String,String>> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }

        public Builder setQueryStringParameters(@Nullable Map<String,String> queryStringParameters) {
            this.queryStringParameters = Input.ofNullable(queryStringParameters);
            return this;
        }
        public EventTargetHttpTargetArgs build() {
            return new EventTargetHttpTargetArgs(headerParameters, pathParameterValues, queryStringParameters);
        }
    }
}
