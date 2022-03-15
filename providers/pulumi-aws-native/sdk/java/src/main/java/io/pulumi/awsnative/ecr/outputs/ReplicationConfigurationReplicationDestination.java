// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReplicationConfigurationReplicationDestination {
    private final String region;
    private final String registryId;

    @CustomType.Constructor
    private ReplicationConfigurationReplicationDestination(
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("registryId") String registryId) {
        this.region = region;
        this.registryId = registryId;
    }

    public String getRegion() {
        return this.region;
    }
    public String getRegistryId() {
        return this.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public ReplicationConfigurationReplicationDestination build() {
            return new ReplicationConfigurationReplicationDestination(region, registryId);
        }
    }
}
