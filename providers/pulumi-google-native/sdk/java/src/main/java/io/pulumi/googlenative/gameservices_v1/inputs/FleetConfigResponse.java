// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Fleet configs for Agones.
 * 
 */
public final class FleetConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final FleetConfigResponse Empty = new FleetConfigResponse();

    /**
     * Agones fleet spec. Example spec: `https://agones.dev/site/docs/reference/fleet/`.
     * 
     */
    @InputImport(name="fleetSpec", required=true)
      private final String fleetSpec;

    public String getFleetSpec() {
        return this.fleetSpec;
    }

    /**
     * The name of the FleetConfig.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public FleetConfigResponse(
        String fleetSpec,
        String name) {
        this.fleetSpec = Objects.requireNonNull(fleetSpec, "expected parameter 'fleetSpec' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private FleetConfigResponse() {
        this.fleetSpec = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetSpec;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetSpec = defaults.fleetSpec;
    	      this.name = defaults.name;
        }

        public Builder setFleetSpec(String fleetSpec) {
            this.fleetSpec = Objects.requireNonNull(fleetSpec);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public FleetConfigResponse build() {
            return new FleetConfigResponse(fleetSpec, name);
        }
    }
}
