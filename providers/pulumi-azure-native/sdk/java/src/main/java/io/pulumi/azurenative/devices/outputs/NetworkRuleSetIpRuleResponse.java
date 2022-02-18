// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRuleSetIpRuleResponse {
    /**
     * IP Filter Action
     * 
     */
    private final @Nullable String action;
    /**
     * Name of the IP filter rule.
     * 
     */
    private final String filterName;
    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    private final String ipMask;

    @OutputCustomType.Constructor({"action","filterName","ipMask"})
    private NetworkRuleSetIpRuleResponse(
        @Nullable String action,
        String filterName,
        String ipMask) {
        this.action = action;
        this.filterName = Objects.requireNonNull(filterName);
        this.ipMask = Objects.requireNonNull(ipMask);
    }

    /**
     * IP Filter Action
     * 
     */
    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * Name of the IP filter rule.
     * 
     */
    public String getFilterName() {
        return this.filterName;
    }
    /**
     * A string that contains the IP address range in CIDR notation for the rule.
     * 
     */
    public String getIpMask() {
        return this.ipMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetIpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private String filterName;
        private String ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetIpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.filterName = defaults.filterName;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setFilterName(String filterName) {
            this.filterName = Objects.requireNonNull(filterName);
            return this;
        }

        public Builder setIpMask(String ipMask) {
            this.ipMask = Objects.requireNonNull(ipMask);
            return this;
        }

        public NetworkRuleSetIpRuleResponse build() {
            return new NetworkRuleSetIpRuleResponse(action, filterName, ipMask);
        }
    }
}
