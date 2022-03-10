// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.UserProfileResourceSpec;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserProfileJupyterServerAppSettings {
    private final @Nullable UserProfileResourceSpec defaultResourceSpec;

    @OutputCustomType.Constructor
    private UserProfileJupyterServerAppSettings(@OutputCustomType.Parameter("defaultResourceSpec") @Nullable UserProfileResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    public Optional<UserProfileResourceSpec> getDefaultResourceSpec() {
        return Optional.ofNullable(this.defaultResourceSpec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileJupyterServerAppSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UserProfileResourceSpec defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileJupyterServerAppSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder setDefaultResourceSpec(@Nullable UserProfileResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }
        public UserProfileJupyterServerAppSettings build() {
            return new UserProfileJupyterServerAppSettings(defaultResourceSpec);
        }
    }
}
