// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupEbsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupEbsConfigGetArgs Empty = new InstanceGroupEbsConfigGetArgs();

    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    @InputImport(name="iops")
    private final @Nullable Input<Integer> iops;

    public Input<Integer> getIops() {
        return this.iops == null ? Input.empty() : this.iops;
    }

    /**
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
     * 
     */
    @InputImport(name="size", required=true)
    private final Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size;
    }

    /**
     * The volume type. Valid options are 'gp2', 'io1' and 'standard'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The number of EBS Volumes to attach per instance.
     * 
     */
    @InputImport(name="volumesPerInstance")
    private final @Nullable Input<Integer> volumesPerInstance;

    public Input<Integer> getVolumesPerInstance() {
        return this.volumesPerInstance == null ? Input.empty() : this.volumesPerInstance;
    }

    public InstanceGroupEbsConfigGetArgs(
        @Nullable Input<Integer> iops,
        Input<Integer> size,
        Input<String> type,
        @Nullable Input<Integer> volumesPerInstance) {
        this.iops = iops;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.volumesPerInstance = volumesPerInstance;
    }

    private InstanceGroupEbsConfigGetArgs() {
        this.iops = Input.empty();
        this.size = Input.empty();
        this.type = Input.empty();
        this.volumesPerInstance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupEbsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> iops;
        private Input<Integer> size;
        private Input<String> type;
        private @Nullable Input<Integer> volumesPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupEbsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
    	      this.volumesPerInstance = defaults.volumesPerInstance;
        }

        public Builder setIops(@Nullable Input<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = Input.ofNullable(iops);
            return this;
        }

        public Builder setSize(Input<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = Input.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setVolumesPerInstance(@Nullable Input<Integer> volumesPerInstance) {
            this.volumesPerInstance = volumesPerInstance;
            return this;
        }

        public Builder setVolumesPerInstance(@Nullable Integer volumesPerInstance) {
            this.volumesPerInstance = Input.ofNullable(volumesPerInstance);
            return this;
        }
        public InstanceGroupEbsConfigGetArgs build() {
            return new InstanceGroupEbsConfigGetArgs(iops, size, type, volumesPerInstance);
        }
    }
}
