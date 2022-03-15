// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkPolicyPort {
    /**
     * If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
     */
    private final @Nullable Either<Integer,String> port;
    /**
     * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
     */
    private final @Nullable String protocol;

    @CustomType.Constructor
    private NetworkPolicyPort(
        @CustomType.Parameter("port") @Nullable Either<Integer,String> port,
        @CustomType.Parameter("protocol") @Nullable String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched.
     * 
    */
    public Optional<Either<Integer,String>> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field defaults to TCP.
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<Integer,String> port;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(@Nullable Either<Integer,String> port) {
            this.port = port;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public NetworkPolicyPort build() {
            return new NetworkPolicyPort(port, protocol);
        }
    }
}
