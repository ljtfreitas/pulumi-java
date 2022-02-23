// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ContentSourceArgs;
import io.pulumi.azurenative.automation.inputs.DscConfigurationAssociationPropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DscNodeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DscNodeConfigurationArgs Empty = new DscNodeConfigurationArgs();

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
     * Gets or sets the configuration of the node.
     * 
     */
    @InputImport(name="configuration", required=true)
        private final Input<DscConfigurationAssociationPropertyArgs> configuration;

    public Input<DscConfigurationAssociationPropertyArgs> getConfiguration() {
        return this.configuration;
    }

    /**
     * If a new build version of NodeConfiguration is required.
     * 
     */
    @InputImport(name="incrementNodeConfigurationBuild")
        private final @Nullable Input<Boolean> incrementNodeConfigurationBuild;

    public Input<Boolean> getIncrementNodeConfigurationBuild() {
        return this.incrementNodeConfigurationBuild == null ? Input.empty() : this.incrementNodeConfigurationBuild;
    }

    /**
     * Name of the node configuration.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The Dsc node configuration name.
     * 
     */
    @InputImport(name="nodeConfigurationName")
        private final @Nullable Input<String> nodeConfigurationName;

    public Input<String> getNodeConfigurationName() {
        return this.nodeConfigurationName == null ? Input.empty() : this.nodeConfigurationName;
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

    public DscNodeConfigurationArgs(
        Input<String> automationAccountName,
        Input<DscConfigurationAssociationPropertyArgs> configuration,
        @Nullable Input<Boolean> incrementNodeConfigurationBuild,
        @Nullable Input<String> name,
        @Nullable Input<String> nodeConfigurationName,
        Input<String> resourceGroupName,
        Input<ContentSourceArgs> source,
        @Nullable Input<Map<String,String>> tags) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
        this.name = name;
        this.nodeConfigurationName = nodeConfigurationName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tags = tags;
    }

    private DscNodeConfigurationArgs() {
        this.automationAccountName = Input.empty();
        this.configuration = Input.empty();
        this.incrementNodeConfigurationBuild = Input.empty();
        this.name = Input.empty();
        this.nodeConfigurationName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DscNodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private Input<DscConfigurationAssociationPropertyArgs> configuration;
        private @Nullable Input<Boolean> incrementNodeConfigurationBuild;
        private @Nullable Input<String> name;
        private @Nullable Input<String> nodeConfigurationName;
        private Input<String> resourceGroupName;
        private Input<ContentSourceArgs> source;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DscNodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.configuration = defaults.configuration;
    	      this.incrementNodeConfigurationBuild = defaults.incrementNodeConfigurationBuild;
    	      this.name = defaults.name;
    	      this.nodeConfigurationName = defaults.nodeConfigurationName;
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

        public Builder setConfiguration(Input<DscConfigurationAssociationPropertyArgs> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder setConfiguration(DscConfigurationAssociationPropertyArgs configuration) {
            this.configuration = Input.of(Objects.requireNonNull(configuration));
            return this;
        }

        public Builder setIncrementNodeConfigurationBuild(@Nullable Input<Boolean> incrementNodeConfigurationBuild) {
            this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
            return this;
        }

        public Builder setIncrementNodeConfigurationBuild(@Nullable Boolean incrementNodeConfigurationBuild) {
            this.incrementNodeConfigurationBuild = Input.ofNullable(incrementNodeConfigurationBuild);
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

        public Builder setNodeConfigurationName(@Nullable Input<String> nodeConfigurationName) {
            this.nodeConfigurationName = nodeConfigurationName;
            return this;
        }

        public Builder setNodeConfigurationName(@Nullable String nodeConfigurationName) {
            this.nodeConfigurationName = Input.ofNullable(nodeConfigurationName);
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
        public DscNodeConfigurationArgs build() {
            return new DscNodeConfigurationArgs(automationAccountName, configuration, incrementNodeConfigurationBuild, name, nodeConfigurationName, resourceGroupName, source, tags);
        }
    }
}
