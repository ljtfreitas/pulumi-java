// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.ClusterConfigurationGetArgs;
import io.pulumi.aws.ecs.inputs.ClusterDefaultCapacityProviderStrategyGetArgs;
import io.pulumi.aws.ecs.inputs.ClusterSettingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * ARN that identifies the cluster.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    @InputImport(name="capacityProviders")
    private final @Nullable Input<List<String>> capacityProviders;

    public Input<List<String>> getCapacityProviders() {
        return this.capacityProviders == null ? Input.empty() : this.capacityProviders;
    }

    /**
     * The execute command configuration for the cluster. Detailed below.
     * 
     */
    @InputImport(name="configuration")
    private final @Nullable Input<ClusterConfigurationGetArgs> configuration;

    public Input<ClusterConfigurationGetArgs> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
     * 
     */
    @InputImport(name="defaultCapacityProviderStrategies")
    private final @Nullable Input<List<ClusterDefaultCapacityProviderStrategyGetArgs>> defaultCapacityProviderStrategies;

    public Input<List<ClusterDefaultCapacityProviderStrategyGetArgs>> getDefaultCapacityProviderStrategies() {
        return this.defaultCapacityProviderStrategies == null ? Input.empty() : this.defaultCapacityProviderStrategies;
    }

    /**
     * Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     * 
     */
    @InputImport(name="settings")
    private final @Nullable Input<List<ClusterSettingGetArgs>> settings;

    public Input<List<ClusterSettingGetArgs>> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ClusterState(
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> capacityProviders,
        @Nullable Input<ClusterConfigurationGetArgs> configuration,
        @Nullable Input<List<ClusterDefaultCapacityProviderStrategyGetArgs>> defaultCapacityProviderStrategies,
        @Nullable Input<String> name,
        @Nullable Input<List<ClusterSettingGetArgs>> settings,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.capacityProviders = capacityProviders;
        this.configuration = configuration;
        this.defaultCapacityProviderStrategies = defaultCapacityProviderStrategies;
        this.name = name;
        this.settings = settings;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ClusterState() {
        this.arn = Input.empty();
        this.capacityProviders = Input.empty();
        this.configuration = Input.empty();
        this.defaultCapacityProviderStrategies = Input.empty();
        this.name = Input.empty();
        this.settings = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> capacityProviders;
        private @Nullable Input<ClusterConfigurationGetArgs> configuration;
        private @Nullable Input<List<ClusterDefaultCapacityProviderStrategyGetArgs>> defaultCapacityProviderStrategies;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ClusterSettingGetArgs>> settings;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.capacityProviders = defaults.capacityProviders;
    	      this.configuration = defaults.configuration;
    	      this.defaultCapacityProviderStrategies = defaults.defaultCapacityProviderStrategies;
    	      this.name = defaults.name;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCapacityProviders(@Nullable Input<List<String>> capacityProviders) {
            this.capacityProviders = capacityProviders;
            return this;
        }

        public Builder setCapacityProviders(@Nullable List<String> capacityProviders) {
            this.capacityProviders = Input.ofNullable(capacityProviders);
            return this;
        }

        public Builder setConfiguration(@Nullable Input<ClusterConfigurationGetArgs> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setConfiguration(@Nullable ClusterConfigurationGetArgs configuration) {
            this.configuration = Input.ofNullable(configuration);
            return this;
        }

        public Builder setDefaultCapacityProviderStrategies(@Nullable Input<List<ClusterDefaultCapacityProviderStrategyGetArgs>> defaultCapacityProviderStrategies) {
            this.defaultCapacityProviderStrategies = defaultCapacityProviderStrategies;
            return this;
        }

        public Builder setDefaultCapacityProviderStrategies(@Nullable List<ClusterDefaultCapacityProviderStrategyGetArgs> defaultCapacityProviderStrategies) {
            this.defaultCapacityProviderStrategies = Input.ofNullable(defaultCapacityProviderStrategies);
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

        public Builder setSettings(@Nullable Input<List<ClusterSettingGetArgs>> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable List<ClusterSettingGetArgs> settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public ClusterState build() {
            return new ClusterState(arn, capacityProviders, configuration, defaultCapacityProviderStrategies, name, settings, tags, tagsAll);
        }
    }
}
