// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WindowsUserConfigurationResponse {
    /**
     * Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
     * 
     */
    private final @Nullable String loginMode;

    @OutputCustomType.Constructor({"loginMode"})
    private WindowsUserConfigurationResponse(@Nullable String loginMode) {
        this.loginMode = loginMode;
    }

    /**
     * Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
     * 
     */
    public Optional<String> getLoginMode() {
        return Optional.ofNullable(this.loginMode);
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

        public Builder setLoginMode(@Nullable String loginMode) {
            this.loginMode = loginMode;
            return this;
        }
        public WindowsUserConfigurationResponse build() {
            return new WindowsUserConfigurationResponse(loginMode);
        }
    }
}
