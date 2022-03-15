// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DiffDiskOptions;
import io.pulumi.azurenative.compute.enums.DiffDiskPlacement;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the parameters of ephemeral disk settings that can be specified for operating system disk. <br><br> NOTE: The ephemeral disk settings can only be specified for managed disk.
 * 
 */
public final class DiffDiskSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiffDiskSettingsArgs Empty = new DiffDiskSettingsArgs();

    /**
     * Specifies the ephemeral disk settings for operating system disk.
     * 
     */
    @Import(name="option")
      private final @Nullable Output<Either<String,DiffDiskOptions>> option;

    public Output<Either<String,DiffDiskOptions>> getOption() {
        return this.option == null ? Output.empty() : this.option;
    }

    /**
     * Specifies the ephemeral disk placement for operating system disk.<br><br> Possible values are: <br><br> **CacheDisk** <br><br> **ResourceDisk** <br><br> Default: **CacheDisk** if one is configured for the VM size otherwise **ResourceDisk** is used.<br><br> Refer to VM size documentation for Windows VM at https://docs.microsoft.com/azure/virtual-machines/windows/sizes and Linux VM at https://docs.microsoft.com/azure/virtual-machines/linux/sizes to check which VM sizes exposes a cache disk.
     * 
     */
    @Import(name="placement")
      private final @Nullable Output<Either<String,DiffDiskPlacement>> placement;

    public Output<Either<String,DiffDiskPlacement>> getPlacement() {
        return this.placement == null ? Output.empty() : this.placement;
    }

    public DiffDiskSettingsArgs(
        @Nullable Output<Either<String,DiffDiskOptions>> option,
        @Nullable Output<Either<String,DiffDiskPlacement>> placement) {
        this.option = option;
        this.placement = placement;
    }

    private DiffDiskSettingsArgs() {
        this.option = Output.empty();
        this.placement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiffDiskSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,DiffDiskOptions>> option;
        private @Nullable Output<Either<String,DiffDiskPlacement>> placement;

        public Builder() {
    	      // Empty
        }

        public Builder(DiffDiskSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.option = defaults.option;
    	      this.placement = defaults.placement;
        }

        public Builder option(@Nullable Output<Either<String,DiffDiskOptions>> option) {
            this.option = option;
            return this;
        }

        public Builder option(@Nullable Either<String,DiffDiskOptions> option) {
            this.option = Output.ofNullable(option);
            return this;
        }

        public Builder placement(@Nullable Output<Either<String,DiffDiskPlacement>> placement) {
            this.placement = placement;
            return this;
        }

        public Builder placement(@Nullable Either<String,DiffDiskPlacement> placement) {
            this.placement = Output.ofNullable(placement);
            return this;
        }
        public DiffDiskSettingsArgs build() {
            return new DiffDiskSettingsArgs(option, placement);
        }
    }
}
