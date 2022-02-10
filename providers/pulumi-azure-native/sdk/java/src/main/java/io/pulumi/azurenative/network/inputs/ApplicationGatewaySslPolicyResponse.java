// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewaySslPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewaySslPolicyResponse Empty = new ApplicationGatewaySslPolicyResponse();

    @InputImport(name="cipherSuites")
    private final @Nullable List<String> cipherSuites;

    public List<String> getCipherSuites() {
        return this.cipherSuites == null ? List.of() : this.cipherSuites;
    }

    @InputImport(name="disabledSslProtocols")
    private final @Nullable List<String> disabledSslProtocols;

    public List<String> getDisabledSslProtocols() {
        return this.disabledSslProtocols == null ? List.of() : this.disabledSslProtocols;
    }

    @InputImport(name="minProtocolVersion")
    private final @Nullable String minProtocolVersion;

    public Optional<String> getMinProtocolVersion() {
        return this.minProtocolVersion == null ? Optional.empty() : Optional.ofNullable(this.minProtocolVersion);
    }

    @InputImport(name="policyName")
    private final @Nullable String policyName;

    public Optional<String> getPolicyName() {
        return this.policyName == null ? Optional.empty() : Optional.ofNullable(this.policyName);
    }

    @InputImport(name="policyType")
    private final @Nullable String policyType;

    public Optional<String> getPolicyType() {
        return this.policyType == null ? Optional.empty() : Optional.ofNullable(this.policyType);
    }

    public ApplicationGatewaySslPolicyResponse(
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

    private ApplicationGatewaySslPolicyResponse() {
        this.cipherSuites = List.of();
        this.disabledSslProtocols = List.of();
        this.minProtocolVersion = null;
        this.policyName = null;
        this.policyType = null;
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