// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.FirewallAllowArgs;
import io.pulumi.gcp.compute.inputs.FirewallDenyArgs;
import io.pulumi.gcp.compute.inputs.FirewallLogConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallArgs Empty = new FirewallArgs();

    @InputImport(name="allows")
    private final @Nullable Input<List<FirewallAllowArgs>> allows;

    public Input<List<FirewallAllowArgs>> getAllows() {
        return this.allows == null ? Input.empty() : this.allows;
    }

    @InputImport(name="denies")
    private final @Nullable Input<List<FirewallDenyArgs>> denies;

    public Input<List<FirewallDenyArgs>> getDenies() {
        return this.denies == null ? Input.empty() : this.denies;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="destinationRanges")
    private final @Nullable Input<List<String>> destinationRanges;

    public Input<List<String>> getDestinationRanges() {
        return this.destinationRanges == null ? Input.empty() : this.destinationRanges;
    }

    @InputImport(name="direction")
    private final @Nullable Input<String> direction;

    public Input<String> getDirection() {
        return this.direction == null ? Input.empty() : this.direction;
    }

    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    @InputImport(name="enableLogging")
    private final @Nullable Input<Boolean> enableLogging;

    @Deprecated /* Deprecated in favor of log_config */
    public Input<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Input.empty() : this.enableLogging;
    }

    @InputImport(name="logConfig")
    private final @Nullable Input<FirewallLogConfigArgs> logConfig;

    public Input<FirewallLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="network", required=true)
    private final Input<String> network;

    public Input<String> getNetwork() {
        return this.network;
    }

    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="sourceRanges")
    private final @Nullable Input<List<String>> sourceRanges;

    public Input<List<String>> getSourceRanges() {
        return this.sourceRanges == null ? Input.empty() : this.sourceRanges;
    }

    @InputImport(name="sourceServiceAccounts")
    private final @Nullable Input<List<String>> sourceServiceAccounts;

    public Input<List<String>> getSourceServiceAccounts() {
        return this.sourceServiceAccounts == null ? Input.empty() : this.sourceServiceAccounts;
    }

    @InputImport(name="sourceTags")
    private final @Nullable Input<List<String>> sourceTags;

    public Input<List<String>> getSourceTags() {
        return this.sourceTags == null ? Input.empty() : this.sourceTags;
    }

    @InputImport(name="targetServiceAccounts")
    private final @Nullable Input<List<String>> targetServiceAccounts;

    public Input<List<String>> getTargetServiceAccounts() {
        return this.targetServiceAccounts == null ? Input.empty() : this.targetServiceAccounts;
    }

    @InputImport(name="targetTags")
    private final @Nullable Input<List<String>> targetTags;

    public Input<List<String>> getTargetTags() {
        return this.targetTags == null ? Input.empty() : this.targetTags;
    }

    public FirewallArgs(
        @Nullable Input<List<FirewallAllowArgs>> allows,
        @Nullable Input<List<FirewallDenyArgs>> denies,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> destinationRanges,
        @Nullable Input<String> direction,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<Boolean> enableLogging,
        @Nullable Input<FirewallLogConfigArgs> logConfig,
        @Nullable Input<String> name,
        Input<String> network,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> project,
        @Nullable Input<List<String>> sourceRanges,
        @Nullable Input<List<String>> sourceServiceAccounts,
        @Nullable Input<List<String>> sourceTags,
        @Nullable Input<List<String>> targetServiceAccounts,
        @Nullable Input<List<String>> targetTags) {
        this.allows = allows;
        this.denies = denies;
        this.description = description;
        this.destinationRanges = destinationRanges;
        this.direction = direction;
        this.disabled = disabled;
        this.enableLogging = enableLogging;
        this.logConfig = logConfig;
        this.name = name;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.priority = priority;
        this.project = project;
        this.sourceRanges = sourceRanges;
        this.sourceServiceAccounts = sourceServiceAccounts;
        this.sourceTags = sourceTags;
        this.targetServiceAccounts = targetServiceAccounts;
        this.targetTags = targetTags;
    }

    private FirewallArgs() {
        this.allows = Input.empty();
        this.denies = Input.empty();
        this.description = Input.empty();
        this.destinationRanges = Input.empty();
        this.direction = Input.empty();
        this.disabled = Input.empty();
        this.enableLogging = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.priority = Input.empty();
        this.project = Input.empty();
        this.sourceRanges = Input.empty();
        this.sourceServiceAccounts = Input.empty();
        this.sourceTags = Input.empty();
        this.targetServiceAccounts = Input.empty();
        this.targetTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FirewallAllowArgs>> allows;
        private @Nullable Input<List<FirewallDenyArgs>> denies;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> destinationRanges;
        private @Nullable Input<String> direction;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<Boolean> enableLogging;
        private @Nullable Input<FirewallLogConfigArgs> logConfig;
        private @Nullable Input<String> name;
        private Input<String> network;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> project;
        private @Nullable Input<List<String>> sourceRanges;
        private @Nullable Input<List<String>> sourceServiceAccounts;
        private @Nullable Input<List<String>> sourceTags;
        private @Nullable Input<List<String>> targetServiceAccounts;
        private @Nullable Input<List<String>> targetTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.denies = defaults.denies;
    	      this.description = defaults.description;
    	      this.destinationRanges = defaults.destinationRanges;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.enableLogging = defaults.enableLogging;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.sourceRanges = defaults.sourceRanges;
    	      this.sourceServiceAccounts = defaults.sourceServiceAccounts;
    	      this.sourceTags = defaults.sourceTags;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
        }

        public Builder setAllows(@Nullable Input<List<FirewallAllowArgs>> allows) {
            this.allows = allows;
            return this;
        }

        public Builder setAllows(@Nullable List<FirewallAllowArgs> allows) {
            this.allows = Input.ofNullable(allows);
            return this;
        }

        public Builder setDenies(@Nullable Input<List<FirewallDenyArgs>> denies) {
            this.denies = denies;
            return this;
        }

        public Builder setDenies(@Nullable List<FirewallDenyArgs> denies) {
            this.denies = Input.ofNullable(denies);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestinationRanges(@Nullable Input<List<String>> destinationRanges) {
            this.destinationRanges = destinationRanges;
            return this;
        }

        public Builder setDestinationRanges(@Nullable List<String> destinationRanges) {
            this.destinationRanges = Input.ofNullable(destinationRanges);
            return this;
        }

        public Builder setDirection(@Nullable Input<String> direction) {
            this.direction = direction;
            return this;
        }

        public Builder setDirection(@Nullable String direction) {
            this.direction = Input.ofNullable(direction);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setEnableLogging(@Nullable Input<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder setEnableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Input.ofNullable(enableLogging);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<FirewallLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable FirewallLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
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

        public Builder setNetwork(Input<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSourceRanges(@Nullable Input<List<String>> sourceRanges) {
            this.sourceRanges = sourceRanges;
            return this;
        }

        public Builder setSourceRanges(@Nullable List<String> sourceRanges) {
            this.sourceRanges = Input.ofNullable(sourceRanges);
            return this;
        }

        public Builder setSourceServiceAccounts(@Nullable Input<List<String>> sourceServiceAccounts) {
            this.sourceServiceAccounts = sourceServiceAccounts;
            return this;
        }

        public Builder setSourceServiceAccounts(@Nullable List<String> sourceServiceAccounts) {
            this.sourceServiceAccounts = Input.ofNullable(sourceServiceAccounts);
            return this;
        }

        public Builder setSourceTags(@Nullable Input<List<String>> sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }

        public Builder setSourceTags(@Nullable List<String> sourceTags) {
            this.sourceTags = Input.ofNullable(sourceTags);
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable Input<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }

        public Builder setTargetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Input.ofNullable(targetServiceAccounts);
            return this;
        }

        public Builder setTargetTags(@Nullable Input<List<String>> targetTags) {
            this.targetTags = targetTags;
            return this;
        }

        public Builder setTargetTags(@Nullable List<String> targetTags) {
            this.targetTags = Input.ofNullable(targetTags);
            return this;
        }

        public FirewallArgs build() {
            return new FirewallArgs(allows, denies, description, destinationRanges, direction, disabled, enableLogging, logConfig, name, network, priority, project, sourceRanges, sourceServiceAccounts, sourceTags, targetServiceAccounts, targetTags);
        }
    }
}