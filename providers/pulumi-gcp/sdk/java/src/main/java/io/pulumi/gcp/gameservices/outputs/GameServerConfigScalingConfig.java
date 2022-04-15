// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.gameservices.outputs.GameServerConfigScalingConfigSchedule;
import io.pulumi.gcp.gameservices.outputs.GameServerConfigScalingConfigSelector;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GameServerConfigScalingConfig {
    /**
     * Fleet autoscaler spec, which is sent to Agones.
     * Example spec can be found :
     * https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    private final String fleetAutoscalerSpec;
    /**
     * The name of the ScalingConfig
     * 
     */
    private final String name;
    /**
     * The schedules to which this scaling config applies.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<GameServerConfigScalingConfigSchedule> schedules;
    /**
     * Labels used to identify the clusters to which this scaling config
     * applies. A cluster is subject to this scaling config if its labels match
     * any of the selector entries.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<GameServerConfigScalingConfigSelector> selectors;

    @CustomType.Constructor
    private GameServerConfigScalingConfig(
        @CustomType.Parameter("fleetAutoscalerSpec") String fleetAutoscalerSpec,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schedules") @Nullable List<GameServerConfigScalingConfigSchedule> schedules,
        @CustomType.Parameter("selectors") @Nullable List<GameServerConfigScalingConfigSelector> selectors) {
        this.fleetAutoscalerSpec = fleetAutoscalerSpec;
        this.name = name;
        this.schedules = schedules;
        this.selectors = selectors;
    }

    /**
     * Fleet autoscaler spec, which is sent to Agones.
     * Example spec can be found :
     * https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
    */
    public String fleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }
    /**
     * The name of the ScalingConfig
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The schedules to which this scaling config applies.
     * Structure is documented below.
     * 
    */
    public List<GameServerConfigScalingConfigSchedule> schedules() {
        return this.schedules == null ? List.of() : this.schedules;
    }
    /**
     * Labels used to identify the clusters to which this scaling config
     * applies. A cluster is subject to this scaling config if its labels match
     * any of the selector entries.
     * Structure is documented below.
     * 
    */
    public List<GameServerConfigScalingConfigSelector> selectors() {
        return this.selectors == null ? List.of() : this.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigScalingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fleetAutoscalerSpec;
        private String name;
        private @Nullable List<GameServerConfigScalingConfigSchedule> schedules;
        private @Nullable List<GameServerConfigScalingConfigSelector> selectors;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigScalingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetAutoscalerSpec = defaults.fleetAutoscalerSpec;
    	      this.name = defaults.name;
    	      this.schedules = defaults.schedules;
    	      this.selectors = defaults.selectors;
        }

        public Builder fleetAutoscalerSpec(String fleetAutoscalerSpec) {
            this.fleetAutoscalerSpec = Objects.requireNonNull(fleetAutoscalerSpec);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schedules(@Nullable List<GameServerConfigScalingConfigSchedule> schedules) {
            this.schedules = schedules;
            return this;
        }
        public Builder schedules(GameServerConfigScalingConfigSchedule... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder selectors(@Nullable List<GameServerConfigScalingConfigSelector> selectors) {
            this.selectors = selectors;
            return this;
        }
        public Builder selectors(GameServerConfigScalingConfigSelector... selectors) {
            return selectors(List.of(selectors));
        }        public GameServerConfigScalingConfig build() {
            return new GameServerConfigScalingConfig(fleetAutoscalerSpec, name, schedules, selectors);
        }
    }
}
