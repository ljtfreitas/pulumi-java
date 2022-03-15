// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointPort is a tuple that describes a single port.
 * 
 */
public final class EndpointPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointPortArgs Empty = new EndpointPortArgs();

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    @Import(name="appProtocol")
      private final @Nullable Output<String> appProtocol;

    public Output<String> getAppProtocol() {
        return this.appProtocol == null ? Output.empty() : this.appProtocol;
    }

    /**
     * The name of this port.  This must match the 'name' field in the corresponding ServicePort. Must be a DNS_LABEL. Optional only if one port is defined.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The port number of the endpoint.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    /**
     * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
     * 
     * Possible enum values:
     *  - `"SCTP"` is the SCTP protocol.
     *  - `"TCP"` is the TCP protocol.
     *  - `"UDP"` is the UDP protocol.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    public EndpointPortArgs(
        @Nullable Output<String> appProtocol,
        @Nullable Output<String> name,
        Output<Integer> port,
        @Nullable Output<String> protocol) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = protocol;
    }

    private EndpointPortArgs() {
        this.appProtocol = Output.empty();
        this.name = Output.empty();
        this.port = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appProtocol;
        private @Nullable Output<String> name;
        private Output<Integer> port;
        private @Nullable Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appProtocol = defaults.appProtocol;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder appProtocol(@Nullable Output<String> appProtocol) {
            this.appProtocol = appProtocol;
            return this;
        }

        public Builder appProtocol(@Nullable String appProtocol) {
            this.appProtocol = Output.ofNullable(appProtocol);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }
        public EndpointPortArgs build() {
            return new EndpointPortArgs(appProtocol, name, port, protocol);
        }
    }
}
