// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.inputs.MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that determine whether magnetic store writes are enabled.
 * 
 */
public final class MagneticStoreWritePropertiesProperties extends io.pulumi.resources.InvokeArgs {

    public static final MagneticStoreWritePropertiesProperties Empty = new MagneticStoreWritePropertiesProperties();

    /**
     * Boolean flag indicating whether magnetic store writes are enabled.
     * 
     */
    @InputImport(name="enableMagneticStoreWrites", required=true)
        private final Boolean enableMagneticStoreWrites;

    public Boolean getEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites;
    }

    /**
     * Location to store information about records that were asynchronously rejected during magnetic store writes.
     * 
     */
    @InputImport(name="magneticStoreRejectedDataLocation")
        private final @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation;

    public Optional<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties> getMagneticStoreRejectedDataLocation() {
        return this.magneticStoreRejectedDataLocation == null ? Optional.empty() : Optional.ofNullable(this.magneticStoreRejectedDataLocation);
    }

    public MagneticStoreWritePropertiesProperties(
        Boolean enableMagneticStoreWrites,
        @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation) {
        this.enableMagneticStoreWrites = Objects.requireNonNull(enableMagneticStoreWrites, "expected parameter 'enableMagneticStoreWrites' to be non-null");
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    private MagneticStoreWritePropertiesProperties() {
        this.enableMagneticStoreWrites = null;
        this.magneticStoreRejectedDataLocation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableMagneticStoreWrites;
        private @Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMagneticStoreWrites = defaults.enableMagneticStoreWrites;
    	      this.magneticStoreRejectedDataLocation = defaults.magneticStoreRejectedDataLocation;
        }

        public Builder setEnableMagneticStoreWrites(Boolean enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = Objects.requireNonNull(enableMagneticStoreWrites);
            return this;
        }

        public Builder setMagneticStoreRejectedDataLocation(@Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationProperties magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }
        public MagneticStoreWritePropertiesProperties build() {
            return new MagneticStoreWritePropertiesProperties(enableMagneticStoreWrites, magneticStoreRejectedDataLocation);
        }
    }
}
