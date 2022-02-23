// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyQueryStringsConfigQueryString;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOriginRequestPolicyQueryStringsConfig {
    private final String queryStringBehavior;
    private final List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings;

    @OutputCustomType.Constructor({"queryStringBehavior","queryStrings"})
    private GetOriginRequestPolicyQueryStringsConfig(
        String queryStringBehavior,
        List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
        this.queryStrings = Objects.requireNonNull(queryStrings);
    }

    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }
    public List<GetOriginRequestPolicyQueryStringsConfigQueryString> getQueryStrings() {
        return this.queryStrings;
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

        public Builder setQueryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder setQueryStrings(List<GetOriginRequestPolicyQueryStringsConfigQueryString> queryStrings) {
            this.queryStrings = Objects.requireNonNull(queryStrings);
            return this;
        }
        public GetOriginRequestPolicyQueryStringsConfig build() {
            return new GetOriginRequestPolicyQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
