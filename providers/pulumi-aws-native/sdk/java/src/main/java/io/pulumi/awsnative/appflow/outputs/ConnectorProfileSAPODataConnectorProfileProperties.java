// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileOAuthProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileSAPODataConnectorProfileProperties {
    private final @Nullable String applicationHostUrl;
    private final @Nullable String applicationServicePath;
    private final @Nullable String clientNumber;
    private final @Nullable String logonLanguage;
    private final @Nullable ConnectorProfileOAuthProperties oAuthProperties;
    private final @Nullable Integer portNumber;
    private final @Nullable String privateLinkServiceName;

    @CustomType.Constructor
    private ConnectorProfileSAPODataConnectorProfileProperties(
        @CustomType.Parameter("applicationHostUrl") @Nullable String applicationHostUrl,
        @CustomType.Parameter("applicationServicePath") @Nullable String applicationServicePath,
        @CustomType.Parameter("clientNumber") @Nullable String clientNumber,
        @CustomType.Parameter("logonLanguage") @Nullable String logonLanguage,
        @CustomType.Parameter("oAuthProperties") @Nullable ConnectorProfileOAuthProperties oAuthProperties,
        @CustomType.Parameter("portNumber") @Nullable Integer portNumber,
        @CustomType.Parameter("privateLinkServiceName") @Nullable String privateLinkServiceName) {
        this.applicationHostUrl = applicationHostUrl;
        this.applicationServicePath = applicationServicePath;
        this.clientNumber = clientNumber;
        this.logonLanguage = logonLanguage;
        this.oAuthProperties = oAuthProperties;
        this.portNumber = portNumber;
        this.privateLinkServiceName = privateLinkServiceName;
    }

    public Optional<String> getApplicationHostUrl() {
        return Optional.ofNullable(this.applicationHostUrl);
    }
    public Optional<String> getApplicationServicePath() {
        return Optional.ofNullable(this.applicationServicePath);
    }
    public Optional<String> getClientNumber() {
        return Optional.ofNullable(this.clientNumber);
    }
    public Optional<String> getLogonLanguage() {
        return Optional.ofNullable(this.logonLanguage);
    }
    public Optional<ConnectorProfileOAuthProperties> getOAuthProperties() {
        return Optional.ofNullable(this.oAuthProperties);
    }
    public Optional<Integer> getPortNumber() {
        return Optional.ofNullable(this.portNumber);
    }
    public Optional<String> getPrivateLinkServiceName() {
        return Optional.ofNullable(this.privateLinkServiceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSAPODataConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationHostUrl;
        private @Nullable String applicationServicePath;
        private @Nullable String clientNumber;
        private @Nullable String logonLanguage;
        private @Nullable ConnectorProfileOAuthProperties oAuthProperties;
        private @Nullable Integer portNumber;
        private @Nullable String privateLinkServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSAPODataConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHostUrl = defaults.applicationHostUrl;
    	      this.applicationServicePath = defaults.applicationServicePath;
    	      this.clientNumber = defaults.clientNumber;
    	      this.logonLanguage = defaults.logonLanguage;
    	      this.oAuthProperties = defaults.oAuthProperties;
    	      this.portNumber = defaults.portNumber;
    	      this.privateLinkServiceName = defaults.privateLinkServiceName;
        }

        public Builder applicationHostUrl(@Nullable String applicationHostUrl) {
            this.applicationHostUrl = applicationHostUrl;
            return this;
        }

        public Builder applicationServicePath(@Nullable String applicationServicePath) {
            this.applicationServicePath = applicationServicePath;
            return this;
        }

        public Builder clientNumber(@Nullable String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }

        public Builder logonLanguage(@Nullable String logonLanguage) {
            this.logonLanguage = logonLanguage;
            return this;
        }

        public Builder oAuthProperties(@Nullable ConnectorProfileOAuthProperties oAuthProperties) {
            this.oAuthProperties = oAuthProperties;
            return this;
        }

        public Builder portNumber(@Nullable Integer portNumber) {
            this.portNumber = portNumber;
            return this;
        }

        public Builder privateLinkServiceName(@Nullable String privateLinkServiceName) {
            this.privateLinkServiceName = privateLinkServiceName;
            return this;
        }
        public ConnectorProfileSAPODataConnectorProfileProperties build() {
            return new ConnectorProfileSAPODataConnectorProfileProperties(applicationHostUrl, applicationServicePath, clientNumber, logonLanguage, oAuthProperties, portNumber, privateLinkServiceName);
        }
    }
}
