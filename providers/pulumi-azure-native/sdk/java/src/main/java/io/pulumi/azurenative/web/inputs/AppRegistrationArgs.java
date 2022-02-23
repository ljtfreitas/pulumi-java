// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the app registration for providers that have app ids and app secrets
 * 
 */
public final class AppRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppRegistrationArgs Empty = new AppRegistrationArgs();

    /**
     * The App ID of the app used for login.
     * 
     */
    @InputImport(name="appId")
        private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * The app setting name that contains the app secret.
     * 
     */
    @InputImport(name="appSecretSettingName")
        private final @Nullable Input<String> appSecretSettingName;

    public Input<String> getAppSecretSettingName() {
        return this.appSecretSettingName == null ? Input.empty() : this.appSecretSettingName;
    }

    public AppRegistrationArgs(
        @Nullable Input<String> appId,
        @Nullable Input<String> appSecretSettingName) {
        this.appId = appId;
        this.appSecretSettingName = appSecretSettingName;
    }

    private AppRegistrationArgs() {
        this.appId = Input.empty();
        this.appSecretSettingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appId;
        private @Nullable Input<String> appSecretSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecretSettingName = defaults.appSecretSettingName;
        }

        public Builder setAppId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder setAppSecretSettingName(@Nullable Input<String> appSecretSettingName) {
            this.appSecretSettingName = appSecretSettingName;
            return this;
        }

        public Builder setAppSecretSettingName(@Nullable String appSecretSettingName) {
            this.appSecretSettingName = Input.ofNullable(appSecretSettingName);
            return this;
        }
        public AppRegistrationArgs build() {
            return new AppRegistrationArgs(appId, appSecretSettingName);
        }
    }
}
