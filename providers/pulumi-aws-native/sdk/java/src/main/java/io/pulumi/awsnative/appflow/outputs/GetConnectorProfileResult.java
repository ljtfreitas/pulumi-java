// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.ConnectorProfileConnectionMode;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectorProfileResult {
    /**
     * Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
     * 
     */
    private final @Nullable ConnectorProfileConnectionMode connectionMode;
    /**
     * Unique identifier for connector profile resources
     * 
     */
    private final @Nullable String connectorProfileArn;
    /**
     * A unique Arn for Connector-Profile resource
     * 
     */
    private final @Nullable String credentialsArn;

    @CustomType.Constructor
    private GetConnectorProfileResult(
        @CustomType.Parameter("connectionMode") @Nullable ConnectorProfileConnectionMode connectionMode,
        @CustomType.Parameter("connectorProfileArn") @Nullable String connectorProfileArn,
        @CustomType.Parameter("credentialsArn") @Nullable String credentialsArn) {
        this.connectionMode = connectionMode;
        this.connectorProfileArn = connectorProfileArn;
        this.credentialsArn = credentialsArn;
    }

    /**
     * Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
     * 
    */
    public Optional<ConnectorProfileConnectionMode> getConnectionMode() {
        return Optional.ofNullable(this.connectionMode);
    }
    /**
     * Unique identifier for connector profile resources
     * 
    */
    public Optional<String> getConnectorProfileArn() {
        return Optional.ofNullable(this.connectorProfileArn);
    }
    /**
     * A unique Arn for Connector-Profile resource
     * 
    */
    public Optional<String> getCredentialsArn() {
        return Optional.ofNullable(this.credentialsArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectorProfileConnectionMode connectionMode;
        private @Nullable String connectorProfileArn;
        private @Nullable String credentialsArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectorProfileArn = defaults.connectorProfileArn;
    	      this.credentialsArn = defaults.credentialsArn;
        }

        public Builder connectionMode(@Nullable ConnectorProfileConnectionMode connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }

        public Builder connectorProfileArn(@Nullable String connectorProfileArn) {
            this.connectorProfileArn = connectorProfileArn;
            return this;
        }

        public Builder credentialsArn(@Nullable String credentialsArn) {
            this.credentialsArn = credentialsArn;
            return this;
        }
        public GetConnectorProfileResult build() {
            return new GetConnectorProfileResult(connectionMode, connectorProfileArn, credentialsArn);
        }
    }
}
