// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the horizontal auto scaling mechanism that adds or removes replicas (containers or container groups).
 * 
 */
public final class AddRemoveReplicaScalingMechanismArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddRemoveReplicaScalingMechanismArgs Empty = new AddRemoveReplicaScalingMechanismArgs();

    /**
     * Enumerates the mechanisms for auto scaling.
     * Expected value is 'AddRemoveReplica'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Maximum number of containers (scale up won't be performed above this number).
     * 
     */
    @InputImport(name="maxCount", required=true)
    private final Input<Integer> maxCount;

    public Input<Integer> getMaxCount() {
        return this.maxCount;
    }

    /**
     * Minimum number of containers (scale down won't be performed below this number).
     * 
     */
    @InputImport(name="minCount", required=true)
    private final Input<Integer> minCount;

    public Input<Integer> getMinCount() {
        return this.minCount;
    }

    /**
     * Each time auto scaling is performed, this number of containers will be added or removed.
     * 
     */
    @InputImport(name="scaleIncrement", required=true)
    private final Input<Integer> scaleIncrement;

    public Input<Integer> getScaleIncrement() {
        return this.scaleIncrement;
    }

    public AddRemoveReplicaScalingMechanismArgs(
        Input<String> kind,
        Input<Integer> maxCount,
        Input<Integer> minCount,
        Input<Integer> scaleIncrement) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.maxCount = Objects.requireNonNull(maxCount, "expected parameter 'maxCount' to be non-null");
        this.minCount = Objects.requireNonNull(minCount, "expected parameter 'minCount' to be non-null");
        this.scaleIncrement = Objects.requireNonNull(scaleIncrement, "expected parameter 'scaleIncrement' to be non-null");
    }

    private AddRemoveReplicaScalingMechanismArgs() {
        this.kind = Input.empty();
        this.maxCount = Input.empty();
        this.minCount = Input.empty();
        this.scaleIncrement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddRemoveReplicaScalingMechanismArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kind;
        private Input<Integer> maxCount;
        private Input<Integer> minCount;
        private Input<Integer> scaleIncrement;

        public Builder() {
    	      // Empty
        }

        public Builder(AddRemoveReplicaScalingMechanismArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.maxCount = defaults.maxCount;
    	      this.minCount = defaults.minCount;
    	      this.scaleIncrement = defaults.scaleIncrement;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setMaxCount(Input<Integer> maxCount) {
            this.maxCount = Objects.requireNonNull(maxCount);
            return this;
        }

        public Builder setMaxCount(Integer maxCount) {
            this.maxCount = Input.of(Objects.requireNonNull(maxCount));
            return this;
        }

        public Builder setMinCount(Input<Integer> minCount) {
            this.minCount = Objects.requireNonNull(minCount);
            return this;
        }

        public Builder setMinCount(Integer minCount) {
            this.minCount = Input.of(Objects.requireNonNull(minCount));
            return this;
        }

        public Builder setScaleIncrement(Input<Integer> scaleIncrement) {
            this.scaleIncrement = Objects.requireNonNull(scaleIncrement);
            return this;
        }

        public Builder setScaleIncrement(Integer scaleIncrement) {
            this.scaleIncrement = Input.of(Objects.requireNonNull(scaleIncrement));
            return this;
        }

        public AddRemoveReplicaScalingMechanismArgs build() {
            return new AddRemoveReplicaScalingMechanismArgs(kind, maxCount, minCount, scaleIncrement);
        }
    }
}
