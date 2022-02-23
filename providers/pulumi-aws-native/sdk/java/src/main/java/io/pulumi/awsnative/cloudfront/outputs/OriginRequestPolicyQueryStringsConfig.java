// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginRequestPolicyQueryStringsConfig {
    private final String queryStringBehavior;
    private final @Nullable List<String> queryStrings;

    @OutputCustomType.Constructor({"queryStringBehavior","queryStrings"})
    private OriginRequestPolicyQueryStringsConfig(
        String queryStringBehavior,
        @Nullable List<String> queryStrings) {
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
        this.queryStrings = queryStrings;
    }

    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }
    public List<String> getQueryStrings() {
        return this.queryStrings == null ? List.of() : this.queryStrings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private @Nullable List<String> queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder setQueryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder setQueryStrings(@Nullable List<String> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }
        public OriginRequestPolicyQueryStringsConfig build() {
            return new OriginRequestPolicyQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}
