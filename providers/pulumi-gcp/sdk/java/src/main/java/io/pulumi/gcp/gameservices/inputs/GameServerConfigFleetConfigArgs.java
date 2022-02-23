// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerConfigFleetConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerConfigFleetConfigArgs Empty = new GameServerConfigFleetConfigArgs();

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
    @InputImport(name="fleetSpec", required=true)
        private final Input<String> fleetSpec;

    public Input<String> getFleetSpec() {
        return this.fleetSpec;
    }

    /**
     * The name of the ScalingConfig
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public GameServerConfigFleetConfigArgs(
        Input<String> fleetSpec,
        @Nullable Input<String> name) {
        this.fleetSpec = Objects.requireNonNull(fleetSpec, "expected parameter 'fleetSpec' to be non-null");
        this.name = name;
    }

    private GameServerConfigFleetConfigArgs() {
        this.fleetSpec = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigFleetConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fleetSpec;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigFleetConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetSpec = defaults.fleetSpec;
    	      this.name = defaults.name;
        }

        public Builder setFleetSpec(Input<String> fleetSpec) {
            this.fleetSpec = Objects.requireNonNull(fleetSpec);
            return this;
        }

        public Builder setFleetSpec(String fleetSpec) {
            this.fleetSpec = Input.of(Objects.requireNonNull(fleetSpec));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public GameServerConfigFleetConfigArgs build() {
            return new GameServerConfigFleetConfigArgs(fleetSpec, name);
        }
    }
}
