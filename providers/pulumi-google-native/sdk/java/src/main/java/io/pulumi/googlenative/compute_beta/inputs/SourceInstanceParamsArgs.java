// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.DiskInstantiationConfigArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A specification of the parameters to use when creating the instance template from a source instance.
 * 
 */
public final class SourceInstanceParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceInstanceParamsArgs Empty = new SourceInstanceParamsArgs();

    /**
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * 
     */
    @InputImport(name="diskConfigs")
      private final @Nullable Input<List<DiskInstantiationConfigArgs>> diskConfigs;

    public Input<List<DiskInstantiationConfigArgs>> getDiskConfigs() {
        return this.diskConfigs == null ? Input.empty() : this.diskConfigs;
    }

    public SourceInstanceParamsArgs(@Nullable Input<List<DiskInstantiationConfigArgs>> diskConfigs) {
        this.diskConfigs = diskConfigs;
    }

    private SourceInstanceParamsArgs() {
        this.diskConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceInstanceParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DiskInstantiationConfigArgs>> diskConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceInstanceParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfigs = defaults.diskConfigs;
        }

        public Builder setDiskConfigs(@Nullable Input<List<DiskInstantiationConfigArgs>> diskConfigs) {
            this.diskConfigs = diskConfigs;
            return this;
        }

        public Builder setDiskConfigs(@Nullable List<DiskInstantiationConfigArgs> diskConfigs) {
            this.diskConfigs = Input.ofNullable(diskConfigs);
            return this;
        }
        public SourceInstanceParamsArgs build() {
            return new SourceInstanceParamsArgs(diskConfigs);
        }
    }
}
