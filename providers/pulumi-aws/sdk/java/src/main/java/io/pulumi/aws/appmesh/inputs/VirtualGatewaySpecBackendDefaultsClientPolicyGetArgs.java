// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @InputImport(name="tls")
    private final @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls;

    public Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> getTls() {
        return this.tls == null ? Input.empty() : this.tls;
    }

    public VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs(@Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls) {
        this.tls = tls;
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs() {
        this.tls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder setTls(@Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls) {
            this.tls = tls;
            return this;
        }

        public Builder setTls(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs tls) {
            this.tls = Input.ofNullable(tls);
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs(tls);
        }
    }
}
