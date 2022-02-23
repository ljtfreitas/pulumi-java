// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IPRuleResponse {
    /**
     * The action of IP ACL rule.
     * 
     */
    private final @Nullable String action;
    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    private final String iPAddressOrRange;

    @OutputCustomType.Constructor({"action","iPAddressOrRange"})
    private IPRuleResponse(
        @Nullable String action,
        String iPAddressOrRange) {
        this.action = action;
        this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange);
    }

    /**
     * The action of IP ACL rule.
     * 
     */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Specifies the IP or IP range in CIDR format. Only IPV4 address is allowed.
     * 
     */
    public String getIPAddressOrRange() {
        return this.iPAddressOrRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String iPAddressOrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IPRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.iPAddressOrRange = defaults.iPAddressOrRange;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setIPAddressOrRange(String iPAddressOrRange) {
            this.iPAddressOrRange = Objects.requireNonNull(iPAddressOrRange);
            return this;
        }
        public IPRuleResponse build() {
            return new IPRuleResponse(action, iPAddressOrRange);
        }
    }
}
