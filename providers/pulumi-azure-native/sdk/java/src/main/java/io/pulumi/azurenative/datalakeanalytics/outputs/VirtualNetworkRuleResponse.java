// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNetworkRuleResponse {
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
     * The resource identifier for the subnet
     * 
     */
    private final String subnetId;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * The current state of the VirtualNetwork Rule
     * 
     */
    private final String virtualNetworkRuleState;

    @OutputCustomType.Constructor({"id","name","subnetId","type","virtualNetworkRuleState"})
    private VirtualNetworkRuleResponse(
        String id,
        String name,
        String subnetId,
        String type,
        String virtualNetworkRuleState) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.subnetId = Objects.requireNonNull(subnetId);
        this.type = Objects.requireNonNull(type);
        this.virtualNetworkRuleState = Objects.requireNonNull(virtualNetworkRuleState);
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
     * The resource identifier for the subnet
     * 
     */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The current state of the VirtualNetwork Rule
     * 
     */
    public String getVirtualNetworkRuleState() {
        return this.virtualNetworkRuleState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String subnetId;
        private String type;
        private String virtualNetworkRuleState;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subnetId = defaults.subnetId;
    	      this.type = defaults.type;
    	      this.virtualNetworkRuleState = defaults.virtualNetworkRuleState;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetworkRuleState(String virtualNetworkRuleState) {
            this.virtualNetworkRuleState = Objects.requireNonNull(virtualNetworkRuleState);
            return this;
        }
        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(id, name, subnetId, type, virtualNetworkRuleState);
        }
    }
}
