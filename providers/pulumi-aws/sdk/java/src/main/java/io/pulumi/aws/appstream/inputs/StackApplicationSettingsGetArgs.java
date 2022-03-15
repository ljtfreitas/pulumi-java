// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackApplicationSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackApplicationSettingsGetArgs Empty = new StackApplicationSettingsGetArgs();

    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    @Import(name="settingsGroup")
      private final @Nullable Output<String> settingsGroup;

    public Output<String> getSettingsGroup() {
        return this.settingsGroup == null ? Output.empty() : this.settingsGroup;
    }

    public StackApplicationSettingsGetArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> settingsGroup) {
        this.enabled = enabled;
        this.settingsGroup = settingsGroup;
    }

    private StackApplicationSettingsGetArgs() {
        this.enabled = Output.empty();
        this.settingsGroup = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackApplicationSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> settingsGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(StackApplicationSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.settingsGroup = defaults.settingsGroup;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder settingsGroup(@Nullable Output<String> settingsGroup) {
            this.settingsGroup = settingsGroup;
            return this;
        }

        public Builder settingsGroup(@Nullable String settingsGroup) {
            this.settingsGroup = Output.ofNullable(settingsGroup);
            return this;
        }
        public StackApplicationSettingsGetArgs build() {
            return new StackApplicationSettingsGetArgs(enabled, settingsGroup);
        }
    }
}
