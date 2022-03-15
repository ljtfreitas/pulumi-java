// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvironmentConfigDatabaseConfig {
    private final String machineType;

    @CustomType.Constructor
    private EnvironmentConfigDatabaseConfig(@CustomType.Parameter("machineType") String machineType) {
        this.machineType = machineType;
    }

    public String getMachineType() {
        return this.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigDatabaseConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigDatabaseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public EnvironmentConfigDatabaseConfig build() {
            return new EnvironmentConfigDatabaseConfig(machineType);
        }
    }
}
