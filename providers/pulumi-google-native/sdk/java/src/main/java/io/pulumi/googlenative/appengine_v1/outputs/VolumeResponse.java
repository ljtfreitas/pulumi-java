// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeResponse {
    /**
     * Unique name for the volume.
     * 
     */
    private final String name;
    /**
     * Volume size in gigabytes.
     * 
     */
    private final Double sizeGb;
    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    private final String volumeType;

    @CustomType.Constructor
    private VolumeResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sizeGb") Double sizeGb,
        @CustomType.Parameter("volumeType") String volumeType) {
        this.name = name;
        this.sizeGb = sizeGb;
        this.volumeType = volumeType;
    }

    /**
     * Unique name for the volume.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Volume size in gigabytes.
     * 
    */
    public Double getSizeGb() {
        return this.sizeGb;
    }
    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
    */
    public String getVolumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double sizeGb;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder sizeGb(Double sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public VolumeResponse build() {
            return new VolumeResponse(name, sizeGb, volumeType);
        }
    }
}
