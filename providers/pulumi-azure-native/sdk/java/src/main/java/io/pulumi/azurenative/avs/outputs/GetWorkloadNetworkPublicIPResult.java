// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkloadNetworkPublicIPResult {
    /**
     * Display name of the Public IP Block.
     * 
     */
    private final @Nullable String displayName;
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
     * Number of Public IPs requested.
     * 
     */
    private final @Nullable Double numberOfPublicIPs;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * CIDR Block of the Public IP Block.
     * 
     */
    private final String publicIPBlock;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"displayName","id","name","numberOfPublicIPs","provisioningState","publicIPBlock","type"})
    private GetWorkloadNetworkPublicIPResult(
        @Nullable String displayName,
        String id,
        String name,
        @Nullable Double numberOfPublicIPs,
        String provisioningState,
        String publicIPBlock,
        String type) {
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.numberOfPublicIPs = numberOfPublicIPs;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPBlock = Objects.requireNonNull(publicIPBlock);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Display name of the Public IP Block.
     * 
     */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
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
     * Number of Public IPs requested.
     * 
     */
    public Optional<Double> getNumberOfPublicIPs() {
        return Optional.ofNullable(this.numberOfPublicIPs);
    }
    /**
     * The provisioning state
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * CIDR Block of the Public IP Block.
     * 
     */
    public String getPublicIPBlock() {
        return this.publicIPBlock;
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

    public static Builder builder(GetWorkloadNetworkPublicIPResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private String name;
        private @Nullable Double numberOfPublicIPs;
        private String provisioningState;
        private String publicIPBlock;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkPublicIPResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.numberOfPublicIPs = defaults.numberOfPublicIPs;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPBlock = defaults.publicIPBlock;
    	      this.type = defaults.type;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
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

        public Builder setNumberOfPublicIPs(@Nullable Double numberOfPublicIPs) {
            this.numberOfPublicIPs = numberOfPublicIPs;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPBlock(String publicIPBlock) {
            this.publicIPBlock = Objects.requireNonNull(publicIPBlock);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadNetworkPublicIPResult build() {
            return new GetWorkloadNetworkPublicIPResult(displayName, id, name, numberOfPublicIPs, provisioningState, publicIPBlock, type);
        }
    }
}
