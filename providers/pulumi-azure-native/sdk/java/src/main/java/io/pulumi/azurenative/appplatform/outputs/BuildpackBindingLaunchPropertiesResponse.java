// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class BuildpackBindingLaunchPropertiesResponse {
    /**
     * Non-sensitive properties for launchProperties
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Sensitive properties for launchProperties
     * 
     */
    private final @Nullable Map<String,String> secrets;

    @OutputCustomType.Constructor({"properties","secrets"})
    private BuildpackBindingLaunchPropertiesResponse(
        @Nullable Map<String,String> properties,
        @Nullable Map<String,String> secrets) {
        this.properties = properties;
        this.secrets = secrets;
    }

    /**
     * Non-sensitive properties for launchProperties
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Sensitive properties for launchProperties
     * 
     */
    public Map<String,String> getSecrets() {
        return this.secrets == null ? Map.of() : this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackBindingLaunchPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackBindingLaunchPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.secrets = defaults.secrets;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setSecrets(@Nullable Map<String,String> secrets) {
            this.secrets = secrets;
            return this;
        }

        public BuildpackBindingLaunchPropertiesResponse build() {
            return new BuildpackBindingLaunchPropertiesResponse(properties, secrets);
        }
    }
}
