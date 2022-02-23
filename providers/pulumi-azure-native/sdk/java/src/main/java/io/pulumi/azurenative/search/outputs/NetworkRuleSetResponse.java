// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.azurenative.search.outputs.IpRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRuleSetResponse {
    /**
     * A list of IP restriction rules that defines the inbound network(s) with allowing access to the search service endpoint. At the meantime, all other public IP networks are blocked by the firewall. These restriction rules are applied only when the 'publicNetworkAccess' of the search service is 'enabled'; otherwise, traffic over public interface is not allowed even with any public IP rules, and private endpoint connections would be the exclusive access method.
     * 
     */
    private final @Nullable List<IpRuleResponse> ipRules;

    @OutputCustomType.Constructor({"ipRules"})
    private NetworkRuleSetResponse(@Nullable List<IpRuleResponse> ipRules) {
        this.ipRules = ipRules;
    }

    /**
     * A list of IP restriction rules that defines the inbound network(s) with allowing access to the search service endpoint. At the meantime, all other public IP networks are blocked by the firewall. These restriction rules are applied only when the 'publicNetworkAccess' of the search service is 'enabled'; otherwise, traffic over public interface is not allowed even with any public IP rules, and private endpoint connections would be the exclusive access method.
     * 
     */
    public List<IpRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IpRuleResponse> ipRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRules = defaults.ipRules;
        }

        public Builder setIpRules(@Nullable List<IpRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(ipRules);
        }
    }
}
