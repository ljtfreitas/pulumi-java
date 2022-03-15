// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run TCPSocketAction describes an action based on opening a socket
 * 
 */
public final class TCPSocketActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TCPSocketActionArgs Empty = new TCPSocketActionArgs();

    /**
     * (Optional) Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of proto's inability to properly support the IntOrString golang type.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    public TCPSocketActionArgs(
        @Nullable Output<String> host,
        @Nullable Output<Integer> port) {
        this.host = host;
        this.port = port;
    }

    private TCPSocketActionArgs() {
        this.host = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPSocketActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> host;
        private @Nullable Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPSocketActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public TCPSocketActionArgs build() {
            return new TCPSocketActionArgs(host, port);
        }
    }
}
