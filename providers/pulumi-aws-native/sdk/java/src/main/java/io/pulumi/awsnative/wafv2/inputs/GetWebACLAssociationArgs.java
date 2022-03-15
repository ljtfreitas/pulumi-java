// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebACLAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebACLAssociationArgs Empty = new GetWebACLAssociationArgs();

    @Import(name="resourceArn", required=true)
      private final String resourceArn;

    public String getResourceArn() {
        return this.resourceArn;
    }

    @Import(name="webACLArn", required=true)
      private final String webACLArn;

    public String getWebACLArn() {
        return this.webACLArn;
    }

    public GetWebACLAssociationArgs(
        String resourceArn,
        String webACLArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.webACLArn = Objects.requireNonNull(webACLArn, "expected parameter 'webACLArn' to be non-null");
    }

    private GetWebACLAssociationArgs() {
        this.resourceArn = null;
        this.webACLArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebACLAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceArn;
        private String webACLArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebACLAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.webACLArn = defaults.webACLArn;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder webACLArn(String webACLArn) {
            this.webACLArn = Objects.requireNonNull(webACLArn);
            return this;
        }
        public GetWebACLAssociationArgs build() {
            return new GetWebACLAssociationArgs(resourceArn, webACLArn);
        }
    }
}
