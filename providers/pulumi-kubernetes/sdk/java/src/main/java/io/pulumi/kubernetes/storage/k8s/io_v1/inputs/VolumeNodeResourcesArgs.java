// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeNodeResources is a set of resource limits for scheduling of volumes.
 * 
 */
public final class VolumeNodeResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeNodeResourcesArgs Empty = new VolumeNodeResourcesArgs();

    /**
     * Maximum number of unique volumes managed by the CSI driver that can be used on a node. A volume that is both attached and mounted on a node is considered to be used once, not twice. The same rule applies for a unique volume that is shared among multiple pods on the same node. If this field is not specified, then the supported number of volumes on this node is unbounded.
     * 
     */
    @InputImport(name="count")
        private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    public VolumeNodeResourcesArgs(@Nullable Input<Integer> count) {
        this.count = count;
    }

    private VolumeNodeResourcesArgs() {
        this.count = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeNodeResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeNodeResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }
        public VolumeNodeResourcesArgs build() {
            return new VolumeNodeResourcesArgs(count);
        }
    }
}
