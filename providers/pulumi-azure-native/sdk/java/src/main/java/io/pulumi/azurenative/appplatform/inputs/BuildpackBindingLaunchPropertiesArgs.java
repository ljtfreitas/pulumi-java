// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Buildpack Binding Launch Properties
 * 
 */
public final class BuildpackBindingLaunchPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildpackBindingLaunchPropertiesArgs Empty = new BuildpackBindingLaunchPropertiesArgs();

    /**
     * Non-sensitive properties for launchProperties
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Sensitive properties for launchProperties
     * 
     */
    @Import(name="secrets")
      private final @Nullable Output<Map<String,String>> secrets;

    public Output<Map<String,String>> getSecrets() {
        return this.secrets == null ? Output.empty() : this.secrets;
    }

    public BuildpackBindingLaunchPropertiesArgs(
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<Map<String,String>> secrets) {
        this.properties = properties;
        this.secrets = secrets;
    }

    private BuildpackBindingLaunchPropertiesArgs() {
        this.properties = Output.empty();
        this.secrets = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackBindingLaunchPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<Map<String,String>> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackBindingLaunchPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.secrets = defaults.secrets;
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder secrets(@Nullable Output<Map<String,String>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder secrets(@Nullable Map<String,String> secrets) {
            this.secrets = Output.ofNullable(secrets);
            return this;
        }
        public BuildpackBindingLaunchPropertiesArgs build() {
            return new BuildpackBindingLaunchPropertiesArgs(properties, secrets);
        }
    }
}
