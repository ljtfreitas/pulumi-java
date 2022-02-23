// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class TaskDefinitionEphemeralStorageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionEphemeralStorageGetArgs Empty = new TaskDefinitionEphemeralStorageGetArgs();

    /**
     * The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
     * 
     */
    @InputImport(name="sizeInGib", required=true)
    private final Input<Integer> sizeInGib;

    public Input<Integer> getSizeInGib() {
        return this.sizeInGib;
    }

    public TaskDefinitionEphemeralStorageGetArgs(Input<Integer> sizeInGib) {
        this.sizeInGib = Objects.requireNonNull(sizeInGib, "expected parameter 'sizeInGib' to be non-null");
    }

    private TaskDefinitionEphemeralStorageGetArgs() {
        this.sizeInGib = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionEphemeralStorageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> sizeInGib;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionEphemeralStorageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizeInGib = defaults.sizeInGib;
        }

        public Builder setSizeInGib(Input<Integer> sizeInGib) {
            this.sizeInGib = Objects.requireNonNull(sizeInGib);
            return this;
        }

        public Builder setSizeInGib(Integer sizeInGib) {
            this.sizeInGib = Input.of(Objects.requireNonNull(sizeInGib));
            return this;
        }
        public TaskDefinitionEphemeralStorageGetArgs build() {
            return new TaskDefinitionEphemeralStorageGetArgs(sizeInGib);
        }
    }
}
