// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentConfigWebServerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigWebServerConfigArgs Empty = new EnvironmentConfigWebServerConfigArgs();

    @InputImport(name="machineType", required=true)
        private final Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType;
    }

    public EnvironmentConfigWebServerConfigArgs(Input<String> machineType) {
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
    }

    private EnvironmentConfigWebServerConfigArgs() {
        this.machineType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWebServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWebServerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder setMachineType(Input<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Input.of(Objects.requireNonNull(machineType));
            return this;
        }
        public EnvironmentConfigWebServerConfigArgs build() {
            return new EnvironmentConfigWebServerConfigArgs(machineType);
        }
    }
}
