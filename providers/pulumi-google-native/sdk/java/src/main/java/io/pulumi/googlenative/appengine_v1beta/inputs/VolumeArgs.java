// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Volumes mounted within the app container. Only applicable in the App Engine flexible environment.
 * 
 */
public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * Unique name for the volume.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Volume size in gigabytes.
     * 
     */
    @InputImport(name="sizeGb")
      private final @Nullable Input<Double> sizeGb;

    public Input<Double> getSizeGb() {
        return this.sizeGb == null ? Input.empty() : this.sizeGb;
    }

    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    @InputImport(name="volumeType")
      private final @Nullable Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType == null ? Input.empty() : this.volumeType;
    }

    public VolumeArgs(
        @Nullable Input<String> name,
        @Nullable Input<Double> sizeGb,
        @Nullable Input<String> volumeType) {
        this.name = name;
        this.sizeGb = sizeGb;
        this.volumeType = volumeType;
    }

    private VolumeArgs() {
        this.name = Input.empty();
        this.sizeGb = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Double> sizeGb;
        private @Nullable Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSizeGb(@Nullable Input<Double> sizeGb) {
            this.sizeGb = sizeGb;
            return this;
        }

        public Builder setSizeGb(@Nullable Double sizeGb) {
            this.sizeGb = Input.ofNullable(sizeGb);
            return this;
        }

        public Builder setVolumeType(@Nullable Input<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = Input.ofNullable(volumeType);
            return this;
        }
        public VolumeArgs build() {
            return new VolumeArgs(name, sizeGb, volumeType);
        }
    }
}
