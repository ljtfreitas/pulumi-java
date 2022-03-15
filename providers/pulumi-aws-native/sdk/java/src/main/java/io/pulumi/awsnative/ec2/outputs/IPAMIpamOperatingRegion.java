// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IPAMIpamOperatingRegion {
    /**
     * The name of the region.
     * 
     */
    private final String regionName;

    @CustomType.Constructor
    private IPAMIpamOperatingRegion(@CustomType.Parameter("regionName") String regionName) {
        this.regionName = regionName;
    }

    /**
     * The name of the region.
     * 
    */
    public String getRegionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMIpamOperatingRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMIpamOperatingRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionName = defaults.regionName;
        }

        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }
        public IPAMIpamOperatingRegion build() {
            return new IPAMIpamOperatingRegion(regionName);
        }
    }
}
