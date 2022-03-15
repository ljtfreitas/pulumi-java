// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerConnectionPoolArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerHealthCheckArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerOutlierDetectionArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerPortMappingArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTimeoutArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerArgs Empty = new VirtualNodeSpecListenerArgs();

    /**
     * The connection pool information for the listener.
     * 
     */
    @Import(name="connectionPool")
      private final @Nullable Output<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool;

    public Output<VirtualNodeSpecListenerConnectionPoolArgs> getConnectionPool() {
        return this.connectionPool == null ? Output.empty() : this.connectionPool;
    }

    /**
     * The health check information for the listener.
     * 
     */
    @Import(name="healthCheck")
      private final @Nullable Output<VirtualNodeSpecListenerHealthCheckArgs> healthCheck;

    public Output<VirtualNodeSpecListenerHealthCheckArgs> getHealthCheck() {
        return this.healthCheck == null ? Output.empty() : this.healthCheck;
    }

    /**
     * The outlier detection information for the listener.
     * 
     */
    @Import(name="outlierDetection")
      private final @Nullable Output<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection;

    public Output<VirtualNodeSpecListenerOutlierDetectionArgs> getOutlierDetection() {
        return this.outlierDetection == null ? Output.empty() : this.outlierDetection;
    }

    /**
     * The port mapping information for the listener.
     * 
     */
    @Import(name="portMapping", required=true)
      private final Output<VirtualNodeSpecListenerPortMappingArgs> portMapping;

    public Output<VirtualNodeSpecListenerPortMappingArgs> getPortMapping() {
        return this.portMapping;
    }

    /**
     * Timeouts for different protocols.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<VirtualNodeSpecListenerTimeoutArgs> timeout;

    public Output<VirtualNodeSpecListenerTimeoutArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The Transport Layer Security (TLS) properties for the listener
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<VirtualNodeSpecListenerTlsArgs> tls;

    public Output<VirtualNodeSpecListenerTlsArgs> getTls() {
        return this.tls == null ? Output.empty() : this.tls;
    }

    public VirtualNodeSpecListenerArgs(
        @Nullable Output<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool,
        @Nullable Output<VirtualNodeSpecListenerHealthCheckArgs> healthCheck,
        @Nullable Output<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection,
        Output<VirtualNodeSpecListenerPortMappingArgs> portMapping,
        @Nullable Output<VirtualNodeSpecListenerTimeoutArgs> timeout,
        @Nullable Output<VirtualNodeSpecListenerTlsArgs> tls) {
        this.connectionPool = connectionPool;
        this.healthCheck = healthCheck;
        this.outlierDetection = outlierDetection;
        this.portMapping = Objects.requireNonNull(portMapping, "expected parameter 'portMapping' to be non-null");
        this.timeout = timeout;
        this.tls = tls;
    }

    private VirtualNodeSpecListenerArgs() {
        this.connectionPool = Output.empty();
        this.healthCheck = Output.empty();
        this.outlierDetection = Output.empty();
        this.portMapping = Output.empty();
        this.timeout = Output.empty();
        this.tls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool;
        private @Nullable Output<VirtualNodeSpecListenerHealthCheckArgs> healthCheck;
        private @Nullable Output<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection;
        private Output<VirtualNodeSpecListenerPortMappingArgs> portMapping;
        private @Nullable Output<VirtualNodeSpecListenerTimeoutArgs> timeout;
        private @Nullable Output<VirtualNodeSpecListenerTlsArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPool = defaults.connectionPool;
    	      this.healthCheck = defaults.healthCheck;
    	      this.outlierDetection = defaults.outlierDetection;
    	      this.portMapping = defaults.portMapping;
    	      this.timeout = defaults.timeout;
    	      this.tls = defaults.tls;
        }

        public Builder connectionPool(@Nullable Output<VirtualNodeSpecListenerConnectionPoolArgs> connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }

        public Builder connectionPool(@Nullable VirtualNodeSpecListenerConnectionPoolArgs connectionPool) {
            this.connectionPool = Output.ofNullable(connectionPool);
            return this;
        }

        public Builder healthCheck(@Nullable Output<VirtualNodeSpecListenerHealthCheckArgs> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        public Builder healthCheck(@Nullable VirtualNodeSpecListenerHealthCheckArgs healthCheck) {
            this.healthCheck = Output.ofNullable(healthCheck);
            return this;
        }

        public Builder outlierDetection(@Nullable Output<VirtualNodeSpecListenerOutlierDetectionArgs> outlierDetection) {
            this.outlierDetection = outlierDetection;
            return this;
        }

        public Builder outlierDetection(@Nullable VirtualNodeSpecListenerOutlierDetectionArgs outlierDetection) {
            this.outlierDetection = Output.ofNullable(outlierDetection);
            return this;
        }

        public Builder portMapping(Output<VirtualNodeSpecListenerPortMappingArgs> portMapping) {
            this.portMapping = Objects.requireNonNull(portMapping);
            return this;
        }

        public Builder portMapping(VirtualNodeSpecListenerPortMappingArgs portMapping) {
            this.portMapping = Output.of(Objects.requireNonNull(portMapping));
            return this;
        }

        public Builder timeout(@Nullable Output<VirtualNodeSpecListenerTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable VirtualNodeSpecListenerTimeoutArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder tls(@Nullable Output<VirtualNodeSpecListenerTlsArgs> tls) {
            this.tls = tls;
            return this;
        }

        public Builder tls(@Nullable VirtualNodeSpecListenerTlsArgs tls) {
            this.tls = Output.ofNullable(tls);
            return this;
        }
        public VirtualNodeSpecListenerArgs build() {
            return new VirtualNodeSpecListenerArgs(connectionPool, healthCheck, outlierDetection, portMapping, timeout, tls);
        }
    }
}
