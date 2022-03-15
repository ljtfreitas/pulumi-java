// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GRPCActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GRPCActionArgs Empty = new GRPCActionArgs();

    /**
     * Port number of the gRPC service. Number must be in the range 1 to 65535.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    /**
     * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md).
     * 
     * If this is not specified, the default behavior is defined by gRPC.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    public GRPCActionArgs(
        Output<Integer> port,
        @Nullable Output<String> service) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.service = service;
    }

    private GRPCActionArgs() {
        this.port = Output.empty();
        this.service = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GRPCActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> port;
        private @Nullable Output<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(GRPCActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.service = defaults.service;
        }

        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public GRPCActionArgs build() {
            return new GRPCActionArgs(port, service);
        }
    }
}
