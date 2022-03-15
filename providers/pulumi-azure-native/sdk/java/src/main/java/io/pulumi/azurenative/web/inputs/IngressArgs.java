// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.IngressTransportMethod;
import io.pulumi.azurenative.web.inputs.TrafficWeightArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App Ingress configuration.
 * 
 */
public final class IngressArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressArgs Empty = new IngressArgs();

    /**
     * Bool indicating if HTTP connections to is allowed. If set to false HTTP connections are automatically redirected to HTTPS connections
     * 
     */
    @Import(name="allowInsecure")
      private final @Nullable Output<Boolean> allowInsecure;

    public Output<Boolean> getAllowInsecure() {
        return this.allowInsecure == null ? Output.empty() : this.allowInsecure;
    }

    /**
     * Bool indicating if app exposes an external http endpoint
     * 
     */
    @Import(name="external")
      private final @Nullable Output<Boolean> external;

    public Output<Boolean> getExternal() {
        return this.external == null ? Output.empty() : this.external;
    }

    /**
     * Target Port in containers for traffic from ingress
     * 
     */
    @Import(name="targetPort")
      private final @Nullable Output<Integer> targetPort;

    public Output<Integer> getTargetPort() {
        return this.targetPort == null ? Output.empty() : this.targetPort;
    }

    @Import(name="traffic")
      private final @Nullable Output<List<TrafficWeightArgs>> traffic;

    public Output<List<TrafficWeightArgs>> getTraffic() {
        return this.traffic == null ? Output.empty() : this.traffic;
    }

    /**
     * Ingress transport protocol
     * 
     */
    @Import(name="transport")
      private final @Nullable Output<Either<String,IngressTransportMethod>> transport;

    public Output<Either<String,IngressTransportMethod>> getTransport() {
        return this.transport == null ? Output.empty() : this.transport;
    }

    public IngressArgs(
        @Nullable Output<Boolean> allowInsecure,
        @Nullable Output<Boolean> external,
        @Nullable Output<Integer> targetPort,
        @Nullable Output<List<TrafficWeightArgs>> traffic,
        @Nullable Output<Either<String,IngressTransportMethod>> transport) {
        this.allowInsecure = allowInsecure;
        this.external = external == null ? Output.ofNullable(false) : external;
        this.targetPort = targetPort;
        this.traffic = traffic;
        this.transport = transport;
    }

    private IngressArgs() {
        this.allowInsecure = Output.empty();
        this.external = Output.empty();
        this.targetPort = Output.empty();
        this.traffic = Output.empty();
        this.transport = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowInsecure;
        private @Nullable Output<Boolean> external;
        private @Nullable Output<Integer> targetPort;
        private @Nullable Output<List<TrafficWeightArgs>> traffic;
        private @Nullable Output<Either<String,IngressTransportMethod>> transport;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.external = defaults.external;
    	      this.targetPort = defaults.targetPort;
    	      this.traffic = defaults.traffic;
    	      this.transport = defaults.transport;
        }

        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = Output.ofNullable(allowInsecure);
            return this;
        }

        public Builder external(@Nullable Output<Boolean> external) {
            this.external = external;
            return this;
        }

        public Builder external(@Nullable Boolean external) {
            this.external = Output.ofNullable(external);
            return this;
        }

        public Builder targetPort(@Nullable Output<Integer> targetPort) {
            this.targetPort = targetPort;
            return this;
        }

        public Builder targetPort(@Nullable Integer targetPort) {
            this.targetPort = Output.ofNullable(targetPort);
            return this;
        }

        public Builder traffic(@Nullable Output<List<TrafficWeightArgs>> traffic) {
            this.traffic = traffic;
            return this;
        }

        public Builder traffic(@Nullable List<TrafficWeightArgs> traffic) {
            this.traffic = Output.ofNullable(traffic);
            return this;
        }

        public Builder transport(@Nullable Output<Either<String,IngressTransportMethod>> transport) {
            this.transport = transport;
            return this;
        }

        public Builder transport(@Nullable Either<String,IngressTransportMethod> transport) {
            this.transport = Output.ofNullable(transport);
            return this;
        }
        public IngressArgs build() {
            return new IngressArgs(allowInsecure, external, targetPort, traffic, transport);
        }
    }
}
