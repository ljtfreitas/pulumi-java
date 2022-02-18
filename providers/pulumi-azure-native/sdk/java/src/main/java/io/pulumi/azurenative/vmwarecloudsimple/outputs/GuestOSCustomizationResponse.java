// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestOSCustomizationResponse {
    /**
     * List of dns servers to use
     * 
     */
    private final @Nullable List<String> dnsServers;
    /**
     * Virtual Machine hostname
     * 
     */
    private final @Nullable String hostName;
    /**
     * Password for login
     * 
     */
    private final @Nullable String password;
    /**
     * id of customization policy
     * 
     */
    private final @Nullable String policyId;
    /**
     * Username for login
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"dnsServers","hostName","password","policyId","username"})
    private GuestOSCustomizationResponse(
        @Nullable List<String> dnsServers,
        @Nullable String hostName,
        @Nullable String password,
        @Nullable String policyId,
        @Nullable String username) {
        this.dnsServers = dnsServers;
        this.hostName = hostName;
        this.password = password;
        this.policyId = policyId;
        this.username = username;
    }

    /**
     * List of dns servers to use
     * 
     */
    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * Virtual Machine hostname
     * 
     */
    public Optional<String> getHostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * Password for login
     * 
     */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * id of customization policy
     * 
     */
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * Username for login
     * 
     */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOSCustomizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;
        private @Nullable String hostName;
        private @Nullable String password;
        private @Nullable String policyId;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOSCustomizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.hostName = defaults.hostName;
    	      this.password = defaults.password;
    	      this.policyId = defaults.policyId;
    	      this.username = defaults.username;
        }

        public Builder setDnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public GuestOSCustomizationResponse build() {
            return new GuestOSCustomizationResponse(dnsServers, hostName, password, policyId, username);
        }
    }
}
