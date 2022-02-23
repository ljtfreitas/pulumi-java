// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutGrpc;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutHttp2;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutHttp;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutTcp;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecListenerTimeout {
    /**
     * Timeouts for gRPC listeners.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutGrpc grpc;
    /**
     * Timeouts for HTTP listeners.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutHttp http;
    /**
     * Timeouts for HTTP2 listeners.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutHttp2 http2;
    /**
     * Timeouts for TCP listeners.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutTcp tcp;

    @OutputCustomType.Constructor({"grpc","http","http2","tcp"})
    private VirtualNodeSpecListenerTimeout(
        @Nullable VirtualNodeSpecListenerTimeoutGrpc grpc,
        @Nullable VirtualNodeSpecListenerTimeoutHttp http,
        @Nullable VirtualNodeSpecListenerTimeoutHttp2 http2,
        @Nullable VirtualNodeSpecListenerTimeoutTcp tcp) {
        this.grpc = grpc;
        this.http = http;
        this.http2 = http2;
        this.tcp = tcp;
    }

    /**
     * Timeouts for gRPC listeners.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutGrpc> getGrpc() {
        return Optional.ofNullable(this.grpc);
    }
    /**
     * Timeouts for HTTP listeners.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutHttp> getHttp() {
        return Optional.ofNullable(this.http);
    }
    /**
     * Timeouts for HTTP2 listeners.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutHttp2> getHttp2() {
        return Optional.ofNullable(this.http2);
    }
    /**
     * Timeouts for TCP listeners.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutTcp> getTcp() {
        return Optional.ofNullable(this.tcp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTimeoutGrpc grpc;
        private @Nullable VirtualNodeSpecListenerTimeoutHttp http;
        private @Nullable VirtualNodeSpecListenerTimeoutHttp2 http2;
        private @Nullable VirtualNodeSpecListenerTimeoutTcp tcp;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpc = defaults.grpc;
    	      this.http = defaults.http;
    	      this.http2 = defaults.http2;
    	      this.tcp = defaults.tcp;
        }

        public Builder setGrpc(@Nullable VirtualNodeSpecListenerTimeoutGrpc grpc) {
            this.grpc = grpc;
            return this;
        }

        public Builder setHttp(@Nullable VirtualNodeSpecListenerTimeoutHttp http) {
            this.http = http;
            return this;
        }

        public Builder setHttp2(@Nullable VirtualNodeSpecListenerTimeoutHttp2 http2) {
            this.http2 = http2;
            return this;
        }

        public Builder setTcp(@Nullable VirtualNodeSpecListenerTimeoutTcp tcp) {
            this.tcp = tcp;
            return this;
        }
        public VirtualNodeSpecListenerTimeout build() {
            return new VirtualNodeSpecListenerTimeout(grpc, http, http2, tcp);
        }
    }
}
