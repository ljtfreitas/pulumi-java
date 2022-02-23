// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.inputs;

import io.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableMagneticStoreWritePropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableMagneticStoreWritePropertiesGetArgs Empty = new TableMagneticStoreWritePropertiesGetArgs();

    /**
     * A flag to enable magnetic store writes.
     * 
     */
    @InputImport(name="enableMagneticStoreWrites")
    private final @Nullable Input<Boolean> enableMagneticStoreWrites;

    public Input<Boolean> getEnableMagneticStoreWrites() {
        return this.enableMagneticStoreWrites == null ? Input.empty() : this.enableMagneticStoreWrites;
    }

    /**
     * The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
     * 
     */
    @InputImport(name="magneticStoreRejectedDataLocation")
    private final @Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation;

    public Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> getMagneticStoreRejectedDataLocation() {
        return this.magneticStoreRejectedDataLocation == null ? Input.empty() : this.magneticStoreRejectedDataLocation;
    }

    public TableMagneticStoreWritePropertiesGetArgs(
        @Nullable Input<Boolean> enableMagneticStoreWrites,
        @Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation) {
        this.enableMagneticStoreWrites = enableMagneticStoreWrites;
        this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
    }

    private TableMagneticStoreWritePropertiesGetArgs() {
        this.enableMagneticStoreWrites = Input.empty();
        this.magneticStoreRejectedDataLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMagneticStoreWritePropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableMagneticStoreWrites;
        private @Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMagneticStoreWritePropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMagneticStoreWrites = defaults.enableMagneticStoreWrites;
    	      this.magneticStoreRejectedDataLocation = defaults.magneticStoreRejectedDataLocation;
        }

        public Builder setEnableMagneticStoreWrites(@Nullable Input<Boolean> enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = enableMagneticStoreWrites;
            return this;
        }

        public Builder setEnableMagneticStoreWrites(@Nullable Boolean enableMagneticStoreWrites) {
            this.enableMagneticStoreWrites = Input.ofNullable(enableMagneticStoreWrites);
            return this;
        }

        public Builder setMagneticStoreRejectedDataLocation(@Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs> magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = magneticStoreRejectedDataLocation;
            return this;
        }

        public Builder setMagneticStoreRejectedDataLocation(@Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs magneticStoreRejectedDataLocation) {
            this.magneticStoreRejectedDataLocation = Input.ofNullable(magneticStoreRejectedDataLocation);
            return this;
        }
        public TableMagneticStoreWritePropertiesGetArgs build() {
            return new TableMagneticStoreWritePropertiesGetArgs(enableMagneticStoreWrites, magneticStoreRejectedDataLocation);
        }
    }
}
