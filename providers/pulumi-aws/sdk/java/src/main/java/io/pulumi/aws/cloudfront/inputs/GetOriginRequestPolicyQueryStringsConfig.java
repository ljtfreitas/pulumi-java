// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyQueryStringsConfigQueryString;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetOriginRequestPolicyQueryStringsConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetOriginRequestPolicyQueryStringsConfig Empty = new GetOriginRequestPolicyQueryStringsConfig();

    @Import(name="queryStringBehavior", required=true)
      private final String queryStringBehavior;

    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    @Import(name="queryStrings", required=true)
      private final List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings;

    public List<GetOriginRequestPolicyQueryStringsConfigQueryString> getQueryStrings() {
        return this.queryStrings;
    }

    public GetOriginRequestPolicyQueryStringsConfig(
        String queryStringBehavior,
        List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
        this.queryStrings = Objects.requireNonNull(queryStrings, "expected parameter 'queryStrings' to be non-null");
    }

    private GetOriginRequestPolicyQueryStringsConfig() {
        this.queryStringBehavior = null;
        this.queryStrings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginRequestPolicyQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder queryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder queryStrings(List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings) {
            this.queryStrings = Objects.requireNonNull(queryStrings);
            return this;
        }
        public GetOriginRequestPolicyQueryStringsConfig build() {
            return new GetOriginRequestPolicyQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
