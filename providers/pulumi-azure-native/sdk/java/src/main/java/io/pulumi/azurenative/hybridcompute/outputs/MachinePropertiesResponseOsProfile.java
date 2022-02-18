// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MachinePropertiesResponseOsProfile {
    /**
     * Specifies the host OS name of the hybrid machine.
     * 
     */
    private final String computerName;

    @OutputCustomType.Constructor({"computerName"})
    private MachinePropertiesResponseOsProfile(String computerName) {
        this.computerName = Objects.requireNonNull(computerName);
    }

    /**
     * Specifies the host OS name of the hybrid machine.
     * 
     */
    public String getComputerName() {
        return this.computerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachinePropertiesResponseOsProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String computerName;

        public Builder() {
    	      // Empty
        }

        public Builder(MachinePropertiesResponseOsProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computerName = defaults.computerName;
        }

        public Builder setComputerName(String computerName) {
            this.computerName = Objects.requireNonNull(computerName);
            return this;
        }

        public MachinePropertiesResponseOsProfile build() {
            return new MachinePropertiesResponseOsProfile(computerName);
        }
    }
}
