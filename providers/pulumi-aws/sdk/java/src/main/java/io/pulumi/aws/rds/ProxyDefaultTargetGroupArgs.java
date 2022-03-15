// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyDefaultTargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyDefaultTargetGroupArgs Empty = new ProxyDefaultTargetGroupArgs();

    /**
     * The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    @Import(name="connectionPoolConfig")
      private final @Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs> connectionPoolConfig;

    public Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs> getConnectionPoolConfig() {
        return this.connectionPoolConfig == null ? Output.empty() : this.connectionPoolConfig;
    }

    /**
     * Name of the RDS DB Proxy.
     * 
     */
    @Import(name="dbProxyName", required=true)
      private final Output<String> dbProxyName;

    public Output<String> getDbProxyName() {
        return this.dbProxyName;
    }

    public ProxyDefaultTargetGroupArgs(
        @Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs> connectionPoolConfig,
        Output<String> dbProxyName) {
        this.connectionPoolConfig = connectionPoolConfig;
        this.dbProxyName = Objects.requireNonNull(dbProxyName, "expected parameter 'dbProxyName' to be non-null");
    }

    private ProxyDefaultTargetGroupArgs() {
        this.connectionPoolConfig = Output.empty();
        this.dbProxyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyDefaultTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs> connectionPoolConfig;
        private Output<String> dbProxyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyDefaultTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPoolConfig = defaults.connectionPoolConfig;
    	      this.dbProxyName = defaults.dbProxyName;
        }

        public Builder connectionPoolConfig(@Nullable Output<ProxyDefaultTargetGroupConnectionPoolConfigArgs> connectionPoolConfig) {
            this.connectionPoolConfig = connectionPoolConfig;
            return this;
        }

        public Builder connectionPoolConfig(@Nullable ProxyDefaultTargetGroupConnectionPoolConfigArgs connectionPoolConfig) {
            this.connectionPoolConfig = Output.ofNullable(connectionPoolConfig);
            return this;
        }

        public Builder dbProxyName(Output<String> dbProxyName) {
            this.dbProxyName = Objects.requireNonNull(dbProxyName);
            return this;
        }

        public Builder dbProxyName(String dbProxyName) {
            this.dbProxyName = Output.of(Objects.requireNonNull(dbProxyName));
            return this;
        }
        public ProxyDefaultTargetGroupArgs build() {
            return new ProxyDefaultTargetGroupArgs(connectionPoolConfig, dbProxyName);
        }
    }
}
