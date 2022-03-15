// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAclArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAclArgs Empty = new GetWebAclArgs();

    /**
     * The name of the WAF Web ACL.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetWebAclArgs(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetWebAclArgs() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAclArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetWebAclArgs build() {
            return new GetWebAclArgs(name);
        }
    }
}
