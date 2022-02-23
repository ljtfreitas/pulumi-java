// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ReplicationConfigurationReplicationConfigurationRuleDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationConfigurationRuleDestinationArgs Empty = new ReplicationConfigurationReplicationConfigurationRuleDestinationArgs();

    /**
     * A Region to replicate to.
     * 
     */
    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    /**
     * The account ID of the destination registry to replicate to.
     * 
     */
    @InputImport(name="registryId", required=true)
    private final Input<String> registryId;

    public Input<String> getRegistryId() {
        return this.registryId;
    }

    public ReplicationConfigurationReplicationConfigurationRuleDestinationArgs(
        Input<String> region,
        Input<String> registryId) {
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private ReplicationConfigurationReplicationConfigurationRuleDestinationArgs() {
        this.region = Input.empty();
        this.registryId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationConfigurationRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> region;
        private Input<String> registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationConfigurationRuleDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRegistryId(Input<String> registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }

        public Builder setRegistryId(String registryId) {
            this.registryId = Input.of(Objects.requireNonNull(registryId));
            return this;
        }
        public ReplicationConfigurationReplicationConfigurationRuleDestinationArgs build() {
            return new ReplicationConfigurationReplicationConfigurationRuleDestinationArgs(region, registryId);
        }
    }
}
