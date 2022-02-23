// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewaySslCipherSuite;
import io.pulumi.azurenative.network.enums.ApplicationGatewaySslPolicyName;
import io.pulumi.azurenative.network.enums.ApplicationGatewaySslPolicyType;
import io.pulumi.azurenative.network.enums.ApplicationGatewaySslProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Application Gateway Ssl policy.
 * 
 */
public final class ApplicationGatewaySslPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewaySslPolicyArgs Empty = new ApplicationGatewaySslPolicyArgs();

    /**
     * Ssl cipher suites to be enabled in the specified order to application gateway.
     * 
     */
    @InputImport(name="cipherSuites")
        private final @Nullable Input<List<Either<String,ApplicationGatewaySslCipherSuite>>> cipherSuites;

    public Input<List<Either<String,ApplicationGatewaySslCipherSuite>>> getCipherSuites() {
        return this.cipherSuites == null ? Input.empty() : this.cipherSuites;
    }

    /**
     * Ssl protocols to be disabled on application gateway.
     * 
     */
    @InputImport(name="disabledSslProtocols")
        private final @Nullable Input<List<Either<String,ApplicationGatewaySslProtocol>>> disabledSslProtocols;

    public Input<List<Either<String,ApplicationGatewaySslProtocol>>> getDisabledSslProtocols() {
        return this.disabledSslProtocols == null ? Input.empty() : this.disabledSslProtocols;
    }

    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * 
     */
    @InputImport(name="minProtocolVersion")
        private final @Nullable Input<Either<String,ApplicationGatewaySslProtocol>> minProtocolVersion;

    public Input<Either<String,ApplicationGatewaySslProtocol>> getMinProtocolVersion() {
        return this.minProtocolVersion == null ? Input.empty() : this.minProtocolVersion;
    }

    /**
     * Name of Ssl predefined policy.
     * 
     */
    @InputImport(name="policyName")
        private final @Nullable Input<Either<String,ApplicationGatewaySslPolicyName>> policyName;

    public Input<Either<String,ApplicationGatewaySslPolicyName>> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    /**
     * Type of Ssl Policy.
     * 
     */
    @InputImport(name="policyType")
        private final @Nullable Input<Either<String,ApplicationGatewaySslPolicyType>> policyType;

    public Input<Either<String,ApplicationGatewaySslPolicyType>> getPolicyType() {
        return this.policyType == null ? Input.empty() : this.policyType;
    }

    public ApplicationGatewaySslPolicyArgs(
        @Nullable Input<List<Either<String,ApplicationGatewaySslCipherSuite>>> cipherSuites,
        @Nullable Input<List<Either<String,ApplicationGatewaySslProtocol>>> disabledSslProtocols,
        @Nullable Input<Either<String,ApplicationGatewaySslProtocol>> minProtocolVersion,
        @Nullable Input<Either<String,ApplicationGatewaySslPolicyName>> policyName,
        @Nullable Input<Either<String,ApplicationGatewaySslPolicyType>> policyType) {
        this.cipherSuites = cipherSuites;
        this.disabledSslProtocols = disabledSslProtocols;
        this.minProtocolVersion = minProtocolVersion;
        this.policyName = policyName;
        this.policyType = policyType;
    }

    private ApplicationGatewaySslPolicyArgs() {
        this.cipherSuites = Input.empty();
        this.disabledSslProtocols = Input.empty();
        this.minProtocolVersion = Input.empty();
        this.policyName = Input.empty();
        this.policyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,ApplicationGatewaySslCipherSuite>>> cipherSuites;
        private @Nullable Input<List<Either<String,ApplicationGatewaySslProtocol>>> disabledSslProtocols;
        private @Nullable Input<Either<String,ApplicationGatewaySslProtocol>> minProtocolVersion;
        private @Nullable Input<Either<String,ApplicationGatewaySslPolicyName>> policyName;
        private @Nullable Input<Either<String,ApplicationGatewaySslPolicyType>> policyType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cipherSuites = defaults.cipherSuites;
    	      this.disabledSslProtocols = defaults.disabledSslProtocols;
    	      this.minProtocolVersion = defaults.minProtocolVersion;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
        }

        public Builder setCipherSuites(@Nullable Input<List<Either<String,ApplicationGatewaySslCipherSuite>>> cipherSuites) {
            this.cipherSuites = cipherSuites;
            return this;
        }

        public Builder setCipherSuites(@Nullable List<Either<String,ApplicationGatewaySslCipherSuite>> cipherSuites) {
            this.cipherSuites = Input.ofNullable(cipherSuites);
            return this;
        }

        public Builder setDisabledSslProtocols(@Nullable Input<List<Either<String,ApplicationGatewaySslProtocol>>> disabledSslProtocols) {
            this.disabledSslProtocols = disabledSslProtocols;
            return this;
        }

        public Builder setDisabledSslProtocols(@Nullable List<Either<String,ApplicationGatewaySslProtocol>> disabledSslProtocols) {
            this.disabledSslProtocols = Input.ofNullable(disabledSslProtocols);
            return this;
        }

        public Builder setMinProtocolVersion(@Nullable Input<Either<String,ApplicationGatewaySslProtocol>> minProtocolVersion) {
            this.minProtocolVersion = minProtocolVersion;
            return this;
        }

        public Builder setMinProtocolVersion(@Nullable Either<String,ApplicationGatewaySslProtocol> minProtocolVersion) {
            this.minProtocolVersion = Input.ofNullable(minProtocolVersion);
            return this;
        }

        public Builder setPolicyName(@Nullable Input<Either<String,ApplicationGatewaySslPolicyName>> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable Either<String,ApplicationGatewaySslPolicyName> policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }

        public Builder setPolicyType(@Nullable Input<Either<String,ApplicationGatewaySslPolicyType>> policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder setPolicyType(@Nullable Either<String,ApplicationGatewaySslPolicyType> policyType) {
            this.policyType = Input.ofNullable(policyType);
            return this;
        }
        public ApplicationGatewaySslPolicyArgs build() {
            return new ApplicationGatewaySslPolicyArgs(cipherSuites, disabledSslProtocols, minProtocolVersion, policyName, policyType);
        }
    }
}
