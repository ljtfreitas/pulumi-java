// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolGrpcArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttp2Args;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerConnectionPoolHttpArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerConnectionPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerConnectionPoolArgs Empty = new VirtualGatewaySpecListenerConnectionPoolArgs();

    /**
     * Connection pool information for gRPC listeners.
     * 
     */
    @Import(name="grpc")
      private final @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc;

    public Output<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> getGrpc() {
        return this.grpc == null ? Output.empty() : this.grpc;
    }

    /**
     * Connection pool information for HTTP listeners.
     * 
     */
    @Import(name="http")
      private final @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http;

    public Output<VirtualGatewaySpecListenerConnectionPoolHttpArgs> getHttp() {
        return this.http == null ? Output.empty() : this.http;
    }

    /**
     * Connection pool information for HTTP2 listeners.
     * 
     */
    @Import(name="http2")
      private final @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2;

    public Output<VirtualGatewaySpecListenerConnectionPoolHttp2Args> getHttp2() {
        return this.http2 == null ? Output.empty() : this.http2;
    }

    public VirtualGatewaySpecListenerConnectionPoolArgs(
        @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc,
        @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http,
        @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
    }

    private VirtualGatewaySpecListenerConnectionPoolArgs() {
        this.grpc = Output.empty();
        this.http = Output.empty();
        this.http2 = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerConnectionPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc;
        private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http;
        private @Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerConnectionPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
        }

        public Builder grpc(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolGrpcArgs> grpc) {
            this.grpc = grpc;
            return this;
        }

        public Builder grpc(@Nullable VirtualGatewaySpecListenerConnectionPoolGrpcArgs grpc) {
            this.grpc = Output.ofNullable(grpc);
            return this;
        }

        public Builder http(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttpArgs> http) {
            this.http = http;
            return this;
        }

        public Builder http(@Nullable VirtualGatewaySpecListenerConnectionPoolHttpArgs http) {
            this.http = Output.ofNullable(http);
            return this;
        }

        public Builder http2(@Nullable Output<VirtualGatewaySpecListenerConnectionPoolHttp2Args> http2) {
            this.http2 = http2;
            return this;
        }

        public Builder http2(@Nullable VirtualGatewaySpecListenerConnectionPoolHttp2Args http2) {
            this.http2 = Output.ofNullable(http2);
            return this;
        }
        public VirtualGatewaySpecListenerConnectionPoolArgs build() {
            return new VirtualGatewaySpecListenerConnectionPoolArgs(grpc, http, http2);
        }
    }
}
