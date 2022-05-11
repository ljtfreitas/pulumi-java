// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSharedImageVersionTargetRegion {
    /**
     * @return The name of the Image Version.
     * 
     */
    private final String name;
    /**
     * @return The number of replicas of the Image Version to be created per region.
     * 
     */
    private final Integer regionalReplicaCount;
    /**
     * @return The storage account type for the image version.
     * 
     */
    private final String storageAccountType;

    @CustomType.Constructor
    private GetSharedImageVersionTargetRegion(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("regionalReplicaCount") Integer regionalReplicaCount,
        @CustomType.Parameter("storageAccountType") String storageAccountType) {
        this.name = name;
        this.regionalReplicaCount = regionalReplicaCount;
        this.storageAccountType = storageAccountType;
    }

    /**
     * @return The name of the Image Version.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The number of replicas of the Image Version to be created per region.
     * 
     */
    public Integer regionalReplicaCount() {
        return this.regionalReplicaCount;
    }
    /**
     * @return The storage account type for the image version.
     * 
     */
    public String storageAccountType() {
        return this.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedImageVersionTargetRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer regionalReplicaCount;
        private String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSharedImageVersionTargetRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regionalReplicaCount = defaults.regionalReplicaCount;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder regionalReplicaCount(Integer regionalReplicaCount) {
            this.regionalReplicaCount = Objects.requireNonNull(regionalReplicaCount);
            return this;
        }
        public Builder storageAccountType(String storageAccountType) {
            this.storageAccountType = Objects.requireNonNull(storageAccountType);
            return this;
        }        public GetSharedImageVersionTargetRegion build() {
            return new GetSharedImageVersionTargetRegion(name, regionalReplicaCount, storageAccountType);
        }
    }
}
