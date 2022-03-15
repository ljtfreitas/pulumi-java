// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalSettingsState extends io.pulumi.resources.ResourceArgs {

    public static final GlobalSettingsState Empty = new GlobalSettingsState();

    /**
     * A list of resources along with the opt-in preferences for the account.
     * 
     */
    @Import(name="globalSettings")
      private final @Nullable Output<Map<String,String>> globalSettings;

    public Output<Map<String,String>> getGlobalSettings() {
        return this.globalSettings == null ? Output.empty() : this.globalSettings;
    }

    public GlobalSettingsState(@Nullable Output<Map<String,String>> globalSettings) {
        this.globalSettings = globalSettings;
    }

    private GlobalSettingsState() {
        this.globalSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> globalSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalSettingsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalSettings = defaults.globalSettings;
        }

        public Builder globalSettings(@Nullable Output<Map<String,String>> globalSettings) {
            this.globalSettings = globalSettings;
            return this;
        }

        public Builder globalSettings(@Nullable Map<String,String> globalSettings) {
            this.globalSettings = Output.ofNullable(globalSettings);
            return this;
        }
        public GlobalSettingsState build() {
            return new GlobalSettingsState(globalSettings);
        }
    }
}
