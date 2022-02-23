// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure container registry configuration information
 * 
 */
public final class ServiceAcrConfigurationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAcrConfigurationInfoResponse Empty = new ServiceAcrConfigurationInfoResponse();

    /**
     * The list of the ACR login servers.
     * 
     */
    @InputImport(name="loginServers")
        private final @Nullable List<String> loginServers;

    public List<String> getLoginServers() {
        return this.loginServers == null ? List.of() : this.loginServers;
    }

    public ServiceAcrConfigurationInfoResponse(@Nullable List<String> loginServers) {
        this.loginServers = loginServers;
    }

    private ServiceAcrConfigurationInfoResponse() {
        this.loginServers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAcrConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> loginServers;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAcrConfigurationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginServers = defaults.loginServers;
        }

        public Builder setLoginServers(@Nullable List<String> loginServers) {
            this.loginServers = loginServers;
            return this;
        }
        public ServiceAcrConfigurationInfoResponse build() {
            return new ServiceAcrConfigurationInfoResponse(loginServers);
        }
    }
}
