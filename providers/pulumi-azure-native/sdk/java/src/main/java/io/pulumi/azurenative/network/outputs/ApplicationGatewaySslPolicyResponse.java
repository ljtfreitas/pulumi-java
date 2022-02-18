// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewaySslPolicyResponse {
    /**
     * Ssl cipher suites to be enabled in the specified order to application gateway.
     * 
     */
    private final @Nullable List<String> cipherSuites;
    /**
     * Ssl protocols to be disabled on application gateway.
     * 
     */
    private final @Nullable List<String> disabledSslProtocols;
    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * 
     */
    private final @Nullable String minProtocolVersion;
    /**
     * Name of Ssl predefined policy.
     * 
     */
    private final @Nullable String policyName;
    /**
     * Type of Ssl Policy.
     * 
     */
    private final @Nullable String policyType;

    @OutputCustomType.Constructor({"cipherSuites","disabledSslProtocols","minProtocolVersion","policyName","policyType"})
    private ApplicationGatewaySslPolicyResponse(
        @Nullable List<String> cipherSuites,
        @Nullable List<String> disabledSslProtocols,
        @Nullable String minProtocolVersion,
        @Nullable String policyName,
        @Nullable String policyType) {
        this.cipherSuites = cipherSuites;
        this.disabledSslProtocols = disabledSslProtocols;
        this.minProtocolVersion = minProtocolVersion;
        this.policyName = policyName;
        this.policyType = policyType;
    }

    /**
     * Ssl cipher suites to be enabled in the specified order to application gateway.
     * 
     */
    public List<String> getCipherSuites() {
        return this.cipherSuites == null ? List.of() : this.cipherSuites;
    }
    /**
     * Ssl protocols to be disabled on application gateway.
     * 
     */
    public List<String> getDisabledSslProtocols() {
        return this.disabledSslProtocols == null ? List.of() : this.disabledSslProtocols;
    }
    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * 
     */
    public Optional<String> getMinProtocolVersion() {
        return Optional.ofNullable(this.minProtocolVersion);
    }
    /**
     * Name of Ssl predefined policy.
     * 
     */
    public Optional<String> getPolicyName() {
        return Optional.ofNullable(this.policyName);
    }
    /**
     * Type of Ssl Policy.
     * 
     */
    public Optional<String> getPolicyType() {
        return Optional.ofNullable(this.policyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cipherSuites;
        private @Nullable List<String> disabledSslProtocols;
        private @Nullable String minProtocolVersion;
        private @Nullable String policyName;
        private @Nullable String policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cipherSuites = defaults.cipherSuites;
    	      this.disabledSslProtocols = defaults.disabledSslProtocols;
    	      this.minProtocolVersion = defaults.minProtocolVersion;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
        }

        public Builder setCipherSuites(@Nullable List<String> cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }

        public Builder setDisabledSslProtocols(@Nullable List<String> disabledSslProtocols) {
            this.disabledSslProtocols = disabledSslProtocols;
            return this;
        }

        public Builder setMinProtocolVersion(@Nullable String minProtocolVersion) {
            this.minProtocolVersion = minProtocolVersion;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }

        public ApplicationGatewaySslPolicyResponse build() {
            return new ApplicationGatewaySslPolicyResponse(cipherSuites, disabledSslProtocols, minProtocolVersion, policyName, policyType);
        }
    }
}
