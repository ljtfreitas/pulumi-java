// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GameServerConfigFleetConfig {
    /**
     * The fleet spec, which is sent to Agones to configure fleet.
     * The spec can be passed as inline json but it is recommended to use a file reference
     * instead. File references can contain the json or yaml format of the fleet spec. Eg:
     * * fleet_spec = jsonencode(yamldecode(file("fleet_configs.yaml")))
     * * fleet_spec = file("fleet_configs.json")
     *   The format of the spec can be found :
     *   `https://agones.dev/site/docs/reference/fleet/`.
     * 
     */
    private final String fleetSpec;
    /**
     * The name of the ScalingConfig
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private GameServerConfigFleetConfig(
        @CustomType.Parameter("fleetSpec") String fleetSpec,
        @CustomType.Parameter("name") @Nullable String name) {
        this.fleetSpec = fleetSpec;
        this.name = name;
    }

    /**
     * The fleet spec, which is sent to Agones to configure fleet.
     * The spec can be passed as inline json but it is recommended to use a file reference
     * instead. File references can contain the json or yaml format of the fleet spec. Eg:
     * * fleet_spec = jsonencode(yamldecode(file("fleet_configs.yaml")))
     * * fleet_spec = file("fleet_configs.json")
     *   The format of the spec can be found :
     *   `https://agones.dev/site/docs/reference/fleet/`.
     * 
    */
    public String getFleetSpec() {
        return this.fleetSpec;
    }
    /**
     * The name of the ScalingConfig
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigFleetConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetSpec;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigFleetConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetSpec = defaults.fleetSpec;
    	      this.name = defaults.name;
        }

        public Builder fleetSpec(String fleetSpec) {
            this.fleetSpec = Objects.requireNonNull(fleetSpec);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public GameServerConfigFleetConfig build() {
            return new GameServerConfigFleetConfig(fleetSpec, name);
        }
    }
}
