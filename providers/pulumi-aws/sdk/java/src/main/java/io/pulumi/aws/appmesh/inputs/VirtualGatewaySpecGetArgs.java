// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecGetArgs Empty = new VirtualGatewaySpecGetArgs();

    /**
     * The defaults for backends.
     * 
     */
    @InputImport(name="backendDefaults")
    private final @Nullable Input<VirtualGatewaySpecBackendDefaultsGetArgs> backendDefaults;

    public Input<VirtualGatewaySpecBackendDefaultsGetArgs> getBackendDefaults() {
        return this.backendDefaults == null ? Input.empty() : this.backendDefaults;
    }

    /**
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * 
     */
    @InputImport(name="listener", required=true)
    private final Input<VirtualGatewaySpecListenerGetArgs> listener;

    public Input<VirtualGatewaySpecListenerGetArgs> getListener() {
        return this.listener;
    }

    /**
     * The inbound and outbound access logging information for the virtual gateway.
     * 
     */
    @InputImport(name="logging")
    private final @Nullable Input<VirtualGatewaySpecLoggingGetArgs> logging;

    public Input<VirtualGatewaySpecLoggingGetArgs> getLogging() {
        return this.logging == null ? Input.empty() : this.logging;
    }

    public VirtualGatewaySpecGetArgs(
        @Nullable Input<VirtualGatewaySpecBackendDefaultsGetArgs> backendDefaults,
        Input<VirtualGatewaySpecListenerGetArgs> listener,
        @Nullable Input<VirtualGatewaySpecLoggingGetArgs> logging) {
        this.backendDefaults = backendDefaults;
        this.listener = Objects.requireNonNull(listener, "expected parameter 'listener' to be non-null");
        this.logging = logging;
    }

    private VirtualGatewaySpecGetArgs() {
        this.backendDefaults = Input.empty();
        this.listener = Input.empty();
        this.logging = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualGatewaySpecBackendDefaultsGetArgs> backendDefaults;
        private Input<VirtualGatewaySpecListenerGetArgs> listener;
        private @Nullable Input<VirtualGatewaySpecLoggingGetArgs> logging;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendDefaults = defaults.backendDefaults;
    	      this.listener = defaults.listener;
    	      this.logging = defaults.logging;
        }

        public Builder setBackendDefaults(@Nullable Input<VirtualGatewaySpecBackendDefaultsGetArgs> backendDefaults) {
            this.backendDefaults = backendDefaults;
            return this;
        }

        public Builder setBackendDefaults(@Nullable VirtualGatewaySpecBackendDefaultsGetArgs backendDefaults) {
            this.backendDefaults = Input.ofNullable(backendDefaults);
            return this;
        }

        public Builder setListener(Input<VirtualGatewaySpecListenerGetArgs> listener) {
            this.listener = Objects.requireNonNull(listener);
            return this;
        }

        public Builder setListener(VirtualGatewaySpecListenerGetArgs listener) {
            this.listener = Input.of(Objects.requireNonNull(listener));
            return this;
        }

        public Builder setLogging(@Nullable Input<VirtualGatewaySpecLoggingGetArgs> logging) {
            this.logging = logging;
            return this;
        }

        public Builder setLogging(@Nullable VirtualGatewaySpecLoggingGetArgs logging) {
            this.logging = Input.ofNullable(logging);
            return this;
        }
        public VirtualGatewaySpecGetArgs build() {
            return new VirtualGatewaySpecGetArgs(backendDefaults, listener, logging);
        }
    }
}
