// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TaskDefinitionInferenceAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionInferenceAcceleratorGetArgs Empty = new TaskDefinitionInferenceAcceleratorGetArgs();

    /**
     * Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Elastic Inference accelerator type to use.
     * 
     */
    @InputImport(name="deviceType", required=true)
    private final Input<String> deviceType;

    public Input<String> getDeviceType() {
        return this.deviceType;
    }

    public TaskDefinitionInferenceAcceleratorGetArgs(
        Input<String> deviceName,
        Input<String> deviceType) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.deviceType = Objects.requireNonNull(deviceType, "expected parameter 'deviceType' to be non-null");
    }

    private TaskDefinitionInferenceAcceleratorGetArgs() {
        this.deviceName = Input.empty();
        this.deviceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionInferenceAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private Input<String> deviceType;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionInferenceAcceleratorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.deviceType = defaults.deviceType;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setDeviceType(Input<String> deviceType) {
            this.deviceType = Objects.requireNonNull(deviceType);
            return this;
        }

        public Builder setDeviceType(String deviceType) {
            this.deviceType = Input.of(Objects.requireNonNull(deviceType));
            return this;
        }
        public TaskDefinitionInferenceAcceleratorGetArgs build() {
            return new TaskDefinitionInferenceAcceleratorGetArgs(deviceName, deviceType);
        }
    }
}
