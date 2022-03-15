// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsUserConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WindowsUserConfigurationResponse Empty = new WindowsUserConfigurationResponse();

    /**
     * Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
     * 
     */
    @Import(name="loginMode")
      private final @Nullable String loginMode;

    public Optional<String> getLoginMode() {
        return this.loginMode == null ? Optional.empty() : Optional.ofNullable(this.loginMode);
    }

    public WindowsUserConfigurationResponse(@Nullable String loginMode) {
        this.loginMode = loginMode;
    }

    private WindowsUserConfigurationResponse() {
        this.loginMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUserConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String loginMode;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUserConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginMode = defaults.loginMode;
        }

        public Builder loginMode(@Nullable String loginMode) {
            this.loginMode = loginMode;
            return this;
        }
        public WindowsUserConfigurationResponse build() {
            return new WindowsUserConfigurationResponse(loginMode);
        }
    }
}
