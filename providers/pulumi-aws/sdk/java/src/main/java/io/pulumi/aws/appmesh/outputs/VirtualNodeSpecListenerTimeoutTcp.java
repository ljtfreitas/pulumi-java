// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTimeoutTcpIdle;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecListenerTimeoutTcp {
    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTimeoutTcpIdle idle;

    @CustomType.Constructor
    private VirtualNodeSpecListenerTimeoutTcp(@CustomType.Parameter("idle") @Nullable VirtualNodeSpecListenerTimeoutTcpIdle idle) {
        this.idle = idle;
    }

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
    */
    public Optional<VirtualNodeSpecListenerTimeoutTcpIdle> getIdle() {
        return Optional.ofNullable(this.idle);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTimeoutTcp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTimeoutTcpIdle idle;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTimeoutTcp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
        }

        public Builder idle(@Nullable VirtualNodeSpecListenerTimeoutTcpIdle idle) {
            this.idle = idle;
            return this;
        }
        public VirtualNodeSpecListenerTimeoutTcp build() {
            return new VirtualNodeSpecListenerTimeoutTcp(idle);
        }
    }
}
