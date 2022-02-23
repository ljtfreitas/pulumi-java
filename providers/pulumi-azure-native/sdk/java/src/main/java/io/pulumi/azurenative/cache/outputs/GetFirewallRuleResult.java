// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFirewallRuleResult {
    /**
     * highest IP address included in the range
     * 
     */
    private final String endIP;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * lowest IP address included in the range
     * 
     */
    private final String startIP;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"endIP","id","name","startIP","type"})
    private GetFirewallRuleResult(
        String endIP,
        String id,
        String name,
        String startIP,
        String type) {
        this.endIP = Objects.requireNonNull(endIP);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.startIP = Objects.requireNonNull(startIP);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * highest IP address included in the range
     * 
     */
    public String getEndIP() {
        return this.endIP;
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
    public String getName() {
        return this.name;
    }
    /**
     * lowest IP address included in the range
     * 
     */
    public String getStartIP() {
        return this.startIP;
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

    public static Builder builder(GetFirewallRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endIP;
        private String id;
        private String name;
        private String startIP;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIP = defaults.endIP;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startIP = defaults.startIP;
    	      this.type = defaults.type;
        }

        public Builder setEndIP(String endIP) {
            this.endIP = Objects.requireNonNull(endIP);
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

        public Builder setStartIP(String startIP) {
            this.startIP = Objects.requireNonNull(startIP);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetFirewallRuleResult build() {
            return new GetFirewallRuleResult(endIP, id, name, startIP, type);
        }
    }
}
