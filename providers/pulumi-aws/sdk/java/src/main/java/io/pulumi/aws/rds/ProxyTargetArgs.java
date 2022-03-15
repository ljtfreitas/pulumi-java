// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyTargetArgs Empty = new ProxyTargetArgs();

    /**
     * DB cluster identifier.
     * 
     */
    @Import(name="dbClusterIdentifier")
      private final @Nullable Output<String> dbClusterIdentifier;

    public Output<String> getDbClusterIdentifier() {
        return this.dbClusterIdentifier == null ? Output.empty() : this.dbClusterIdentifier;
    }

    /**
     * DB instance identifier.
     * 
     */
    @Import(name="dbInstanceIdentifier")
      private final @Nullable Output<String> dbInstanceIdentifier;

    public Output<String> getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier == null ? Output.empty() : this.dbInstanceIdentifier;
    }

    /**
     * The name of the DB proxy.
     * 
     */
    @Import(name="dbProxyName", required=true)
      private final Output<String> dbProxyName;

    public Output<String> getDbProxyName() {
        return this.dbProxyName;
    }

    /**
     * The name of the target group.
     * 
     */
    @Import(name="targetGroupName", required=true)
      private final Output<String> targetGroupName;

    public Output<String> getTargetGroupName() {
        return this.targetGroupName;
    }

    public ProxyTargetArgs(
        @Nullable Output<String> dbClusterIdentifier,
        @Nullable Output<String> dbInstanceIdentifier,
        Output<String> dbProxyName,
        Output<String> targetGroupName) {
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbProxyName = Objects.requireNonNull(dbProxyName, "expected parameter 'dbProxyName' to be non-null");
        this.targetGroupName = Objects.requireNonNull(targetGroupName, "expected parameter 'targetGroupName' to be non-null");
    }

    private ProxyTargetArgs() {
        this.dbClusterIdentifier = Output.empty();
        this.dbInstanceIdentifier = Output.empty();
        this.dbProxyName = Output.empty();
        this.targetGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dbClusterIdentifier;
        private @Nullable Output<String> dbInstanceIdentifier;
        private Output<String> dbProxyName;
        private Output<String> targetGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbInstanceIdentifier = defaults.dbInstanceIdentifier;
    	      this.dbProxyName = defaults.dbProxyName;
    	      this.targetGroupName = defaults.targetGroupName;
        }

        public Builder dbClusterIdentifier(@Nullable Output<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        public Builder dbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = Output.ofNullable(dbClusterIdentifier);
            return this;
        }

        public Builder dbInstanceIdentifier(@Nullable Output<String> dbInstanceIdentifier) {
            this.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        public Builder dbInstanceIdentifier(@Nullable String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Output.ofNullable(dbInstanceIdentifier);
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

        public Builder targetGroupName(Output<String> targetGroupName) {
            this.targetGroupName = Objects.requireNonNull(targetGroupName);
            return this;
        }

        public Builder targetGroupName(String targetGroupName) {
            this.targetGroupName = Output.of(Objects.requireNonNull(targetGroupName));
            return this;
        }
        public ProxyTargetArgs build() {
            return new ProxyTargetArgs(dbClusterIdentifier, dbInstanceIdentifier, dbProxyName, targetGroupName);
        }
    }
}
