// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow;

import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectionMode;
import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectorType;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfileConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileArgs Empty = new ConnectorProfileArgs();

    /**
     * Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
     * 
     */
    @Import(name="connectionMode", required=true)
      private final Output<ConnectorProfileConnectionMode> connectionMode;

    public Output<ConnectorProfileConnectionMode> getConnectionMode() {
        return this.connectionMode;
    }

    /**
     * Connector specific configurations needed to create connector profile
     * 
     */
    @Import(name="connectorProfileConfig")
      private final @Nullable Output<ConnectorProfileConfigArgs> connectorProfileConfig;

    public Output<ConnectorProfileConfigArgs> getConnectorProfileConfig() {
        return this.connectorProfileConfig == null ? Output.empty() : this.connectorProfileConfig;
    }

    /**
     * The maximum number of items to retrieve in a single batch.
     * 
     */
    @Import(name="connectorProfileName")
      private final @Nullable Output<String> connectorProfileName;

    public Output<String> getConnectorProfileName() {
        return this.connectorProfileName == null ? Output.empty() : this.connectorProfileName;
    }

    /**
     * List of Saas providers that need connector profile to be created
     * 
     */
    @Import(name="connectorType", required=true)
      private final Output<ConnectorProfileConnectorType> connectorType;

    public Output<ConnectorProfileConnectorType> getConnectorType() {
        return this.connectorType;
    }

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
     * 
     */
    @Import(name="kMSArn")
      private final @Nullable Output<String> kMSArn;

    public Output<String> getKMSArn() {
        return this.kMSArn == null ? Output.empty() : this.kMSArn;
    }

    public ConnectorProfileArgs(
        Output<ConnectorProfileConnectionMode> connectionMode,
        @Nullable Output<ConnectorProfileConfigArgs> connectorProfileConfig,
        @Nullable Output<String> connectorProfileName,
        Output<ConnectorProfileConnectorType> connectorType,
        @Nullable Output<String> kMSArn) {
        this.connectionMode = Objects.requireNonNull(connectionMode, "expected parameter 'connectionMode' to be non-null");
        this.connectorProfileConfig = connectorProfileConfig;
        this.connectorProfileName = connectorProfileName;
        this.connectorType = Objects.requireNonNull(connectorType, "expected parameter 'connectorType' to be non-null");
        this.kMSArn = kMSArn;
    }

    private ConnectorProfileArgs() {
        this.connectionMode = Output.empty();
        this.connectorProfileConfig = Output.empty();
        this.connectorProfileName = Output.empty();
        this.connectorType = Output.empty();
        this.kMSArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ConnectorProfileConnectionMode> connectionMode;
        private @Nullable Output<ConnectorProfileConfigArgs> connectorProfileConfig;
        private @Nullable Output<String> connectorProfileName;
        private Output<ConnectorProfileConnectorType> connectorType;
        private @Nullable Output<String> kMSArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectorProfileConfig = defaults.connectorProfileConfig;
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.kMSArn = defaults.kMSArn;
        }

        public Builder connectionMode(Output<ConnectorProfileConnectionMode> connectionMode) {
            this.connectionMode = Objects.requireNonNull(connectionMode);
            return this;
        }

        public Builder connectionMode(ConnectorProfileConnectionMode connectionMode) {
            this.connectionMode = Output.of(Objects.requireNonNull(connectionMode));
            return this;
        }

        public Builder connectorProfileConfig(@Nullable Output<ConnectorProfileConfigArgs> connectorProfileConfig) {
            this.connectorProfileConfig = connectorProfileConfig;
            return this;
        }

        public Builder connectorProfileConfig(@Nullable ConnectorProfileConfigArgs connectorProfileConfig) {
            this.connectorProfileConfig = Output.ofNullable(connectorProfileConfig);
            return this;
        }

        public Builder connectorProfileName(@Nullable Output<String> connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }

        public Builder connectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = Output.ofNullable(connectorProfileName);
            return this;
        }

        public Builder connectorType(Output<ConnectorProfileConnectorType> connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }

        public Builder connectorType(ConnectorProfileConnectorType connectorType) {
            this.connectorType = Output.of(Objects.requireNonNull(connectorType));
            return this;
        }

        public Builder kMSArn(@Nullable Output<String> kMSArn) {
            this.kMSArn = kMSArn;
            return this;
        }

        public Builder kMSArn(@Nullable String kMSArn) {
            this.kMSArn = Output.ofNullable(kMSArn);
            return this;
        }
        public ConnectorProfileArgs build() {
            return new ConnectorProfileArgs(connectionMode, connectorProfileConfig, connectorProfileName, connectorType, kMSArn);
        }
    }
}
