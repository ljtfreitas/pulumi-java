// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.LoginMode;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsUserConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsUserConfigurationArgs Empty = new WindowsUserConfigurationArgs();

    @InputImport(name="loginMode")
    private final @Nullable Input<LoginMode> loginMode;

    public Input<LoginMode> getLoginMode() {
        return this.loginMode == null ? Input.empty() : this.loginMode;
    }

    public WindowsUserConfigurationArgs(@Nullable Input<LoginMode> loginMode) {
        this.loginMode = loginMode;
    }

    private WindowsUserConfigurationArgs() {
        this.loginMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUserConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LoginMode> loginMode;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUserConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginMode = defaults.loginMode;
        }

        public Builder setLoginMode(@Nullable Input<LoginMode> loginMode) {
            this.loginMode = loginMode;
            return this;
        }

        public Builder setLoginMode(@Nullable LoginMode loginMode) {
            this.loginMode = Input.ofNullable(loginMode);
            return this;
        }

        public WindowsUserConfigurationArgs build() {
            return new WindowsUserConfigurationArgs(loginMode);
        }
    }
}