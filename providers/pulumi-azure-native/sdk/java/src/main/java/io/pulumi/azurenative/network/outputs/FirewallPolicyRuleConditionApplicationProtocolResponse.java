// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyRuleConditionApplicationProtocolResponse {
    /**
     * Port number for the protocol, cannot be greater than 64000.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Protocol type.
     * 
     */
    private final @Nullable String protocolType;

    @CustomType.Constructor
    private FirewallPolicyRuleConditionApplicationProtocolResponse(
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("protocolType") @Nullable String protocolType) {
        this.port = port;
        this.protocolType = protocolType;
    }

    /**
     * Port number for the protocol, cannot be greater than 64000.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Protocol type.
     * 
    */
    public Optional<String> getProtocolType() {
        return Optional.ofNullable(this.protocolType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleConditionApplicationProtocolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String protocolType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleConditionApplicationProtocolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocolType = defaults.protocolType;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder protocolType(@Nullable String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public FirewallPolicyRuleConditionApplicationProtocolResponse build() {
            return new FirewallPolicyRuleConditionApplicationProtocolResponse(port, protocolType);
        }
    }
}
