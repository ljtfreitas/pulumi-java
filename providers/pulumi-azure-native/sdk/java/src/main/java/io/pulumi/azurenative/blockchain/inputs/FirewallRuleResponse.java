// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ip range for firewall rules
 * 
 */
public final class FirewallRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallRuleResponse Empty = new FirewallRuleResponse();

    /**
     * Gets or sets the end IP address of the firewall rule range.
     * 
     */
    @Import(name="endIpAddress")
      private final @Nullable String endIpAddress;

    public Optional<String> getEndIpAddress() {
        return this.endIpAddress == null ? Optional.empty() : Optional.ofNullable(this.endIpAddress);
    }

    /**
     * Gets or sets the name of the firewall rules.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable String ruleName;

    public Optional<String> getRuleName() {
        return this.ruleName == null ? Optional.empty() : Optional.ofNullable(this.ruleName);
    }

    /**
     * Gets or sets the start IP address of the firewall rule range.
     * 
     */
    @Import(name="startIpAddress")
      private final @Nullable String startIpAddress;

    public Optional<String> getStartIpAddress() {
        return this.startIpAddress == null ? Optional.empty() : Optional.ofNullable(this.startIpAddress);
    }

    public FirewallRuleResponse(
        @Nullable String endIpAddress,
        @Nullable String ruleName,
        @Nullable String startIpAddress) {
        this.endIpAddress = endIpAddress;
        this.ruleName = ruleName;
        this.startIpAddress = startIpAddress;
    }

    private FirewallRuleResponse() {
        this.endIpAddress = null;
        this.ruleName = null;
        this.startIpAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endIpAddress;
        private @Nullable String ruleName;
        private @Nullable String startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.ruleName = defaults.ruleName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder endIpAddress(@Nullable String endIpAddress) {
            this.endIpAddress = endIpAddress;
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder startIpAddress(@Nullable String startIpAddress) {
            this.startIpAddress = startIpAddress;
            return this;
        }
        public FirewallRuleResponse build() {
            return new FirewallRuleResponse(endIpAddress, ruleName, startIpAddress);
        }
    }
}
