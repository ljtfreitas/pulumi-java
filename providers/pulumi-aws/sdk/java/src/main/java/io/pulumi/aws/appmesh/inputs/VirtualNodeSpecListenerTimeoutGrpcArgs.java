// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcIdleArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTimeoutGrpcArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTimeoutGrpcArgs Empty = new VirtualNodeSpecListenerTimeoutGrpcArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
      private final @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle;

    public Output<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> getIdle() {
        return this.idle == null ? Output.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @Import(name="perRequest")
      private final @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest;

    public Output<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> getPerRequest() {
        return this.perRequest == null ? Output.empty() : this.perRequest;
    }

    public VirtualNodeSpecListenerTimeoutGrpcArgs(
        @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle,
        @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private VirtualNodeSpecListenerTimeoutGrpcArgs() {
        this.idle = Output.empty();
        this.perRequest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutGrpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle;
        private @Nullable Output<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutGrpcArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable Output<VirtualNodeSpecListenerTimeoutGrpcIdleArgs> idle) {
            this.idle = idle;
            return this;
        }

        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutGrpcIdleArgs idle) {
            this.idle = Output.ofNullable(idle);
            return this;
        }

        public Builder perRequest(@Nullable Output<VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }

        public Builder perRequest(@Nullable VirtualNodeSpecListenerTimeoutGrpcPerRequestArgs perRequest) {
            this.perRequest = Output.ofNullable(perRequest);
            return this;
        }
        public VirtualNodeSpecListenerTimeoutGrpcArgs build() {
            return new VirtualNodeSpecListenerTimeoutGrpcArgs(idle, perRequest);
        }
    }
}
