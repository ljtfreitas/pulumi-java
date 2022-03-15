// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIPv6FirewallRuleResult {
    /**
     * The end IP address of the firewall rule. Must be IPv6 format. Must be greater than or equal to startIpAddress.
     * 
     */
    private final @Nullable String endIPv6Address;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * The start IP address of the firewall rule. Must be IPv6 format.
     * 
     */
    private final @Nullable String startIPv6Address;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIPv6FirewallRuleResult(
        @CustomType.Parameter("endIPv6Address") @Nullable String endIPv6Address,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("startIPv6Address") @Nullable String startIPv6Address,
        @CustomType.Parameter("type") String type) {
        this.endIPv6Address = endIPv6Address;
        this.id = id;
        this.name = name;
        this.startIPv6Address = startIPv6Address;
        this.type = type;
    }

    /**
     * The end IP address of the firewall rule. Must be IPv6 format. Must be greater than or equal to startIpAddress.
     * 
    */
    public Optional<String> getEndIPv6Address() {
        return Optional.ofNullable(this.endIPv6Address);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The start IP address of the firewall rule. Must be IPv6 format.
     * 
    */
    public Optional<String> getStartIPv6Address() {
        return Optional.ofNullable(this.startIPv6Address);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPv6FirewallRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endIPv6Address;
        private String id;
        private @Nullable String name;
        private @Nullable String startIPv6Address;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPv6FirewallRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIPv6Address = defaults.endIPv6Address;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startIPv6Address = defaults.startIPv6Address;
    	      this.type = defaults.type;
        }

        public Builder endIPv6Address(@Nullable String endIPv6Address) {
            this.endIPv6Address = endIPv6Address;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder startIPv6Address(@Nullable String startIPv6Address) {
            this.startIPv6Address = startIPv6Address;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetIPv6FirewallRuleResult build() {
            return new GetIPv6FirewallRuleResult(endIPv6Address, id, name, startIPv6Address, type);
        }
    }
}
