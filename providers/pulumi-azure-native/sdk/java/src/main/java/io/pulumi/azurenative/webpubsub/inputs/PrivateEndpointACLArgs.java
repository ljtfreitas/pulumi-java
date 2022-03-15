// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.enums.WebPubSubRequestType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ACL for a private endpoint
 * 
 */
public final class PrivateEndpointACLArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointACLArgs Empty = new PrivateEndpointACLArgs();

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @Import(name="allow")
      private final @Nullable Output<List<Either<String,WebPubSubRequestType>>> allow;

    public Output<List<Either<String,WebPubSubRequestType>>> getAllow() {
        return this.allow == null ? Output.empty() : this.allow;
    }

    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @Import(name="deny")
      private final @Nullable Output<List<Either<String,WebPubSubRequestType>>> deny;

    public Output<List<Either<String,WebPubSubRequestType>>> getDeny() {
        return this.deny == null ? Output.empty() : this.deny;
    }

    /**
     * Name of the private endpoint connection
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public PrivateEndpointACLArgs(
        @Nullable Output<List<Either<String,WebPubSubRequestType>>> allow,
        @Nullable Output<List<Either<String,WebPubSubRequestType>>> deny,
        Output<String> name) {
        this.allow = allow;
        this.deny = deny;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PrivateEndpointACLArgs() {
        this.allow = Output.empty();
        this.deny = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,WebPubSubRequestType>>> allow;
        private @Nullable Output<List<Either<String,WebPubSubRequestType>>> deny;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.name = defaults.name;
        }

        public Builder allow(@Nullable Output<List<Either<String,WebPubSubRequestType>>> allow) {
            this.allow = allow;
            return this;
        }

        public Builder allow(@Nullable List<Either<String,WebPubSubRequestType>> allow) {
            this.allow = Output.ofNullable(allow);
            return this;
        }

        public Builder deny(@Nullable Output<List<Either<String,WebPubSubRequestType>>> deny) {
            this.deny = deny;
            return this;
        }

        public Builder deny(@Nullable List<Either<String,WebPubSubRequestType>> deny) {
            this.deny = Output.ofNullable(deny);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public PrivateEndpointACLArgs build() {
            return new PrivateEndpointACLArgs(allow, deny, name);
        }
    }
}
