// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gameservices_v1beta.outputs.FleetConfigResponse;
import io.pulumi.googlenative.gameservices_v1beta.outputs.ScalingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetConfigResult {
    /**
     * The creation time.
     * 
     */
    private final String createTime;
    /**
     * The description of the game server config.
     * 
     */
    private final String description;
    /**
     * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    private final List<FleetConfigResponse> fleetConfigs;
    /**
     * The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    private final String name;
    /**
     * The autoscaling settings.
     * 
     */
    private final List<ScalingConfigResponse> scalingConfigs;
    /**
     * The last-modified time.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","description","fleetConfigs","labels","name","scalingConfigs","updateTime"})
    private GetConfigResult(
        String createTime,
        String description,
        List<FleetConfigResponse> fleetConfigs,
        Map<String,String> labels,
        String name,
        List<ScalingConfigResponse> scalingConfigs,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.fleetConfigs = Objects.requireNonNull(fleetConfigs);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.scalingConfigs = Objects.requireNonNull(scalingConfigs);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The creation time.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the game server config.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    public List<FleetConfigResponse> getFleetConfigs() {
        return this.fleetConfigs;
    }
    /**
     * The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The autoscaling settings.
     * 
     */
    public List<ScalingConfigResponse> getScalingConfigs() {
        return this.scalingConfigs;
    }
    /**
     * The last-modified time.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private List<FleetConfigResponse> fleetConfigs;
        private Map<String,String> labels;
        private String name;
        private List<ScalingConfigResponse> scalingConfigs;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.fleetConfigs = defaults.fleetConfigs;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.scalingConfigs = defaults.scalingConfigs;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFleetConfigs(List<FleetConfigResponse> fleetConfigs) {
            this.fleetConfigs = Objects.requireNonNull(fleetConfigs);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScalingConfigs(List<ScalingConfigResponse> scalingConfigs) {
            this.scalingConfigs = Objects.requireNonNull(scalingConfigs);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetConfigResult build() {
            return new GetConfigResult(createTime, description, fleetConfigs, labels, name, scalingConfigs, updateTime);
        }
    }
}
