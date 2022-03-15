// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.ConfigurationServiceGitPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings of Application Configuration Service.
 * 
 */
public final class ConfigurationServiceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationServiceSettingsArgs Empty = new ConfigurationServiceSettingsArgs();

    /**
     * Property of git environment.
     * 
     */
    @Import(name="gitProperty")
      private final @Nullable Output<ConfigurationServiceGitPropertyArgs> gitProperty;

    public Output<ConfigurationServiceGitPropertyArgs> getGitProperty() {
        return this.gitProperty == null ? Output.empty() : this.gitProperty;
    }

    public ConfigurationServiceSettingsArgs(@Nullable Output<ConfigurationServiceGitPropertyArgs> gitProperty) {
        this.gitProperty = gitProperty;
    }

    private ConfigurationServiceSettingsArgs() {
        this.gitProperty = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigurationServiceGitPropertyArgs> gitProperty;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gitProperty = defaults.gitProperty;
        }

        public Builder gitProperty(@Nullable Output<ConfigurationServiceGitPropertyArgs> gitProperty) {
            this.gitProperty = gitProperty;
            return this;
        }

        public Builder gitProperty(@Nullable ConfigurationServiceGitPropertyArgs gitProperty) {
            this.gitProperty = Output.ofNullable(gitProperty);
            return this;
        }
        public ConfigurationServiceSettingsArgs build() {
            return new ConfigurationServiceSettingsArgs(gitProperty);
        }
    }
}
