// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkAclArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkAclArgs Empty = new GetNetworkAclArgs();

    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public GetNetworkAclArgs(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetNetworkAclArgs() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkAclArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetNetworkAclArgs build() {
            return new GetNetworkAclArgs(id);
        }
    }
}
