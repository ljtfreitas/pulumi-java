// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FleetConfigResponse {
    /**
     * @return Agones fleet spec (see [example spec](https://agones.dev/site/docs/reference/fleet/)).
     * 
     */
    private final String fleetSpec;
    /**
     * @return The name of the FleetConfig.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private FleetConfigResponse(
        @CustomType.Parameter("fleetSpec") String fleetSpec,
        @CustomType.Parameter("name") String name) {
        this.fleetSpec = fleetSpec;
        this.name = name;
    }

    /**
     * @return Agones fleet spec (see [example spec](https://agones.dev/site/docs/reference/fleet/)).
     * 
     */
    public String fleetSpec() {
        return this.fleetSpec;
    }
    /**
     * @return The name of the FleetConfig.
     * 
     */
    public String name() {
        return this.name;
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

        public Builder fleetSpec(String fleetSpec) {
            this.fleetSpec = Objects.requireNonNull(fleetSpec);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public FleetConfigResponse build() {
            return new FleetConfigResponse(fleetSpec, name);
        }
    }
}
