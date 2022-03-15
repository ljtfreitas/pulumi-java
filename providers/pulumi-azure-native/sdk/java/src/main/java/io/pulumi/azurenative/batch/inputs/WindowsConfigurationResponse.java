// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WindowsConfigurationResponse Empty = new WindowsConfigurationResponse();

    /**
     * If omitted, the default value is true.
     * 
     */
    @Import(name="enableAutomaticUpdates")
      private final @Nullable Boolean enableAutomaticUpdates;

    public Optional<Boolean> getEnableAutomaticUpdates() {
        return this.enableAutomaticUpdates == null ? Optional.empty() : Optional.ofNullable(this.enableAutomaticUpdates);
    }

    public WindowsConfigurationResponse(@Nullable Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
    }

    private WindowsConfigurationResponse() {
        this.enableAutomaticUpdates = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAutomaticUpdates;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutomaticUpdates = defaults.enableAutomaticUpdates;
        }

        public Builder enableAutomaticUpdates(@Nullable Boolean enableAutomaticUpdates) {
            this.enableAutomaticUpdates = enableAutomaticUpdates;
            return this;
        }
        public WindowsConfigurationResponse build() {
            return new WindowsConfigurationResponse(enableAutomaticUpdates);
        }
    }
}
