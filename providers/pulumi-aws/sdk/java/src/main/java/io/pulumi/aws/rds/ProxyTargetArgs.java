// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyTargetArgs Empty = new ProxyTargetArgs();

    /**
     * DB cluster identifier.
     * 
     */
    @InputImport(name="dbClusterIdentifier")
    private final @Nullable Input<String> dbClusterIdentifier;

    public Input<String> getDbClusterIdentifier() {
        return this.dbClusterIdentifier == null ? Input.empty() : this.dbClusterIdentifier;
    }

    /**
     * DB instance identifier.
     * 
     */
    @InputImport(name="dbInstanceIdentifier")
    private final @Nullable Input<String> dbInstanceIdentifier;

    public Input<String> getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier == null ? Input.empty() : this.dbInstanceIdentifier;
    }

    /**
     * The name of the DB proxy.
     * 
     */
    @InputImport(name="dbProxyName", required=true)
    private final Input<String> dbProxyName;

    public Input<String> getDbProxyName() {
        return this.dbProxyName;
    }

    /**
     * The name of the target group.
     * 
     */
    @InputImport(name="targetGroupName", required=true)
    private final Input<String> targetGroupName;

    public Input<String> getTargetGroupName() {
        return this.targetGroupName;
    }

    public ProxyTargetArgs(
        @Nullable Input<String> dbClusterIdentifier,
        @Nullable Input<String> dbInstanceIdentifier,
        Input<String> dbProxyName,
        Input<String> targetGroupName) {
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.dbInstanceIdentifier = dbInstanceIdentifier;
        this.dbProxyName = Objects.requireNonNull(dbProxyName, "expected parameter 'dbProxyName' to be non-null");
        this.targetGroupName = Objects.requireNonNull(targetGroupName, "expected parameter 'targetGroupName' to be non-null");
    }

    private ProxyTargetArgs() {
        this.dbClusterIdentifier = Input.empty();
        this.dbInstanceIdentifier = Input.empty();
        this.dbProxyName = Input.empty();
        this.targetGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dbClusterIdentifier;
        private @Nullable Input<String> dbInstanceIdentifier;
        private Input<String> dbProxyName;
        private Input<String> targetGroupName;

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

        public Builder setDbClusterIdentifier(@Nullable Input<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        public Builder setDbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = Input.ofNullable(dbClusterIdentifier);
            return this;
        }

        public Builder setDbInstanceIdentifier(@Nullable Input<String> dbInstanceIdentifier) {
            this.dbInstanceIdentifier = dbInstanceIdentifier;
            return this;
        }

        public Builder setDbInstanceIdentifier(@Nullable String dbInstanceIdentifier) {
            this.dbInstanceIdentifier = Input.ofNullable(dbInstanceIdentifier);
            return this;
        }

        public Builder setDbProxyName(Input<String> dbProxyName) {
            this.dbProxyName = Objects.requireNonNull(dbProxyName);
            return this;
        }

        public Builder setDbProxyName(String dbProxyName) {
            this.dbProxyName = Input.of(Objects.requireNonNull(dbProxyName));
            return this;
        }

        public Builder setTargetGroupName(Input<String> targetGroupName) {
            this.targetGroupName = Objects.requireNonNull(targetGroupName);
            return this;
        }

        public Builder setTargetGroupName(String targetGroupName) {
            this.targetGroupName = Input.of(Objects.requireNonNull(targetGroupName));
            return this;
        }
        public ProxyTargetArgs build() {
            return new ProxyTargetArgs(dbClusterIdentifier, dbInstanceIdentifier, dbProxyName, targetGroupName);
        }
    }
}
