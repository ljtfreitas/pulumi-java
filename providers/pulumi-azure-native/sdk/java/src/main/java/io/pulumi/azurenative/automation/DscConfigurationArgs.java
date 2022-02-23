// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ContentSourceArgs;
import io.pulumi.azurenative.automation.inputs.DscConfigurationParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DscConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DscConfigurationArgs Empty = new DscConfigurationArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
        private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The create or update parameters for configuration.
     * 
     */
    @InputImport(name="configurationName")
        private final @Nullable Input<String> configurationName;

    public Input<String> getConfigurationName() {
        return this.configurationName == null ? Input.empty() : this.configurationName;
    }

    /**
     * Gets or sets the description of the configuration.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Gets or sets progress log option.
     * 
     */
    @InputImport(name="logProgress")
        private final @Nullable Input<Boolean> logProgress;

    public Input<Boolean> getLogProgress() {
        return this.logProgress == null ? Input.empty() : this.logProgress;
    }

    /**
     * Gets or sets verbose log option.
     * 
     */
    @InputImport(name="logVerbose")
        private final @Nullable Input<Boolean> logVerbose;

    public Input<Boolean> getLogVerbose() {
        return this.logVerbose == null ? Input.empty() : this.logVerbose;
    }

    /**
     * Gets or sets name of the resource.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Gets or sets the configuration parameters.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<Map<String,DscConfigurationParameterArgs>> parameters;

    public Input<Map<String,DscConfigurationParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the source.
     * 
     */
    @InputImport(name="source", required=true)
        private final Input<ContentSourceArgs> source;

    public Input<ContentSourceArgs> getSource() {
        return this.source;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DscConfigurationArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> configurationName,
        @Nullable Input<String> description,
        @Nullable Input<String> location,
        @Nullable Input<Boolean> logProgress,
        @Nullable Input<Boolean> logVerbose,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,DscConfigurationParameterArgs>> parameters,
        Input<String> resourceGroupName,
        Input<ContentSourceArgs> source,
        @Nullable Input<Map<String,String>> tags) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.configurationName = configurationName;
        this.description = description;
        this.location = location;
        this.logProgress = logProgress;
        this.logVerbose = logVerbose;
        this.name = name;
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tags = tags;
    }

    private DscConfigurationArgs() {
        this.automationAccountName = Input.empty();
        this.configurationName = Input.empty();
        this.description = Input.empty();
        this.location = Input.empty();
        this.logProgress = Input.empty();
        this.logVerbose = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.resourceGroupName = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DscConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> configurationName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> location;
        private @Nullable Input<Boolean> logProgress;
        private @Nullable Input<Boolean> logVerbose;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,DscConfigurationParameterArgs>> parameters;
        private Input<String> resourceGroupName;
        private Input<ContentSourceArgs> source;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DscConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.configurationName = defaults.configurationName;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.logProgress = defaults.logProgress;
    	      this.logVerbose = defaults.logVerbose;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setConfigurationName(@Nullable Input<String> configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        public Builder setConfigurationName(@Nullable String configurationName) {
            this.configurationName = Input.ofNullable(configurationName);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setLogProgress(@Nullable Input<Boolean> logProgress) {
            this.logProgress = logProgress;
            return this;
        }

        public Builder setLogProgress(@Nullable Boolean logProgress) {
            this.logProgress = Input.ofNullable(logProgress);
            return this;
        }

        public Builder setLogVerbose(@Nullable Input<Boolean> logVerbose) {
            this.logVerbose = logVerbose;
            return this;
        }

        public Builder setLogVerbose(@Nullable Boolean logVerbose) {
            this.logVerbose = Input.ofNullable(logVerbose);
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

        public Builder setParameters(@Nullable Input<Map<String,DscConfigurationParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,DscConfigurationParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSource(Input<ContentSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(ContentSourceArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
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
        public DscConfigurationArgs build() {
            return new DscConfigurationArgs(automationAccountName, configurationName, description, location, logProgress, logVerbose, name, parameters, resourceGroupName, source, tags);
        }
    }
}
