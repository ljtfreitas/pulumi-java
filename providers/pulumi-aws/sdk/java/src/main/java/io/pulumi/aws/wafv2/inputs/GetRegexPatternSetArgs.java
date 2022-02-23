// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRegexPatternSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegexPatternSetArgs Empty = new GetRegexPatternSetArgs();

    /**
     * The name of the WAFv2 Regex Pattern Set.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetRegexPatternSetArgs(
        String name,
        String scope) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetRegexPatternSetArgs() {
        this.name = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegexPatternSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetRegexPatternSetArgs build() {
            return new GetRegexPatternSetArgs(name, scope);
        }
    }
}