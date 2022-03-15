// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.QueryStringBehavior;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the cache-key query string action.
 * 
 */
public final class CacheKeyQueryStringActionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheKeyQueryStringActionParametersArgs Empty = new CacheKeyQueryStringActionParametersArgs();

    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * query parameters to include or exclude (comma separated).
     * 
     */
    @Import(name="queryParameters")
      private final @Nullable Output<String> queryParameters;

    public Output<String> getQueryParameters() {
        return this.queryParameters == null ? Output.empty() : this.queryParameters;
    }

    /**
     * Caching behavior for the requests
     * 
     */
    @Import(name="queryStringBehavior", required=true)
      private final Output<Either<String,QueryStringBehavior>> queryStringBehavior;

    public Output<Either<String,QueryStringBehavior>> getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    public CacheKeyQueryStringActionParametersArgs(
        Output<String> odataType,
        @Nullable Output<String> queryParameters,
        Output<Either<String,QueryStringBehavior>> queryStringBehavior) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.queryParameters = queryParameters;
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
    }

    private CacheKeyQueryStringActionParametersArgs() {
        this.odataType = Output.empty();
        this.queryParameters = Output.empty();
        this.queryStringBehavior = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheKeyQueryStringActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> odataType;
        private @Nullable Output<String> queryParameters;
        private Output<Either<String,QueryStringBehavior>> queryStringBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheKeyQueryStringActionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.queryParameters = defaults.queryParameters;
    	      this.queryStringBehavior = defaults.queryStringBehavior;
        }

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder queryParameters(@Nullable Output<String> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public Builder queryParameters(@Nullable String queryParameters) {
            this.queryParameters = Output.ofNullable(queryParameters);
            return this;
        }

        public Builder queryStringBehavior(Output<Either<String,QueryStringBehavior>> queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder queryStringBehavior(Either<String,QueryStringBehavior> queryStringBehavior) {
            this.queryStringBehavior = Output.of(Objects.requireNonNull(queryStringBehavior));
            return this;
        }
        public CacheKeyQueryStringActionParametersArgs build() {
            return new CacheKeyQueryStringActionParametersArgs(odataType, queryParameters, queryStringBehavior);
        }
    }
}
