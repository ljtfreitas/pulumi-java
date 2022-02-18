// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallRuleResponse {
    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    private final String endIpAddress;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    private final String startIpAddress;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"endIpAddress","id","name","startIpAddress","type"})
    private FirewallRuleResponse(
        String endIpAddress,
        String id,
        String name,
        String startIpAddress,
        String type) {
        this.endIpAddress = Objects.requireNonNull(endIpAddress);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.startIpAddress = Objects.requireNonNull(startIpAddress);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    public String getEndIpAddress() {
        return this.endIpAddress;
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    public String getStartIpAddress() {
        return this.startIpAddress;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endIpAddress;
        private String id;
        private String name;
        private String startIpAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startIpAddress = defaults.startIpAddress;
    	      this.type = defaults.type;
        }

        public Builder setEndIpAddress(String endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStartIpAddress(String startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public FirewallRuleResponse build() {
            return new FirewallRuleResponse(endIpAddress, id, name, startIpAddress, type);
        }
    }
}
