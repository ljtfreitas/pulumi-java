// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentConfigDatabaseConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigDatabaseConfig Empty = new GetEnvironmentConfigDatabaseConfig();

    @Import(name="machineType", required=true)
      private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    public GetEnvironmentConfigDatabaseConfig(String machineType) {
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
    }

    private GetEnvironmentConfigDatabaseConfig() {
        this.machineType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigDatabaseConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigDatabaseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public GetEnvironmentConfigDatabaseConfig build() {
            return new GetEnvironmentConfigDatabaseConfig(machineType);
        }
    }
}
