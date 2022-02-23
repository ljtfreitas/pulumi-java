// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutGrpcIdle;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutGrpcPerRequest;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecListenerTimeoutGrpc {
    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle;
    /**
     * The per request timeout.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest;

    @OutputCustomType.Constructor({"idle","perRequest"})
    private VirtualNodeSpecListenerTimeoutGrpc(
        @Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle,
        @Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutGrpcIdle> getIdle() {
        return Optional.ofNullable(this.idle);
    }
    /**
     * The per request timeout.
     * 
     */
    public Optional<VirtualNodeSpecListenerTimeoutGrpcPerRequest> getPerRequest() {
        return Optional.ofNullable(this.perRequest);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutGrpc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle;
        private @Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutGrpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder setIdle(@Nullable VirtualNodeSpecListenerTimeoutGrpcIdle idle) {
            this.idle = idle;
            return this;
        }

        public Builder setPerRequest(@Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequest perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public VirtualNodeSpecListenerTimeoutGrpc build() {
            return new VirtualNodeSpecListenerTimeoutGrpc(idle, perRequest);
        }
    }
}
